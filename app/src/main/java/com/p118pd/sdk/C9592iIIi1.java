package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨iI丨Ii丨1  reason: invalid class name and case insensitive filesystem */
public class C9592iIIi1 extends AbstractC5738Lil {
    public final C6518lIlIl[] OooO00o;

    public C9592iIIi1(I11li1 i11li1) {
        this.OooO00o = LIIIiI.OooO00o(i11li1);
    }

    public C9592iIIi1(C6518lIlIl lilil) {
        this.OooO00o = new C6518lIlIl[]{lilil};
    }

    public C9592iIIi1(C6518lIlIl[] lililArr) {
        this.OooO00o = LIIIiI.OooO00o(lililArr);
    }

    public static C9592iIIi1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9592iIIi1 OooO00o(Object obj) {
        if (obj instanceof C9592iIIi1) {
            return (C9592iIIi1) obj;
        }
        if (obj != null) {
            return new C9592iIIi1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6518lIlIl[] OooO00o() {
        return LIIIiI.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(this.OooO00o);
    }
}
