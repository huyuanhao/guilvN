package com.p118pd.sdk;

import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.dane.DANEException;

/* renamed from: com.pd.sdk.LlIi丨1  reason: invalid class name and case insensitive filesystem */
public class C5778LlIi1 {
    public final C9838iii OooO00o;

    public C5778LlIi1(I111LIL r2) {
        this.OooO00o = new C9838iii(r2);
    }

    public C9469L11iL OooO00o(String str, int i, X509CertificateHolder x509CertificateHolder) throws DANEException {
        if (i < 0 || i > 3) {
            throw new DANEException("unknown certificate usage: " + i);
        }
        return new C9469L11iL(this.OooO00o.OooO00o(str).OooO0O0(), new byte[]{(byte) i, 0, 0}, x509CertificateHolder);
    }

    public C9469L11iL OooO00o(String str, X509CertificateHolder x509CertificateHolder) throws DANEException {
        return OooO00o(str, 3, x509CertificateHolder);
    }
}
