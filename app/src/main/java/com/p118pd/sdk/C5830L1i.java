package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L丨1i  reason: invalid class name and case insensitive filesystem */
public class C5830L1i extends AbstractC5738Lil {
    public final C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6513lIiI f16799OooO00o;

    public C5830L1i(I11li1 i11li1) {
        this.f16799OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
    }

    public C5830L1i(C6456l1ilL r4) {
        this.f16799OooO00o = new C6513lIiI(0);
        this.OooO00o = r4;
    }

    public static final C5830L1i OooO00o(Object obj) {
        if (obj instanceof C5830L1i) {
            return (C5830L1i) obj;
        }
        if (obj != null) {
            return new C5830L1i(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16799OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
