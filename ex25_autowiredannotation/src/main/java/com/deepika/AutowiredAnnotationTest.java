package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredAnnotationTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Student st = ctx.getBean("student", Student.class);
		
		st.displayAddress();
		
		((AbstractApplicationContext) ctx).close();
	}

}
