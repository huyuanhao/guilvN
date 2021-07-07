package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.I1L1iLi */
public class I1L1iLi extends Iiii1L {
    @Override // com.p118pd.sdk.Iiii1L
    public AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r7, BigInteger bigInteger) {
        int[] OooO00o = I1lL.m15322OooO00o(bigInteger);
        AbstractC9738llL1L OooO0Oo = r7.OooO0Oo();
        AbstractC9738llL1L OooO0OO = OooO0Oo.OooO0OO();
        AbstractC9738llL1L OooO00o2 = r7.m21800OooO00o().m15393OooO00o();
        int length = OooO00o.length;
        while (true) {
            length--;
            if (length < 0) {
                return OooO00o2;
            }
            int i = OooO00o[length];
            OooO00o2 = OooO00o2.OooO0OO((i >> 16) < 0 ? OooO0OO : OooO0Oo).OooO00o(i & 65535);
        }
    }
}
