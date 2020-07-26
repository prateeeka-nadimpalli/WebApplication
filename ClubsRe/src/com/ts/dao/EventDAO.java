package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.MyConnection;
import com.ts.dto.Club;
import com.ts.dto.Event;

public class EventDAO {
private SessionFactory factory = null;


	
	public int register(Event event) {
		Connection con = null;
		PreparedStatement pst = null;
		final String INSERT_QUERY="insert into event(eventname,ename,description,CLUB_ID) values(?,?,?,?)";
		con = MyConnection.getConnection();
		int x = 0;
		try {
			pst = con.prepareStatement(INSERT_QUERY);
			pst.setString(1, event.getEventname());
			pst.setString(2, event.getEname());
			pst.setString(3, event.getDescription());
			pst.setInt(4, event.getClub().getClubid());

			x = pst.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return x;		
	}



	public List<Event> getAllEvents(int clubId) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		final String SELECT_QUERY="select * from event where CLUB_ID = ?";
		con = MyConnection.getConnection();
		List<Event> arrayList = new ArrayList<Event>();
		try {
			pst = con.prepareStatement(SELECT_QUERY);
			pst.setInt(1, clubId);			
			rs = pst.executeQuery();
			while(rs.next()) {
				Event event = new Event();
				event.setEventid(rs.getInt(1));
				event.setEventname(rs.getString(2));
				event.setEname(rs.getString(3));
				event.setDescription(rs.getString(4));	
				//event.getClub().setClubid(rs.getInt(5));
				//event.getClub().setClubname(rs.getString(6));
				arrayList.add(event);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return arrayList;
	}
	public Event getEvent(int id) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		final String SELECT_QUERY="select * from event where eventid = ?";
		con = MyConnection.getConnection();
		Event event = null;
		try {
			pst = con.prepareStatement(SELECT_QUERY);
			pst.setInt(1, id);			
			rs = pst.executeQuery();
			if(rs.next()) {
				event = new Event();
				event.setEventid(rs.getInt(1));
				event.setEventname(rs.getString(2));
				event.setEname(rs.getString(3));
				event.setDescription(rs.getString(4));
				//event.getClub().setClubid(rs.getInt(5));
				//event.getClub().setClubname(rs.getString(6));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return event;		
	}



	public void deleteEvent(int eventid) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		final String SELECT_QUERY="delete from event where eventid=?";
		con = MyConnection.getConnection();		
		try {
			pst = con.prepareStatement(SELECT_QUERY);
			pst.setInt(1,eventid);
			pst.executeUpdate();
		}
catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
