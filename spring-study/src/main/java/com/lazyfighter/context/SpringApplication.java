package com.lazyfighter.context;

import com.lazyfighter.service.HelloService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liping
 */
public class SpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.refresh();
		List<BeanFactoryPostProcessor> processors = context.getBeanFactoryPostProcessors();
		System.out.println(processors);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		HelloService helloService = context.getBean("helloService", HelloService.class);
		System.out.println(helloService.sayHello("world"));

	}


}
