package com.baidu.nuomi.crm.target.asp;

import org.springframework.stereotype.Service;

/**
 * @author zhangmengmeng01@baidu.com
 * @version 2015年12月17日 下午3:41:05 类说明 :
 */
@Service("aService")
public class AServiceImp implements AService {

    @Override
    public void barA() {
        System.out.println("AServiceImpl.barA()");
    }

    @Override
    public void fooA(String _msg) {
        System.out.println("AServiceImpl.fooA(msg:" + _msg + ")");
    }

}
