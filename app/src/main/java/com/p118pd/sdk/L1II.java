package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.L1II */
public class L1II {
    public static final String OooO00o = "1.2.840.113549.1.9.16.3.8";

    public C5303ILL OooO00o(AbstractC5563Il r4, IIlL1l iIlL1l) throws CMSException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OutputStream OooO00o2 = iIlL1l.OooO00o(byteArrayOutputStream);
            r4.write(OooO00o2);
            OooO00o2.close();
            return new C5303ILL(new C5753LiI1(AbstractC6252iiLl.OooO0oo, new C6761llIl(iIlL1l.OooO00o(), new C5753LiI1(r4.OooO00o(), new C5837L1l(byteArrayOutputStream.toByteArray())))));
        } catch (IOException e) {
            throw new CMSException("exception encoding data.", e);
        }
    }
}
