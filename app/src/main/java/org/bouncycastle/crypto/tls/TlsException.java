package org.bouncycastle.crypto.tls;

import java.io.IOException;

public class TlsException extends IOException {
    public Throwable cause;

    public TlsException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
