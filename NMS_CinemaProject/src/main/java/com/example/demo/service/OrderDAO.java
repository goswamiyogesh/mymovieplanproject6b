package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.OrderTable;
import com.example.demo.repository.OrderRepo;

@Service
public class OrderDAO {
	@Autowired
  private OrderRepo orepo;
	
	//inset order
	public OrderTable insert(OrderTable a) {
		return orepo.save(a);
	}
	// get list of user
	public List<OrderTable> getall(){
		return orepo.findAll();
	}
}
