package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.pd.sdk.iiLli丨  reason: invalid class name and case insensitive filesystem */
public class C6253iiLli extends C5184I1l {
    public C6253iiLli(X509Certificate x509Certificate) {
        super(OooO00o(x509Certificate.getIssuerX500Principal()), x509Certificate.getSerialNumber(), OooO00o(x509Certificate));
    }

    public C6253iiLli(X500Principal x500Principal, BigInteger bigInteger) {
        super(OooO00o(x500Principal), bigInteger);
    }

    public C6253iiLli(X500Principal x500Principal, BigInteger bigInteger, byte[] bArr) {
        super(OooO00o(x500Principal), bigInteger, bArr);
    }

    public static l1LILI1 OooO00o(X500Principal x500Principal) {
        if (x500Principal == null) {
            return null;
        }
        return l1LILI1.OooO00o(x500Principal.getEncoded());
    }

    public static byte[] OooO00o(X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(C5237III.o00OoOo.m16387OooO0O0());
        if (extensionValue != null) {
            return AbstractC6804llL1ii.OooO00o((Object) AbstractC6804llL1ii.OooO00o((Object) extensionValue).m17938OooO00o()).m17938OooO00o();
        }
        return null;
    }
}
