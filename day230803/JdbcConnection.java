package day230803;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection
{
	private static final String URL = "jdbc:mysql://localhost:3306/library_application";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("DB 연결 완료");
			return conn;
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("JDBC 드라이버 로드 오류");
		}
		catch(SQLException e)
		{
			System.out.println("DB 연결 오류");
		}
		return null;
	}
}
