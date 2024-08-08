package com.kh.test6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Application {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbe:mysql://localhost:3306","root","qwer1234");
			
			String query = "SELECT * FROM employee SET emp_id WHERE emp_name";
			PreparedStatement st = conn.prepareStatement(query);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("empId") + " / " + rs.getString("empName"));
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
