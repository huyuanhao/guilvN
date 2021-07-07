package com.p118pd.sdk;

import java.io.IOException;
import java.util.Date;
import org.bouncycastle.dvcs.DVCSException;

/* renamed from: com.pd.sdk.LLLliIi */
public class LLLliIi extends C1I {
    public LLLliIi() {
        super(new C6883lll(IiIllLI.OooO0O0));
    }

    public C5333ILiL OooO00o(iiiLLi1 r3) throws DVCSException {
        try {
            return OooO00o(new C5178I1iIi(r3.getEncoded()));
        } catch (IOException e) {
            throw new DVCSException("Failed to encode CMS signed data", e);
        }
    }

    public void OooO00o(Date date) {
        ((C1I) this).f22748OooO00o.OooO00o(new C5509IIiI(date));
    }
}
