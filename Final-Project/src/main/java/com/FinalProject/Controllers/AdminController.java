package com.FinalProject.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.FinalProject.Entity.accounts;
import com.FinalProject.Entity.foodie;
import com.FinalProject.Entity.vendor;
import com.FinalProject.RepoImpl.AdminRepoImpl;

@Controller
public class AdminController {
	
	@Autowired
	AdminRepoImpl ai;
	
	@GetMapping("showf")
	public String getfoodielist(Model m)
	{
		List<foodie> reslist = ai.showAllfoodie();
		m.addAttribute("flist", reslist);
		return "Admin/viewfoodie";

	}
	
	@GetMapping("vendrs")
	public String logIn(Model m) 
	{
		List<vendor> vendrqAll=ai.showAllvendorreq();
		m.addAttribute("vendrqAll", vendrqAll);
		
		return "Admin/ViewReqs";
		
	}
	@GetMapping("acceptvendor/{vendorid}")
	public String acceptVendor(@PathVariable String vendorid,Model m) 
	{
	
		String r=ai.approveVendorById(vendorid);
		if(r!=null) {
			m.addAttribute("msg",r);
			List<vendor> vendrqAll=ai.showAllvendorreq();
			m.addAttribute("vendrqAll", vendrqAll);
			return "Admin/ViewReqs";
		}
		else {
			m.addAttribute("msg", "failed");
			return "Admin/ViewReqs";
		}
	
		
	}
	
	@GetMapping("rejectvendor/{vendorid}")
	public String rejectVendor(@PathVariable String vendorid,Model m) 
	{
	
		String r=ai.rejectVendorById(vendorid);
		if(r!=null) {
			accounts acc=ai.getAccountsObjectById(vendorid);
			acc.setPaidamount(0);
			String subsc=acc.getSubscription();
			if(subsc.equals("one")) {
				ai.transcatDebitAdmin(vendorid, 1000);
				ai.transcatCreditVendor(vendorid, 1000);
			}
			else if(subsc.equals("three")) {
				ai.transcatDebitAdmin(vendorid, 2000);
				ai.transcatCreditVendor(vendorid, 2000);
			}
			else if(subsc.equals("six")) {
				ai.transcatDebitAdmin(vendorid, 5000);
				ai.transcatCreditVendor(vendorid, 1000);
			}
			else if(subsc.equals("twelve")) {
				ai.transcatDebitAdmin(vendorid, 9000);
				ai.transcatCreditVendor(vendorid, 1000);
			}
			m.addAttribute("msg",r);
			List<vendor> vendrqAll=ai.showAllvendorreq();
			m.addAttribute("vendrqAll", vendrqAll);
			return "Admin/ViewReqs";
		}
		else {
			m.addAttribute("msg", "failed");
			return "Admin/ViewReqs";
		}
	
		
	}
	
	@GetMapping("showv")
	public String viewVendor(Model m)
	{
		List<vendor>vlist=ai.showAllApprovedvendor();
		m.addAttribute("vlist", vlist);
		return "Admin/viewvendor";
	}


	@GetMapping("activate/{vendorid}")
	public String activateVendor(@PathVariable String vendorid,Model m)
	{

		String r=ai.ActivateVendorById(vendorid);
		if(r!=null) {
			m.addAttribute("msg",r);
			List<vendor> vlist=ai.showAllApprovedvendor();
			m.addAttribute("vlist", vlist);
			return "Admin/viewvendor";
		}
		else {
			m.addAttribute("msg", "failed activation");
			return "Admin/viewvendor";
		}


	}

	@GetMapping("deactivate/{vendorid}")
	public String deactivateVendor(@PathVariable String vendorid,Model m)
	{

		String r=ai.DeactivateVendorById(vendorid);
		if(r!=null) {
			m.addAttribute("msg",r);
			List<vendor> vlist=ai.showAllApprovedvendor();
			m.addAttribute("vlist", vlist);
			return "Admin/viewvendor";
		}
		else {
			m.addAttribute("msg", "failed deactivation");
			return "Admin/viewvendor";
		}


	}

	@GetMapping("delete/{vendorid}")
	public String deletevendor(@PathVariable String vendorid,Model m)
	{
		String st=ai.searchVendorById(vendorid).getActivestatus();
		if(st.equals("activated")) {
			m.addAttribute("msg", "Cannot delete active vendor");
			return "Admin/viewvendor";
		}
		else if(st.equals("deactivated")) {
			String r = ai.DeleteVendorById(vendorid);
			if(r!=null) {
				m.addAttribute("msg",r);
				List<vendor> vlist=ai.showAllApprovedvendor();
				m.addAttribute("vlist", vlist);
				return "Admin/viewvendor";
			}
			else {
				m.addAttribute("msg", "failed");
				return "Admin/viewvendor";
			}
		}
		return null;
		
	}
}
