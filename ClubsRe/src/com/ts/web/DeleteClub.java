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

@WebServlet("/DeleteClub")
public class DeleteClub extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println(request.getParameter("clubid"));
		int clubid = Integer.parseInt(request.getParameter("clubid"));	
		ClubDAO clubDao = new ClubDAO();
		Club club = clubDao.getClub(clubid);
		if(club!=null){
			request.setAttribute("club", club);
			clubDao.deleteClub(clubid);
			RequestDispatcher rd2 = request.getRequestDispatcher("DisplayAllClub");
			rd2.include(request, response);
		}
		else{
			out.println("Club not found");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
