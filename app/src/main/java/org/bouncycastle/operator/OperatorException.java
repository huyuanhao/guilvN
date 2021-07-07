package org.bouncycastle.operator;

public class OperatorException extends Exception {
    public Throwable cause;

    public OperatorException(String str) {
        super(str);
    }

    public OperatorException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
