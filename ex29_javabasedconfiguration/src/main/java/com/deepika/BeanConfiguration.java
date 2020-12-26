package com.deepika;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Student stu() {
		Student s = new Student();
		return s;
	}
	
	@Bean
	public Address address() {
		Address ad = new Address();
		ad.setCity("chennai");
		ad.setCountry("India");
		return ad;
	}
}
