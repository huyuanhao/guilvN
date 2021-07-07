package org.bouncycastle.cert.dane;

public class DANEException extends Exception {
    public Throwable cause;

    public DANEException(String str) {
        super(str);
    }

    public DANEException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
