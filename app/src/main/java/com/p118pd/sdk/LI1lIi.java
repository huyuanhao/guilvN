package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.pd.sdk.LI1lIi丨  reason: invalid class name */
public class LI1lIi extends C1679L1 {
    public LI1lIi(X509Certificate x509Certificate) {
        super(OooO00o(x509Certificate.getIssuerX500Principal()), x509Certificate.getSerialNumber(), C5334IL1.m15542OooO00o(x509Certificate));
    }

    public LI1lIi(X500Principal x500Principal, BigInteger bigInteger) {
        super(OooO00o(x500Principal), bigInteger);
    }

    public LI1lIi(X500Principal x500Principal, BigInteger bigInteger, byte[] bArr) {
        super(OooO00o(x500Principal), bigInteger, bArr);
    }

    public static l1LILI1 OooO00o(X500Principal x500Principal) {
        if (x500Principal == null) {
            return null;
        }
        return l1LILI1.OooO00o(x500Principal.getEncoded());
    }
}
