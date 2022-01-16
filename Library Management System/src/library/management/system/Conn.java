package library.management.system;

import java.sql.*;
/*this is the simple connection class to establish the Connection with the databases*/

public class Conn {
	Connection c;
	Statement s;
	
	String url = "jdbc:mysql://localhost:3306/library_management_system";
	String uname ="root";
	String pass = "admin";
	
	public Conn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");//Load the Driver
			c = DriverManager.getConnection(url,uname,pass);//Make the connection with the database
			s = c.createStatement();//to make a query that will perform with database
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
