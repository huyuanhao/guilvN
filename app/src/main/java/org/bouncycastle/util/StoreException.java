package org.bouncycastle.util;

public class StoreException extends RuntimeException {

    /* renamed from: _e */
    public Throwable f13508_e;

    public StoreException(String str, Throwable th) {
        super(str);
        this.f13508_e = th;
    }

    public Throwable getCause() {
        return this.f13508_e;
    }
}
