package com.deepika;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Student {

	@Resource
	private Address addr;

	public void displayAddress() {
		System.out.println(addr);
	}
	
	@PostConstruct
	public void anynameInit() {
		System.out.println("After Creation");
	}
	
	@PreDestroy
	public void anynameDestroy() {
		System.out.println("Before destroy");
	}
	
}
