package com.nuomi.crm.annotation;

import java.lang.reflect.Method;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月19日 下午6:37:18 类说明 :
 */
public class AnalysisAnonotation {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try {
            Class rt_class = Class.forName("com.nuomi.crm.annotation.Utility");
            Method[] methods = rt_class.getMethods();

            boolean flag = rt_class.isAnnotationPresent(Desc.class);

            if (flag) {
                Desc ds = (Desc) rt_class.getAnnotation(Desc.class);
                System.out.println(ds.value());
                for (Method method : methods) {
                    if (method.isAnnotationPresent(Author.class)) {
                        Author author = (Author) method.getAnnotation(Author.class);
                        System.out.println(author.name() + "***" + author.group());
                    }
                }
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
