package com.baidu.mmtest; 
/** 
 * @Function: TODO ADD FUNCTION. <br/> 
 * @Date: 2016年4月13日 下午6:59:58 
 *
 * @author zhangmengmeng01@baidu.com
 */
public class SystemPropertyTest {
    public static void main(String[] args) {
        System.setProperty("env", "mmtest");
        System.out.println(System.getProperty("env"));
    }
}
 