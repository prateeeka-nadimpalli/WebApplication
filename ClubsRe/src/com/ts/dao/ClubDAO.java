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

public class ClubDAO {
private SessionFactory factory = null;
	
	public int add(Club club) {
		Connection con = null;
		PreparedStatement pst = null;
		final String INSERT_QUERY="insert into club(clubname,email,password,cname,description) values(?,?,?,?,?)";
		con = MyConnection.getConnection();
		int x = 0;
		try {
			pst = con.prepareStatement(INSERT_QUERY);
			pst.setString(1, club.getClubname());
			pst.setString(2, club.getEmail());
			pst.setString(3, club.getPassword());
			pst.setString(4, club.getCname());
			pst.setString(5, club.getDescription());
			x = pst.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return x;		
	}
	public List<Club> getAllClubs() {
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		final String SELECT_QUERY="select * from club";
		con = MyConnection.getConnection();
		List <Club> liste=new ArrayList<Club>();
		try {
			pst = con.prepareStatement(SELECT_QUERY);			
			rs = pst.executeQuery();
			while(rs.next()) {
				Club club = new Club();
				club.setClubid(rs.getInt(1));
				club.setClubname(rs.getString(2));
				club.setEmail(rs.getString(3));
				club.setPassword(rs.getString(4));
				club.setCname(rs.getString(5));
				club.setDescription(rs.getString(6));
				liste.add(club);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return liste;	
	}
	public Club getClub(int id) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		final String SELECT_QUERY="select * from club where clubid=?";
		con = MyConnection.getConnection();
		Club club = null;
		try {
			pst = con.prepareStatement(SELECT_QUERY);
			pst.setInt(1, id);			
			rs = pst.executeQuery();
			if(rs.next()) {
				club = new Club();
				club.setClubid(rs.getInt(1));
				club.setClubname(rs.getString(2));
				club.setEmail(rs.getString(3));
				club.setPassword(rs.getString(4));
				club.setCname(rs.getString(5));
				club.setDescription(rs.getString(6));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return club;		
	}
	public Club getClub(String email,String password) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		final String SELECT_QUERY="select * from club where email=? and password=?";
		con = MyConnection.getConnection();
		Club club = null;
		try {
			pst = con.prepareStatement(SELECT_QUERY);
			pst.setString(1,email);	
			pst.setString(2, password);
			rs = pst.executeQuery();
			if(rs.next()) {
				club = new Club();
				club.setClubid(rs.getInt(1));
				club.setClubname(rs.getString(2));
				club.setEmail(rs.getString(3));
				club.setPassword(rs.getString(4));
				club.setCname(rs.getString(5));
				club.setDescription(rs.getString(6));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return club;		
	}
	public void deleteClub(int clubid) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pst = null;
		final String SELECT_QUERY="delete from club where clubid=?";
		con = MyConnection.getConnection();		
		try {
			pst = con.prepareStatement(SELECT_QUERY);
			pst.setInt(1, clubid);
			pst.executeUpdate();
		}
catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	/*public Club getClubb(int clubId) {
		Connection con = null;
		PreparedStatement pst1 = null;
		PreparedStatement pst2 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		Club club = null;
		final String QUERY_CLUB="select * from club where CLUB_ID = ?";
		final String QUERY_EVENT="select * from event where eventId = ?";
		con = MyConnection.getConnection();
		try {
			pst1 = con.prepareStatement(QUERY_CLUB);
			pst1.setInt(1, clubId);			
			rs1 = pst1.executeQuery();
			if(rs1.next()) {
				club = new Club();
				club.setClubid(rs1.getInt(1));
				club.setClubname(rs1.getString(2));
				club.setEmail(rs1.getString(3));
				club.setPassword(rs1.getString(4));
				club.setCname(rs1.getString(5));
				club.setDescription(rs1.getString(6));			
			}
			pst2 = con.prepareStatement(QUERY_EVENT);
			pst2.setInt(1, clubId);			
			rs2 = pst2.executeQuery();
			while(rs2.next()) {
				Event event = new Event();
				event.setEventid(rs2.getInt(1));
				event.setEventname(rs2.getString(2));
				event.setEname((rs2.getString(4));
				event.setDescription(rs2.getString(5));
				System.out.println(event);
				club.getEvents().add(event);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println("Inside DEPT DAO"+dept);
		return null;		
	}*/

}
