package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class JavaBasedConfigurationTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
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
