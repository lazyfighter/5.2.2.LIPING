package com.lazyfighter.bean.inject.primary;

import org.springframework.stereotype.Component;

@Component("OrderAutoWire1")
public class TestOrderAutoWire1 implements OrderAutoWire {

	@Override
	public void sayOrder() {
		System.out.println(1);
	}
}
