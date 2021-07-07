package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨L丨  reason: invalid class name and case insensitive filesystem */
public class C9542L extends AbstractC5738Lil implements AbstractC5462Ilil {
    public AbstractC6854lLi1LL OooO00o;

    public C9542L(IIllLll1 iIllLll1) {
        this.OooO00o = iIllLll1;
    }

    public C9542L(AbstractC6122iIlLiL iillil) {
        this.OooO00o = iillil;
    }

    public C9542L(AbstractC6804llL1ii r3) {
        this.OooO00o = new ILI1Ll(false, 0, r3);
    }

    public static C9542L OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9542L)) {
            return (C9542L) obj;
        }
        if (obj instanceof IIllLll1) {
            return new C9542L((IIllLll1) obj);
        }
        if (obj instanceof AbstractC6804llL1ii) {
            return new C9542L((AbstractC6804llL1ii) obj);
        }
        if (obj instanceof AbstractC6122iIlLiL) {
            return new C9542L((AbstractC6122iIlLiL) obj);
        }
        throw new IllegalArgumentException("Illegal object in SignerIdentifier: " + obj.getClass().getName());
    }

    public boolean OooO00o() {
        return this.OooO00o instanceof AbstractC5903LlLLL;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m21602OooO0O0() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        return r0 instanceof AbstractC5903LlLLL ? AbstractC6804llL1ii.OooO00o((AbstractC5903LlLLL) r0, false) : r0;
    }
}
