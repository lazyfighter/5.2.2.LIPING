package com.lazyfighter.context;

import com.lazyfighter.importselector.MyImportSelector;
import com.lazyfighter.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author liping
 */
@Import(MyImportSelector.class)
@Configuration(proxyBeanMethods = false)
public class AnnotationContext {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("com.lazyfighter");
		applicationContext.refresh();
		HelloService helloService = applicationContext.getBean(HelloService.class);
		helloService.sayHello("world");
	}

}
