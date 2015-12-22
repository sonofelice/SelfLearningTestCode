package com.nuomi.crm1.test.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nuomi.crm.service.base.BaseTest;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月17日 下午3:36:27 类说明 :
 */
public class MmTest extends BaseTest {

    @Autowired
    Mm mm;

    @Test
    public void test() {
        mm.edit();
    }

}
