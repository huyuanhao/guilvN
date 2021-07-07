package com.rxhui.httpclient.response;

import java.io.Serializable;

public class HttpStatus<T> implements Serializable {
    public T data;
    public MessageBean message;

    public static class MessageBean implements Serializable {
        public String code;
        public String message;

        public String getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setMessage(String str) {
            this.message = str;
        }
    }

    public T getData() {
        return this.data;
    }

    public MessageBean getMessageBean() {
        return this.message;
    }

    public boolean isCodeInvalid() {
        return !"0".equals(this.message.getCode());
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setMessageBean(MessageBean messageBean) {
        this.message = messageBean;
    }
}
