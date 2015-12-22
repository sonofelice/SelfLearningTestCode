package com.nuomi.crm1.test.service.impl;

import org.springframework.stereotype.Service;

import com.nuomi.crm1.test.service.CrmSpringService;
@Service("crmSpringService")
public class CrmSpringServiceImpl implements CrmSpringService{

	@Override
	public void testSpring() {
		System.out.println("crmSpringServiceTest");
		
	}

}
