package com.lazyfighter.service.impl;

import com.lazyfighter.service.TransactionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TransactionServiceImpl implements TransactionService {

	@Override
	public void insert() {
		System.out.println("hello transaction");
	}
}
