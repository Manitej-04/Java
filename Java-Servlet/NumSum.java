package com.api.testing;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class NumSum
 */
@WebServlet("/NumSumPost")
public class NumSum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String numParam = request.getParameter("n");
		
		int n = Integer.parseInt(numParam);
		int temp = n;
		int sum = 0;
		
		while ( temp>0 ) {
			sum += temp%10;
			temp /= 10;
		}
		response.getWriter().println("Number sum of "+n+": "+sum);
	}

}
