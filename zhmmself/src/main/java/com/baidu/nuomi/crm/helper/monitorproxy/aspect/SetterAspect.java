package com.baidu.nuomi.crm.helper.monitorproxy.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.aop.support.AopUtils;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月17日 下午5:27:57 类说明 :
 */
public class SetterAspect {
    public void after(JoinPoint jp, Object value) {
        Object proxy = jp.getThis();
        Object target = jp.getTarget();

        if (AopUtils.isAopProxy(proxy)) {

        }
    }
}
