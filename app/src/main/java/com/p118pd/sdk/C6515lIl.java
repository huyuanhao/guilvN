package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.lIl  reason: case insensitive filesystem */
public class C6515lIl {
    public AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f18397OooO00o;
    public BigInteger OooO0O0;

    public BigInteger OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.OooO0O0.modPow(LLII.OooO00o(this.OooO00o, this.f18397OooO00o, bArr, bArr2, bArr3), this.f18397OooO00o);
    }

    public void OooO00o(C6057i1L r2, AbstractC6436l11LI r3) {
        this.f18397OooO00o = r2.OooO0O0();
        this.OooO0O0 = r2.OooO00o();
        this.OooO00o = r3;
    }

    public void OooO00o(BigInteger bigInteger, BigInteger bigInteger2, AbstractC6436l11LI r3) {
        this.f18397OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO00o = r3;
    }
}
