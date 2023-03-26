package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class OrderTable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
    
    private String moviename;
	private String movieprice;
}
