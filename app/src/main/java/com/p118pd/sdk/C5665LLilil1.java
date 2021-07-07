package com.p118pd.sdk;

import java.io.IOException;
import java.security.cert.X509CertSelector;

/* renamed from: com.pd.sdk.LLilil1  reason: case insensitive filesystem */
public class C5665LLilil1 {
    public C1679L1 OooO00o(X509CertSelector x509CertSelector) {
        try {
            return x509CertSelector.getSubjectKeyIdentifier() != null ? new C1679L1(l1LILI1.OooO00o(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber(), AbstractC6804llL1ii.OooO00o((Object) x509CertSelector.getSubjectKeyIdentifier()).m17938OooO00o()) : new C1679L1(l1LILI1.OooO00o(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber());
        } catch (IOException e) {
            throw new IllegalArgumentException("unable to convert issuer: " + e.getMessage());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9610iLl1 m16236OooO00o(X509CertSelector x509CertSelector) {
        try {
            return x509CertSelector.getSubjectKeyIdentifier() != null ? new C9610iLl1(l1LILI1.OooO00o(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber(), AbstractC6804llL1ii.OooO00o((Object) x509CertSelector.getSubjectKeyIdentifier()).m17938OooO00o()) : new C9610iLl1(l1LILI1.OooO00o(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber());
        } catch (IOException e) {
            throw new IllegalArgumentException("unable to convert issuer: " + e.getMessage());
        }
    }
}
