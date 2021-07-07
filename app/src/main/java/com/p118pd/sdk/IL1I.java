package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.IL1I */
public class IL1I {
    public final ILIL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final X509CertificateHolder f15543OooO00o;

    public IL1I(X509CertificateHolder x509CertificateHolder, ILIL ilil) {
        this.f15543OooO00o = x509CertificateHolder;
        this.OooO00o = ilil;
    }

    public IL1I(byte[] bArr) throws IOException {
        C5805Ll1 r0 = new C5805Ll1(bArr);
        this.f15543OooO00o = new X509CertificateHolder(r0.OooO00o().getEncoded());
        AbstractC6122iIlLiL OooO00o2 = r0.OooO00o();
        if (OooO00o2 != null) {
            this.OooO00o = new ILIL(OooO00o2.getEncoded());
        } else {
            this.OooO00o = null;
        }
    }

    public ILIL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509CertificateHolder m15469OooO00o() {
        return this.f15543OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15470OooO00o() throws IOException {
        return C9586iIILl.m21645OooO0O0(this.f15543OooO00o.getEncoded(), this.OooO00o.OooO00o().getEncoded());
    }
}
