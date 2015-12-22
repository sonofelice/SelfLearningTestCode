package com.nuomi.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.nuomi.crm.dao.TestDao;
import com.nuomi.crm.model.MmTest;

@Controller
@RequestMapping("/")
public class SpringControllerTest {
    @Autowired
    private TestDao testDao;

    @RequestMapping("/test")
    public String springControllerTest() {
        return "tmm";
        // return str;
    }

    @RequestMapping("/tmm/{userId}")
    public String showUserInfo(ModelMap modelMap, @PathVariable long userId) {
        MmTest res = testDao.selectById(userId);
        modelMap.addAttribute("userInfo", res);
        return "/tmm";
    }

    @RequestMapping("/showInfosjson")
    public @ResponseBody Object showUserInfos() {
        List<MmTest> result = testDao.selectAll();
        return JSONObject.toJSON(result);
    }
}
