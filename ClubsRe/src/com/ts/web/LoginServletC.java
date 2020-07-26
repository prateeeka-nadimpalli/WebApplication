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

import com.ts.dao.ClubDAO;
import com.ts.dto.Club;

@WebServlet("/LoginServletC")
public class LoginServletC extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("uid");
		String password = request.getParameter("pwd");	
		ClubDAO clubDao = new ClubDAO();
		Club club = clubDao.getClub(email,password);
		out.print("<html>");		
		if(club!=null){
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			session.setAttribute("clubname", club.getClubname());
			session.setAttribute("clubId", club.getClubid());
			session.setAttribute("password", password);
		
			RequestDispatcher rd = request.getRequestDispatcher("EventDisplayByClub.jsp");
			rd.forward(request, response);	
			
		}
		else
		{
			out.print("<body>");
			out.print("<center><h1>Invalid Credentials..</h1></center>");
			RequestDispatcher rd = request.getRequestDispatcher("loginCoor.html");
			rd.include(request, response);
			out.print("</body>");			
		}
		out.println("</html>");		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
