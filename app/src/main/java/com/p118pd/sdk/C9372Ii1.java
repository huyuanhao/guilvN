package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨Ii1丨  reason: invalid class name and case insensitive filesystem */
public class C9372Ii1 extends Iiii1L {
    @Override // com.p118pd.sdk.Iiii1L
    public AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r10, BigInteger bigInteger) {
        IIiLIli OooO00o = r10.m21800OooO00o();
        int OooO00o2 = IILL1i.OooO00o(OooO00o);
        if (bigInteger.bitLength() <= OooO00o2) {
            C5315ILlLil OooO00o3 = IILL1i.OooO00o(r10);
            AbstractC6100iILll OooO00o4 = OooO00o3.m15524OooO00o();
            int OooO00o5 = OooO00o3.OooO00o();
            int i = ((OooO00o2 + OooO00o5) - 1) / OooO00o5;
            AbstractC9738llL1L OooO00o6 = OooO00o.m15393OooO00o();
            int i2 = OooO00o5 * i;
            int[] OooO00o7 = C1iiIiI.OooO00o(i2, bigInteger);
            int i3 = i2 - 1;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = 0;
                for (int i6 = i3 - i4; i6 >= 0; i6 -= i) {
                    i5 = (i5 << 1) | C1iiIiI.OooO00o(OooO00o7, i6);
                }
                OooO00o6 = OooO00o6.OooO0OO(OooO00o4.OooO00o(i5));
            }
            return OooO00o6.OooO00o(OooO00o3.m15525OooO00o());
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}
