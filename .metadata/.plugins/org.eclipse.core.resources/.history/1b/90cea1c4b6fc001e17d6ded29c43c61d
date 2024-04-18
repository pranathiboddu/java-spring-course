package com.javacourse.DemoHibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

//Mapping Relations

@Entity 
public class Laptop 
{
	@Id
	private int lid;
	private String lname;
	
//	@ManyToOne
//	private Student student;
	
	@ManyToMany
	private  List<Student> student1 = new ArrayList<Student>();
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	public List<Student> getStudent1() {
		return student1;
	}
	public void setStudent1(List<Student> student1) {
		this.student1 = student1;
	}
	
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}

	
}
