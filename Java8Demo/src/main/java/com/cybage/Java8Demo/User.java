package com.cybage.Java8Demo;

public class User {

	private int age=20;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public User(String name) {
		
		this.name = name;
	}
	
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}

	
	
}
