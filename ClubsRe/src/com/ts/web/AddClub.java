package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.ClubDAO;
import com.ts.dto.Club;

@WebServlet("/AddClub")
public class AddClub extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String clubname = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		String cname = request.getParameter("cname");
        int clubId = Integer.parseInt(request.getParameter("Id"));
		String desc = request.getParameter("desc");
        Club club = new Club(clubId,clubname,email,password,cname,desc);		
		ClubDAO clubDao = new ClubDAO();
		int x =clubDao.add(club);
		RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
		rd.include(request, response);
	 out.println("<h3><CENTER>Registration Success .."+x+" Rows inserted...</CENTER></H3>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}	

}
