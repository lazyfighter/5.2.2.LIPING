package com.lazyfighter.bean.inject.autowire.lookup;

import org.springframework.stereotype.Component;

@Component
public class LookUpImpl2 implements LookUpService {

	@Override
	public void sayHi() {
		System.out.println("LookUpImpl2");
	}
}
