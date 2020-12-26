package com.deepika;

import org.springframework.beans.factory.BeanNameAware;

public class Student implements BeanNameAware{

	public void setBeanName(String name) {
		System.out.println("Bean "+ name + " initialized");
	}
	
}
