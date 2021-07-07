package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.X509CertSelector;

/* renamed from: com.pd.sdk.丨Il丨丨I1  reason: invalid class name and case insensitive filesystem */
public class C9430IlI1 {
    public X509CertSelector OooO00o(C5184I1l i1l) {
        return OooO00o(i1l.OooO00o(), i1l.m15304OooO00o(), i1l.m15305OooO00o());
    }

    public X509CertSelector OooO00o(l1LILI1 r3, BigInteger bigInteger, byte[] bArr) {
        X509CertSelector x509CertSelector = new X509CertSelector();
        if (r3 != null) {
            try {
                x509CertSelector.setIssuer(r3.getEncoded());
            } catch (IOException e) {
                throw new IllegalArgumentException("unable to convert issuer: " + e.getMessage());
            }
        }
        if (bigInteger != null) {
            x509CertSelector.setSerialNumber(bigInteger);
        }
        if (bArr != null) {
            try {
                x509CertSelector.setSubjectKeyIdentifier(new C6487lIIiIlL(bArr).getEncoded());
            } catch (IOException e2) {
                throw new IllegalArgumentException("unable to convert issuer: " + e2.getMessage());
            }
        }
        return x509CertSelector;
    }
}
