package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByConstructorTest {
	public static void main(String[] args) {
		
		//call the student bean and its displayAddress method
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");
		Student s = cxt.getBean("stu", Student.class);
		s.displayAddress();
		
	}
}
