package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Admin {
    @Id
	private int id;
	private String username;
	private String password;
}
