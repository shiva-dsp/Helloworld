package com.jsp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employeedetails {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:root?user=root&password=12345";
		String query="SELECT * FROM billing.customer3";
		
			//Establish connection//
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billing","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
				
			}
			} catch (Exception e) {
			
			e.printStackTrace();
		} 
			
}
}
