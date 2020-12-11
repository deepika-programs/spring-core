package com.deepika;

public class Student {

	private String fullname;
	private Address address;

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void myAddress() {
		System.out.println(address);
	}

	@Override
	public String toString() {
		return "Student [fullname=" + fullname + ", address=" + address + "]";
	}
	
	
}
