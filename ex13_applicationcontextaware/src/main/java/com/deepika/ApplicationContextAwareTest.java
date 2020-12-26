package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextAwareTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		ApplicationContextAwareImpl aca = ctx.getBean("appContext", ApplicationContextAwareImpl.class);
		aca.stuAddress();

	}
}
