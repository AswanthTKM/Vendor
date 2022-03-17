package com.FinalProject.Repo;

import com.FinalProject.Entity.accounts;
import com.FinalProject.Entity.foodie;
import com.FinalProject.Entity.vendor;

public interface LoginRepo {
	
	public boolean validateAdmin(String username,String password);
	public vendor validatevendor(String vendorid,String password);
	public foodie validatefoodie(String foodieid,String password);
    public boolean addvendor (vendor ven);
    public boolean addfoodie (foodie fod);
    public boolean makepayment(accounts acc);
    
    
}
