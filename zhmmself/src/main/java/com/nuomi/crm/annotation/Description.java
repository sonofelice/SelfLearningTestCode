package com.nuomi.crm.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月19日 下午3:48:00 类说明 :
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Description {
    String author() default "william"; // 定义"作者"参数

    int size(); // 定义"大小"参数
}
