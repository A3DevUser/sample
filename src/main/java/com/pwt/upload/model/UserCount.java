package com.pwt.upload.model;

public class UserCount {
	
	private String userName;
	int total;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public UserCount(String userName, int total) {
		super();
		this.userName = userName;
		this.total = total;
	
	}
	public UserCount() {
		super();
	}
	
	

}
