package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Student s = ctx.getBean("stu", Student.class);
	
		s.setAge(25);
		s.setFullName("Depika");
		s.setCity("Chennai");
		
		s.details();

		
		Student s1 = ctx.getBean("stu", Student.class);
		s1.details();
		
	}
}
