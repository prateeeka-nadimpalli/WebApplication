package com.ts.dto;

public class Club {
	private int clubid;
	private String clubname;
	private String email;
	private String password;
	private String cname;
	private String description;
	public int getClubid() {
		return clubid;
	}
	public void setClubid(int clubid) {
		this.clubid = clubid;
	}
	public String getClubname() {
		return clubname;
	}
	public void setClubname(String clubname) {
		this.clubname = clubname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Club() {
		super();
	}
	
	public Club(String clubname, String email, String password, String cname, String description) {
		super();
		this.clubname = clubname;
		this.email = email;
		this.password = password;
		this.cname = cname;
		this.description = description;
	}
	public Club(int clubid, String clubname, String email, String password, String cname, String description) {
		super();
		this.clubid = clubid;
		this.clubname = clubname;
		this.email = email;
		this.password = password;
		this.cname = cname;
		this.description = description;
	}

	

}
