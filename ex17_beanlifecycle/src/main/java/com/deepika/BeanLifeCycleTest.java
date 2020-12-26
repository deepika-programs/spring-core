package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TODO--real time example needed

public class BeanLifeCycleTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		India i = ctx.getBean("india", India.class);
		i.displayMessage();
		((AbstractApplicationContext) ctx).close();
	}
}
