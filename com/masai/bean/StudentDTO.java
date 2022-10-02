package com.masai.bean;

public class StudentDTO {
	
	private int roll;
	private String name; 
	private String email ;
	private String mobile;

	private int cid;
	private String cname;
	private int fees;
	
	private int Batch;
	private int totalSeat;
	private int bid;
	public StudentDTO() {
		super();
	}
	
	public StudentDTO(int roll, String name, String email, String mobile, String cname, int fees, int batch) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
		this.Batch = batch;
		this.totalSeat = totalSeat;
		this.bid = bid;
	}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getBatch() {
		return Batch;
	}
	public void setBatch(int batch) {
		Batch = batch;
	}
	public int getTotalSeat() {
		return totalSeat;
	}
	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "StudentDTO [roll=" + roll + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", cid="
				+ cid + ", cname=" + cname + ", fees=" + fees + ", Batch=" + Batch + ", totalSeat=" + totalSeat
				+ ", bid=" + bid + "]";
	}
	
	
	
	

}
