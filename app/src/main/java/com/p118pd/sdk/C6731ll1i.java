package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ll1i  reason: case insensitive filesystem */
public class C6731ll1i extends AbstractC5738Lil implements AbstractC5462Ilil {
    public IIllLll1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1I1Ll f18710OooO00o;

    public C6731ll1i(IIllLll1 iIllLll1) {
        this.OooO00o = iIllLll1;
        this.f18710OooO00o = null;
    }

    public C6731ll1i(L1I1Ll r2) {
        this.OooO00o = null;
        this.f18710OooO00o = r2;
    }

    public static C6731ll1i OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6731ll1i OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6731ll1i)) {
            return (C6731ll1i) obj;
        }
        if (obj instanceof I11li1) {
            return new C6731ll1i(IIllLll1.OooO00o(obj));
        }
        if (obj instanceof AbstractC5903LlLLL) {
            AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) obj;
            if (r0.OooO00o() == 0) {
                return new C6731ll1i(L1I1Ll.OooO00o(r0, false));
            }
        }
        throw new IllegalArgumentException("Invalid KeyAgreeRecipientIdentifier: " + obj.getClass().getName());
    }

    public IIllLll1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public L1I1Ll m17827OooO00o() {
        return this.f18710OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        IIllLll1 iIllLll1 = this.OooO00o;
        return iIllLll1 != null ? iIllLll1.OooO0O0() : new ILI1Ll(false, 0, this.f18710OooO00o);
    }
}
