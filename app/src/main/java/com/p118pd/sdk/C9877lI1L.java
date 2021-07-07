package com.p118pd.sdk;

import java.io.OutputStream;
import org.bouncycastle.pkcs.PKCSException;

/* renamed from: com.pd.sdk.丨丨丨l丨I1L  reason: invalid class name and case insensitive filesystem */
public class C9877lI1L {
    public IL OooO00o;

    public C9877lI1L(IL r1) {
        this.OooO00o = r1;
    }

    public C9713llii OooO00o(char[] cArr, byte[] bArr) throws PKCSException {
        try {
            AbstractC6296il1il1 OooO00o2 = this.OooO00o.OooO00o(cArr);
            OutputStream OooO00o3 = OooO00o2.m17322OooO00o();
            OooO00o3.write(bArr);
            OooO00o3.close();
            C6456l1ilL OooO00o4 = OooO00o2.m17321OooO00o();
            C6052i1l r0 = new C6052i1l(this.OooO00o.OooO00o(), OooO00o2.m17323OooO00o());
            C6263iiiL OooO00o5 = C6263iiiL.OooO00o(OooO00o4.m17587OooO0O0());
            return new C9713llii(r0, OooO00o5.m17277OooO00o(), OooO00o5.OooO00o().intValue());
        } catch (Exception e) {
            throw new PKCSException("unable to process data: " + e.getMessage(), e);
        }
    }
}
