package com.lazyfighter;

import java.util.Arrays;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liping
 */
public class SpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.refresh();
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	}
}
