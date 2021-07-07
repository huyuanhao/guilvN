package org.bouncycastle.crypto.p289io;

import java.io.IOException;

/* renamed from: org.bouncycastle.crypto.io.CipherIOException */
public class CipherIOException extends IOException {
    public static final long serialVersionUID = 1;
    public final Throwable cause;

    public CipherIOException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
