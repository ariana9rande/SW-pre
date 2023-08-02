package day230802;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcMethod
{
	public Connection makeConnection()
	{
		// mysql용
		String url = "jdbc:mysql://localhost:3306/studentdb";
		String id = "scott";
		String password = "tiger";
		Connection con = null;

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결 성공");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("드라이버를 찾을 수 없습니다.");
		}
		catch(SQLException e)
		{
			System.out.println("연결에 실패하였습니다.");
		}
		return con;
	}

	public void insertMethod()
	{
		Connection con = makeConnection();
		if(con == null)
		{
			System.out.println("DB 연결이 되지 않음");
			return;
		}

		System.out.println();
		System.out.println(" ** student table 에서 데이터 삽입을 시작합니다. ** ");
		Scanner sc = new Scanner(System.in);
		String sql = "insert into student(id,name, dept) values(?, ?, ?)";
		PreparedStatement pstmt = null;

		try
		{
			pstmt = con.prepareStatement(sql);
			System.out.print("입력할 학번 : ");
			String id = sc.next();
			System.out.print("입력할 이름 : ");
			String name = sc.next();
			System.out.print("입력할 학과코드 : ");
			String dept = sc.next();

			pstmt.setString(1, id); // setDouble():실수, setTimeStamp():날짜
			pstmt.setString(2, name);
			pstmt.setString(3, dept);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건이 추가되었음");
			// con.commit();
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
				con.close();
			}
			catch(Exception e)
			{
			}
		}
	}

	public void updateMethod()
	{
		Connection con = makeConnection();
		if(con == null)
		{
			System.out.println("DB 연결이 되지 않음");
			return;
		}

		System.out.println();
		System.out.println(" ** student table에서 학과 수정을 시작합니다. ** ");

		Scanner sc = new Scanner(System.in);
		String sql = "update student set dept = ? where name = ? ";
		PreparedStatement pstmt = null;

		try
		{
			pstmt = con.prepareStatement(sql);
			System.out.print("수정할 학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("수정할 학과 입력 : ");
			String dept = sc.next();

			pstmt.setString(1, dept);
			pstmt.setString(2, name);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건이 수정되었음.");
			//con.commit();
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
				con.close();
			}
			catch(Exception e)
			{
			}
		}
	}

	public void deleteMethod()
	{
		Connection con = makeConnection();
		if(con == null)
		{
			System.out.println("DB 연결이 되지 않음");
			return;
		}

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println(" ** student table 삭제를 시작합니다. ** ");
		String sql = "delete from student where name = ?";

		PreparedStatement pstmt = null;
		String name = "";

		try
		{
			pstmt = con.prepareStatement(sql);
			System.out.print("삭제할 데이터의 학생이름을 입력 : ");
			name = sc.next();

			pstmt.setString(1, name);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건의 데이터가 삭제됨");
			//con.commit();
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
				con.close();
			}
			catch(Exception e)
			{
			}
		}
	}

	public void selectMethod()
	{
		Connection con = makeConnection();
		if(con == null)
		{
			System.out.println("DB연결이 되지 않음");
			return;
		}

		System.out.println();
		System.out.println(" ** student table 검색을 시작합니다. ** ");
		String sql = "SELECT *  FROM STUDENT";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try
		{
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while(rs.next())
			{
				String id = rs.getString("id");
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				System.out.println("학번: " + id + ",  이름: " + name + ",  학과: " + dept);
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
				con.close();
				pstmt.close();
				rs.close();
			}
			catch(Exception e)
			{
			}
		} // try
	}
}