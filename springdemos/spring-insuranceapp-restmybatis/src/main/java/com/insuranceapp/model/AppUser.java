package com.insuranceapp.model;

import java.util.List;

public class AppUser {
	private String userName;
	private String password;
	private String email;
	private Integer userId;
	private List<String> role;
	public AppUser() {
		super();
	}
	public AppUser(String userName, String password, String email, Integer userId, List<String> role) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.userId = userId;
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public List<String> getrole() {
		return role;
	}
	public void setrole(List<String> role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "AppUser [userName=" + userName + ", password=" + password + ", email=" + email + ", userId=" + userId
				+ ", role=" + role + "]";
	}
	

}
