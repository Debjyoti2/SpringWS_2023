package com.spring.vo;

public class UserVO {
	
	private String userName;
	private String userEmail;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "UserVO [userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	
	

}
