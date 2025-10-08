package jdbcprograms.services;

import java.sql.*;
import jdbcprograms.dao.DBUtli;



public class Curdoperations {
 static Connection con;
 static PreparedStatement pst;
 static {
	 con=DBUtli.getConnection();
	 if(con!=null)
	 {
		 System.out.println("connection is success");
	 }
 }
 //created the table now add values to table
 public static int addStudent(int sid,String sname)
 {
	 int n=0;
	 try {
		 pst=con.prepareStatement("INSERT INTO student VALUES(?,?)");
		 pst.setInt(1,sid);
		 pst.setString(2, sname);
		 pst.executeUpdate();
		 
	 }
	 catch(Exception e)
	 {
		 
	 }
	 return n;
	 
 }
 
 
}
