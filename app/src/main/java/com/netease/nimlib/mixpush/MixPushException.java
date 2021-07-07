package com.netease.nimlib.mixpush;

public class MixPushException extends Exception {
    public int errorCode;
    public Exception innerException;

    public MixPushException(String str) {
        super(str);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public Exception getInnerException() {
        return this.innerException;
    }

    public MixPushException(String str, Exception exc) {
        super(str);
        this.innerException = exc;
    }

    public MixPushException(String str, int i) {
        super(str);
        this.errorCode = i;
    }
}
