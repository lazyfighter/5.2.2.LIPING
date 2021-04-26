package com.lazyfighter.pojo;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestConvertAutoWireCase {

	@Test
	public void testLookup() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(new String[]{"com.lazyfighter.pojo"});
		Student bean = applicationContext.getBean("person", Student.class);
		System.out.println(bean);


	}
}
