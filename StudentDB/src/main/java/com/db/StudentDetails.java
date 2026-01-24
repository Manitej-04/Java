package com.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentDetails
 */
@WebServlet("/StudentDetails1")
public class StudentDetails extends HttpServlet {
	static Map<Integer, Student> map = new HashMap<>();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
	    String email = request.getParameter("email");
	    String course = request.getParameter("course");
		
		PrintWriter out = response.getWriter();
		
		/*
//		Normal Method
		out.print("Id: "+id);
		out.print("\nName: "+name);	
		*/
		
		/*
		//Using Map Key-value pair
		Map<Integer, String> stdmap = new HashMap<Integer, String>();
		stdmap.put(id, name);
		out.print(stdmap.get(id));
		
		out.print("\nData added");
		*/
		
		/*	
		//Using List	
		Map<Integer, List<String>> map = new HashMap<>();
		
	    List<String> details = new ArrayList<>();
	    details.add(name);
	    details.add(email);
	    details.add(course);
	    
	    map.put(id, details);
	    out.print("\nData added");
	    */
	    
		//Using Student Class		
	    
	    Student s = new Student(id, name, email, course);
	    map.put(id, s);
	    out.print("\nData added");
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		
//		int id = Integer.parseInt(request.getParameter("id"));
//		String name = request.getParameter("name");
	    PrintWriter out = response.getWriter();
		
		String idStr = request.getParameter("id");
        if (idStr == null) {
            out.println("Please provide ID");
            return;
        }

        int id = Integer.parseInt(idStr);
        Student s = map.get(id);
        
        if (s == null) {
            out.println("Student not found for ID: " + id);
            return;
        }
	    	    
//	    out.println("<html><body>");
//
//	    out.println("<h2>Student Details</h2>");
//        out.println("<p>Id: " + id + "</p>");
//        out.println("<p>Name: " + name + "</p>");
//
//        out.println("</body></html>");
        
        out.println("<html><body>");
        out.println("<h2>Student Details</h2>");
        out.println("<p>Id: " + s.getId() + "</p>");
        out.println("<p>Name: " + s.getName() + "</p>");
        out.println("<p>Email: " + s.getEmail() + "</p>");
        out.println("<p>Course: " + s.getCourse() + "</p>");
        out.println("</body></html>");
	}
	
}
