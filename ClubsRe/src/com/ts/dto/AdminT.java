package com.ts.dto;


public class AdminT {
private String mail;
private String password;
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public AdminT() {
	super();
}
public AdminT(String mail, String password) {
	super();
	this.mail = mail;
	this.password = password;
}

}
