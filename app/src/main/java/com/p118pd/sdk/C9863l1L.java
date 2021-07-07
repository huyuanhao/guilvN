package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨l丨1L  reason: invalid class name and case insensitive filesystem */
public class C9863l1L extends AbstractC5738Lil {
    public final C6518lIlIl[] OooO00o;

    public C9863l1L(I11li1 i11li1) {
        this.OooO00o = LIIIiI.OooO00o(i11li1);
    }

    public C9863l1L(C6518lIlIl lilil) {
        this.OooO00o = new C6518lIlIl[]{lilil};
    }

    public C9863l1L(C6518lIlIl[] lililArr) {
        this.OooO00o = LIIIiI.OooO00o(lililArr);
    }

    public static C9863l1L OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9863l1L OooO00o(Object obj) {
        if (obj instanceof C9863l1L) {
            return (C9863l1L) obj;
        }
        if (obj != null) {
            return new C9863l1L(I11li1.OooO00o(obj));
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
