package com.work.cloudcommon.exception;

import com.work.cloudcommon.data.AppDefs;

public class CustomException extends RuntimeException {

    private Integer code;

    public CustomException() {
        this.code = -1;
    }

    public CustomException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public CustomException(String msg) {
        super(msg);
        this.code = -1;
    }

    public CustomException(String msg, Throwable cause) {
        super(msg, cause);
        this.code = -1;
    }

    public CustomException(Throwable cause) {
        super(cause);
        this.code = -1;
    }

    public CustomException(AppDefs.ResultMessage message) {
        super(message.getMessage());
        this.code = message.getCode();
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
