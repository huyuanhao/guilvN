package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨1II  reason: invalid class name */
public class C1II extends AbstractC5738Lil implements AbstractC5462Ilil {
    public AbstractC6854lLi1LL OooO00o;

    public C1II(l1LILI1 r1) {
        this.OooO00o = r1;
    }

    public C1II(AbstractC6804llL1ii r1) {
        this.OooO00o = r1;
    }

    public static C1II OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(r0.OooO0o());
    }

    public static C1II OooO00o(Object obj) {
        if (obj instanceof C1II) {
            return (C1II) obj;
        }
        if (obj instanceof C6487lIIiIlL) {
            return new C1II((C6487lIIiIlL) obj);
        }
        if (!(obj instanceof AbstractC5903LlLLL)) {
            return new C1II(l1LILI1.OooO00o(obj));
        }
        AbstractC5903LlLLL r2 = (AbstractC5903LlLLL) obj;
        return r2.OooO00o() == 1 ? new C1II(l1LILI1.OooO00o(r2, true)) : new C1II(AbstractC6804llL1ii.OooO00o(r2, true));
    }

    public l1LILI1 OooO00o() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        if (r0 instanceof AbstractC6804llL1ii) {
            return null;
        }
        return l1LILI1.OooO00o(r0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21263OooO00o() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        if (r0 instanceof AbstractC6804llL1ii) {
            return ((AbstractC6804llL1ii) r0).m17938OooO00o();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o instanceof AbstractC6804llL1ii ? new ILI1Ll(true, 2, this.OooO00o) : new ILI1Ll(true, 1, this.OooO00o);
    }
}
