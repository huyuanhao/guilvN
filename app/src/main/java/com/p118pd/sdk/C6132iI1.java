package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iI丨1  reason: invalid class name and case insensitive filesystem */
public class C6132iI1 extends AbstractC5738Lil {
    public C6353i1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f17614OooO00o;

    public C6132iI1(I11li1 i11li1) {
        this.OooO00o = C6353i1.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() == 2) {
            this.f17614OooO00o = iI11IL.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true);
        }
    }

    public C6132iI1(C6353i1 r1, iI11IL r2) {
        this.OooO00o = r1;
        this.f17614OooO00o = r2;
    }

    public static C6132iI1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6132iI1 OooO00o(Object obj) {
        if (obj instanceof C6132iI1) {
            return (C6132iI1) obj;
        }
        if (obj != null) {
            return new C6132iI1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6353i1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m17035OooO00o() {
        return this.f17614OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        if (this.f17614OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.f17614OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
