package org.bouncycastle.jce.exception;

import com.p118pd.sdk.AbstractC9480LIlIil;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;

public class ExtCertPathBuilderException extends CertPathBuilderException implements AbstractC9480LIlIil {
    public Throwable cause;

    public ExtCertPathBuilderException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public ExtCertPathBuilderException(String str, Throwable th, CertPath certPath, int i) {
        super(str, th);
        this.cause = th;
    }

    @Override // com.p118pd.sdk.AbstractC9480LIlIil
    public Throwable getCause() {
        return this.cause;
    }
}
