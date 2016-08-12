package com.baidu.mm.enumtest;

/**
 * Created by zhangmengmeng01@baidu.com on 16/8/10.
 */
enum Shrubbery {
    GROUND, CRAWLING, HANGING
}

public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            System.out.println(s + " ordinal: " + s.ordinal() + "   " + s.name());
        }
    }
}
