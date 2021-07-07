package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.L丨lLliLL  reason: invalid class name */
public class LlLliLL extends Iiii1L {
    @Override // com.p118pd.sdk.Iiii1L
    public AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r7, BigInteger bigInteger) {
        int[] OooO00o = I1lL.m15322OooO00o(bigInteger);
        AbstractC9738llL1L OooO00o2 = r7.m21800OooO00o().m15393OooO00o();
        int i = 0;
        int i2 = 0;
        while (i < OooO00o.length) {
            int i3 = OooO00o[i];
            int i4 = i3 >> 16;
            r7 = r7.OooO00o(i2 + (i3 & 65535));
            OooO00o2 = OooO00o2.OooO00o(i4 < 0 ? r7.OooO0OO() : r7);
            i++;
            i2 = 1;
        }
        return OooO00o2;
    }
}
