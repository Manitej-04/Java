package com.db;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class TestingClass
 */
@WebServlet("/TestingClass1")
public class TestingClass extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String branch = request.getParameter("branch");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdetails", "root", "mani");
			System.out.println(conn);
			
			PreparedStatement pst = conn.prepareStatement("insert into student values(?,?)");
			pst.setString(1, name);
			pst.setString(2, branch);
			
			int count = pst.executeUpdate();
			
			System.out.println("Updated: -->"+count);

//			response.getContentType();
			
			response.getWriter().write("<h3>Updated: row -->"+count);			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
