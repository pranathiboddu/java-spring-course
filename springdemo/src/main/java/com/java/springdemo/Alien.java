package com.java.springdemo;

public class Alien {

	private int age;
//	private Laptop laptop;
	
	private Computer computer;

//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Alien() {
		System.out.println("Alien Object Created");
	}

//	public Alien(int age, Laptop laptop) {
//		this.age = age;
//		this.laptop = laptop;
//	}
	public void show() {
		System.out.println("Coding");
		computer.compile();
	}
}
