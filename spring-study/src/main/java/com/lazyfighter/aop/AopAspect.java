package com.lazyfighter.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@Aspect
public class AopAspect {


	@Pointcut("execution(* com.lazyfighter.aop.impl..*(..))")
	public void pointCut(){}

	@Before("pointCut()")
	public void doBefore(JoinPoint joinPoint) {
		System.out.println("service invoke before");
	}


	@After("pointCut()")
	public void doAfter(JoinPoint joinPoint) {
		System.out.println("service invoke after");
	}
}
