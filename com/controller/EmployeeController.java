package com.controller;

import com.entities.Employee;
import com.service.EmployeeService;

public class EmployeeController {
public static void main(String[] args) throws Exception {
	
	Employee e = new Employee(22, "Akshay", "IT");
	
	EmployeeService es = new EmployeeService();
	es.insertData(e);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
