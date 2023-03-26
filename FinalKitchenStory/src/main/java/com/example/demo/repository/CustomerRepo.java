package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Customer;

public interface CustomerRepo  extends JpaRepository<Customer, Integer>{

	
	@Query("select c.password from Customer c where c.username=?1")
	public String ifExist(String s);

@Query("update Customer c set c.item_purchased=?1 where c.username=?2")
public String setItemPurchase(String name,String uname);
}
