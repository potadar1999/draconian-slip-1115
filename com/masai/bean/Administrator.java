package com.masai.bean;

public class Administrator {
	
	private int cid;
	private String cname;
	private int fees;
	public Administrator() {
		super();
	}
	public Administrator(int cid, String cname, int fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
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
	@Override
	public String toString() {
		return "Administrator [cid=" + cid + ", cname=" + cname + ", fees=" + fees + "]";
	}
	
	
	
	
	
	

}
