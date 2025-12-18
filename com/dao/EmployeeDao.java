package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.entities.Employee;

public class EmployeeDao {

	public void insertData(Employee e) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp_systems", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into employees(id,name,department)values(?,?,?);");
		ps.setInt(1, e.getId());
		ps.setString(2, e.getName()); // create class in entities
		ps.setString(3, e.getDepartment());

		int check = ps.executeUpdate();
		if (check > 0) {
			System.out.println("Data is inserted...");
		} else {
			System.err.println("Data is NOT inserted...");
		}

		c.close();
	
		
		
		
		
		
		
		
	}}
