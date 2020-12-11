package com.deepika;

public class Student {

	private String fullName;
	private String city;
	private int age;

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void details() {
		System.out.println("Student [fullName=" + fullName + ", city=" + city + ", age=" + age + "]");
	}
	
}
