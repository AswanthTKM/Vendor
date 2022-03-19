package com.FinalProject.RepoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.FinalProject.Entity.Reviews;
import com.FinalProject.Entity.foodie;
import com.FinalProject.Entity.vendor;
import com.FinalProject.Repo.FoodieRepo;

@Component
public class FoodieRepoImpl implements FoodieRepo {
	
	@Autowired
	JdbcTemplate jt;
	
	private String foodieid;

	@Override
	public String addReview(Reviews obr) {
		// TODO Auto-generated method stub
		String str = "insert into reviews(vendorid,vendorname,location,foodieid,dateofvisit,dateofreview,review,ratings,complaint) values(?,?,?,?,?,?,?,?,?);";
		try
		{
			int r=jt.update(str, new Object[] {obr.getVendorid(),obr.getVendorname(),obr.getLocation(),obr.getFoodieid(),obr.getDateofvisit(),obr.getDateofreview(),obr.getReview(),obr.getRatings(),obr.getComplaint()});
			if(r>=1)
			{
				return "Review added Succesfully";
			}
			else
		       return "Error in review addition";
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}

	@Override
	public List<vendor> showActivatedVendor() {
		// TODO Auto-generated method stub
		String sql = "Select * from vendor where reqstatus='approved' and activestatus='activated';";
		try {
		List<vendor> venderacAll = jt.query(sql, new BeanPropertyRowMapper(vendor.class));
		return venderacAll;
		}
		catch(Exception ex) {
		System.out.println(ex.getMessage());
		}
		return null;
	
	}

	@Override
	public vendor getVendorByName(String vendorname) {
		// TODO Auto-generated method stub
		String sql = "Select * from vendor where vendorname=?;";
		try
		{
			vendor x=(vendor) jt.queryForObject(sql, new Object[] {vendorname}, new BeanPropertyRowMapper(vendor.class));
			return x;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	
	}

	@Override
	public void setFoodieId(String foodieid) {
		// TODO Auto-generated method stub
		this.foodieid=foodieid;
		
		
	}

	@Override
	public String getFoodieId() {
		// TODO Auto-generated method stub
		return foodieid;
	}

	@Override
	public foodie getFoodieById(String foodieid) {
		// TODO Auto-generated method stub
		String sql = "Select * from foodie where foodieid=?;";
		try
		{
			foodie x=(foodie) jt.queryForObject(sql, new Object[] {foodieid}, new BeanPropertyRowMapper(foodie.class));
			return x;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
		
	}

	@Override
	public List<Reviews> viewReview(String foodieid) {
		// TODO Auto-generated method stub
		String sql = "Select * from reviews where foodieid=?;";
		try {
			List<Reviews> reviewfAll = jt.query(sql, new BeanPropertyRowMapper(Reviews.class));
			if(reviewfAll.isEmpty()) {
				System.out.println("list is empty");
			}
			else
				System.out.println("list is not empty");
			return reviewfAll;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
		
	}
	

}
