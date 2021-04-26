package com.lazyfighter.bean.inject.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("OrderAutoWire2")
@Primary
public class TestOrderAutoWire2 implements OrderAutoWire {


	@Override
	public void sayOrder() {
		System.out.println(2);
	}
}
