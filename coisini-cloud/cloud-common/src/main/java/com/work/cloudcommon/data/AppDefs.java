package com.work.cloudcommon.data;

public class AppDefs {

    public enum ResultMessage {
        MSG_WITH_FILTER_OK(401, "with filter success");

        private int    code;
        private String message;

        private ResultMessage(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }
    }

}
