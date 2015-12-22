package com.nuomi.crm1.test.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nuomi.crm.service.base.BaseTest;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月17日 下午3:24:51 类说明 :
 */
public class BeanInInterfaceTest extends BaseTest {
    @Autowired
    BeanInInterface beanInInterface;

    @Test
    public void test() {
        beanInInterface.testbean();
    }

}
