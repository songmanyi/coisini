package com.work.bizuser.api;

import com.work.cloudcommon.exception.CustomException;
import com.work.cloudcommon.json.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserApiController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JsonData login(@RequestParam(value = "userName") String userName,
                          @RequestParam(value = "password") String password) {
        System.out.println(userName);
        System.out.println(password);
        if ("1".equals(userName)) {
            throw new CustomException("报错了");
        }
        return new JsonData("test");
    }

}
