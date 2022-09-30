package com.masai.bean;

public class Batch {

	private int Batch;
	private int totalSeat;
	private int bid;

	public Batch() {
		super();
	}
	public Batch(int batch,  int totalSeat,int bid) {
		super();
		Batch = batch;
		this.totalSeat = totalSeat;
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
	public int getTotalSeat() {
		return totalSeat;
	}
	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	@Override
	public String toString() {
		return "Batch [Batch=" + Batch + ", bid=" + bid + ", totalSeat=" + totalSeat + "]";
	}
	
	

	
	
	
}
