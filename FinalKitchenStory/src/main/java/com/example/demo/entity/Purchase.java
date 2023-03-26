package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Purchase {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int p_id;
	private String f_name;
	private String name;
	private int price;
}
