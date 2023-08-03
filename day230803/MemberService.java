package day230803;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberService
{
	Member currentMember = null;
	Scanner sc = new Scanner(System.in);

	public void register()
	{
		Connection conn = JdbcConnection.getConnection();
		if(conn == null)
		{
			System.out.println("DB 연결 오류");
			return;
		}

		System.out.println("------------------------------");
		System.out.println("회원가입");
		System.out.println("------------------------------");

		String sql = "insert into member(member_name, password, role) values(?, ?, ?)";
		PreparedStatement pstmt = null;

		try
		{
			pstmt = conn.prepareStatement(sql);
			
			System.out.print("이름 : ");
			String name = sc.nextLine();

			System.out.print("비밀번호 : ");
			String password = sc.nextLine();

			System.out.print("역할(손님, 매니저) : ");
			String role = sc.next();

			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.setString(3, role);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건이 추가되었음");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				pstmt.close();
				conn.close();
			}
			catch(Exception e)
			{
			}
		}
	}
	
	public Member login()
	{
		Connection conn = JdbcConnection.getConnection();
		if(conn == null)
		{
			System.out.println("DB 연결 오류");
			return null;
		}

		System.out.println("------------------------------");
		System.out.println("로그인");
		System.out.println("------------------------------");

		String sql = "select * from member where name = ? and password = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try
		{
			pstmt = conn.prepareStatement(sql);
			
			System.out.print("이름 : ");
			String name = sc.nextLine();

			System.out.print("비밀번호 : ");
			String password = sc.nextLine();

			pstmt.setString(1, name);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				currentMember = new Member();
				currentMember.setMemberName(rs.getString("name"));
				currentMember.setPassword(rs.getString("password"));
				currentMember.setRole(rs.getString("role"));
//				member.setBook(rs.getInt("book_id"));
				currentMember.setLate(false);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				pstmt.close();
				conn.close();
			}
			catch(Exception e)
			{
			}
		}
		return currentMember;
	}
}
