package com.baidu.nuomi.crm.target.asp.impl;

import org.springframework.stereotype.Service;

import com.baidu.nuomi.crm.target.asp.BService;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月17日 下午3:31:02 类说明 :
 */
@Service("bService")
public class BServiceImpl implements BService {

    @Override
    public void barB(String _msg, int _type) {
        System.out.println("BServiceImpl.barB(msg:" + _msg + " type:" + _type + ")");
        if (_type == 1)
            throw new IllegalArgumentException("测试异常");
    }

    @Override
    public void fooB() {
        System.out.println("BServiceImpl.fooB()");
    }

}