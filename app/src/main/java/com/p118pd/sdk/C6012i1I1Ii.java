package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.i1I1Ii  reason: case insensitive filesystem */
public class C6012i1I1Ii {
    public final C1674II OooO00o;

    public C6012i1I1Ii(C1674II ii) {
        this.OooO00o = ii;
    }

    private String OooO00o(AbstractC98681 r1) {
        if (r1 != null) {
            return r1.toString();
        }
        return null;
    }

    public l1iII OooO00o() {
        C1674II ii = this.OooO00o;
        if (ii != null) {
            return ii.m15345OooO00o();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16857OooO00o() {
        C1674II ii = this.OooO00o;
        if (ii != null) {
            return OooO00o(ii.m15344OooO00o());
        }
        return null;
    }

    public void OooO00o(I111LIL r4) throws CMSException {
        C1674II ii = this.OooO00o;
        if (ii != null && ii.m15346OooO00o()) {
            try {
                r4.m21370OooO00o().write(this.OooO00o.OooO00o(AbstractC5533IiL.OooO00o));
            } catch (IOException e) {
                throw new CMSException("unable to initialise calculator from metaData: " + e.getMessage(), e);
            }
        }
    }

    public String OooO0O0() {
        C1674II ii = this.OooO00o;
        if (ii != null) {
            return OooO00o(ii.OooO00o());
        }
        return null;
    }
}
