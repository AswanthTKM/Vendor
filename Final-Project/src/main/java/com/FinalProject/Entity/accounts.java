package com.FinalProject.Entity;

public class accounts {
	
	private int sno;
	private String vendorid;
	private String subscription;
	private int paidamount;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getVendorid() {
		return vendorid;
	}
	public void setVendorid(String vendorid) {
		this.vendorid = vendorid;
	}
	public String getSubscription() {
		return subscription;
	}
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}
	public int getPaidamount() {
		return paidamount;
	}
	public void setPaidamount(int paidamount) {
		this.paidamount = paidamount;
	}
	
	public accounts(int sno, String vendorid, String subscription, int paidamount) {
		super();
		this.sno = sno;
		this.vendorid = vendorid;
		this.subscription = subscription;
		this.paidamount = paidamount;
		
	}
	public accounts() {
		super();
	}
	
	

}
