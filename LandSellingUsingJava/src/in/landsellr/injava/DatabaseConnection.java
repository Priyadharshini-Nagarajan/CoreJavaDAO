package in.landsellr.injava;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static final String URL = "jdbc:mysql://localhost:3306/land_selling_db";
	private static final String UserName = "root";
	private static final String PassWord= "Priya@8448";
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(URL, UserName, PassWord);
	}
}
