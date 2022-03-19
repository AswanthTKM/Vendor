package com.FinalProject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.FinalProject.Entity.accounts;
import com.FinalProject.Entity.foodie;
import com.FinalProject.Entity.vendor;
import com.FinalProject.RepoImpl.FoodieRepoImpl;
import com.FinalProject.RepoImpl.LoginRepoImpl;

@Controller
public class LoginController {
	
	@Autowired
	LoginRepoImpl lr;
	
	@Autowired
	FoodieRepoImpl fr;
	
	@GetMapping("ab")
	public String loginpage()
	{
		return "Login/LoginPage";
	}
	
	@PostMapping("loginprocess")
	public String logIn(@RequestParam String txtuser,@RequestParam String txtpass,@RequestParam String usertype,Model m)
	{
		if(usertype.equals("Admin"))
		{
			
			return "Admin/HomePage";
			
		}
		else if(usertype.equals("Vendor"))
		{
			vendor v = lr.validatevendor(txtuser, txtpass);
			if(v==null) {
				m.addAttribute("msg","Wrong username/password");
				return "Login/LoginPage";
			}
			else if((v.getReqstatus().equals("approved"))&& (v.getActivestatus().equals("activated")))
			{
				m.addAttribute("v", v);
				return "vendor/vendorhome";
			}
			else if(v.getReqstatus().equals("pending"))
			{
				return "vendor/pendingvendor";
			}
			else if(v.getActivestatus().equals("deactivated"))
			{
				return "vendor/deactivatevendor";
			}
			else
				m.addAttribute("msg","Wrong username/password");
				return "Login/LoginPage";
		}
	
		else if(usertype.equals("Foodie"))
		{
			foodie f = lr.validatefoodie(txtuser, txtpass);
			if (f!=null)
			{
				fr.setFoodieId(f.getFoodieid());
				m.addAttribute("f", f);
				return "Foodie/foodiehome";
			}
			else
				m.addAttribute("msg","Wrong username/password");
				return "Login/LoginPage";
		}
	
		else
			m.addAttribute("msg","Wrong username/password");
			return "Login/LoginPage";

	}

	
	@GetMapping("vendorReg")
	public String getvendorregpage()
	{
		return "Login/vendorRegi";
	}
	
	@GetMapping("foodieReg")
	public String getfoodieregpage()
	{
		return "Login/foodieRegi";
	}
	
	@PostMapping("addvendor")
	public String addNewVendor(@RequestParam String vendorname,@RequestParam String email,@RequestParam String websiteid,@RequestParam String location,@RequestParam String password,@RequestParam String vendortype,
			@RequestParam String cusinetype,@RequestParam String uploadmenucard,@RequestParam String uploadphoto ,Model m)
	{
		vendor v = new vendor();
		v.setVendorname(vendorname);
		v.setEmail(email);
		v.setWebsiteid(websiteid);
		v.setLocation(location);
		v.setPassword(password);
		v.setVendortype(vendortype);
		v.setCusinetype(cusinetype);
		v.setUploadmenucard(uploadmenucard);
		v.setUploadphoto(uploadphoto);
		boolean r = lr.addvendor(v);
		
		
		m.addAttribute("msg",r);
		String vid=lr.getVendorId(vendorname);
		System.out.println("new vendor id "+vid);
		String transadd=lr.addToTransact(vid);
		m.addAttribute("vid", vid);
		return "Login/payment";
		
	}
	
	@PostMapping("sub")
	public String makePayment(@RequestParam String vendorid,@RequestParam String subsc,Model M) {
		accounts ac=new accounts();
		ac.setVendorid(vendorid);
		ac.setSubscription(subsc);
		if(subsc.equals("one")) {
			ac.setPaidamount(1000);
			String ms=lr.transcationAdmin(vendorid,1000);
			lr.transcationVendor(vendorid, 1000);
			M.addAttribute("ms",ms);
			
		}
		else if(subsc.equals("three")) {
			ac.setPaidamount(2000);
			String ms=lr.transcationAdmin(vendorid,2000);
			lr.transcationVendor(vendorid, 2000);
			M.addAttribute("ms",ms);
		}
		else if(subsc.equals("six")) {
			ac.setPaidamount(5000);
			String ms=lr.transcationAdmin(vendorid,5000);
			lr.transcationVendor(vendorid, 5000);
			M.addAttribute("ms",ms);
		}
		else if(subsc.equals("twelve")) {
			ac.setPaidamount(9000);
			String ms=lr.transcationAdmin(vendorid,9000);
			lr.transcationVendor(vendorid, 9000);
			M.addAttribute("ms",ms);
		}
		lr.makepayment(ac);
		
		M.addAttribute("msg","Succcesfull Payment");
		return "Login/payment";
		
	}
	
	@PostMapping("addfoodie")
	public String addNewFoodie(@RequestParam String firstname,@RequestParam String lastname,@RequestParam String password,@RequestParam String confirmpassword,@RequestParam String emailid,@RequestParam String dob,
			@RequestParam String gender,@RequestParam String address,@RequestParam String mobile,Model m)
	{
		foodie f = new foodie();
		f.setFirstname(firstname);
		f.setLastname(lastname);
		f.setPassword(password);
		f.setConfirmpassword(confirmpassword);
		f.setEmailid(emailid);
		f.setDob(dob);
		f.setGender(gender);
		f.setAddress(address);
		f.setMobile(mobile);
		boolean r = lr.addfoodie(f);
		m.addAttribute("msg", r);
		
		return "Login/foodieRegi";
		
	}
	
	
	
}
	



