package com.work.bizuser.api;

import com.work.bizuser.service.UserTestService;
import com.work.cloudcommon.exception.CustomException;
import com.work.cloudcommon.json.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserApiController {

    @Autowired
    private UserTestService userTestService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JsonData login(@RequestParam(value = "userName") String userName,
                          @RequestParam(value = "password") String password) {
        System.out.println(userName);
        System.out.println(password);
        if ("1".equals(userName)) {
            throw new CustomException("报错了");
        }
        return new JsonData(userTestService.getAll());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JsonData add(@RequestParam(value = "name") String name,
                          @RequestParam(value = "age") String age) {
        userTestService.add(name, Integer.parseInt(age));
        return new JsonData();
    }

}
