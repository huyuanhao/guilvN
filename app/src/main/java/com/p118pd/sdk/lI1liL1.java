package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.cert.crmf.CRMFException;

/* renamed from: com.pd.sdk.lI1l丨iL1  reason: invalid class name */
public class lI1liL1 {
    public final C9539LliII OooO00o;

    public lI1liL1(C9539LliII r1) {
        this.OooO00o = r1;
    }

    public boolean OooO00o(C5562Ill r3, char[] cArr, C6888ll r5) throws CRMFException {
        this.OooO00o.OooO00o(C5612LI1l.OooO00o(r3.m15867OooO00o().m17587OooO0O0()));
        AbstractC6296il1il1 OooO00o2 = this.OooO00o.OooO00o(cArr);
        OutputStream OooO00o3 = OooO00o2.m17322OooO00o();
        try {
            OooO00o3.write(r5.OooO00o(AbstractC5533IiL.OooO00o));
            OooO00o3.close();
            return C9586iIILl.m21627OooO00o(OooO00o2.m17323OooO00o(), r3.OooO00o().m15475OooO00o());
        } catch (IOException e) {
            throw new CRMFException("exception encoding mac input: " + e.getMessage(), e);
        }
    }
}
