package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.dvcs.DVCSException;

/* renamed from: com.pd.sdk.丨1I  reason: invalid class name */
public abstract class C1I {
    public final ILlllLi OooO00o = new ILlllLi();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final L11l1i f22747OooO00o = new L11l1i();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6883lll f22748OooO00o;

    public C1I(C6883lll r2) {
        this.f22748OooO00o = r2;
    }

    public C5333ILiL OooO00o(C5178I1iIi i1iIi) throws DVCSException {
        if (!this.f22747OooO00o.m15892OooO00o()) {
            this.f22748OooO00o.OooO00o(this.f22747OooO00o.OooO00o());
        }
        return new C5333ILiL(new C5753LiI1(AbstractC1692l1.OooO0o0, new C6091iIL(this.f22748OooO00o.OooO00o(), i1iIi)));
    }

    public void OooO00o(ILI ili) {
        this.f22748OooO00o.OooO00o(ili);
    }

    public void OooO00o(LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r4) throws DVCSException {
        try {
            this.f22747OooO00o.OooO00o(llLI1, z, r4);
        } catch (IOException e) {
            throw new DVCSException("cannot encode extension: " + e.getMessage(), e);
        }
    }

    public void OooO00o(C5845LIillll r2) {
        this.f22748OooO00o.OooO00o(r2);
    }

    public void OooO00o(BigInteger bigInteger) {
        this.f22748OooO00o.OooO00o(bigInteger);
    }

    public void OooO0O0(ILI ili) {
        this.f22748OooO00o.OooO0O0(ili);
    }

    public void OooO0O0(C5845LIillll r2) {
        this.f22748OooO00o.OooO0O0(r2);
    }

    public void OooO0OO(ILI ili) {
        this.f22748OooO00o.OooO0OO(ili);
    }
}
