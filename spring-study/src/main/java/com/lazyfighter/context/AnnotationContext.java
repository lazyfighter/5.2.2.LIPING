package com.lazyfighter.context;

import com.lazyfighter.pojo.Person;
import com.lazyfighter.pojo.Student;
import com.lazyfighter.service.HelloService;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;

/**
 * @author liping
 */
public class AnnotationContext {

	public static void main(String[] args) {
		try {
			AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(new String[]{"com.lazyfighter"});
			ObjectProvider<HelloService> beanProvider = applicationContext.getBeanFactory().getBeanProvider(HelloService.class);
			HelloService object = beanProvider.getObject();
			System.out.println(object);
			System.out.println(applicationContext.getBean(HelloService.class));
//			Person person = new Person();
//			person.setName("lll");
//			person.setGender("body");
//			Student student = conversionService.convert(person, Student.class);
//			System.out.println(student);
		} catch (Exception e) {
			System.out.println(e);
		}


	}


}
