package org.bouncycastle.cert;

public class CertRuntimeException extends RuntimeException {
    public Throwable cause;

    public CertRuntimeException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
