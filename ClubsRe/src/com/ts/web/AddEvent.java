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
import com.ts.dao.EventDAO;
import com.ts.dto.Club;
import com.ts.dto.Event;

@WebServlet("/AddEvent")
public class AddEvent extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String eventname = request.getParameter("name");
		String ename = request.getParameter("ename");
        int eventId = Integer.parseInt(request.getParameter("Id"));
        int clubId = Integer.parseInt(request.getParameter("clubId"));
		String desc = request.getParameter("desc");
		Club club = new Club();
		club.setClubid(clubId);
        Event event = new Event(eventId,eventname,ename,desc,club);		
		EventDAO eventDao = new EventDAO();
		int x =eventDao.register(event);
		RequestDispatcher rd = request.getRequestDispatcher("EventDisplayByClub.jsp");
		rd.include(request, response);
	 out.println("<h3><CENTER>Registration Success .."+x+" Rows inserted...</CENTER></H3>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}	

}
