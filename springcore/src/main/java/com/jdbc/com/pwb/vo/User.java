package com.jdbc.com.pwb.vo;

public class User {
	
	private int at_userid;
	private String at_username;
	private String at_email;
	private String at_password;
	private String at_gender;
	
	public User() {
	}

	public User(int at_userid, String at_username, String at_email, String at_password, String at_gender) {
		super();
		this.at_userid = at_userid;
		this.at_username = at_username;
		this.at_email = at_email;
		this.at_password = at_password;
		this.at_gender = at_gender;
	}

	public int getAt_userid() {
		return at_userid;
	}

	public void setAt_userid(int at_userid) {
		this.at_userid = at_userid;
	}

	public String getAt_username() {
		return at_username;
	}

	public void setAt_username(String at_username) {
		this.at_username = at_username;
	}

	public String getAt_email() {
		return at_email;
	}

	public void setAt_email(String at_email) {
		this.at_email = at_email;
	}

	public String getAt_password() {
		return at_password;
	}

	public void setAt_password(String at_password) {
		this.at_password = at_password;
	}

	public String getAt_gender() {
		return at_gender;
	}

	public void setAt_gender(String at_gender) {
		this.at_gender = at_gender;
	}

	@Override
	public String toString() {
		return "User [at_userid=" + at_userid + ", at_username=" + at_username + ", at_email=" + at_email
				+ ", at_password=" + at_password + ", at_gender=" + at_gender + "]";
	}
	
	

}
