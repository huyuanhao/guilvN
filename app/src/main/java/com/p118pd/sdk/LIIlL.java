package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIIl丨丨L  reason: invalid class name */
public class LIIlL extends AbstractC5738Lil {
    public final I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LII f16293OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f16294OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C1682Li f16295OooO00o;

    /* renamed from: com.pd.sdk.LIIl丨丨L$OooO00o */
    public static class OooO00o extends AbstractC5738Lil implements AbstractC5462Ilil {
        public final C6101iIL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final IlL1ll1 f16296OooO00o;

        public OooO00o(C6101iIL r2) {
            this(null, r2);
        }

        public OooO00o(IlL1ll1 r2) {
            this(r2, null);
        }

        public OooO00o(IlL1ll1 r1, C6101iIL r2) {
            this.f16296OooO00o = r1;
            this.OooO00o = r2;
        }

        public static OooO00o OooO0O0(Object obj) {
            if (obj instanceof OooO00o) {
                return (OooO00o) obj;
            }
            if (obj instanceof AbstractC6854lLi1LL) {
                AbstractC6122iIlLiL OooO0O0 = ((AbstractC6854lLi1LL) obj).OooO0O0();
                if (OooO0O0 instanceof C6513lIiI) {
                    return new OooO00o(IlL1ll1.OooO00o(OooO0O0));
                }
                if (OooO0O0 instanceof I11li1) {
                    return new OooO00o(C6101iIL.OooO00o(OooO0O0));
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance(): " + obj.getClass().getName());
        }

        public boolean OooO00o() {
            return this.f16296OooO00o != null;
        }

        @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
        public AbstractC6122iIlLiL OooO0O0() {
            C6101iIL r0 = this.OooO00o;
            return r0 != null ? r0.OooO0O0() : this.f16296OooO00o.OooO0O0();
        }
    }

    public LIIlL(I11li1 i11li1) {
        AbstractC6854lLi1LL OooO00o2;
        if (i11li1.size() < 2 || i11li1.size() > 4) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f16295OooO00o = C1682Li.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(1));
        if (i11li1.size() > 3) {
            this.f16293OooO00o = LII.OooO00o(i11li1.OooO00o(2));
            OooO00o2 = i11li1.OooO00o(3);
        } else {
            if (i11li1.size() <= 2) {
                this.f16293OooO00o = null;
            } else if (i11li1.OooO00o(2) instanceof LII) {
                this.f16293OooO00o = LII.OooO00o(i11li1.OooO00o(2));
            } else {
                this.f16293OooO00o = null;
                OooO00o2 = i11li1.OooO00o(2);
            }
            this.f16294OooO00o = null;
            return;
        }
        this.f16294OooO00o = OooO00o.OooO0O0(OooO00o2);
    }

    public LIIlL(C1682Li li, I11li1 i11li1, LII lii, OooO00o oooO00o) {
        this.f16295OooO00o = li;
        this.OooO00o = i11li1;
        this.f16293OooO00o = lii;
        this.f16294OooO00o = oooO00o;
    }

    public static LIIlL OooO00o(Object obj) {
        if (obj instanceof LIIlL) {
            return (LIIlL) obj;
        }
        if (obj != null) {
            return new LIIlL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LII OooO00o() {
        return this.f16293OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO00o m16033OooO00o() {
        return this.f16294OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1682Li m16034OooO00o() {
        return this.f16295OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16035OooO00o() {
        return this.f16294OooO00o != null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6518lIlIl[] m16036OooO00o() {
        return LIIIiI.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16295OooO00o);
        r0.OooO00o(this.OooO00o);
        LII lii = this.f16293OooO00o;
        if (lii != null) {
            r0.OooO00o(lii);
        }
        OooO00o oooO00o = this.f16294OooO00o;
        if (oooO00o != null) {
            r0.OooO00o(oooO00o);
        }
        return new C5707LiL1(r0);
    }
}
