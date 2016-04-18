package com.baidu.nuomi.mmtest.annotation; 
/** 
 * 带有自定义注解的方法 
 * @Date: 2016年3月23日 上午9:31:10 
 *
 * @author zhangmengmeng01@baidu.com
 */
public class PasswordUtils {
@UserCase(id=47,description="pass must contain at least one numieric")
public boolean validatePassword(String password){
    return (password.matches("\\w*\\d\\w*"));
}
}
 