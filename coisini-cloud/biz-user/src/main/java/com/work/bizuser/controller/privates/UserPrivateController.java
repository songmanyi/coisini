package com.work.bizuser.controller.privates;

import com.work.cloudcommon.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/private/users")
public class UserPrivateController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "userName") String userName,
                        @RequestParam(value = "password") String password) {
        System.out.println(userName);
        System.out.println(password);
        if ("1".equals(userName)) {
            throw new CustomException("报错了");
        }
        redisTemplate.opsForValue().set("ceshi-" + userName + "-" + password, "", 5, TimeUnit.MINUTES);
        return "test";
    }

}
