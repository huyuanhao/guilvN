package com.jinhui365.util.util.gson;

public class Result<T> {
    public T data;
    public MessageVO message;

    public T getData() {
        return this.data;
    }

    public MessageVO getMessage() {
        return this.message;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setMessage(MessageVO messageVO) {
        this.message = messageVO;
    }
}
