package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.cert.ocsp.OCSPException;

/* renamed from: com.pd.sdk.丨L1LlI丨I  reason: invalid class name and case insensitive filesystem */
public class C9460L1LlII extends C6390ii1 {
    public C9460L1LlII(I111LIL r2, X509Certificate x509Certificate, BigInteger bigInteger) throws OCSPException, CertificateEncodingException {
        super(r2, new JcaX509CertificateHolder(x509Certificate), bigInteger);
    }
}
