package org.springframework.beans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

public class ClassPathBeanDefinitionScannerTestOrderAutoWireCase {

	@Test
	public void testScanner() {
		SimpleBeanDefinitionRegistry beanDefinitionRegistry = new SimpleBeanDefinitionRegistry();
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(beanDefinitionRegistry);
		int scanCount = scanner.scan(new String[]{"com.lazyfighter"});
		System.out.println(scanCount);
	}

}
