package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dao.AdminDAO;
import com.ts.dto.AdminT;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String mail = request.getParameter("uid");
		String password = request.getParameter("pwd");
		
		AdminDAO adminDao = new AdminDAO();
		AdminT admint = adminDao.getAdmin(mail,password);
		out.print("<html>");		
		if(mail.equals("admin@gmail.com") && password.equals("admin")){
			HttpSession session = request.getSession(true);
			session.setAttribute("mail", mail);
			session.setAttribute("password", password);
			RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
			rd.forward(request, response);	
			
		}
		else
		{
			out.print("<body>");
			out.print("<center><h1>Invalid Credentials..</h1></center>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			out.print("</body>");			
		}
		out.println("</html>");		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
