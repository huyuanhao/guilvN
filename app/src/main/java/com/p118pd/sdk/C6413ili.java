package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨li丨  reason: invalid class name and case insensitive filesystem */
public class C6413ili extends AbstractC5738Lil {
    public iIilII1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18230OooO00o;

    public C6413ili(I11li1 i11li1) {
        this.f18230OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = (iIilII1) i11li1.OooO00o(1);
    }

    public C6413ili(C6456l1ilL r1, byte[] bArr) {
        this.f18230OooO00o = r1;
        this.OooO00o = new iIilII1(bArr);
    }

    public static C6413ili OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6413ili OooO00o(Object obj) {
        if (obj instanceof C6413ili) {
            return (C6413ili) obj;
        }
        if (obj != null) {
            return new C6413ili(I11li1.OooO00o(obj));
        }
        return null;
    }

    public iIilII1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17529OooO00o() {
        return this.f18230OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18230OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
