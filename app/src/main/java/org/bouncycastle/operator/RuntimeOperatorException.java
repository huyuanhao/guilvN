package org.bouncycastle.operator;

public class RuntimeOperatorException extends RuntimeException {
    public Throwable cause;

    public RuntimeOperatorException(String str) {
        super(str);
    }

    public RuntimeOperatorException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
