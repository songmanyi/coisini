package com.work.cloudcommon.client.api;

import com.work.cloudcommon.client.impl.UserClientFallbackFactory;
import com.work.cloudcommon.json.JsonData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "biz-user", path = "/api/users", fallbackFactory = UserClientFallbackFactory.class)
public interface UserApi {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    JsonData login(@RequestParam(value = "userName") String userName,
                   @RequestParam(value = "password") String password);

}
