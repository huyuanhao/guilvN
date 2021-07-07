package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Vector;

/* renamed from: com.pd.sdk.l丨I1L  reason: invalid class name and case insensitive filesystem */
public class C6818lI1L extends I1i1i {
    public Vector OooO00o;
    public BigInteger OooO0OO;

    public C6818lI1L(BigInteger bigInteger, BigInteger bigInteger2, int i, Vector vector, BigInteger bigInteger3) {
        super(true, bigInteger, bigInteger2, i);
        this.OooO00o = vector;
        this.OooO0OO = bigInteger3;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.I1i1i, com.p118pd.sdk.I1i1i
    public Vector OooO00o() {
        return this.OooO00o;
    }

    public BigInteger OooO0OO() {
        return this.OooO0OO;
    }
}
