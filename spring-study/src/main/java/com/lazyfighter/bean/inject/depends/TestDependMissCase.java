package com.lazyfighter.bean.inject.depends;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDependMissCase {

	@Test
	public void testNoBeanDefinitionGetBean() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(new String[]{"com.lazyfighter.bean.inject.depends"});
		DependBean bean = applicationContext.getBean(DependBean.class);
		System.out.println(bean);
	}
}
