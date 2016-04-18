package com.baidu.nuomi.mmtest.annotation; 

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @Function: TODO ADD FUNCTION. <br/> 
 * @Date: 2016年3月23日 上午9:29:08 
 *
 * @author zhangmengmeng01@baidu.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface UserCase {
    public int id();
    public String description() default "no description";
}
 