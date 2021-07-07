package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1i1LL1  reason: case insensitive filesystem */
public class C5177I1i1LL1 extends AbstractC5738Lil {
    public final I11li1 OooO00o;
    public final I11li1 OooO0O0;
    public final I11li1 OooO0OO;

    public C5177I1i1LL1(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(0));
            this.OooO0O0 = I11li1.OooO00o(i11li1.OooO00o(1));
            this.OooO0OO = I11li1.OooO00o(i11li1.OooO00o(2));
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public static C5177I1i1LL1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5177I1i1LL1 OooO00o(Object obj) {
        if (obj instanceof C5177I1i1LL1) {
            return (C5177I1i1LL1) obj;
        }
        if (obj != null) {
            return new C5177I1i1LL1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11li1 OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public I11li1 OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15287OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.OooO0OO);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public I11li1 OooO0OO() {
        return this.OooO0OO;
    }
}
