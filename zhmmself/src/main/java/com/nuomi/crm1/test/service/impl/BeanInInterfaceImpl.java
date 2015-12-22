package com.nuomi.crm1.test.service.impl;

import org.springframework.stereotype.Service;

import com.nuomi.crm1.test.service.BeanInInterface;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月23日 上午10:53:26 类说明 :
 */
@Service("beanInInterface")
public class BeanInInterfaceImpl implements BeanInInterface {

    @Override
    public void testbean() {
        System.out.println("the output of the bean");
    }

}
