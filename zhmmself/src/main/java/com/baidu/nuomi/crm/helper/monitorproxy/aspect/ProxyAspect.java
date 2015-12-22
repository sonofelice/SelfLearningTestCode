package com.baidu.nuomi.crm.helper.monitorproxy.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月17日 下午1:21:46 类说明 :
 */
public class ProxyAspect {
    public void doAfter(JoinPoint jp) {
        System.out.println("log Ending method:" + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName());

    }

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long time = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        time = System.currentTimeMillis() - time;
        System.out.println("process time:" + time + "ms");
        return retVal;
    }

    public void doBefore(JoinPoint jp) {
        System.out.println("long Beginning methoe:" + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName());
    }

    public void doThrowing(JoinPoint jp, Throwable ex) {
        System.out.println("methoe" + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName()
                + " throw exception");
        System.out.println(ex.getMessage());
    }
}
