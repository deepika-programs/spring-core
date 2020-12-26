package com.deepika;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class JavaBasedConfigurationTest {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		ctx.start();
		
		Student st = ctx.getBean("stu", Student.class);
		System.out.println(st);
		
		ctx.stop();
		
		((AbstractApplicationContext) ctx).close();
	}

}
