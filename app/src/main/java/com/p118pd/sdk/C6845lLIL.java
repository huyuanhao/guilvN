package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.l丨LIL  reason: invalid class name and case insensitive filesystem */
public class C6845lLIL extends AbstractC5738Lil {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f18905OooO00o;

    public C6845lLIL(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.OooO00o = C6456l1ilL.OooO00o(OooO00o2.nextElement());
        this.f18905OooO00o = AbstractC6804llL1ii.OooO00o(OooO00o2.nextElement());
    }

    public C6845lLIL(C6456l1ilL r1, byte[] bArr) {
        this.OooO00o = r1;
        this.f18905OooO00o = new C6487lIIiIlL(bArr);
    }

    public static C6845lLIL OooO00o(Object obj) {
        if (obj instanceof C6845lLIL) {
            return (C6845lLIL) obj;
        }
        if (obj != null) {
            return new C6845lLIL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17992OooO00o() {
        return this.f18905OooO00o.m17938OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f18905OooO00o);
        return new C5707LiL1(r0);
    }
}
