package com.work.bizmenu.client;

import com.work.cloudcommon.client.BaseClient;
import com.work.cloudcommon.client.api.UserApi;
import com.work.cloudcommon.json.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserClient extends BaseClient {

    @Autowired
    private UserApi userApi;

    public String getLoginStatus(String userName, String password) {
        JsonData jsonData = userApi.login(userName, password);
        return parseJson(jsonData, String.class);
    }


}
