package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨iiLi丨l  reason: invalid class name and case insensitive filesystem */
public class C9617iiLil extends I1LiIl {
    public C6236iiI1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f23200OooO00o;
    public BigInteger OooO0O0;
    public BigInteger OooO0OO;
    public BigInteger OooO0Oo;
    public BigInteger OooO0o0;

    public C9617iiLil(L11I l11i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, l11i);
        this.f23200OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO0OO = bigInteger3;
        this.OooO0Oo = bigInteger4;
        this.OooO0o0 = bigInteger5;
    }

    @Override // com.p118pd.sdk.I1LiIl, com.p118pd.sdk.C6213iL11I
    public C6236iiI1l OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.I1LiIl, com.p118pd.sdk.C6213iL11I
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21679OooO00o() {
        return this.f23200OooO00o;
    }

    public void OooO00o(C6236iiI1l r1) {
        this.OooO00o = r1;
    }

    public BigInteger OooO0O0() {
        return this.OooO0O0;
    }

    public BigInteger OooO0OO() {
        return this.OooO0OO;
    }

    public BigInteger OooO0Oo() {
        return this.OooO0Oo;
    }

    public BigInteger OooO0o0() {
        return this.OooO0o0;
    }

    @Override // com.p118pd.sdk.I1LiIl
    public boolean equals(Object obj) {
        if (!(obj instanceof C9617iiLil)) {
            return false;
        }
        C9617iiLil r0 = (C9617iiLil) obj;
        return r0.m21679OooO00o().equals(this.f23200OooO00o) && r0.OooO0O0().equals(this.OooO0O0) && r0.OooO0OO().equals(this.OooO0OO) && r0.OooO0Oo().equals(this.OooO0Oo) && r0.OooO0o0().equals(this.OooO0o0) && super.equals(obj);
    }

    @Override // com.p118pd.sdk.I1LiIl
    public int hashCode() {
        return ((((this.f23200OooO00o.hashCode() ^ this.OooO0O0.hashCode()) ^ this.OooO0OO.hashCode()) ^ this.OooO0Oo.hashCode()) ^ this.OooO0o0.hashCode()) ^ super.hashCode();
    }
}
