package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.iIL1LIIl */
public class iIL1LIIl extends C5850LL {
    private C5823L11 OooO0O0(AbstractC5563Il r4, AbstractC5650LIL r5) throws CMSException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OutputStream OooO00o = r5.OooO00o(byteArrayOutputStream);
            r4.write(OooO00o);
            OooO00o.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C1684L r0 = new C1684L(r4.OooO00o(), r5.m16163OooO00o(), new C5837L1l(byteArray));
            C5781LlIl r42 = null;
            AbstractC9852lIli r52 = this.OooO00o;
            if (r52 != null) {
                r42 = new C5781LlIl(r52.OooO00o(new HashMap()).m21785OooO00o());
            }
            return new C5823L11(new C5753LiI1(AbstractC6252iiLl.OooO0o, new C6031i1iI(r0, r42)));
        } catch (IOException unused) {
            throw new CMSException("");
        }
    }

    public C5823L11 OooO00o(AbstractC5563Il r1, AbstractC5650LIL r2) throws CMSException {
        return OooO0O0(r1, r2);
    }
}
