package com.deepika;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcess BeforeInitialization : " + beanName);
		System.out.println("Previous value : " + ((World)bean).getMsg1());
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcess AfterInitialization : " + beanName);
		((World)bean).setMsg1("Changed Msg :" + new Date());
		return bean;
	}

}
