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
import com.FinalProject.RepoImpl.LoginRepoImpl;

@Controller
public class LoginController {
	
	@Autowired
	LoginRepoImpl lr;
	
	@GetMapping("ab")
	public String loginpage()
	{
		return "Login/LoginPage";
	}
	
	@PostMapping("loginprocess")
	public String logIn(@RequestParam String txtuser,@RequestParam String txtpass,@RequestParam String usertype,Model m)
	{
		usertype.equals("Admin");
			boolean res = lr.validateAdmin(txtuser, txtpass);
			if(res) {
				return "Admin/HomePage";
			}
		
			else {
			m.addAttribute("msg","Wrong username/password");
			return "Login/LoginPage";
		}
			
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
		
		return "Login/payment";
		
	}
	
	@PostMapping("sub")
	public String makePayment(@RequestParam String vendorid,@RequestParam String subsc,Model M) {
		accounts ac=new accounts();
		ac.setVendorid(Integer.parseInt(vendorid));
		ac.setSubscription(subsc);
		if(subsc.equals("one")) {
			ac.setPaidamount(1000);
		}
		else if(subsc.equals("three")) {
			ac.setPaidamount(2000);
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
	



