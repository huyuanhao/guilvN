package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.iiI丨丨1l  reason: invalid class name and case insensitive filesystem */
public class C6236iiI1l extends I1LiIl {
    public BigInteger OooO00o;
    public BigInteger OooO0O0;
    public BigInteger OooO0OO;

    public C6236iiI1l(L11I l11i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, l11i);
        this.OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO0OO = bigInteger3;
    }

    @Override // com.p118pd.sdk.I1LiIl, com.p118pd.sdk.C6213iL11I
    public BigInteger OooO00o() {
        return this.OooO00o;
    }

    public BigInteger OooO0O0() {
        return this.OooO0O0;
    }

    public BigInteger OooO0OO() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.I1LiIl
    public boolean equals(Object obj) {
        if (!(obj instanceof C6236iiI1l)) {
            return false;
        }
        C6236iiI1l r0 = (C6236iiI1l) obj;
        return r0.OooO00o().equals(this.OooO00o) && r0.OooO0O0().equals(this.OooO0O0) && r0.OooO0OO().equals(this.OooO0OO) && super.equals(obj);
    }

    @Override // com.p118pd.sdk.I1LiIl
    public int hashCode() {
        return ((this.OooO00o.hashCode() ^ this.OooO0O0.hashCode()) ^ this.OooO0OO.hashCode()) ^ super.hashCode();
    }
}
