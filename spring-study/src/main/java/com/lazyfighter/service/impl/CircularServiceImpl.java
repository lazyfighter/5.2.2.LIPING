package com.lazyfighter.service.impl;

import com.lazyfighter.service.CircularService;
import com.lazyfighter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CircularServiceImpl implements CircularService {

	@Autowired
	private HelloService helloService;

	@Override
	public void circular() {
		System.out.println(helloService.hashCode());
	}
}
