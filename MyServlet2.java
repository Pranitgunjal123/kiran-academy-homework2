package com.tka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/patients")

public class MyServlet2 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname       = request.getParameter("fname");
		String lname       = request.getParameter("lname");
		String aage         = request.getParameter("age");
		int age =   Integer.parseInt(aage);
		
		String gender      = request.getParameter("gender");
		String dob         = request.getParameter("dob");
		String phone       = request.getParameter("phone");
		Long mob =   Long.parseLong(phone);
		
		String email       = request.getParameter("email");
		String address     = request.getParameter("address");
		String city        = request.getParameter("city");
		String state       = request.getParameter("state");
		String pin         = request.getParameter("pin");
		int pincode =   Integer.parseInt(pin);
		
		String blood       = request.getParameter("blood");
		String history     = request.getParameter("history");
		String doctor      = request.getParameter("doctor");
		String admit_date  = request.getParameter("admit_date");

		
//		System.out.println("First Name: " + fname);
//		System.out.println("Last Name: " + lname);
//		System.out.println("Age: " + age);
//		System.out.println("Gender: " + gender);
//		System.out.println("Date of Birth: " + dob);
//		System.out.println("Phone Number: " + mob);
//		System.out.println("Email: " + email);
//		System.out.println("Address: " + address);
//		System.out.println("City: " + city);
//		System.out.println("State: " + state);
//		System.out.println("Pincode: " + pincode);
//		System.out.println("Blood Group: " + blood);
//		System.out.println("Medical History: " + history);
//		System.out.println("Doctor Assigned: " + doctor);
//		System.out.println("Admission Date: " + admit_date);

		//response.getWriter().println("<h1>Registration Successful !</h1>");
		
		PrintWriter out = response.getWriter();
		out.println(fname);
		out.println(lname);
		out.println(age);
		out.println(gender);
		out.println(dob);
		out.println(mob);
		out.println(email);
		out.println(address);
		out.println(city);
		out.println(state);
		out.println(pincode);
		out.println(blood);
		out.println(history);
		out.println(doctor);
		out.println(admit_date);
		
		
		
		  String url = "jdbc:mysql://localhost:3306/erp_systems";
	       
	       try {
	    	   Class.forName("com.mysql.cj.jdbc.Driver");
	    	   Connection c = DriverManager.getConnection(url, "root", "root");
	  
	    	   // history is a reserved keyword in sql so not was storing => historyy
	    	   
	    	  PreparedStatement ps = c.prepareStatement( "INSERT INTO patients " +
	    					    "(fname, lname, age, gender, dob, mob, email, address, city, state, pincode, blood, historyy, doctor, admit_date) " +
	    					    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

	    	  out.println("<h2>Patient Registered Successfully!</h2>");
	    	   ps.setString(1, fname);
	    	   ps.setString(2, lname);
	    	   ps.setInt(3, age);
	    	   ps.setString(4, gender);
	    	   ps.setString(5, dob);
	    	   ps.setLong(6, mob);
	    	   ps.setString(7, email);
	    	   ps.setString(8, address);
	    	   ps.setString(9, city);
	    	   ps.setString(10, state);
	    	   ps.setInt(11, pincode);
	    	   ps.setString(12, blood);
	    	   ps.setString(13, history);
	    	   ps.setString(14, doctor);
	    	   ps.setString(15, admit_date);

	    	   
	    	   ps.executeUpdate();
	    	   
	    	   
	    	   c.close();
	    	   
	       }
	    	   catch (Exception e) {
	    		   System.out.println(e.getMessage());
			
			}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
