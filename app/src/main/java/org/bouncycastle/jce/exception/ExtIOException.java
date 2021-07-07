package org.bouncycastle.jce.exception;

import com.p118pd.sdk.AbstractC9480LIlIil;
import java.io.IOException;

public class ExtIOException extends IOException implements AbstractC9480LIlIil {
    public Throwable cause;

    public ExtIOException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // com.p118pd.sdk.AbstractC9480LIlIil
    public Throwable getCause() {
        return this.cause;
    }
}
