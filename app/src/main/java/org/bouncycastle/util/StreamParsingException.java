package org.bouncycastle.util;

public class StreamParsingException extends Exception {

    /* renamed from: _e */
    public Throwable f13509_e;

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this.f13509_e = th;
    }

    public Throwable getCause() {
        return this.f13509_e;
    }
}
