package com.learneracademy.pojo;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classes {
	@Id
	private int classid;
	@Column 
	 private String classname;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="classes")
	private List<Students> students;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="classes")
	private List<Subjects> subjects;

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}
	
	
}
