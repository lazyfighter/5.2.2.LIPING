package com.lazyfighter.context;

import com.lazyfighter.importselector.MyImportSelector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author liping
 */
@Import(MyImportSelector.class)
@Configuration
public class AnnotationContext {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("com.lazyfighter");
		applicationContext.refresh();
		String[] names = applicationContext.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
	}

}
