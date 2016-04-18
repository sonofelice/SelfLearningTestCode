package com.baidu.mm.innerclass;

/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年3月24日 下午8:32:07
 *
 * @author zhangmengmeng01@baidu.com
 */
public class Implementation2 implements Service {
    private Implementation2() {
    }

    public void method1() {
        System.out.println("Implementation2 method1");
    }

    public void method2() {
        System.out.println("Implementation2 method2");

    }

    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation2();
        }
    };
}
