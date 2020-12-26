package com.deepika;

public class India {
	private String msg1;
	
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}

	public void displayMessage() {
		System.out.println("India [msg1=" + msg1 + "]");
	}
	
	public void beanInit() {
		System.out.println("Bean Initialized");
	}
	
	public void beanDestroy() {
		System.out.println("Bean Destroyed");
	}
	
}
