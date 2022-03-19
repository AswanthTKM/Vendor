package com.FinalProject.Entity;

import java.util.Date;

/*create table reviews (sno int auto_increment primary key, vendorid int,
 * vendorname varchar(45),location varchar(45),foodieid int,dateofvisit date,dateofreview date,
 * review varchar(100),ratings varchar(10),complaint varchar(50) ,
FOREIGN KEY(vendorid) REFERENCES vendor(vendorid),
FOREIGN KEY(foodieid) REFERENCES foodie(foodieid) );*/

public class Reviews {
	
	private int sno;
	private String vendorid;
	private String vendorname;
	private String location;
	private String foodieid;
	private String dateofvisit;
	private String dateofreview;
	private String review;
	private String ratings;
	private String complaint;
	
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
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFoodieid() {
		return foodieid;
	}
	public void setFoodieid(String foodieid) {
		this.foodieid = foodieid;
	}
	public String getDateofvisit() {
		return dateofvisit;
	}
	public void setDateofvisit(String dateofvisit) {
		this.dateofvisit = dateofvisit;
	}
	public String getDateofreview() {
		return dateofreview;
	}
	public void setDateofreview(String dateofreview) {
		this.dateofreview = dateofreview;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	public Reviews(int sno, String vendorid, String vendorname, String location, String foodieid, String dateofvisit,
			String dateofreview, String review, String ratings, String complaint) {
		super();
		this.sno = sno;
		this.vendorid = vendorid;
		this.vendorname = vendorname;
		this.location = location;
		this.foodieid = foodieid;
		this.dateofvisit = dateofvisit;
		this.dateofreview = dateofreview;
		this.review = review;
		this.ratings = ratings;
		this.complaint = complaint;
	}
	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
