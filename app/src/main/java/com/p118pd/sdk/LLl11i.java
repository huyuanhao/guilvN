package com.p118pd.sdk;

import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.pd.sdk.LLl11i */
public class LLl11i {
    public static l1LILI1 OooO00o(Object obj) {
        return obj instanceof X509Certificate ? OooO00o((X509Certificate) obj) : l1LILI1.OooO00o(((X500Principal) ((AbstractC9605iL11) obj).m21662OooO00o().m21591OooO00o()[0]).getEncoded());
    }

    public static l1LILI1 OooO00o(TrustAnchor trustAnchor) {
        return l1LILI1.OooO00o(trustAnchor.getCA().getEncoded());
    }

    public static l1LILI1 OooO00o(X509CRL x509crl) {
        return l1LILI1.OooO00o(x509crl.getIssuerX500Principal().getEncoded());
    }

    public static l1LILI1 OooO00o(X509Certificate x509Certificate) {
        return l1LILI1.OooO00o(x509Certificate.getIssuerX500Principal().getEncoded());
    }

    public static l1LILI1 OooO0O0(X509Certificate x509Certificate) {
        return l1LILI1.OooO00o(x509Certificate.getSubjectX500Principal().getEncoded());
    }
}
