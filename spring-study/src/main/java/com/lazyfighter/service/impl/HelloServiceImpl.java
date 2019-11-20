package com.lazyfighter.service.impl;

import com.lazyfighter.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
	@Override
	public String sayHello(String name) {
		return "hello " + name;
	}
}
