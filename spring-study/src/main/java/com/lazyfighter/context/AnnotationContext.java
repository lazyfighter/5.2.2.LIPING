package com.lazyfighter.context;

import com.lazyfighter.service.HelloService;
import com.lazyfighter.service.TransactionService;
import com.lazyfighter.service.impl.TransactionServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liping
 */
public class AnnotationContext {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("com.lazyfighter");
		applicationContext.refresh();
		try {
			TransactionService transactionService = applicationContext.getBean(TransactionService.class);
			transactionService.insert();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
