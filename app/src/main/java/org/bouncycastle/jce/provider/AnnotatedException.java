package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC9480LIlIil;

public class AnnotatedException extends Exception implements AbstractC9480LIlIil {
    public Throwable _underlyingException;

    public AnnotatedException(String str) {
        this(str, null);
    }

    public AnnotatedException(String str, Throwable th) {
        super(str);
        this._underlyingException = th;
    }

    @Override // com.p118pd.sdk.AbstractC9480LIlIil
    public Throwable getCause() {
        return this._underlyingException;
    }

    public Throwable getUnderlyingException() {
        return this._underlyingException;
    }
}
