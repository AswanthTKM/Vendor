package com.FinalProject.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.FinalProject.Entity.foodie;
import com.FinalProject.RepoImpl.AdminRepoImpl;
import com.FinalProject.RepoImpl.VendorRepoImpl;

public class VendorController {
	
	@Autowired
	VendorRepoImpl ai;
	
	@GetMapping("showf")
	public String getfoodielist(Model m)
	{
		//List<foodie> reslist = ai.showAllfoodie();
		//m.addAttribute("flist", reslist);
		return "Admin/viewfoodie";

	}
	

}
