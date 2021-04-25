package org.springframework.beans;

import com.lazyfighter.service.impl.AbstractHelloServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookupTest {


	@Test
	public void testLookup() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(new String[]{"com.lazyfighter"});
		AbstractHelloServiceImpl bean = applicationContext.getBean(AbstractHelloServiceImpl.class);
		System.out.println(bean);


	}

}
