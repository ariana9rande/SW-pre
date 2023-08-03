package day230803;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookService
{
	Scanner sc = new Scanner(System.in);

	public void insert()
	{
		Connection conn = JdbcConnection.getConnection();
		if(conn == null)
		{
			System.out.println("DB 연결 오류");
			return;
		}

		System.out.println("------------------------------");
		System.out.println("도서 추가");
		System.out.println("------------------------------");

		String sql = "insert into book(title, author, category) values(?, ?, ?)";
		PreparedStatement pstmt = null;

		try
		{
			pstmt = conn.prepareStatement(sql);
			
			System.out.print("책 제목 : ");
			String title = sc.nextLine();

			System.out.print("저자 : ");
			String author = sc.nextLine();

			System.out.print("카테고리 : ");
			String category = sc.next();

			pstmt.setString(1, title);
			pstmt.setString(2, author);
			pstmt.setString(3, category);

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
	
	public void delete()
	{
		Connection conn = JdbcConnection.getConnection();
		if(conn == null)
		{
			System.out.println("DB 연결 오류");
			return;
		}
		
		System.out.println("------------------------------");
		System.out.println("도서 삭제");
		System.out.println("------------------------------");

		String sql = "delete from book where title = ?";
		PreparedStatement pstmt = null;

		try
		{
			pstmt = conn.prepareStatement(sql);
			
			System.out.print("삭제할 책 제목 : ");
			String title = sc.nextLine();

			pstmt.setString(1, title);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건이 삭제됨");
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
	
	public void search()
	{
		Connection conn = JdbcConnection.getConnection();
		if(conn == null)
		{
			System.out.println("DB 연결 오류");
			return;
		}
		
		System.out.println("------------------------------");
		System.out.println("도서 검색");
		System.out.println("------------------------------");
		
		System.out.println("무엇으로 검색하시겠습니까");
		System.out.println("1.제목 2.저자 3.카테고리");
		int input = Integer.parseInt(sc.nextLine());

		String sql = "select * from book where ";
		
		switch(input)
		{
			case 1 ->
				sql += "title = ?";
			case 2 ->
				sql += "author = ?";
			case 3 ->
				sql += "category = ?";
		}
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try
		{
			pstmt = conn.prepareStatement(sql);
			
			switch(input)
			{
				case 1 ->
				{
					System.out.print("검색할 책 제목 : ");
					String title = sc.nextLine();

					pstmt.setString(1, title);
				}
				case 2 ->
				{
					System.out.print("검색할 책 저자 : ");
					String author = sc.nextLine();

					pstmt.setString(1, author);
				}
				case 3 ->
				{
					System.out.print("검색할 책 카테고리 : ");
					String category = sc.nextLine();

					pstmt.setString(1, category);
				}
			}
			
			rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				String id = rs.getString("book_id");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String category = rs.getString("category");
				boolean available = rs.getBoolean("available");
				System.out.println("id : " + id + ", 제목 : " + title + ", 저자 : " + author
						+ ", 카테고리 : " + category + ", 대출가능 : " + available);
			}

//			int cnt = pstmt.executeUpdate();
			System.out.println(rs.getRow() + "건이 검색됨");
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
	
	public void searchAll()
	{
		Connection conn = JdbcConnection.getConnection();
		if(conn == null)
		{
			System.out.println("DB 연결 오류");
			return;
		}
		
		System.out.println("------------------------------");
		System.out.println("도서 목록");
		System.out.println("------------------------------");

		String sql = "select * from book";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try
		{
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			int cnt = rs.getRow();
			
			while(rs.next())
			{
				String id = rs.getString("book_id");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String category = rs.getString("category");
				boolean available = rs.getBoolean("available");
				System.out.println("id : " + id + ", 제목 : " + title + ", 저자 : " + author
						+ ", 카테고리 : " + category + ", 대출가능 : " + available);
			}

			System.out.println(cnt + "건이 검색됨");
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
}
