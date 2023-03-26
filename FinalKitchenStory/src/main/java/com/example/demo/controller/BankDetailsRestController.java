package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BankDetails;
import com.example.demo.service.BankDetailsDao;

@RestController
public class BankDetailsRestController {

	@Autowired
	BankDetailsDao bk_dao;
	@PostMapping("/insertbank")
	public BankDetails insert(@RequestBody BankDetails a) {
		return bk_dao.insert(a);
	}
	
	@PostMapping("/insertallbank")
	public List<BankDetails> insertall(@RequestBody List<BankDetails> bd){
		return bk_dao.insertall(bd);
	}

}
