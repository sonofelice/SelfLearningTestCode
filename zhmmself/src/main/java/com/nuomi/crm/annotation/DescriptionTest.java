package com.nuomi.crm.annotation;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月19日 下午3:48:48 类说明 :
 */
@Description(author = "helloworld", size = 200)
public class DescriptionTest {
    @SuppressWarnings(value = { "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Class clazz = DescriptionTest.class;

        if (clazz.isAnnotationPresent(Description.class)) {

            Description desc = (Description) clazz.getAnnotation(Description.class);

            System.out.println("desc.author:" + desc.author());

            System.out.println("desc.size:" + desc.size());

        } else {

            System.out.println("没有在DescriptionTest上使用注解!");

        }
    }
}
