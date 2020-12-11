package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanIdAndAliasDemo {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Student obj1 = ctx.getBean("stu", Student.class);
		System.out.println(obj1);
		
		Student obj2 = ctx.getBean("stu1", Student.class);
		System.out.println(obj2);
		
		Student obj3 = ctx.getBean("stu2", Student.class);
		System.out.println(obj3);
		
		Student obj4 = ctx.getBean("stu3", Student.class);
		System.out.println(obj4);
		
		Student obj5 = ctx.getBean("s1", Student.class);
		System.out.println(obj5);
		
		Student obj6 = ctx.getBean("s2", Student.class);
		System.out.println(obj6);
	}
}
