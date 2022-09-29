package com.masai.bean;

public class Batch {

	private int Batch;
	private int bid;
	public Batch() {
		super();
	}
	public Batch(int batch, int bid) {
		super();
		Batch = batch;
		this.bid = bid;
	}
	public int getBatch() {
		return Batch;
	}
	public void setBatch(int batch) {
		Batch = batch;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "Batch [Batch=" + Batch + ", bid=" + bid + "]";
	}
	
	
	
}
