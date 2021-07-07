package com.p118pd.sdk;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.丨i1  reason: invalid class name and case insensitive filesystem */
public class C9560i1 {
    public C5812LlLiL OooO00o;

    public C9560i1(AbstractC6290ii r2) {
        this(r2, new iILlLL());
    }

    public C9560i1(AbstractC6290ii r2, AbstractC6817lI r3) {
        this.OooO00o = new C5812LlLiL(r2, r3);
    }

    public C6248iiLLi OooO00o(Lii1ii1 r2, X509Certificate x509Certificate) throws OperatorCreationException, CertificateEncodingException {
        return OooO00o(r2, new JcaX509CertificateHolder(x509Certificate));
    }

    public C6248iiLLi OooO00o(Lii1ii1 r2, X509CertificateHolder x509CertificateHolder) throws OperatorCreationException {
        return this.OooO00o.OooO00o(r2, x509CertificateHolder);
    }

    public C6248iiLLi OooO00o(Lii1ii1 r2, byte[] bArr) throws OperatorCreationException {
        return this.OooO00o.OooO00o(r2, bArr);
    }

    public C9560i1 OooO00o(AbstractC9852lIli r2) {
        this.OooO00o.OooO00o(r2);
        return this;
    }

    public C9560i1 OooO00o(boolean z) {
        this.OooO00o.OooO00o(z);
        return this;
    }

    public C9560i1 OooO0O0(AbstractC9852lIli r2) {
        this.OooO00o.OooO0O0(r2);
        return this;
    }
}
