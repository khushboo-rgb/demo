package com.cybage.Java8Demo;

import java.util.List;

public class UserData {

	
	private Integer age=30;
	private String name;
	private List<String> phoneNumbers;
	
	public UserData() {
		
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public UserData(Integer age, String name, List<String> phoneNumbers) {
		super();
		this.age = age;
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "UserData [age=" + age + ", name=" + name + ", phoneNumbers=" + phoneNumbers + "]";
	}
	
	

}
