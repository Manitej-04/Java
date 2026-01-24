package com.db;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/Register1")
public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
//		PrintWriter out = response.getWriter();
//		out.println(name);
//		out.println(email);
//		out.println(password);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdetails", "root", "mani");
			System.out.println(conn);
			
			PreparedStatement pst = conn.prepareStatement("insert into studentregister values(?,?,?)");
			pst.setString(1, username);
			pst.setString(2, email);
			pst.setString(3, password);
			
			int count = pst.executeUpdate();
			
			System.out.println(username+" has registered");

			response.getWriter().write(username+" has registered");			

			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
