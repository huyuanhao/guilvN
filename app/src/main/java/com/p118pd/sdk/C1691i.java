package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨 */
public class C1691i extends AbstractC5738Lil {
    public LLllil OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1L1il f18115OooO00o;

    public C1691i(I11li1 i11li1) {
        if (i11li1.size() < 1 || i11li1.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        this.f18115OooO00o = C1L1il.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1) {
            this.OooO00o = LLllil.OooO00o(i11li1.OooO00o(1));
        }
    }

    public C1691i(C1L1il r2) {
        this(r2, null);
    }

    public C1691i(C1L1il r1, LLllil r2) {
        this.f18115OooO00o = r1;
        this.OooO00o = r2;
    }

    public static C1691i OooO00o(Object obj) {
        if (obj instanceof C1691i) {
            return (C1691i) obj;
        }
        if (obj != null) {
            return new C1691i(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LLllil OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1L1il m17417OooO00o() {
        return this.f18115OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18115OooO00o.OooO0O0());
        LLllil r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1.OooO0O0());
        }
        return new C5707LiL1(r0);
    }
}
