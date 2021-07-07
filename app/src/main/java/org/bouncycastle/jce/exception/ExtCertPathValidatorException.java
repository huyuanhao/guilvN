package org.bouncycastle.jce.exception;

import com.p118pd.sdk.AbstractC9480LIlIil;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

public class ExtCertPathValidatorException extends CertPathValidatorException implements AbstractC9480LIlIil {
    public Throwable cause;

    public ExtCertPathValidatorException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public ExtCertPathValidatorException(String str, Throwable th, CertPath certPath, int i) {
        super(str, th, certPath, i);
        this.cause = th;
    }

    @Override // com.p118pd.sdk.AbstractC9480LIlIil
    public Throwable getCause() {
        return this.cause;
    }
}
