package com.lazyfighter.context;

import com.lazyfighter.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liping
 */
public class AnnotationContext {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("com.lazyfighter");
		applicationContext.refresh();
		HelloService helloService = applicationContext.getBean(HelloService.class);
		helloService.sayHello("world");
	}

}
