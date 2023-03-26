package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class FoodItem {
	
	@Id
	private int fd_id;
	private String name;
	private int price;
	
}
