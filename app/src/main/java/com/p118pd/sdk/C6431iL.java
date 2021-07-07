package com.p118pd.sdk;

import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.i丨丨丨L  reason: invalid class name and case insensitive filesystem */
public class C6431iL extends AbstractC6832lIi {
    public C1l1 OooO00o;

    public C6431iL(C1l1 r2, C6456l1ilL r3, iLLLlIi illllii, AbstractC6646liI11LlI lii11lli) {
        super(r2.m21879OooO00o(), r3, illllii, lii11lli);
        C9610iLl1 r32;
        this.OooO00o = r2;
        C5630LIii OooO00o2 = r2.OooO00o();
        boolean OooO00o3 = OooO00o2.OooO00o();
        AbstractC6854lLi1LL OooO0O0 = OooO00o2.m16088OooO0O0();
        if (OooO00o3) {
            r32 = new C9610iLl1(AbstractC6804llL1ii.OooO00o(OooO0O0).m17938OooO00o());
        } else {
            IIllLll1 OooO00o4 = IIllLll1.OooO00o(OooO0O0);
            r32 = new C9610iLl1(OooO00o4.OooO00o(), OooO00o4.m15417OooO00o().m17647OooO0O0());
        }
        ((AbstractC6832lIi) this).f18883OooO00o = r32;
    }

    @Override // com.p118pd.sdk.AbstractC6832lIi, com.p118pd.sdk.AbstractC6832lIi, com.p118pd.sdk.AbstractC6832lIi
    public LL1L OooO00o(AbstractC6799ll r4) throws CMSException {
        return ((AbstractC6520lIlLi) r4).OooO00o(((AbstractC6832lIi) this).f18881OooO00o, this.OooO0O0, this.OooO00o.m21881OooO00o().m17938OooO00o());
    }
}
