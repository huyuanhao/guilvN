package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.L11I */
public class L11I implements AbstractC6370iIIIl {
    public AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f16114OooO00o;
    public BigInteger OooO0O0;
    public BigInteger OooO0OO;

    public L11I(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, AbstractC6436l11LI r4) {
        this.f16114OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO0OO = bigInteger3;
        this.OooO00o = r4;
    }

    public AbstractC6436l11LI OooO00o() {
        this.OooO00o.reset();
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15877OooO00o() {
        return this.OooO0O0;
    }

    public BigInteger OooO0O0() {
        return this.OooO0OO;
    }

    public BigInteger OooO0OO() {
        return this.f16114OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof L1llLl1)) {
            return false;
        }
        L11I l11i = (L11I) obj;
        return l11i.OooO0OO().equals(this.f16114OooO00o) && l11i.m15877OooO00o().equals(this.OooO0O0) && l11i.OooO0O0().equals(this.OooO0OO);
    }

    public int hashCode() {
        return (OooO0OO().hashCode() ^ m15877OooO00o().hashCode()) ^ OooO0O0().hashCode();
    }
}
