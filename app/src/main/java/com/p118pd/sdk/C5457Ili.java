package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ili  reason: case insensitive filesystem */
public class C5457Ili extends AbstractC5738Lil {
    public final C5753LiI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6518lIlIl f15864OooO00o;

    public C5457Ili(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.f15864OooO00o = C6518lIlIl.OooO00o(i11li1.OooO00o(0));
            this.OooO00o = C5753LiI1.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("incorrect sequence size");
    }

    public C5457Ili(C6518lIlIl lilil, C5753LiI1 r2) {
        this.f15864OooO00o = lilil;
        this.OooO00o = r2;
    }

    public static C5457Ili OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5457Ili OooO00o(Object obj) {
        if (obj instanceof C5457Ili) {
            return (C5457Ili) obj;
        }
        if (obj != null) {
            return new C5457Ili(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5753LiI1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6518lIlIl m15686OooO00o() {
        return this.f15864OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15864OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
