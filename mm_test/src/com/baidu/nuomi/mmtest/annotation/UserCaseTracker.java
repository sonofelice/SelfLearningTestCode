package com.baidu.nuomi.mmtest.annotation; 

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 
 * 获取注解内容 
 * @Date: 2016年3月23日 上午9:43:57 
 *
 * @author zhangmengmeng01@baidu.com
 */
public class UserCaseTracker {
    public static void trackUserCases(List<Integer> useCases,Class<?> cl){
        for(Method m: cl.getDeclaredMethods()){
            UserCase uc = m.getAnnotation(UserCase.class);
            if(uc!=null){
                System.out.println("Found Use Cases:" + uc.id() + " " + uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
        for(int i: useCases){
            System.out.println("Warning : Missing use case- " + i);
        }
    }
    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47,48,49,50);
        trackUserCases(useCases, PasswordUtils.class);
    }

}
 