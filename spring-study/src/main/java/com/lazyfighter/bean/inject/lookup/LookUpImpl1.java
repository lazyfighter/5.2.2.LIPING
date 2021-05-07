package com.lazyfighter.bean.inject.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class LookUpImpl1 implements LookUpService {

	@Override
	public void sayHi() {
		getBean().sayHi();
	}

	@Lookup("lookUpImpl2")
	public abstract LookUpService getBean();
}
