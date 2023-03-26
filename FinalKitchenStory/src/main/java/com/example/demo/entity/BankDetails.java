package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class BankDetails {
	
	@Id
	private int b_id;
	private long balance;
}
