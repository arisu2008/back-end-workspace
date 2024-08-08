package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAO {
	Class.forName("com.mysql.cj/jdbc.Driveer");
}

public Connection getConnect() {
	return DriverManager.getConnection("jdbc:mysql://localhost:3306/kh", "root", "qwer1234");
	
}

public void close(ResultSet rs, PreparedStatement ps, Connection conn) {
	if(rs!=null) rs.close();
	if(ps!=null) ps.close();
	if(conn!=null) conn.close();
}

public Employee search(int id) {
	Connection conn = getConnect();
	
	String query = "SELECT * FROM employee WHERE emp_id =?";
	PreparedStatement ps = conn.prepareStatement(query);
	
	ResultSet rs = ps.executeQuery();
	Employee employee = null;
	
	if(rs.next()) {
		employee = new Employee();
	}
	
	Close(rs, ps, conn);
	
	return employee;
}
