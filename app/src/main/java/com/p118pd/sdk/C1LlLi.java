package com.p118pd.sdk;

import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.pd.sdk.丨丨1LlLi丨  reason: invalid class name */
public class C1LlLi extends IL1LI {
    public C1LlLi(X509Certificate x509Certificate) {
        this(x509Certificate.getIssuerX500Principal());
    }

    public C1LlLi(X500Principal x500Principal) {
        super(l1LILI1.OooO00o(x500Principal.getEncoded()));
    }
}
