package com.fannie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// Assuming that you connect to db 
				if(userName.equals("fannie") && password.equals("reston")){
					
					request.getRequestDispatcher("Success").forward(request, response);
					//out.print("<h2>Welcome User "  + userName +"</h2>");
				}else{
					//out.print("Sorry Invalid Credentials");
					request.getRequestDispatcher("Failure").include(request, response);
					request.getRequestDispatcher("/LoginForm.html").include(request, response);
				}
				
	}
}


