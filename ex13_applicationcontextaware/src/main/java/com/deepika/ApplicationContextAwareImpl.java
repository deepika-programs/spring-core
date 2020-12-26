package com.deepika;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareImpl implements ApplicationContextAware {

	private ApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
	
	public void stuAddress() {
		Student student = context.getBean("stu", Student.class);
		student.displayAddress();
	}

}
