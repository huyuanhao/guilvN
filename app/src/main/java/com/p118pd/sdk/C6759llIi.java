package com.p118pd.sdk;

/* renamed from: com.pd.sdk.llIi  reason: case insensitive filesystem */
public class C6759llIi extends AbstractC5738Lil {
    public final L1Li OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LIi1i1l1 f18743OooO00o;

    public C6759llIi(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = L1Li.OooO00o(i11li1.OooO00o(0));
            this.f18743OooO00o = LIi1i1l1.OooO00o(i11li1.OooO00o(1));
            return;
        }
        if (i11li1.size() == 1) {
            boolean z = i11li1.OooO00o(0).OooO0O0() instanceof I11li1;
            AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(0);
            if (z) {
                this.OooO00o = L1Li.OooO00o(OooO00o2);
            } else {
                this.f18743OooO00o = LIi1i1l1.OooO00o(OooO00o2);
                this.OooO00o = null;
                return;
            }
        } else if (i11li1.size() == 0) {
            this.OooO00o = null;
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        this.f18743OooO00o = null;
    }

    public C6759llIi(L1Li l1Li, LIi1i1l1 lIi1i1l1) {
        this.OooO00o = l1Li;
        this.f18743OooO00o = lIi1i1l1;
    }

    public C6759llIi(L1Li l1Li, String str) {
        this(l1Li, new LIi1i1l1(str));
    }

    public static C6759llIi OooO00o(Object obj) {
        if (obj instanceof C6759llIi) {
            return (C6759llIi) obj;
        }
        if (obj != null) {
            return new C6759llIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public L1Li OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LIi1i1l1 m17864OooO00o() {
        return this.f18743OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        L1Li l1Li = this.OooO00o;
        if (l1Li != null) {
            r0.OooO00o(l1Li);
        }
        LIi1i1l1 lIi1i1l1 = this.f18743OooO00o;
        if (lIi1i1l1 != null) {
            r0.OooO00o(lIi1i1l1);
        }
        return new C5707LiL1(r0);
    }
}
