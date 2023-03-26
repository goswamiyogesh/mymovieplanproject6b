package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FoodItem;
import com.example.demo.service.FoodItemDao;
@RestController
public class FoodItemRestController {
	@Autowired
	FoodItemDao fd_dao;
	
	@PostMapping("/insertFooditem")
	public FoodItem insert(@RequestBody FoodItem a) {
		return fd_dao.insertByRest(a);
	}
}
