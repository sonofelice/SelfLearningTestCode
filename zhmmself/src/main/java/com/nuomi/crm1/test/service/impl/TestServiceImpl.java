package com.nuomi.crm1.test.service.impl;

import org.springframework.stereotype.Service;

import com.nuomi.crm1.test.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {

	public String test() {
		System.out.println("Hello world!");
		return "hello";
	}

}
