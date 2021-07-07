package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lIi  reason: case insensitive filesystem */
public class C6506lIi extends AbstractC5738Lil {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18387OooO00o;

    public C6506lIi(I11li1 i11li1) {
        this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
        this.f18387OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1)).m17938OooO00o();
    }

    public C6506lIi(C6456l1ilL r1, byte[] bArr) {
        this.OooO00o = r1;
        this.f18387OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public static C6506lIi OooO00o(Object obj) {
        if (obj instanceof C6506lIi) {
            return (C6506lIi) obj;
        }
        if (obj != null) {
            return new C6506lIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17633OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f18387OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(new C6487lIIiIlL(this.f18387OooO00o));
        return new C5707LiL1(r0);
    }
}
