package com.lazyfighter.bean.inject.primary;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestOrderAutoWireCase {

	@Test
	public void testLookup() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(new String[]{"com.lazyfighter.bean.inject"});
		OrderAutoWire bean = applicationContext.getBean(OrderAutoWire.class);
		System.out.println(bean);


	}
}
