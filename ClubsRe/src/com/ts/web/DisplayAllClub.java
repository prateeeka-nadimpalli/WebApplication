package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.ClubDAO;
import com.ts.dto.Club;

@WebServlet("/DisplayAllClub")
public class DisplayAllClub extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();		
		ClubDAO clubDAO = new ClubDAO();
		List<Club> arrayList = clubDAO.getAllClubs();
		request.setAttribute("clubsData", arrayList);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayAllClub.jsp");
		rd.forward(request, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}