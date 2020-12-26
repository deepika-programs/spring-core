package com.deepika;

public class Student {
	
	private Address stuAddress;
	public Student(Address stuAddress) {	//Constructor parameter type should match with the name of the address bean
		this.stuAddress = stuAddress;
	}


	public void displayAddress() {
		System.out.println(stuAddress);
	}
}
