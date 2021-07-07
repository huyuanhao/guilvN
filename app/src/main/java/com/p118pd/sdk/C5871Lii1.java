package com.p118pd.sdk;

import java.security.cert.X509Certificate;

/* renamed from: com.pd.sdk.L丨ii丨1  reason: invalid class name and case insensitive filesystem */
public class C5871Lii1 {
    public static l1LILI1 OooO00o(AbstractC5662LLi lLi, X509Certificate x509Certificate) {
        return l1LILI1.OooO00o(lLi, x509Certificate.getIssuerX500Principal().getEncoded());
    }

    public static l1LILI1 OooO00o(X509Certificate x509Certificate) {
        return l1LILI1.OooO00o(x509Certificate.getIssuerX500Principal().getEncoded());
    }

    public static l1LILI1 OooO0O0(AbstractC5662LLi lLi, X509Certificate x509Certificate) {
        return l1LILI1.OooO00o(lLi, x509Certificate.getSubjectX500Principal().getEncoded());
    }

    public static l1LILI1 OooO0O0(X509Certificate x509Certificate) {
        return l1LILI1.OooO00o(x509Certificate.getSubjectX500Principal().getEncoded());
    }
}
