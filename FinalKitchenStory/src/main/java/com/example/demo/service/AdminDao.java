package com.example.demo.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepo;

@Service
public class AdminDao {

	
	@Autowired
	AdminRepo ad_repo;
	
	public Admin insert(Admin a) {
		return ad_repo.save(a);
	}
	
	public int getId(String ad_username) {
		return ad_repo.getId(ad_username);
	}
	
	public String getPassword(String ad_username) {
		return ad_repo.getPassword(ad_username);
	}
	
	public List<Admin> insertall(List<Admin> ad){
		return ad_repo.saveAll(ad);
	}
	
	public void deletebyid(int id) {
		ad_repo.deleteById(id);
		}
	
	public Admin updatePass(Admin a) {
		Admin aa=ad_repo.findById(a.getAd_id()).orElse(null);
		aa.setAd_username(a.getAd_username());
		aa.setAd_password(a.getAd_password());
		return ad_repo.save(aa);
	}
	
}
	

