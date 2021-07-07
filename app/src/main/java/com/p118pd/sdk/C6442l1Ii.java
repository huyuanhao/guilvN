package com.p118pd.sdk;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.pkcs.PKCSIOException;

/* renamed from: com.pd.sdk.l1Ii  reason: case insensitive filesystem */
public class C6442l1Ii extends C5398IiLi1 {
    public C6442l1Ii(PrivateKey privateKey) {
        super(C5464IlilIi.OooO00o(privateKey.getEncoded()));
    }

    public C6442l1Ii(PrivateKey privateKey, AbstractC5650LIL r2) {
        super(C5464IlilIi.OooO00o(privateKey.getEncoded()), r2);
    }

    public C6442l1Ii(X509Certificate x509Certificate) throws IOException {
        super(OooO00o(x509Certificate));
    }

    public static LilIiIl OooO00o(X509Certificate x509Certificate) throws IOException {
        try {
            return LilIiIl.OooO00o(x509Certificate.getEncoded());
        } catch (CertificateEncodingException e) {
            throw new PKCSIOException("cannot encode certificate: " + e.getMessage(), e);
        }
    }
}
