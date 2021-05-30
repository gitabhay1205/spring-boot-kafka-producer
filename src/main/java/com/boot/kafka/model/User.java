package com.boot.kafka.model;

public class User {
	
	private String name;
	private String department;
	private int userId;
	public User(String name, String department, int userId) {
		super();
		this.name = name;
		this.department = department;
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}


}
