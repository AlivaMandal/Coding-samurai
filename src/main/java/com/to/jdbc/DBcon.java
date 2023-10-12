package com.to.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBcon {
	private static Connection con=null;
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/todo","root","Aliva@2000");	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
