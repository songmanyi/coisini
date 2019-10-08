package com.work.cloudcommon.client;

import com.alibaba.fastjson.JSONObject;
import com.work.cloudcommon.exception.CustomException;
import com.work.cloudcommon.json.JsonData;

public abstract class BaseClient {

    public <T> T parseJson(JsonData jsonData, Class<T> clazz) {
        if (jsonData == null || !jsonData.isSuccess()) {
            throw new CustomException(jsonData.getCode(), jsonData.getMessage());
        }
        if (jsonData.getData() == null) {
            return null;
        }
        return JSONObject.parseObject(jsonData.getData().toString(), clazz);
    }

}
