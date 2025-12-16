package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDao {

public void getAllRecord() throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp_systems","root", "root");
	
	PreparedStatement ps = c.prepareStatement("select * from employees");
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()) {
		System.out.println("Employee id: " + rs.getInt(1) + " Employee name: " + rs.getString(2) + " Employee department: " + rs.getString(3));
	}
	c.close();
	
}
	

public void updateRecord() throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp_systems","root", "root");
	
	PreparedStatement ps = c.prepareStatement("update employees set name = 'yash' where id = 1");
	 ps.executeUpdate();
	System.out.println("Query Executed");
	
	c.close();
	
	
}
	
public void deleteRecord() throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp_systems","root", "root");
	
	PreparedStatement ps = c.prepareStatement("delete from employees where id = 3");
	 ps.executeUpdate();
	System.out.println("Query Executed");
	
	c.close();
	
	
}
}
