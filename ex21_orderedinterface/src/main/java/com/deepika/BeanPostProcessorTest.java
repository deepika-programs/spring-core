package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		World w = ctx.getBean("world", World.class);
		
		System.out.println(w.getMsg1());
		System.out.println(w.getMsg2());
		
		((AbstractApplicationContext) ctx).close();
	}

}
