package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class BankDetails {

	@Id
	private int bid;
	private long balance;
}
