package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨ILi  reason: invalid class name and case insensitive filesystem */
public class C9365ILi extends AbstractC5738Lil {
    public C9623il OooO00o;
    public C9623il OooO0O0;

    public C9365ILi(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = C9623il.OooO00o(i11li1.OooO00o(0));
            this.OooO0O0 = C9623il.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C9365ILi(C9623il r1, C9623il r2) {
        this.OooO00o = r1;
        this.OooO0O0 = r2;
    }

    public static C9365ILi OooO00o(Object obj) {
        if (obj instanceof C9365ILi) {
            return (C9365ILi) obj;
        }
        if (obj != null) {
            return new C9365ILi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C9623il OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.OooO0O0);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C9623il m21431OooO0O0() {
        return this.OooO00o;
    }
}
