package com.lazyfighter.aop.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements InitializingBean {

	public void sayHi() {
		System.out.println("hi");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init");
	}
}
