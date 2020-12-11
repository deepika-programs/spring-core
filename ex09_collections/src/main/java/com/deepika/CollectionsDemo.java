package com.deepika;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsDemo {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Student obj1 = ctx.getBean("stu", Student.class);
		
		System.out.println("SetAddress: " + obj1.getSetAddress());
		System.out.println("SetAddress: " + obj1.getSetAddress().toArray()[0]);
		
		System.out.println("ListAddress: " + obj1.getListAddress());
		System.out.println("ListAddress: " + obj1.getListAddress().get(0));
		
		System.out.println("MapAddress: " + obj1.getMapAddress());
		System.out.println("MapAddress: " + obj1.getMapAddress().get("country"));
		
		System.out.println("PropAddress: " + obj1.getPropAddress());
		System.out.println("PropAddress: " + obj1.getPropAddress().getProperty("3"));
		
		
	}
}
