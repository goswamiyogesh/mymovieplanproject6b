package com.learneracademy.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Students {
	@Id 
	private int studentid;
	@Column(name ="First_Name")
	private String studentfname;
	@Column(name ="Last_Name")
	private String studentlname;
	@Column
	private String dob;
	@Column
	private String address;
	@Column
	private int phone;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="classid")
	private Classes classes;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentfname() {
		return studentfname;
	}

	public void setStudentfname(String studentfname) {
		this.studentfname = studentfname;
	}

	public String getStudentlname() {
		return studentlname;
	}

	public void setStudentlname(String studentlname) {
		this.studentlname = studentlname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	
}
