package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
	if lazy-init="true", the constructor/bean will be initialized only when we call the bean.
	else, the bean will be initialized when the bean factory is created.
*/
public class BeanScopeDemo {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		//Student s = ctx.getBean("stu", Student.class);
		
	}
}
