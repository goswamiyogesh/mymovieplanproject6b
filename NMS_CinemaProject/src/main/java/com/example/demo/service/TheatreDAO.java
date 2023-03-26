package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Theatre;
import com.example.demo.repository.TheatreRepo;

@Service
public class TheatreDAO {
@Autowired
	TheatreRepo trepo;

//insert movie
public  Theatre Insert(Theatre a) {
	return trepo.save(a);
}

//list of movie
	public List<Theatre> getall(){
		return trepo.findAll();
	}
}
