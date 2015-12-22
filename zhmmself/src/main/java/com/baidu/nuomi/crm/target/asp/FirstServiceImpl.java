package com.baidu.nuomi.crm.target.asp;

import org.springframework.stereotype.Service;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月17日 下午3:44:33 类说明 :
 */
@Service("firstService")
public class FirstServiceImpl implements FirstService {

    @Override
    public void fs() {
        System.out.println("fs");
    }

}
