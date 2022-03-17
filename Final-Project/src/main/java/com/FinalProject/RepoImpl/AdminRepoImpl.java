package com.FinalProject.RepoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

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
	public List<vendor> showAllvendor() {
		// TODO Auto-generated method stub
		return null;
	}

}
