package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FoodItem;
import com.example.demo.repository.FoodItemRepo;
@Service
public class FoodItemDao {
	
	@Autowired
	FoodItemRepo fd_repo;
	
	
	public FoodItem insert(FoodItem a) {				
		return fd_repo.save(a);
	}
	
	public FoodItem insertByRest(FoodItem a) {
		return fd_repo.save(a);
	}
	
	public String delete(FoodItem a) {
		fd_repo.delete(a);
		return "Deleted";
	}
	public List<FoodItem> getall(){
		return fd_repo.findAll();
	}
	
	public FoodItem updateByName(FoodItem a) {
		FoodItem aa=fd_repo.findById(a.getFd_id()).orElse(null);
		aa.setName(a.getName());
		aa.setPrice(a.getPrice());
	return	fd_repo.save(aa);
		
	}
	public List<FoodItem> listAll(String keyword){
	if(keyword != null) {
		return fd_repo.search(keyword);
	}
	return fd_repo.findAll();
	}
}
