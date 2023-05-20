package com.skillstorm.project;

import java.util.ArrayList;

public class Account {
	private String name;
	private String username;
	private String password;
	private String email;
	private String phone;
	private static ArrayList<String> applications = new ArrayList<>();
	
	public Account() {}

	public Account(String username, String password, String name, String email, String phone) {
		this.username = username;
		this.password = password;
		this.name = name;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public void setApplications(ArrayList<String> applications) {
		this.applications = applications;
	}
	public String toString() {
	    String results = "+";
	    for(String a : applications) {
	        results += a.toString();
	    }
	    return results;
	}	
}
