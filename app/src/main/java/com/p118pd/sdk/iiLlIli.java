package com.p118pd.sdk;

import org.bouncycastle.dvcs.DVCSConstructionException;

/* renamed from: com.pd.sdk.iiLlIli */
public class iiLlIli extends AbstractC9504LiIlL {
    public C6066i1lil OooO00o;

    public iiLlIli(C5753LiI1 r4) throws DVCSConstructionException {
        super(r4);
        if (AbstractC1692l1.OooO0o.equals(r4.OooO00o())) {
            try {
                this.OooO00o = r4.m16341OooO0O0().OooO0O0() instanceof I11li1 ? C6066i1lil.OooO00o(r4.m16341OooO0O0()) : C6066i1lil.OooO00o(AbstractC6804llL1ii.OooO00o(r4.m16341OooO0O0()).m17938OooO00o());
            } catch (Exception e) {
                throw new DVCSConstructionException("Unable to parse content: " + e.getMessage(), e);
            }
        } else {
            throw new DVCSConstructionException("ContentInfo not a DVCS Response");
        }
    }

    public iiLlIli(iiiLLi1 r1) throws DVCSConstructionException {
        this(C5575L11Li.OooO00o(r1.m17281OooO00o().m16341OooO0O0()).m15880OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC9504LiIlL, com.p118pd.sdk.AbstractC9504LiIlL
    public AbstractC6854lLi1LL OooO00o() {
        return this.OooO00o;
    }
}
