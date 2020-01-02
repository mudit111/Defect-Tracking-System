package com.defect.entity;

public class Password {

	private String userPassword;

	public Password() {

	}

	public Password(String userPassword) {
		super();
		this.userPassword = userPassword;
	}

	public String getPassword() {
		return userPassword;
	}

	public void setPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}