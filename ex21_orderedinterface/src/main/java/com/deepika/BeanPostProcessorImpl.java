package com.deepika;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessorImpl implements  BeanPostProcessor, Ordered {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcess BeforeInitialization 1 : " + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcess AfterInitialization 1 : " + beanName);
		return bean;
	}
	
	
	public int getOrder() {
		return 1;
	}
}
