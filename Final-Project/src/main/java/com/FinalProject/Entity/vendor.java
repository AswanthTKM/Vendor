package com.FinalProject.Entity;

public class vendor {
	
	private String vendorid;
	private String vendorname;
	private String email;
	private String password;
	private String location;
	private String websiteid;
	private String vendortype;
	private String cusinetype;
	private String uploadmenucard;
	private String uploadphoto;
	private String status;
	
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWebsiteid() {
		return websiteid;
	}
	public void setWebsiteid(String websiteid) {
		this.websiteid = websiteid;
	}
	public String getVendortype() {
		return vendortype;
	}
	public void setVendortype(String vendortype) {
		this.vendortype = vendortype;
	}
	public String getCusinetype() {
		return cusinetype;
	}
	public void setCusinetype(String cusinetype) {
		this.cusinetype = cusinetype;
	}
	public String getUploadmenucard() {
		return uploadmenucard;
	}
	public void setUploadmenucard(String uploadmenucard) {
		this.uploadmenucard = uploadmenucard;
	}
	public String getUploadphoto() {
		return uploadphoto;
	}
	public void setUploadphoto(String uploadphoto) {
		this.uploadphoto = uploadphoto;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public vendor( String vendorname, String email, String password, String location, String websiteid,
			String vendortype, String cusinetype, String uploadmenucard, String uploadphoto) {
		super();
		
		this.vendorname = vendorname;
		this.email = email;
		this.password = password;
		this.location = location;
		this.websiteid = websiteid;
		this.vendortype = vendortype;
		this.cusinetype = cusinetype;
		this.uploadmenucard = uploadmenucard;
		this.uploadphoto = uploadphoto;
		
	}
	public vendor() {
		super();
	}
	
	
	
}
