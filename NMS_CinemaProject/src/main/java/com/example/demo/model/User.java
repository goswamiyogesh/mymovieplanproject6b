package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class User {
 @Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	private String uname;
	private String email;
	private String uusername;
	private String upassword;
}
