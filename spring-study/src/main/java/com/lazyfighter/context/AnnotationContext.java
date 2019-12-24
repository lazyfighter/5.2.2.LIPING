package com.lazyfighter.context;

import com.lazyfighter.pojo.Person;
import com.lazyfighter.pojo.Student;
import com.lazyfighter.service.TransactionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;

/**
 * @author liping
 */
public class AnnotationContext {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("com.lazyfighter");
		applicationContext.refresh();
		applicationContext.register(ConversionServiceFactoryBean.class);
		ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
		ConversionService conversionService = applicationContext.getBean(ConversionService.class);
		Person person = new Person();
		person.setName("lll");
		person.setGender("body");
		Student student = conversionService.convert(person, Student.class);
		System.out.println(student);

	}

//	public void testConvertionService() {
//		applicationContext.register(ConversionServiceFactoryBean.class);
//		ConversionService conversionService = applicationContext.getBean(ConversionService.class);
//		Person person = new Person();
//		person.setName("lll");
//		person.setGender("body");
//		Student student = conversionService.convert(person, Student.class);
//		System.out.println(student);
//	}

}
