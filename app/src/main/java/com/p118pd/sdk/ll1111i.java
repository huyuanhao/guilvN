package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ll1丨111i  reason: invalid class name */
public class ll1111i extends AbstractC5738Lil {
    public II1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1L1il f18715OooO00o;

    public ll1111i(I11li1 i11li1) {
        if (i11li1.size() < 1 || i11li1.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        this.OooO00o = II1l.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1) {
            this.f18715OooO00o = C1L1il.OooO00o(i11li1.OooO00o(1));
        }
    }

    public ll1111i(II1l iI1l) {
        this(iI1l, null);
    }

    public ll1111i(II1l iI1l, C1L1il r2) {
        this.OooO00o = iI1l;
        this.f18715OooO00o = r2;
    }

    public static ll1111i OooO00o(Object obj) {
        if (obj instanceof ll1111i) {
            return (ll1111i) obj;
        }
        if (obj != null) {
            return new ll1111i(I11li1.OooO00o(obj));
        }
        return null;
    }

    public II1l OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1L1il m17839OooO00o() {
        return this.f18715OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        C1L1il r1 = this.f18715OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }
}
