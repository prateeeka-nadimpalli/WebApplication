package com.ts.dto;

public class Event {
	private int eventid;
	private String eventname;
	private String ename;
	private String description;
	private Club club;
	
	public int getEventid() {
		return eventid;
	}

	public void setEventid(int eventid) {
		this.eventid = eventid;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public Event() {
		super();
	}

	public Event(int eventid, String eventname, String ename, String description, Club club) {
		super();
		this.eventid = eventid;
		this.eventname = eventname;
		this.ename = ename;
		this.description = description;
		this.club = club;
	}
	

}
