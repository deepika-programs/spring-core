package com.deepika;

public class Student {
	
	private Address address;	//variable name "address" should match with the name of the address bean
	public void setAddress(Address address) {
		this.address = address;
	}


	public void displayAddress() {
		System.out.println(address);
	}
}
