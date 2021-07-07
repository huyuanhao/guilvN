package com.google.zxing;

public abstract class ReaderException extends Exception {
    public static final StackTraceElement[] NO_TRACE = new StackTraceElement[0];
    public static final boolean isStackTrace = (System.getProperty("surefire.test.class.path") != null);

    public ReaderException() {
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    public ReaderException(Throwable th) {
        super(th);
    }
}
