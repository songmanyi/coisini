package com.work.cloudcommon.client.impl;

import com.work.cloudcommon.client.api.UserApi;
import com.work.cloudcommon.json.JsonData;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallbackFactory implements FallbackFactory<UserApi> {

    @Override
    public UserApi create(Throwable throwable) {
        System.out.println("熔断触发了");
        return new UserApi() {
            @Override
            public JsonData login(String userName, String password) {
                return null;
            }
        };
    }

}
