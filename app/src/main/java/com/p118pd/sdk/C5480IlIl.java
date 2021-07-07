package com.p118pd.sdk;

import java.security.cert.X509Certificate;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.pd.sdk.Il丨I丨丨l  reason: invalid class name and case insensitive filesystem */
public class C5480IlIl extends C6006i11LL {
    public C5480IlIl(X509Certificate x509Certificate, Date date) {
        this(x509Certificate.getSubjectX500Principal(), date);
    }

    public C5480IlIl(X500Principal x500Principal, Date date) {
        super(l1LILI1.OooO00o(x500Principal.getEncoded()), date);
    }
}
