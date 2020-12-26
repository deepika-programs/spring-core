package com.deepika;

public class Student {

	private String fullName;
	private String city;
	private int age;
	
	
	public Student(String fullName, String city, int age) {
		this.fullName = fullName;
		this.city = city;
		this.age = age;
	}


	public void details() {
		System.out.println("Student [fullName=" + fullName + ", city=" + city + ", age=" + age + "]");
	}
	
	
	
}
