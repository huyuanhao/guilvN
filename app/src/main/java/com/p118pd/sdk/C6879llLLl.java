package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.dvcs.DVCSException;

/* renamed from: com.pd.sdk.l丨lLL丨l  reason: invalid class name and case insensitive filesystem */
public class C6879llLLl {
    public final ILlllLi OooO00o;

    public C6879llLLl(ILlllLi r1) {
        this.OooO00o = r1;
    }

    public iiiLLi1 OooO00o(AbstractC9504LiIlL r4) throws DVCSException {
        try {
            return this.OooO00o.OooO00o((AbstractC5563Il) new C6438l11L1(r4.OooO00o(), r4.m21569OooO00o().OooO0O0().OooO00o(AbstractC5533IiL.OooO00o)), true);
        } catch (CMSException e) {
            throw new DVCSException("Could not sign DVCS request", e);
        } catch (IOException e2) {
            throw new DVCSException("Could not encode DVCS request", e2);
        }
    }
}
