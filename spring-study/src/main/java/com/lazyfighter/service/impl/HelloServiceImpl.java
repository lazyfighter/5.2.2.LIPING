package com.lazyfighter.service.impl;

import com.lazyfighter.service.HelloService;

public class HelloServiceImpl implements HelloService {
	@Override
	public String sayHello(String name) {
		return "hello " + name;
	}
}
