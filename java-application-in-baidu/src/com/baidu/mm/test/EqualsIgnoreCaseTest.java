package com.baidu.mm.test;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月21日 下午4:15:45 类说明 :
 */
public class EqualsIgnoreCaseTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String upper = "ABC";
        String low = "abc";
        if (upper.equalsIgnoreCase(low))
            System.out.println("yes");
        else
            System.out.println("no");
    }

}
