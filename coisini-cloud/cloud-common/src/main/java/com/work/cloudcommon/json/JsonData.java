package com.work.cloudcommon.json;

public class JsonData extends JsonObject {

    private Object data;

    public JsonData() {
        this.code = 0;
        this.success = true;
    }

    public JsonData(Object data) {
        this.data = data;
        this.code = 0;
        this.success = true;
    }

    public JsonData(Object data, Boolean success, String msg) {
        this.data = data;
        this.message = msg;
        if (success != null && success) {
            this.code = 0;
        } else {
            this.code = -1;
        }

        this.success = success;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
