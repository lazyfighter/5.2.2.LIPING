package com.lazyfighter.aop.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("test2")
public class HelloServiceImpl2 implements InitializingBean {

	@Autowired
	private HelloServiceImpl helloService;

	public void sayHi() {
		System.out.println(helloService);
		System.out.println("hi");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init");
	}
}
