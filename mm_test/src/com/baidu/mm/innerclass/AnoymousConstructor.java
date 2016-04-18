package com.baidu.mm.innerclass;

/**
 * @Function: TODO ADD FUNCTION. <br/>
 * @Date: 2016年3月24日 下午7:45:58
 *
 * @author zhangmengmeng01@baidu.com
 */
public class AnoymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }

            public void f() {
                System.out.println("In anonymous f()");
            }
        };

    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
