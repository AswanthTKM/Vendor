package com.FinalProject.RepoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.FinalProject.Entity.accounts;
import com.FinalProject.Entity.foodie;
import com.FinalProject.Entity.vendor;
import com.FinalProject.Repo.AdminRepo;


@Component
public class AdminRepoImpl implements AdminRepo {
	
	@Autowired
	JdbcTemplate jt;

	@Override
	public List<foodie> showAllfoodie() {
		String sql = "Select * from foodie;";
		try {
		List<foodie> foodieAll = jt.query(sql, new BeanPropertyRowMapper(foodie.class));
		return foodieAll;
		}
		catch(Exception ex) {
		System.out.println(ex.getMessage());
		}
		return null;
		}

	@Override
	public List<vendor> showAllvendorreq() {
		// TODO Auto-generated method stub
		String sql = "Select * from vendor where reqstatus='pending';";
		try {
		List<vendor> vendrqAll = jt.query(sql, new BeanPropertyRowMapper(vendor.class));
		return vendrqAll;
		}
		catch(Exception ex) {
		System.out.println(ex.getMessage());
		}
		return null;
		
	}

	@Override
	public String approveVendorById(String vendorid) {
		// TODO Auto-generated method stub
		vendor vob=searchVendorById(vendorid);
		try
		{
			if(vob.getReqstatus().equals("approved")){
				return "Already Approved";
			}
			else if(vob.getReqstatus().equals("pending")) {
				String sql="update vendor set reqstatus='approved' where vendorid=?;";
				int res=jt.update(sql,new Object[] {vendorid});
				if(res>=1)
					return "Request Approved Successfully";
				else
					return "Error in approve";
							
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	@Override
	public String rejectVendorById(String vendorid) {
		// TODO Auto-generated method stub
		try
		{
			String sql="update vendor set reqstatus='rejected' where vendorid=?;";
			int res=jt.update(sql,new Object[] {vendorid});
			if(res>=1)
				return "Request Rejected";
			else
				return "Error in reject";
							
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}

	@Override
	public vendor searchVendorById(String vendorid) {
		// TODO Auto-generated method stub
		String sql = "Select * from vendor where vendorid=?;";
		try
		{
			vendor x=(vendor) jt.queryForObject(sql, new Object[] {vendorid}, new BeanPropertyRowMapper(vendor.class));
			return x;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}

	@Override
	public accounts getAccountsObjectById(String vendorid) {
		// TODO Auto-generated method stub
		String sql = "Select * from accounts where vendorid=?;";
		try
		{
			accounts ac=(accounts) jt.queryForObject(sql, new Object[] {vendorid}, new BeanPropertyRowMapper(accounts.class));
			return ac;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}

	@Override
	public String transcatDebitAdmin(String vendorid, int amount) {
		// TODO Auto-generated method stub
		String str="update transact set balance=balance-? Where user='admin';";
		int r=jt.update(str,new Object[] {amount});
		if(r>=1)
			return "Amount transferred Succesfully";
		else
			return "Error Occured";
		
	}

	@Override
	public String transcatCreditVendor(String vendorid, int amount) {
		// TODO Auto-generated method stub
		String str="update transact set balance=balance+? Where user=?;";
		int r=jt.update(str,new Object[] {amount,vendorid});
		if(r>=1)
			return "Amount transferred Succesfully";
		else
			return "Error Occured";
	}
	@Override
	public List<vendor> showAllApprovedvendor() {
	// TODO Auto-generated method stub
		String sql = "Select * from vendor where reqstatus='approved';";
		try {
		List<vendor> appven = jt.query(sql, new BeanPropertyRowMapper(vendor.class));
		return appven;
		}
		catch(Exception ex) {
		System.out.println(ex.getMessage());
		}
		return null; 
	}



	@Override
	public String ActivateVendorById(String vendorid) {
		vendor v=searchVendorById(vendorid);
		try
		{
			String sql="update vendor set activestatus='activated' where vendorid=?;";
			int res=jt.update(sql,new Object[] {vendorid});
			if(res>=1)
			return "Vendor Activated Successfully";
			else
			return "Error in activation";
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}



	@Override
	public String DeactivateVendorById(String vendorid) {
	// TODO Auto-generated method stub
		vendor v=searchVendorById(vendorid);
		try
		{
	
			String sql="update vendor set activestatus='deactivated' where vendorid=?;";
			int res=jt.update(sql,new Object[] {vendorid});
			if(res>=1)
			return "Vendor Deactivated Successfully";
			else
			return "Error in Deactivation";
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}



	@Override
	public String DeleteVendorById(String vendorid) {
	// TODO Auto-generated method stub
		try
		{
			String sql="update vendor set reqstatus='rejected' where vendorid=?;";
			int res=jt.update(sql,new Object[] {vendorid});
			if(res>=1)
			return "Vendor Deleted";
			else
			return "Error";
		
	
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}



	

}
