package com.p118pd.sdk;

import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.Ll丨LiL  reason: invalid class name and case insensitive filesystem */
public class C5812LlLiL {
    public AbstractC6290ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6817lI f16766OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9852lIli f16767OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16768OooO00o;
    public AbstractC9852lIli OooO0O0;

    public C5812LlLiL(AbstractC6290ii r2) {
        this(r2, new iILlLL());
    }

    public C5812LlLiL(AbstractC6290ii r1, AbstractC6817lI r2) {
        this.OooO00o = r1;
        this.f16766OooO00o = r2;
    }

    private C6248iiLLi OooO00o(Lii1ii1 r9, C9542L r10) throws OperatorCreationException {
        if (this.f16768OooO00o) {
            return new C6248iiLLi(r10, r9, this.OooO00o, this.f16766OooO00o, true);
        }
        if (this.f16767OooO00o == null && this.OooO0O0 == null) {
            return new C6248iiLLi(r10, r9, this.OooO00o, this.f16766OooO00o);
        }
        if (this.f16767OooO00o == null) {
            this.f16767OooO00o = new C9561i111();
        }
        return new C6248iiLLi(r10, r9, this.OooO00o, this.f16766OooO00o, this.f16767OooO00o, this.OooO0O0);
    }

    public C5812LlLiL OooO00o(AbstractC9852lIli r1) {
        this.f16767OooO00o = r1;
        return this;
    }

    public C5812LlLiL OooO00o(boolean z) {
        this.f16768OooO00o = z;
        return this;
    }

    public C6248iiLLi OooO00o(Lii1ii1 r4, X509CertificateHolder x509CertificateHolder) throws OperatorCreationException {
        C6248iiLLi OooO00o2 = OooO00o(r4, new C9542L(new IIllLll1(x509CertificateHolder.toASN1Structure())));
        OooO00o2.OooO00o(x509CertificateHolder);
        return OooO00o2;
    }

    public C6248iiLLi OooO00o(Lii1ii1 r3, byte[] bArr) throws OperatorCreationException {
        return OooO00o(r3, new C9542L((AbstractC6804llL1ii) new C6487lIIiIlL(bArr)));
    }

    public C5812LlLiL OooO0O0(AbstractC9852lIli r1) {
        this.OooO0O0 = r1;
        return this;
    }
}
