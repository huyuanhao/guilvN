package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.丨丨liliL  reason: invalid class name and case insensitive filesystem */
public class C9860liliL {
    public C6438l11L1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9690lLi f23477OooO00o;

    public C9860liliL(C5464IlilIi r2, ILI ili) {
        try {
            this.OooO00o = new C6438l11L1(LLIl11l.OooO0oo, new C5774LlIILI(r2, ili).getEncoded());
            this.f23477OooO00o = new C9690lLi();
        } catch (IOException unused) {
            throw new IllegalStateException("unable to encode key and general name info");
        }
    }

    public C6829lILiLl OooO00o(AbstractC5650LIL r4) throws CMSException {
        return new C6829lILiLl(new LIL(new ii1IlLLL(Ii1I1LlI.OooO00o(this.f23477OooO00o.OooO00o(this.OooO00o, r4).m17725OooO00o().m16341OooO0O0()))));
    }

    public C9860liliL OooO00o(AbstractC5760Lil r2) {
        this.f23477OooO00o.OooO00o(r2);
        return this;
    }
}
