package com.deepika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stu") //without "stu", access the bean using the name "student"
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
