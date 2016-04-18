package com.baidu.mm.innerclass;

/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年3月24日 下午8:28:08
 *
 * @author zhangmengmeng01@baidu.com
 */
public class Implementation1 implements Service {
    private Implementation1() {
    }

    public void method1() {
        System.out.println("Implementation1 method1");
    }

    public void method2() {
        System.out.println("Implementation1 method2");

    }

    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation1();
        }
    };
}
