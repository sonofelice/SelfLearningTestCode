package com.baidu.nuomi.crm.target.asp;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nuomi.crm.service.base.BaseTest;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月17日 下午3:28:21 类说明 :
 */
public class BServiceTest extends BaseTest {
    @Autowired
    AService aService;

    @Test
    public void test() {
        aService.barA();
        aService.fooA("msg");
    }
}
