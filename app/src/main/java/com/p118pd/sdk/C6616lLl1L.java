package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.pkcs.PKCSException;
import org.bouncycastle.pkcs.PKCSIOException;

/* renamed from: com.pd.sdk.lLl1丨丨L  reason: invalid class name and case insensitive filesystem */
public class C6616lLl1L {
    public iILLL1 OooO00o = new iILLL1();

    private C6616lLl1L OooO00o(AbstractC5650LIL r4, I11li1 i11li1) throws IOException {
        try {
            this.OooO00o.OooO00o(new iIL1LIIl().OooO00o(new C6438l11L1(i11li1.getEncoded()), r4).OooO00o());
            return this;
        } catch (CMSException e) {
            throw new PKCSIOException(e.getMessage(), e.getCause());
        }
    }

    public C6616lLl1L OooO00o(AbstractC5650LIL r2, C6481lI1i li1i) throws IOException {
        return OooO00o(r2, new C5707LiL1(li1i.OooO00o()));
    }

    public C6616lLl1L OooO00o(AbstractC5650LIL r4, C6481lI1i[] li1iArr) throws IOException {
        iILLL1 r0 = new iILLL1();
        for (int i = 0; i != li1iArr.length; i++) {
            r0.OooO00o(li1iArr[i].OooO00o());
        }
        return OooO00o(r4, new C6120iIlL1(r0));
    }

    public C6616lLl1L OooO00o(C6481lI1i li1i) throws IOException {
        this.OooO00o.OooO00o(new C6903lil(AbstractC5711LiLli.o00Oo0, new C6487lIIiIlL(new C6120iIlL1(li1i.OooO00o()).getEncoded())));
        return this;
    }

    public C93181L OooO00o(IL r5, char[] cArr) throws PKCSException {
        try {
            byte[] encoded = C98661.OooO00o(new C6120iIlL1(this.OooO00o)).getEncoded();
            C6903lil r1 = new C6903lil(AbstractC5711LiLli.o00Oo0, new C6487lIIiIlL(encoded));
            C9713llii r2 = null;
            if (r5 != null) {
                r2 = new C9877lI1L(r5).OooO00o(cArr, encoded);
            }
            return new C93181L(new C1696ll(r1, r2));
        } catch (IOException e) {
            throw new PKCSException("unable to encode AuthenticatedSafe: " + e.getMessage(), e);
        }
    }
}
