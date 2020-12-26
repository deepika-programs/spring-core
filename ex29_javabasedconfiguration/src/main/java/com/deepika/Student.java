package com.deepika;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	private Address addr;

	public void addAddress() {
		addr.setCity("Chennai");
		addr.setCountry("India");
	}
	
	
	public void displayAddress() {
		System.out.println(addr);
	}

}
