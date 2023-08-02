package day230802;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbtest
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/studentdb";
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("DB 연결 완료");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("JDBC 드라이버 로드 오류");
		}
		catch(SQLException e)
		{
			System.out.println("DB 연결 오류");
		}
	}
}
