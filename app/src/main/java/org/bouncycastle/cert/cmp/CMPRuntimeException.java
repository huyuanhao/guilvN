package org.bouncycastle.cert.cmp;

public class CMPRuntimeException extends RuntimeException {
    public Throwable cause;

    public CMPRuntimeException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
