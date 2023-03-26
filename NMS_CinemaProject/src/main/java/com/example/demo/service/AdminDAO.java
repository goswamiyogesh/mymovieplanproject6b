package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepo;
@Service
public class AdminDAO {
    @Autowired
	AdminRepo repo;
    
    //insert admin
    public Admin insert(Admin a) {
		return repo.save(a);
	}
    // get password
    public String getPassword(String username) {
		return repo.getPassword(username);
	}
    // get id
    public int getId(String username) {
		return repo.getId(username);
	}
	
  //update password
  	public Admin updatePass(Admin a) {
  		Admin aa=repo.findById(a.getId()).orElse(null);
  		aa.setUsername(a.getUsername());
  		aa.setPassword(a.getPassword());
  		return repo.save(aa);
  	}
}
