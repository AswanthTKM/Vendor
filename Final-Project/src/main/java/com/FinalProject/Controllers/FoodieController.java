package com.FinalProject.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.FinalProject.Entity.Reviews;
import com.FinalProject.Entity.foodie;
import com.FinalProject.Entity.vendor;
import com.FinalProject.RepoImpl.AdminRepoImpl;
import com.FinalProject.RepoImpl.FoodieRepoImpl;

@Controller
public class FoodieController {
	
	@Autowired
	FoodieRepoImpl fr;
	
	@GetMapping("fhome")
	public String foodieHome(Model m)
	{
		String fid=fr.getFoodieId();
		foodie f=fr.getFoodieById(fid);
		m.addAttribute("f",f);
		return "Foodie/foodiehome";

	}
	
	@GetMapping("freview")
	public String foodieReview(Model m)
	{
		List<vendor> venderacAll=fr.showActivatedVendor();
		m.addAttribute("venderacAll",venderacAll);
		foodie f=fr.getFoodieById(fr.getFoodieId());
		m.addAttribute("f",f);
		return "Foodie/foodiereview";

	}
	
	@GetMapping("vendshow/{vendorname}")
	public String activateVendor(@PathVariable String vendorname,Model m)
	{
		vendor v=fr.getVendorByName(vendorname);
		if(v!=null) {
			/*m.addAttribute("msg",r);
			List<vendor> vlist=ai.showAllApprovedvendor();*/
			m.addAttribute("v", v);
			return "Foodie/showvendor";
		}
		else {
			m.addAttribute("msg", "null vendor");
			return "Foodie/foodiereview";
		}
	}
	
	@PostMapping("/addreview/{vendorid}/{vendorname}/{location}")
	public String addNewReview(@PathVariable String vendorid,@PathVariable String vendorname,
			@PathVariable String location,
			
			@RequestParam String review,
			@RequestParam String ratings,Model m)
	{
		Reviews r=new Reviews();
		r.setVendorid(vendorid);
		r.setVendorname(vendorname);
		r.setLocation(location);
		r.setFoodieid(fr.getFoodieId());
		//r.setDateofvisit(dateofvisit);
		//r.setDateofreview(dateofreview);
		r.setReview(review);
		r.setRatings(ratings);
		//r.setComplaint(complaints);
		String st=fr.addReview(r);
		m.addAttribute("msg",st);
		return "Foodie/foodiereview";
		
	}
	
	@GetMapping("viewfreview")
	public String viewFoodieReview(Model m)
	{
		String fid=fr.getFoodieId();
		List<Reviews> reviewfAll=fr.viewReview(fid);
		m.addAttribute("reviewfAll",reviewfAll);
		return "Foodie/viewfreview";

	}

}
