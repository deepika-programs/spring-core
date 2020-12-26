package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanAnnotationTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Student st = ctx.getBean("stu", Student.class);
		
		st.addAddress();
		st.displayAddress();
		
		System.out.println("------------------------");
		
		Address ad = ctx.getBean("address", Address.class);
		ad.setCity("Toronto");
		ad.setCountry("Canada");
		System.out.println(ad);
		
		((AbstractApplicationContext) ctx).close();
	}

}
