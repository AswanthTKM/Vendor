package com.FinalProject.Repo;

import java.util.List;

import com.FinalProject.Entity.accounts;
import com.FinalProject.Entity.foodie;
import com.FinalProject.Entity.vendor;

public interface AdminRepo {
	
	public List<foodie> showAllfoodie();
	public List<vendor> showAllvendorreq();
	public vendor searchVendorById(String id);
	public String approveVendorById(String vendorid);
	public String rejectVendorById(String vendorid);
	public accounts getAccountsObjectById(String vendorid);
	public String transcatDebitAdmin(String vendorid, int amount);
	public String transcatCreditVendor(String vendorid, int amount);
	public List<vendor> showAllApprovedvendor();
	public String ActivateVendorById(String vendorid);
	public String DeactivateVendorById(String vendorid);
	public String DeleteVendorById(String vendorid);

}
