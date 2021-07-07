package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.丨lLi丨  reason: invalid class name and case insensitive filesystem */
public class C9690lLi extends C1L1l {
    private C6636li1I OooO0O0(AbstractC5563Il r7, AbstractC5650LIL r8) throws CMSException {
        if (((C1L1l) this).f22781OooO00o.isEmpty()) {
            iILLL1 r0 = new iILLL1();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                OutputStream OooO00o = r8.OooO00o(byteArrayOutputStream);
                r7.write(OooO00o);
                OooO00o.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C6456l1ilL OooO00o2 = r8.m16163OooO00o();
                C5837L1l r3 = new C5837L1l(byteArray);
                LIiI11 OooO00o3 = r8.OooO00o();
                for (AbstractC5760Lil r4 : this.f22782OooO0O0) {
                    r0.OooO00o(r4.OooO00o(OooO00o3));
                }
                C1684L r82 = new C1684L(r7.OooO00o(), OooO00o2, r3);
                C5781LlIl r72 = null;
                AbstractC9852lIli r1 = ((C1L1l) this).f22780OooO00o;
                if (r1 != null) {
                    r72 = new C5781LlIl(r1.OooO00o(new HashMap()).m21785OooO00o());
                }
                return new C6636li1I(new C5753LiI1(AbstractC6252iiLl.OooO0OO, new Ii1I1LlI(((C1L1l) this).f22779OooO00o, new i1I1I1l(r0), r82, r72)));
            } catch (IOException unused) {
                throw new CMSException("");
            }
        } else {
            throw new IllegalStateException("can only use addRecipientGenerator() with this method");
        }
    }

    public C6636li1I OooO00o(AbstractC5563Il r1, AbstractC5650LIL r2) throws CMSException {
        return OooO0O0(r1, r2);
    }
}
