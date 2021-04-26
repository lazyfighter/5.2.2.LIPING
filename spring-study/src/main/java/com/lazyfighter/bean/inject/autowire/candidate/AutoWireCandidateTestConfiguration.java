package com.lazyfighter.bean.inject.autowire.candidate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoWireCandidateTestConfiguration {

	@Bean(autowireCandidate = false)
	public AutoWireCandidate autoWireCandidate1() {
		return () -> System.out.println("this is bean1");
	}


	@Bean
	public AutoWireCandidate autoWireCandidate2() {
		return () -> System.out.println("this is bean2");
	}

}
