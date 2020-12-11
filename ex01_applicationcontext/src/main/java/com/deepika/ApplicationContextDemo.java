package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextDemo {

	public static void main(String[] args) {
		
		//As per Java
		/*
			Student st = new Student();
			st.display();
		*/
		
		// accessing spring bean factory :
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		//AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		//ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\Users\deepika\Documents\GitHub\spring-core\ex01_applicationcontext\src\main\resources\spring-beans.xml");
		
		//Student st1 = (Student) ctx.getBean("stu");
		Student st1 = ctx.getBean("stu", Student.class);
		st1.name="deepika.A";
		st1.display();
		
		//ctx.close(); ->AbstractApplicationContext's method
		((AbstractApplicationContext) ctx).close();
	}
	
}
