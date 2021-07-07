package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.cert.crmf.CRMFException;

/* renamed from: com.pd.sdk.丨LLIIL  reason: invalid class name and case insensitive filesystem */
public class C9488LLIIL {
    public C9539LliII OooO00o;

    public C9488LLIIL(C9539LliII r1) {
        this.OooO00o = r1;
    }

    public C5562Ill OooO00o(char[] cArr, C6888ll r4) throws CRMFException {
        AbstractC6296il1il1 OooO00o2 = this.OooO00o.OooO00o(cArr);
        OutputStream OooO00o3 = OooO00o2.m17322OooO00o();
        try {
            OooO00o3.write(r4.OooO00o(AbstractC5533IiL.OooO00o));
            OooO00o3.close();
            return new C5562Ill(OooO00o2.m17321OooO00o(), new iIilII1(OooO00o2.m17323OooO00o()));
        } catch (IOException e) {
            throw new CRMFException("exception encoding mac input: " + e.getMessage(), e);
        }
    }
}
