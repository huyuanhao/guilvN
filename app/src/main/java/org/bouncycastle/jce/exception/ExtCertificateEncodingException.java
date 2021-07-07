package org.bouncycastle.jce.exception;

import com.p118pd.sdk.AbstractC9480LIlIil;
import java.security.cert.CertificateEncodingException;

public class ExtCertificateEncodingException extends CertificateEncodingException implements AbstractC9480LIlIil {
    public Throwable cause;

    public ExtCertificateEncodingException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // com.p118pd.sdk.AbstractC9480LIlIil
    public Throwable getCause() {
        return this.cause;
    }
}
