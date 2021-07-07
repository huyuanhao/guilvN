package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.llLl丨1  reason: invalid class name and case insensitive filesystem */
public class C6775llLl1 extends Iiii1L {
    public final IIiLIli OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9584iI1I f18793OooO00o;

    public C6775llLl1(IIiLIli r2, AbstractC9584iI1I r3) {
        if (r2 == null || r2.m15401OooO0O0() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.OooO00o = r2;
        this.f18793OooO00o = r3;
    }

    @Override // com.p118pd.sdk.Iiii1L
    public AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r4, BigInteger bigInteger) {
        if (this.OooO00o.OooO00o(r4.m21800OooO00o())) {
            BigInteger[] OooO00o2 = this.f18793OooO00o.OooO00o(bigInteger.mod(r4.m21800OooO00o().m15401OooO0O0()));
            BigInteger bigInteger2 = OooO00o2[0];
            BigInteger bigInteger3 = OooO00o2[1];
            AbstractC6872ll1i OooO00o3 = this.f18793OooO00o.OooO00o();
            return this.f18793OooO00o.m15380OooO00o() ? Lii1I.OooO00o(r4, bigInteger2, OooO00o3, bigInteger3) : Lii1I.OooO0O0(r4, bigInteger2, OooO00o3.OooO00o(r4), bigInteger3);
        }
        throw new IllegalStateException();
    }
}
