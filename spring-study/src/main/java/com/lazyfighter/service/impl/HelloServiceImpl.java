package com.lazyfighter.service.impl;

import com.lazyfighter.beanpostprocessor.MyBeanPostProcessor;
import com.lazyfighter.service.HelloService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author liping
 */
@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private MyBeanPostProcessor myBeanPostProcessor;

	@Override
	public String sayHello(String name) {
		System.out.println(myBeanPostProcessor.getClass().getName());
		return "hello " + name;
	}
}
