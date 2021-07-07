package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨lIi丨  reason: invalid class name and case insensitive filesystem */
public class C9683lIi {
    public BigInteger OooO00o;
    public BigInteger OooO0O0;
    public BigInteger OooO0OO;

    public C9683lIi(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO0OO = bigInteger3;
    }

    public BigInteger OooO00o() {
        return this.OooO0OO;
    }

    public BigInteger OooO0O0() {
        return this.OooO00o;
    }

    public BigInteger OooO0OO() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9683lIi)) {
            return false;
        }
        C9683lIi r4 = (C9683lIi) obj;
        return this.OooO0OO.equals(r4.OooO0OO) && this.OooO00o.equals(r4.OooO00o) && this.OooO0O0.equals(r4.OooO0O0);
    }

    public int hashCode() {
        return (this.OooO0OO.hashCode() ^ this.OooO00o.hashCode()) ^ this.OooO0O0.hashCode();
    }
}
