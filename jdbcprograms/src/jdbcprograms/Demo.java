package jdbcprograms;
import java.sql.*;
import javax.sql.*;


public class Demo {

	public static void main(String[] args) throws Exception {
		
		 String URL = "jdbc:mysql://localhost:3306/teegala";
		 String USER = "root";
		 String PASSWORD="Keerthan@49";
	
		//step1: load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	   System.out.println("this driver is loaded sucessfully");
		
	   //step2:establishing the connection 
	   
	 Connection con=DriverManager.getConnection( URL,USER,PASSWORD);  
	 System.out.println("Connection established");
	
	 //step3:statement creation
	 
	 Statement st =con.createStatement();
	 
	 //step4:execute a query
	 st.executeUpdate("CREATE TABLE student(SID int, sname varchar(20))");
	 System.out.println("Table created");
	 
	 st.close();
	 con.close();
	 
	}

}
