package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
	bean inside another bean is called inner-bean
*/
public class InnerBeanDemo {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Student s = ctx.getBean("stu", Student.class);
		
		System.out.println(s);
		
		s.myAddress();
		
	}
}
