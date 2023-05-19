package com.skillstorm.project;

import java.util.ArrayList;

public class Account {
	private String name;
	private String userID;
	private String password;
	private String email;
	private String phone;
	private static ArrayList<String> applications;
	
	public Account() {}

	public Account(String name, String userID, String password, String email, String phone) {
		this.name = name;
		this.userID = userID;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public static void addToApp(String i) {
		applications.add(i);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public ArrayList<String> getApplications() {
		return applications;
	}
	public void setApplications(ArrayList<String> application) {
		this.applications = application;
	}
}
