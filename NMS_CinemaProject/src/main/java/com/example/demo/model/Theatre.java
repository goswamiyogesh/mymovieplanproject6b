package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Theatre {
@Id
	private int  tid;
	private  String tname;
	private String ttype;
	private String address;
	private String file_path;
}
