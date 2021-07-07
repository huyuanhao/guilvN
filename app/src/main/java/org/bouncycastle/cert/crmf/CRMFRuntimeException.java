package org.bouncycastle.cert.crmf;

public class CRMFRuntimeException extends RuntimeException {
    public Throwable cause;

    public CRMFRuntimeException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
