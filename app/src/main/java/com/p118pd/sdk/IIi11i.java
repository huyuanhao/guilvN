package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.IIi11i */
public class IIi11i extends Iiii1L {
    @Override // com.p118pd.sdk.Iiii1L
    public AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r6, BigInteger bigInteger) {
        AbstractC9738llL1L OooO0Oo = r6.OooO0Oo();
        AbstractC9738llL1L OooO0OO = OooO0Oo.OooO0OO();
        int bitLength = bigInteger.bitLength();
        int lowestSetBit = bigInteger.getLowestSetBit();
        AbstractC9738llL1L r3 = OooO0Oo;
        while (true) {
            bitLength--;
            if (bitLength <= lowestSetBit) {
                return r3.OooO00o(lowestSetBit);
            }
            r3 = r3.OooO0OO(bigInteger.testBit(bitLength) ? OooO0Oo : OooO0OO);
        }
    }
}
