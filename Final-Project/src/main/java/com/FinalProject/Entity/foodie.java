package com.FinalProject.Entity;

public class foodie {
	
	private String foodieid;
	private String firstname;
	private String lastname;
	private String password;
	private String confirmpassword;
	private String emailid;
	private String gender;
	private String dob;
	private String mobile;
	private String address;
	
	public String getFoodieid() {
		return foodieid;
	}
	public void setFoodieid(String foodieid) {
		this.foodieid = foodieid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public foodie( String firstname, String lastname, String password, String confirmpassword,
			String emailid, String gender, String dob, String mobile,String address) {
		super();
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.emailid = emailid;
		this.gender = gender;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
	}
	public foodie() {
		super();
	}
	
	

}