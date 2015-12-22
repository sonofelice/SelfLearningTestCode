package com.nuomi.crm.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nuomi.crm1.test.service.BeanInInterface;

public class SpringMainTest {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        // CrmMengMengService myBean = (CrmMengMengService) ctx.getBean("crmMengMengService");
        // myBean.mengmeng();
        BeanInInterface bii = (BeanInInterface) ctx.getBean("beanInInterface");
        bii.testbean();

    }

}
