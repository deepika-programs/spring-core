package com.deepika;

public class Student {
	
	private Address studentAddress;	//variable type "Address" should match with the type of the Address bean
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}



	public void displayAddress() {
		System.out.println(studentAddress);
	}
}
