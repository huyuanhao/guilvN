package com.p118pd.sdk;

/* renamed from: com.pd.sdk.II1l */
public class II1l extends AbstractC5738Lil {
    public C1II OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9623il f15451OooO00o;

    public II1l(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = C1II.OooO00o(i11li1.OooO00o(0));
            this.f15451OooO00o = (C9623il) i11li1.OooO00o(1);
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public II1l(C1II r1, C9623il r2) {
        this.OooO00o = r1;
        this.f15451OooO00o = r2;
    }

    public static II1l OooO00o(Object obj) {
        if (obj instanceof II1l) {
            return (II1l) obj;
        }
        if (obj != null) {
            return new II1l(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C1II OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m15356OooO00o() {
        return this.f15451OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f15451OooO00o);
        return new C5707LiL1(r0);
    }
}
