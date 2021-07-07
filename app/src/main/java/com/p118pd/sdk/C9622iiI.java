package com.p118pd.sdk;

import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.丨ii丨I  reason: invalid class name and case insensitive filesystem */
public class C9622iiI {
    public static boolean OooO00o(X509CertificateHolder x509CertificateHolder) {
        return x509CertificateHolder.getSubject().equals(x509CertificateHolder.getIssuer());
    }
}
