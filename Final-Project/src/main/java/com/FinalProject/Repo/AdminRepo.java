package com.FinalProject.Repo;

import java.util.List;

import com.FinalProject.Entity.foodie;
import com.FinalProject.Entity.vendor;

public interface AdminRepo {
	
	public List<foodie> showAllfoodie();
	public List<vendor> showAllvendor();

}
