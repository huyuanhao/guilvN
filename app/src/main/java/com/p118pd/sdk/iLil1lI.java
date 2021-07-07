package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨iLil1lI  reason: invalid class name */
public class iLil1lI extends Iiii1L {
    public int OooO00o(int i) {
        return I1lL.OooO00o(i);
    }

    @Override // com.p118pd.sdk.Iiii1L
    public AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r11, BigInteger bigInteger) {
        AbstractC9738llL1L r0;
        int max = Math.max(2, Math.min(16, OooO00o(bigInteger.bitLength())));
        C6597lLil OooO00o = I1lL.OooO00o(r11, max, true);
        AbstractC9738llL1L[] OooO00o2 = OooO00o.m17698OooO00o();
        AbstractC9738llL1L[] OooO0O0 = OooO00o.OooO0O0();
        int[] OooO00o3 = I1lL.m15321OooO00o(max, bigInteger);
        AbstractC9738llL1L OooO00o4 = r11.m21800OooO00o().m15393OooO00o();
        int length = OooO00o3.length;
        if (length > 1) {
            length--;
            int i = OooO00o3[length];
            int i2 = i >> 16;
            int i3 = i & 65535;
            int abs = Math.abs(i2);
            AbstractC9738llL1L[] r6 = i2 < 0 ? OooO0O0 : OooO00o2;
            if ((abs << 2) < (1 << max)) {
                byte b = IiL1Li.OooO00o[abs];
                int i4 = max - b;
                r0 = r6[((1 << (max - 1)) - 1) >>> 1].OooO00o(r6[(((abs ^ (1 << (b - 1))) << i4) + 1) >>> 1]);
                i3 -= i4;
            } else {
                r0 = r6[abs >>> 1];
            }
            OooO00o4 = r0.OooO00o(i3);
        }
        while (length > 0) {
            length--;
            int i5 = OooO00o3[length];
            int i6 = i5 >> 16;
            OooO00o4 = OooO00o4.OooO0OO((i6 < 0 ? OooO0O0 : OooO00o2)[Math.abs(i6) >>> 1]).OooO00o(i5 & 65535);
        }
        return OooO00o4;
    }
}
