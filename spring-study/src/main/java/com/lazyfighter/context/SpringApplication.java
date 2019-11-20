package com.lazyfighter.context;

import com.lazyfighter.importselector.MyImportSelector;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liping
 */
@Import(MyImportSelector.class)
public class SpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.refresh();
		List<BeanFactoryPostProcessor> processors = context.getBeanFactoryPostProcessors();
		System.out.println(processors);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	}


}
