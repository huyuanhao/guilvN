package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.IL1IiL  reason: case insensitive filesystem */
public class C5247IL1IiL extends Iiii1L {
    @Override // com.p118pd.sdk.Iiii1L
    public AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r8, BigInteger bigInteger) {
        AbstractC9738llL1L[] r0 = {r8.m21800OooO00o().m15393OooO00o(), r8};
        int bitLength = bigInteger.bitLength();
        for (int i = 0; i < bitLength; i++) {
            boolean testBit = bigInteger.testBit(i);
            int i2 = 1 - (testBit ? 1 : 0);
            r0[i2] = r0[i2].OooO0OO(r0[testBit ? 1 : 0]);
        }
        return r0[0];
    }
}
