package com.service;
import com.dao.EmployeeDao;
import com.entities.Employee;

public class EmployeeService {

	public void insertData(Employee e) throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.insertData(e);
	}
	
}
