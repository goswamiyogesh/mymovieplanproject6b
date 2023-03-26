package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BankDetails;
import com.example.demo.model.Admin;
import com.example.demo.model.User;
import com.example.demo.service.AdminDAO;
import com.example.demo.service.BankDAO;

import com.example.demo.service.UserDAO;

@RestController
public class Controller {
	@Autowired
	AdminDAO dao;
	@Autowired
	 UserDAO udao;
	@Autowired
	 private BankDAO bdao;
	@PostMapping("/insertadmin")
	public Admin insert(@RequestBody Admin a) {
		return dao.insert(a);
	}
	
	@PostMapping("/insertbank")
	public List<BankDetails> insertbank(@RequestBody List<BankDetails> bd){
		 return bdao.insertAll(bd);
	}
}

