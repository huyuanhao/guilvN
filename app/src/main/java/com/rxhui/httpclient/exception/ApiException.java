package com.rxhui.httpclient.exception;

public class ApiException extends RuntimeException {
    public String errorCode;
    public String errorMsg;
    public String response;

    public ApiException(String str, String str2, String str3) {
        super(str3);
        this.response = str;
        this.errorMsg = str3;
        this.errorCode = str2;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getResponse() {
        return this.response;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public void setResponse(String str) {
        this.response = str;
    }
}
