package com.deepika;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	@Autowired
	private Address addr;	//autowired annotation will inject this bean (Address) automatically based on type/name
	
	//Below code is autowired by constructor :
	/*
	Address addr;
	
	@Autowired
	Student(Address addr) {
		this.addr = addr;
	}
	*/

	public void displayAddress() {
		System.out.println(addr);
	}
}
