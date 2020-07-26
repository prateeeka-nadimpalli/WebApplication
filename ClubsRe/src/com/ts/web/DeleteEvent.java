package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.EventDAO;
import com.ts.dto.Event;

@WebServlet("/DeleteEvent")
public class DeleteEvent extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int eventid = Integer.parseInt(request.getParameter("eventid"));	
		EventDAO eventDao = new EventDAO();
		Event event = eventDao.getEvent(eventid);
		if(event!=null){
			request.setAttribute("event", event);
			eventDao.deleteEvent(eventid);
			//request.setAttribute("clubId", event.getClub().getClubid());
			RequestDispatcher rd2 = request.getRequestDispatcher("DisplayAllEvent");
			rd2.forward(request, response);
		}
		else{
			out.println("event not found");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
