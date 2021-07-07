package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.iII丨II1l  reason: invalid class name */
public class iIIII1l extends Iiii1L {
    @Override // com.p118pd.sdk.Iiii1L
    public AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r5, BigInteger bigInteger) {
        AbstractC9738llL1L OooO00o = r5.m21800OooO00o().m15393OooO00o();
        int bitLength = bigInteger.bitLength();
        int lowestSetBit = bigInteger.getLowestSetBit();
        AbstractC9738llL1L OooO00o2 = r5.OooO00o(lowestSetBit);
        while (true) {
            lowestSetBit++;
            if (lowestSetBit >= bitLength) {
                return OooO00o.OooO00o(OooO00o2);
            }
            OooO00o = OooO00o.OooO00o(bigInteger.testBit(lowestSetBit) ? OooO00o2 : OooO00o2.OooO0OO());
            OooO00o2 = OooO00o2.OooO0o();
        }
    }
}
