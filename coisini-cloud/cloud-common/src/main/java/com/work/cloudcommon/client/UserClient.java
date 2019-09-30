package com.work.cloudcommon.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "biz-user")
public interface UserClient {

    @RequestMapping(value = "/private/users/login", method = RequestMethod.POST)
    String login(@RequestParam(value = "userName") String userName,
                 @RequestParam(value = "password") String password);

}
