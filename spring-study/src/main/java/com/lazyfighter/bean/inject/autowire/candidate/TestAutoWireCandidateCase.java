package com.lazyfighter.bean.inject.autowire.candidate;

import com.lazyfighter.bean.inject.primary.OrderAutoWire;
import org.junit.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAutoWireCandidateCase {


	@Test
	public void testAutoWireCandidateInject() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(new String[]{"com.lazyfighter.bean.inject.autowire.candidate"});
		AutoWireCandidate bean = applicationContext.getBean(AutoWireCandidate.class);
		bean.sayHello();
		System.out.println(bean);
	}


	@Test(expected = NoSuchBeanDefinitionException.class)
	public void testNoBeanDefinitionGetBean() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(new String[]{"com.lazyfighter.bean.inject.autowire.candidate"});
		OrderAutoWire bean = applicationContext.getBean(OrderAutoWire.class);
	}

}
