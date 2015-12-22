package com.nuomi.crm.dao; 

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.nuomi.crm.model.MmTest;
import com.nuomi.crm.service.base.BaseTest;

/** 
 * @author zhangmengmeng01@baidu.com 
 * @version 2015年11月18日 下午3:58:25 
 * 类说明 : 
 */
public class TestDaoTest extends BaseTest {
	@Autowired
	private TestDao testDao;

	@Test
	public void testSelect() {

		List<MmTest> result = testDao.selectAll();

		System.out.println(JSONObject.toJSON(result));
		
		System.out.println("mm");
	}

}
 