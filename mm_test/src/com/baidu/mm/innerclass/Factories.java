package com.baidu.mm.innerclass;

/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年3月24日 下午8:32:47
 *
 * @author zhangmengmeng01@baidu.com
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}
