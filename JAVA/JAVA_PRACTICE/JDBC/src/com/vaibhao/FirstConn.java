package com.vaibhao;
import java.sql.*;
public class FirstConn {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver Loaded Successfully");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcapp","vaibhaovk","vaibhao");
		if (conn!=null) {
			Statement stmt = conn.createStatement();
			int val=stmt.executeUpdate("insert into school values('mukul','muklya@gmail.com','7798212')");
			if (val>0) {
				System.out.println("Zala be...............");
			}
			else {
				System.out.println("Nahi zala be.......");
			}
		}
		else {
			System.out.println("Not Connected");
		}
	}
}
