package com.p118pd.sdk;

import java.io.IOException;
import java.security.cert.X509CertSelector;

/* renamed from: com.pd.sdk.I丨L1I  reason: invalid class name and case insensitive filesystem */
public class C5515IL1I {
    public C5184I1l OooO00o(X509CertSelector x509CertSelector) {
        try {
            return x509CertSelector.getSubjectKeyIdentifier() != null ? new C5184I1l(l1LILI1.OooO00o(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber(), AbstractC6804llL1ii.OooO00o((Object) x509CertSelector.getSubjectKeyIdentifier()).m17938OooO00o()) : new C5184I1l(l1LILI1.OooO00o(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber());
        } catch (IOException e) {
            throw new IllegalArgumentException("unable to convert issuer: " + e.getMessage());
        }
    }
}
