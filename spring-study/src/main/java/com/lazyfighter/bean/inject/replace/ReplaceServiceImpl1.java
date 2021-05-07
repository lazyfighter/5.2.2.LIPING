package com.lazyfighter.bean.inject.replace;

public class ReplaceServiceImpl1 implements ReplaceService {
	@Override
	public void testReplace() {
		System.out.println(this.getClass().getName());
	}
}
