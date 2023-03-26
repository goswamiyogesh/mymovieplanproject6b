package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BankDetails;
import com.example.demo.repository.BankDetailsRepo;
@Service
public class BankDetailsDao {
	@Autowired
	BankDetailsRepo repo;
	
	public BankDetails insert(BankDetails a) {
		return repo.save(a);
	}
	
	public List<BankDetails> insertall(List<BankDetails> ad){
		return repo.saveAll(ad);
	}
	
	public BankDetails findRow(int bid) {
		return repo.getById(bid);
	}
}

