package com.lazyfighter.service.impl;

import com.lazyfighter.service.HelloService;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractHelloServiceImpl implements HelloService {

	@Lookup("helloServiceImpl")
	public abstract String sayHello(String name);
}
