package com.masai.bean;

public class Adminlog {
	
	private String email;
	private String password;
	public Adminlog() {
		super();
	}
	public Adminlog(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Adminlog [email=" + email + ", password=" + password + "]";
	}
	
	

}
