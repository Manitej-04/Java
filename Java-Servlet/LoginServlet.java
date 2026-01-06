package com.api.testing;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/LoginServlet1")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		if( name.equals("admin") && password.equals("admin123")) {
			response.getWriter().append("Login Success");
			response.getWriter().append("Name: "+name+"\nPassword: "+password);
		} else {
			response.getWriter().append("Login Failed");
		}
	}
}
