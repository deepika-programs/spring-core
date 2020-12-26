package com.deepika;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class India implements InitializingBean, DisposableBean {
	private String msg1;
	
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}

	public void displayMessage() {
		System.out.println("2. Life-Cycle Bean-Init : displayMessage : India [msg1=" + msg1 + "]");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("1. InitializingBean : afterPropertiesSet : India [msg1=" + msg1 + "]");
	}

	public void destroy() throws Exception {
		System.out.println("3. DisposableBean : Destroy Method");
	}
	
	public void beanDestroy() throws Exception {
		System.out.println("4. Life-Cycle : Bean Destroyed ");
	}
	
}
