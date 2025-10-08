package jdbcprograms.dao;

import java.sql.*;

public class DBUtli {
	 
	
	private static Connection con ;
	private static final String Driver="com.mysql.cj.jdbc.Driver";
	private static final String USERNAME="root";
	private static final String PASSWORD="Keerthan@49";
	private static final String URL="jdbc:mysql://localhost:3306/teegala";
	 
	public static Connection getConnection()
	{
	try {
		Class.forName(Driver);
		System.out.println("Driver loaded Sucessfully");
		
		con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		System.out.println("Connection Established");
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return con;
}
}
