package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.i丨i  reason: invalid class name and case insensitive filesystem */
public class C6389ii extends C5627LIiI {
    public BigInteger OooO00o;

    public C6389ii(BigInteger bigInteger, C6017i1Il i1il) {
        super(true, i1il);
        this.OooO00o = bigInteger;
    }

    @Override // com.p118pd.sdk.C5627LIiI, com.p118pd.sdk.C6213iL11I
    public BigInteger OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C5627LIiI
    public boolean equals(Object obj) {
        return (obj instanceof C6389ii) && ((C6389ii) obj).OooO00o().equals(this.OooO00o) && super.equals(obj);
    }

    @Override // com.p118pd.sdk.C5627LIiI
    public int hashCode() {
        return this.OooO00o.hashCode() ^ super.hashCode();
    }
}
