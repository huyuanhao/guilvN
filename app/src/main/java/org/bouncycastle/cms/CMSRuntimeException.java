package org.bouncycastle.cms;

public class CMSRuntimeException extends RuntimeException {

    /* renamed from: e */
    public Exception f13485e;

    public CMSRuntimeException(String str) {
        super(str);
    }

    public CMSRuntimeException(String str, Exception exc) {
        super(str);
        this.f13485e = exc;
    }

    public Throwable getCause() {
        return this.f13485e;
    }

    public Exception getUnderlyingException() {
        return this.f13485e;
    }
}
