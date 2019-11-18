package com.lazyfighter;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
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
	}
}
