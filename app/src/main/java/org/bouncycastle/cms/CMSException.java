package org.bouncycastle.cms;

public class CMSException extends Exception {

    /* renamed from: e */
    public Exception f13484e;

    public CMSException(String str) {
        super(str);
    }

    public CMSException(String str, Exception exc) {
        super(str);
        this.f13484e = exc;
    }

    public Throwable getCause() {
        return this.f13484e;
    }

    public Exception getUnderlyingException() {
        return this.f13484e;
    }
}
