package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.i1l丨  reason: invalid class name and case insensitive filesystem */
public class C6052i1l extends AbstractC5738Lil {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17450OooO00o;

    public C6052i1l(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.OooO00o = C6456l1ilL.OooO00o(OooO00o2.nextElement());
        this.f17450OooO00o = AbstractC6804llL1ii.OooO00o(OooO00o2.nextElement()).m17938OooO00o();
    }

    public C6052i1l(C6456l1ilL r1, byte[] bArr) {
        this.f17450OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO00o = r1;
    }

    public static C6052i1l OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6052i1l OooO00o(Object obj) {
        if (obj instanceof C6052i1l) {
            return (C6052i1l) obj;
        }
        if (obj != null) {
            return new C6052i1l(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16916OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f17450OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(new C6487lIIiIlL(this.f17450OooO00o));
        return new C5707LiL1(r0);
    }
}
