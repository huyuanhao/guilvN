package com.p118pd.sdk;

import java.math.BigInteger;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.I1l  reason: case insensitive filesystem */
public class C5184I1l implements AbstractC6317ilLi {
    public l1LILI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f15396OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15397OooO00o;

    public C5184I1l(l1LILI1 r2, BigInteger bigInteger) {
        this(r2, bigInteger, null);
    }

    public C5184I1l(l1LILI1 r1, BigInteger bigInteger, byte[] bArr) {
        this.OooO00o = r1;
        this.f15396OooO00o = bigInteger;
        this.f15397OooO00o = bArr;
    }

    public C5184I1l(byte[] bArr) {
        this(null, null, bArr);
    }

    private boolean OooO00o(Object obj, Object obj2) {
        return obj != null ? obj.equals(obj2) : obj2 == null;
    }

    public l1LILI1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15304OooO00o() {
        return this.f15396OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        if (obj instanceof X509CertificateHolder) {
            X509CertificateHolder x509CertificateHolder = (X509CertificateHolder) obj;
            if (m15304OooO00o() != null) {
                IIllLll1 iIllLll1 = new IIllLll1(x509CertificateHolder.toASN1Structure());
                return iIllLll1.OooO00o().equals(this.OooO00o) && iIllLll1.m15417OooO00o().m17647OooO0O0().equals(this.f15396OooO00o);
            } else if (this.f15397OooO00o != null) {
                C5237III extension = x509CertificateHolder.getExtension(C5237III.o00OoOo);
                if (extension == null) {
                    return C9586iIILl.m21627OooO00o(this.f15397OooO00o, C6635li1I.OooO00o(x509CertificateHolder.getSubjectPublicKeyInfo()));
                }
                return C9586iIILl.m21627OooO00o(this.f15397OooO00o, AbstractC6804llL1ii.OooO00o(extension.m15435OooO0O0()).m17938OooO00o());
            }
        } else if (obj instanceof byte[]) {
            return C9586iIILl.m21627OooO00o(this.f15397OooO00o, (byte[]) obj);
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15305OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f15397OooO00o);
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return new C5184I1l(this.OooO00o, this.f15396OooO00o, this.f15397OooO00o);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5184I1l)) {
            return false;
        }
        C5184I1l i1l = (C5184I1l) obj;
        return C9586iIILl.m21627OooO00o(this.f15397OooO00o, i1l.f15397OooO00o) && OooO00o(this.f15396OooO00o, i1l.f15396OooO00o) && OooO00o(this.OooO00o, i1l.OooO00o);
    }

    public int hashCode() {
        int OooO00o2 = C9586iIILl.OooO00o(this.f15397OooO00o);
        BigInteger bigInteger = this.f15396OooO00o;
        if (bigInteger != null) {
            OooO00o2 ^= bigInteger.hashCode();
        }
        l1LILI1 r1 = this.OooO00o;
        return r1 != null ? OooO00o2 ^ r1.hashCode() : OooO00o2;
    }
}
