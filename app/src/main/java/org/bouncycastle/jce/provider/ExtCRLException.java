package org.bouncycastle.jce.provider;

import java.security.cert.CRLException;

public class ExtCRLException extends CRLException {
    public Throwable cause;

    public ExtCRLException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
