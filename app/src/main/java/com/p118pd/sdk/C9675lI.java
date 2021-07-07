package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨lI  reason: invalid class name and case insensitive filesystem */
public class C9675lI extends AbstractC5738Lil implements AbstractC5462Ilil {
    public AbstractC6854lLi1LL OooO00o;

    public C9675lI(IIllLll1 iIllLll1) {
        this.OooO00o = iIllLll1;
    }

    public C9675lI(AbstractC6122iIlLiL iillil) {
        this.OooO00o = iillil;
    }

    public C9675lI(C6413ili r4) {
        this.OooO00o = new ILI1Ll(false, 1, r4);
    }

    public C9675lI(C6584lLLL llll) {
        this.OooO00o = new ILI1Ll(false, 0, llll);
    }

    public C9675lI(AbstractC6804llL1ii r2) {
        this(new C6584lLLL(r2.m17938OooO00o()));
    }

    public static C9675lI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        if (z) {
            return OooO00o(r0.OooO0o());
        }
        throw new IllegalArgumentException("Can't implicitly tag OriginatorIdentifierOrKey");
    }

    public static C9675lI OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9675lI)) {
            return (C9675lI) obj;
        }
        if ((obj instanceof IIllLll1) || (obj instanceof I11li1)) {
            return new C9675lI(IIllLll1.OooO00o(obj));
        }
        if (obj instanceof AbstractC5903LlLLL) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) obj;
            if (r0.OooO00o() == 0) {
                return new C9675lI(C6584lLLL.OooO00o(r0, false));
            }
            if (r0.OooO00o() == 1) {
                return new C9675lI(C6413ili.OooO00o(r0, false));
            }
        }
        throw new IllegalArgumentException("Invalid OriginatorIdentifierOrKey: " + obj.getClass().getName());
    }

    public IIllLll1 OooO00o() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        if (r0 instanceof IIllLll1) {
            return (IIllLll1) r0;
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6413ili m21724OooO00o() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        if (!(r0 instanceof AbstractC5903LlLLL) || ((AbstractC5903LlLLL) r0).OooO00o() != 1) {
            return null;
        }
        return C6413ili.OooO00o((AbstractC5903LlLLL) this.OooO00o, false);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6584lLLL m21725OooO00o() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        if (!(r0 instanceof AbstractC5903LlLLL) || ((AbstractC5903LlLLL) r0).OooO00o() != 0) {
            return null;
        }
        return C6584lLLL.OooO00o((AbstractC5903LlLLL) this.OooO00o, false);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m21726OooO0O0() {
        return this.OooO00o;
    }
}
