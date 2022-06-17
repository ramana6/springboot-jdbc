package com.ramana.demo;


public class User {
	
	private long user_id;
	private String username;
	private String email;
	private String dept;
	private String user_zone;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long user_id, String username, String email, String dept, String user_zone) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.dept = dept;
		this.user_zone = user_zone;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getUser_zone() {
		return user_zone;
	}
	public void setUser_zone(String user_zone) {
		this.user_zone = user_zone;
	}
	
	
}
