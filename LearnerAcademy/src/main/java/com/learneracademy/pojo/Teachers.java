package com.learneracademy.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teachers {
	@Id
	@GeneratedValue
	private int teacherid;
	@Column
	private String teacherfname;
	@Column
	private String teacherlname;
	@Column
	private int phone;
	@Column
	private String designation;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="teacher")
	private List<Subjects> subjects;
	
	public List<Subjects> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeacherfname() {
		return teacherfname;
	}
	public void setTeacherfname(String teacherfname) {
		this.teacherfname = teacherfname;
	}
	public String getTeacherlname() {
		return teacherlname;
	}
	public void setTeacherlname(String teacherlname) {
		this.teacherlname = teacherlname;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
