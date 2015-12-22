package com.nuomi.crm1.test.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nuomi.crm.service.base.BaseTest;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月17日 上午11:34:21 类说明 :
 */
public class CrmSpringServiceTest extends BaseTest {
    @Autowired
    CrmSpringService crmSpringService;

    @Test
    public void test() {
        crmSpringService.testSpring();
    }

}
