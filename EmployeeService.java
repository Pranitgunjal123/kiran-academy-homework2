package com.service;
import com.dao.*;


public class EmployeeService {

	public void getAllRecord() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.getAllRecord();
	}
	
	public void updateRecord() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.updateRecord();
	}
	
	
	public void deleteRecord() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.deleteRecord();
	}
	
	
	
	
	
}
