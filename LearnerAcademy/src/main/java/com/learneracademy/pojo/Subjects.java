package com.learneracademy.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Subjects {
	@Id
	private int subjectid;
	@Column
	private String subjectname;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="classid")
	private Classes classes;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="teachersid")
	private Teachers teachers;
	
	public int getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	
}
