package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.Ii1lIl */
public class Ii1lIl implements AbstractC6370iIIIl {
    public iIIiLli OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f15681OooO00o;
    public BigInteger OooO0O0;
    public BigInteger OooO0OO;

    public Ii1lIl(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f15681OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO0OO = bigInteger3;
    }

    public Ii1lIl(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, iIIiLli r4) {
        this.OooO0OO = bigInteger3;
        this.f15681OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO00o = r4;
    }

    public iIIiLli OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15559OooO00o() {
        return this.OooO0OO;
    }

    public BigInteger OooO0O0() {
        return this.f15681OooO00o;
    }

    public BigInteger OooO0OO() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Ii1lIl)) {
            return false;
        }
        Ii1lIl ii1lIl = (Ii1lIl) obj;
        return ii1lIl.OooO0O0().equals(this.f15681OooO00o) && ii1lIl.OooO0OO().equals(this.OooO0O0) && ii1lIl.m15559OooO00o().equals(this.OooO0OO);
    }

    public int hashCode() {
        return (this.f15681OooO00o.hashCode() ^ this.OooO0O0.hashCode()) ^ this.OooO0OO.hashCode();
    }
}
