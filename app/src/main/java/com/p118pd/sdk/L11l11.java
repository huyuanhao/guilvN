package com.p118pd.sdk;

import java.io.IOException;
import java.util.List;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.L11l1丨1  reason: invalid class name */
public class L11l11 extends AbstractC6832lIi {
    public AbstractC6804llL1ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9451L1 f16152OooO00o;

    public L11l11(C9451L1 r2, iilI1iI r3, AbstractC6804llL1ii r4, C6456l1ilL r5, iLLLlIi illllii, AbstractC6646liI11LlI lii11lli) {
        super(r2.m21502OooO00o(), r5, illllii, lii11lli);
        this.f16152OooO00o = r2;
        ((AbstractC6832lIi) this).f18883OooO00o = r3;
        this.OooO00o = r4;
    }

    private C6888ll OooO00o(C5904LlLi11 r2) throws CMSException {
        throw new CMSException("No support for 'originator' as IssuerAndSerialNumber or SubjectKeyIdentifier");
    }

    private C6888ll OooO00o(C6456l1ilL r2, C6413ili r3) {
        return new C6888ll(r2, r3.OooO00o().m15475OooO00o());
    }

    private C6888ll OooO00o(C6456l1ilL r2, C9675lI r3) throws CMSException, IOException {
        C6413ili OooO00o2 = r3.m21724OooO00o();
        if (OooO00o2 != null) {
            return OooO00o(r2, OooO00o2);
        }
        IIllLll1 OooO00o3 = r3.OooO00o();
        return OooO00o(OooO00o3 != null ? new C5904LlLi11(OooO00o3.OooO00o(), OooO00o3.m15417OooO00o().m17647OooO0O0()) : new C5904LlLi11(r3.m21725OooO00o().OooO00o()));
    }

    public static void OooO00o(List list, C9451L1 r13, C6456l1ilL r14, iLLLlIi illllii, AbstractC6646liI11LlI lii11lli) {
        I11li1 OooO00o2 = r13.OooO00o();
        for (int i = 0; i < OooO00o2.size(); i++) {
            C9697li OooO00o3 = C9697li.OooO00o(OooO00o2.OooO00o(i));
            C6731ll1i OooO00o4 = OooO00o3.OooO00o();
            IIllLll1 OooO00o5 = OooO00o4.OooO00o();
            list.add(new L11l11(r13, OooO00o5 != null ? new C5750Li1(OooO00o5.OooO00o(), OooO00o5.m15417OooO00o().m17647OooO0O0()) : new C5750Li1(OooO00o4.m17827OooO00o().m21507OooO00o().m17938OooO00o()), OooO00o3.m21732OooO00o(), r14, illllii, lii11lli));
        }
    }

    @Override // com.p118pd.sdk.AbstractC6832lIi, com.p118pd.sdk.AbstractC6832lIi, com.p118pd.sdk.AbstractC6832lIi
    public LL1L OooO00o(AbstractC6799ll r7) throws CMSException, IOException {
        lILLi1iL lilli1il = (lILLi1iL) r7;
        return lilli1il.OooO00o(((AbstractC6832lIi) this).f18881OooO00o, this.OooO0O0, OooO00o(lilli1il.OooO00o(), this.f16152OooO00o.m21505OooO00o()), this.f16152OooO00o.m21504OooO00o(), this.OooO00o.m17938OooO00o());
    }
}
