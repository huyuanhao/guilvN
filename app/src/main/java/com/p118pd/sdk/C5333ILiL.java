package com.p118pd.sdk;

import org.bouncycastle.dvcs.DVCSConstructionException;

/* renamed from: com.pd.sdk.IL丨iL  reason: invalid class name and case insensitive filesystem */
public class C5333ILiL extends AbstractC9504LiIlL {
    public C5463Ilii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5761Lili f15652OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6091iIL f15653OooO00o;

    public C5333ILiL(C5753LiI1 r4) throws DVCSConstructionException {
        super(r4);
        AbstractC5761Lili r42;
        if (AbstractC1692l1.OooO0o0.equals(r4.OooO00o())) {
            try {
                this.f15653OooO00o = r4.m16341OooO0O0().OooO0O0() instanceof I11li1 ? C6091iIL.OooO00o(r4.m16341OooO0O0()) : C6091iIL.OooO00o(AbstractC6804llL1ii.OooO00o(r4.m16341OooO0O0()).m17938OooO00o());
                C5463Ilii r43 = new C5463Ilii(this.f15653OooO00o.m16954OooO00o());
                this.OooO00o = r43;
                int OooO00o2 = r43.OooO00o();
                if (OooO00o2 == IiIllLI.OooO00o.OooO00o().intValue()) {
                    r42 = new C6652liIiL(this.f15653OooO00o.OooO00o());
                } else if (OooO00o2 == IiIllLI.OooO0O0.OooO00o().intValue()) {
                    r42 = new C9567i1I1(this.f15653OooO00o.OooO00o());
                } else if (OooO00o2 == IiIllLI.OooO0OO.OooO00o().intValue()) {
                    r42 = new C6331ill(this.f15653OooO00o.OooO00o());
                } else if (OooO00o2 == IiIllLI.OooO0Oo.OooO00o().intValue()) {
                    r42 = new C6575lLIiL(this.f15653OooO00o.OooO00o());
                } else {
                    throw new DVCSConstructionException("Unknown service type: " + OooO00o2);
                }
                this.f15652OooO00o = r42;
            } catch (Exception e) {
                throw new DVCSConstructionException("Unable to parse content: " + e.getMessage(), e);
            }
        } else {
            throw new DVCSConstructionException("ContentInfo not a DVCS Request");
        }
    }

    public C5333ILiL(iiiLLi1 r1) throws DVCSConstructionException {
        this(C5575L11Li.OooO00o(r1.m17281OooO00o().m16341OooO0O0()).m15880OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC9504LiIlL, com.p118pd.sdk.AbstractC9504LiIlL
    public ILI OooO00o() {
        return this.f15653OooO00o.m16953OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9504LiIlL, com.p118pd.sdk.AbstractC9504LiIlL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5463Ilii m15537OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9504LiIlL, com.p118pd.sdk.AbstractC9504LiIlL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5761Lili m15538OooO00o() {
        return this.f15652OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9504LiIlL, com.p118pd.sdk.AbstractC9504LiIlL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL m15539OooO00o() {
        return this.f15653OooO00o;
    }
}
