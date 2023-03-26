package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;
@Entity
@Data
public class Movie {
@Id()
@GeneratedValue(strategy = GenerationType.AUTO)
	private int mid;
	private String title;
	private String language;
	private String genre;
	private int tickets;	
	private String time;
	private int price;
	private String file_path;
	
	
}
