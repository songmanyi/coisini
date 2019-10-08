package com.work.bizmenu.controller;

import com.work.bizmenu.client.UserClient;
import com.work.cloudcommon.exception.CustomException;
import com.work.cloudcommon.json.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "hehe", method = RequestMethod.GET)
    public JsonData hehe() {
        String obj = userClient.getLoginStatus("1", "123");
        if (obj == null) {
            throw new CustomException("获得登录状态异常");
        }
        System.out.println("返回内容：" + obj);
        return new JsonData("成功");
    }

}
