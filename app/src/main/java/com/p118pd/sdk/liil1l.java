package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.liil1l */
public class liil1l extends AbstractC6832lIi {
    public C6265iiilI OooO00o;

    public liil1l(C6265iiilI iiili, C6456l1ilL r3, iLLLlIi illllii, AbstractC6646liI11LlI lii11lli) {
        super(iiili.m17288OooO00o(), r3, illllii, lii11lli);
        this.OooO00o = iiili;
        ((AbstractC6832lIi) this).f18883OooO00o = new C9376IiIi(iiili.OooO00o().m15347OooO00o().m17938OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC6832lIi, com.p118pd.sdk.AbstractC6832lIi, com.p118pd.sdk.AbstractC6832lIi
    public LL1L OooO00o(AbstractC6799ll r4) throws CMSException, IOException {
        return ((AbstractC6479lI1L) r4).OooO00o(((AbstractC6832lIi) this).f18881OooO00o, this.OooO0O0, this.OooO00o.m17290OooO00o().m17938OooO00o());
    }
}
