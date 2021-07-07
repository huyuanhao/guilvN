package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.L1llLl1 */
public class L1llLl1 implements AbstractC6370iIIIl {
    public C5561Ili OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f16224OooO00o;
    public BigInteger OooO0O0;
    public BigInteger OooO0OO;

    public L1llLl1(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f16224OooO00o = bigInteger3;
        this.OooO0OO = bigInteger;
        this.OooO0O0 = bigInteger2;
    }

    public L1llLl1(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, C5561Ili r4) {
        this.f16224OooO00o = bigInteger3;
        this.OooO0OO = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO00o = r4;
    }

    public C5561Ili OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15991OooO00o() {
        return this.f16224OooO00o;
    }

    public BigInteger OooO0O0() {
        return this.OooO0OO;
    }

    public BigInteger OooO0OO() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof L1llLl1)) {
            return false;
        }
        L1llLl1 l1llLl1 = (L1llLl1) obj;
        return l1llLl1.OooO0O0().equals(this.OooO0OO) && l1llLl1.OooO0OO().equals(this.OooO0O0) && l1llLl1.m15991OooO00o().equals(this.f16224OooO00o);
    }

    public int hashCode() {
        return (OooO0O0().hashCode() ^ OooO0OO().hashCode()) ^ m15991OooO00o().hashCode();
    }
}
