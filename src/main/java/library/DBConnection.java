package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/YOUR_DATABASE";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "YOUR_PASSWORD";
	
	public static Connection getConnection() throws SQLException{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			throw new SQLException("MySQL driver not found. Check WEB-INF-lib", e);
		}
		
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}
