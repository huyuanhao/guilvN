package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.Iiii1L丨  reason: invalid class name */
public abstract class Iiii1L implements AbstractC6615lLl1Ii {
    public AbstractC9738llL1L OooO00o(AbstractC9738llL1L r1) {
        return Lii1I.OooO00o(r1);
    }

    @Override // com.p118pd.sdk.AbstractC6615lLl1Ii
    public AbstractC9738llL1L OooO00o(AbstractC9738llL1L r3, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || r3.m21814OooO0OO()) {
            return r3.m21800OooO00o().m15393OooO00o();
        }
        AbstractC9738llL1L OooO0O0 = OooO0O0(r3, bigInteger.abs());
        if (signum <= 0) {
            OooO0O0 = OooO0O0.OooO0OO();
        }
        return OooO00o(OooO0O0);
    }

    public abstract AbstractC9738llL1L OooO0O0(AbstractC9738llL1L v, BigInteger bigInteger);
}
