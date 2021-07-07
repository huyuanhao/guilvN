package com.facebook.common.util;

public class ExceptionWithNoStacktrace extends Exception {
    public ExceptionWithNoStacktrace(String str) {
        super(str);
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
