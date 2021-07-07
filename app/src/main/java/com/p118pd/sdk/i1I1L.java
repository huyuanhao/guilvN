package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.i丨1I1L  reason: invalid class name */
public class i1I1L extends ii1IIl1 {
    public BigInteger OooO00o;

    public i1I1L(BigInteger bigInteger, C5312ILl iLl) {
        super(false, iLl);
        this.OooO00o = bigInteger;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.ii1IIl1
    public BigInteger OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.ii1IIl1
    public boolean equals(Object obj) {
        return (obj instanceof i1I1L) && ((i1I1L) obj).OooO00o().equals(this.OooO00o) && super.equals(obj);
    }

    @Override // com.p118pd.sdk.ii1IIl1
    public int hashCode() {
        return this.OooO00o.hashCode() ^ super.hashCode();
    }
}
