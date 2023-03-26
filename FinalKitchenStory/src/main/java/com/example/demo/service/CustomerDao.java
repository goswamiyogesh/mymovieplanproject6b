package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerDao  {
@Autowired
	CustomerRepo c_repo;


public Customer insert(Customer a) {
	return c_repo.save(a);
}

public String ifExists(String s) {
	return c_repo.ifExist(s);
	
}


public List<Customer> getall(){
	return c_repo.findAll();
}

public String updatePurchase(String name,String uname) {
	 c_repo.setItemPurchase(name, uname);
	 return "updated";
	
}
}
