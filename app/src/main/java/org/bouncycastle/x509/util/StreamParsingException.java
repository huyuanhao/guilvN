package org.bouncycastle.x509.util;

public class StreamParsingException extends Exception {

    /* renamed from: _e */
    public Throwable f13510_e;

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this.f13510_e = th;
    }

    public Throwable getCause() {
        return this.f13510_e;
    }
}
