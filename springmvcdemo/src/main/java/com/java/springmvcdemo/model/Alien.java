package com.java.springmvcdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	
	@Id
	private int id;
	
	private String name;
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public Alien() {
		super();
	}
	
	public Alien(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + "]";
	}
	
	
}
