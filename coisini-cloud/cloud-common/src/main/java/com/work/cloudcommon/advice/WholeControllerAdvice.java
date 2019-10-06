package com.work.cloudcommon.advice;

import com.work.cloudcommon.exception.CustomException;
import com.work.cloudcommon.json.JsonData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class WholeControllerAdvice {

    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public JsonData errorHandler(Exception ex) {
        JsonData data = new JsonData();
        data.setSuccess(false);
        if (ex instanceof CustomException) {
            CustomException cex = (CustomException) ex;
            data.setCode(cex.getCode());
            data.setMessage(cex.getMessage());
        } else {
            data.setCode(-1);
            data.setMessage("系统异常，工程师正在排查");
        }
        return data;
    }

}
