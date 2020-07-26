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

import com.ts.dao.EventDAO;
import com.ts.dto.Event;

@WebServlet("/DisplayAllEvent")
public class DisplayAllEvent extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int clubId=Integer.parseInt(request.getParameter("clubId"));
		EventDAO eventDAO = new EventDAO();
		List<Event> arrayList = eventDAO.getAllEvents(clubId);
		request.setAttribute("eventsData", arrayList);
		request.setAttribute("clubId", clubId);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayAllEvent.jsp");
		rd.forward(request, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}