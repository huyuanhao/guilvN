package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.li丨l1丨I  reason: invalid class name and case insensitive filesystem */
public class C6715lil1I extends Iiii1L {
    public int OooO00o;
    public int OooO0O0;

    public C6715lil1I() {
        this(2, 4);
    }

    public C6715lil1I(int i, int i2) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
    }

    public IIiLIli OooO00o(IIiLIli r3, int i) {
        if (r3.m15387OooO00o() == i) {
            return r3;
        }
        if (r3.OooO00o(i)) {
            return r3.m15389OooO00o().OooO00o(i).OooO00o();
        }
        throw new IllegalArgumentException("Coordinate system " + i + " not supported by this curve");
    }

    @Override // com.p118pd.sdk.Iiii1L
    public AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r9, BigInteger bigInteger) {
        IIiLIli OooO00o2 = r9.m21800OooO00o();
        IIiLIli OooO00o3 = OooO00o(OooO00o2, this.OooO00o);
        IIiLIli OooO00o4 = OooO00o(OooO00o2, this.OooO0O0);
        int[] OooO00o5 = I1lL.m15322OooO00o(bigInteger);
        AbstractC9738llL1L OooO00o6 = OooO00o3.m15393OooO00o();
        AbstractC9738llL1L OooO00o7 = OooO00o4.OooO00o(r9);
        int i = 0;
        AbstractC9738llL1L r4 = OooO00o6;
        int i2 = 0;
        while (i < OooO00o5.length) {
            int i3 = OooO00o5[i];
            int i4 = i3 >> 16;
            OooO00o7 = OooO00o7.OooO00o(i2 + (i3 & 65535));
            AbstractC9738llL1L OooO00o8 = OooO00o3.OooO00o(OooO00o7);
            if (i4 < 0) {
                OooO00o8 = OooO00o8.OooO0OO();
            }
            r4 = r4.OooO00o(OooO00o8);
            i++;
            i2 = 1;
        }
        return OooO00o2.OooO00o(r4);
    }
}
