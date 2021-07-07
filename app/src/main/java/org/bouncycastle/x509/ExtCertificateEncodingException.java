package org.bouncycastle.x509;

import java.security.cert.CertificateEncodingException;

public class ExtCertificateEncodingException extends CertificateEncodingException {
    public Throwable cause;

    public ExtCertificateEncodingException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
