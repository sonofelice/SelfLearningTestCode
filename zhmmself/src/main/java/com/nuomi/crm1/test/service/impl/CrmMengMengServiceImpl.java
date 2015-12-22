package com.nuomi.crm1.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nuomi.crm1.test.service.CrmMengMengService;
import com.nuomi.crm1.test.service.TestService;
@Service("crmMengMengService")
public class CrmMengMengServiceImpl implements CrmMengMengService {

	@Autowired
	private TestService testService;
	public void mengmeng() {
		System.out.println("meng meng service ");
		testService.test();
	}
}
