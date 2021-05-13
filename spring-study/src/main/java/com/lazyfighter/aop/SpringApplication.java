package com.lazyfighter.aop;

import com.lazyfighter.aop.impl.HelloServiceImpl;
import com.lazyfighter.service.HelloService;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author liping
 */
public class SpringApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(new String[]{"com.lazyfighter.aop"});
		List<BeanFactoryPostProcessor> processors = context.getBeanFactoryPostProcessors();
		System.out.println(processors);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		HelloServiceImpl helloService = context.getBean("helloServiceImpl", HelloServiceImpl.class);
		helloService.sayHi();

	}


}
