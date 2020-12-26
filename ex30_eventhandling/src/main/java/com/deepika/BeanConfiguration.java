package com.deepika;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.deepika"})
public class BeanConfiguration {
	
	@Bean
	public Student stu() {
		Student s = new Student();
		s.setName("Deepika");
		return s;
	}
	
}
