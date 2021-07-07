package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Random;

/* renamed from: com.pd.sdk.Li丨L  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5755LiL {
    public static AbstractC9738llL1L OooO00o(IIiLIli r4, byte[] bArr) {
        AbstractC97441iIIL OooO00o = r4.OooO00o(BigInteger.valueOf((long) (bArr[bArr.length - 1] & 1)));
        AbstractC97441iIIL OooO00o2 = r4.OooO00o(new BigInteger(1, bArr));
        if (!OooO00o(OooO00o2).equals(r4.m15394OooO00o())) {
            OooO00o2 = OooO00o2.m21857OooO00o();
        }
        AbstractC97441iIIL r1 = null;
        if (OooO00o2.m21863OooO0O0()) {
            r1 = r4.m15400OooO0O0().OooO0Oo();
        } else {
            AbstractC97441iIIL OooO00o3 = OooO00o(r4, OooO00o2.OooO0o0().m21862OooO0O0().OooO0OO(r4.m15400OooO0O0()).OooO00o(r4.m15394OooO00o()).OooO00o(OooO00o2));
            if (OooO00o3 != null) {
                if (!OooO00o(OooO00o3).equals(OooO00o)) {
                    OooO00o3 = OooO00o3.m21857OooO00o();
                }
                r1 = OooO00o2.OooO0OO(OooO00o3);
            }
        }
        if (r1 != null) {
            return r4.OooO0O0(OooO00o2.m21859OooO00o(), r1.m21859OooO00o());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    public static AbstractC97441iIIL OooO00o(IIiLIli r8, AbstractC97441iIIL r9) {
        AbstractC97441iIIL r6;
        if (r9.m21863OooO0O0()) {
            return r9;
        }
        AbstractC97441iIIL OooO00o = r8.OooO00o(AbstractC5490IlLL.OooO00o);
        Random random = new Random();
        int OooO0O0 = r9.OooO0O0();
        do {
            AbstractC97441iIIL OooO00o2 = r8.OooO00o(new BigInteger(OooO0O0, random));
            AbstractC97441iIIL r5 = r9;
            r6 = OooO00o;
            for (int i = 1; i <= OooO0O0 - 1; i++) {
                AbstractC97441iIIL OooO0o0 = r5.OooO0o0();
                r6 = r6.OooO0o0().OooO00o(OooO0o0.OooO0OO(OooO00o2));
                r5 = OooO0o0.OooO00o(r9);
            }
            if (!r5.m21863OooO0O0()) {
                return null;
            }
        } while (r6.OooO0o0().OooO00o(r6).m21863OooO0O0());
        return r6;
    }

    public static AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3) {
        AbstractC97441iIIL r1 = r3;
        for (int i = 1; i < r3.OooO0O0(); i++) {
            r1 = r1.OooO0o0().OooO00o(r3);
        }
        return r1;
    }

    public static byte[] OooO00o(AbstractC9738llL1L r3) {
        AbstractC9738llL1L OooO0Oo = r3.OooO0Oo();
        AbstractC97441iIIL OooO00o = OooO0Oo.m21802OooO00o();
        byte[] OooO00o2 = OooO00o.m21861OooO00o();
        if (!OooO00o.m21863OooO0O0()) {
            if (OooO00o(OooO0Oo.m21810OooO0O0().OooO0O0(OooO00o)).m21860OooO00o()) {
                int length = OooO00o2.length - 1;
                OooO00o2[length] = (byte) (OooO00o2[length] | 1);
            } else {
                int length2 = OooO00o2.length - 1;
                OooO00o2[length2] = (byte) (OooO00o2[length2] & 254);
            }
        }
        return OooO00o2;
    }
}
