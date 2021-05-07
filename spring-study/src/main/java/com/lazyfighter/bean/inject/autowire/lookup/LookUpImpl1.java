package com.lazyfighter.bean.inject.autowire.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class LookUpImpl1 implements LookUpService {


	@Lookup("lookUpImpl2")
	public void sayHi() {
		System.out.println("LookUpImpl1");
	}
}
