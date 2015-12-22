package com.nuomi.crm.annotation;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年11月19日 下午6:35:16 类说明 :
 */
@Desc(value = "this is a useful class")
public class Utility {

    @Author(name = "Felice", group = "baidu.com")
    public String work() {
        return "work over!";
    }
}
