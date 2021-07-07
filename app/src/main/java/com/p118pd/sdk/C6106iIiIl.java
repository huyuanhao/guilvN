package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.iIiIl  reason: case insensitive filesystem */
public class C6106iIiIl implements AlgorithmParameterSpec {
    public IIiLIli OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9738llL1L f17553OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f17554OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17555OooO00o;
    public BigInteger OooO0O0;

    public C6106iIiIl(IIiLIli r1, AbstractC9738llL1L r2, BigInteger bigInteger) {
        this.OooO00o = r1;
        this.f17553OooO00o = r2.OooO0Oo();
        this.f17554OooO00o = bigInteger;
        this.OooO0O0 = BigInteger.valueOf(1);
        this.f17555OooO00o = null;
    }

    public C6106iIiIl(IIiLIli r1, AbstractC9738llL1L r2, BigInteger bigInteger, BigInteger bigInteger2) {
        this.OooO00o = r1;
        this.f17553OooO00o = r2.OooO0Oo();
        this.f17554OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.f17555OooO00o = null;
    }

    public C6106iIiIl(IIiLIli r1, AbstractC9738llL1L r2, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.OooO00o = r1;
        this.f17553OooO00o = r2.OooO0Oo();
        this.f17554OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.f17555OooO00o = bArr;
    }

    public IIiLIli OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m16969OooO00o() {
        return this.f17553OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16970OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16971OooO00o() {
        return this.f17555OooO00o;
    }

    public BigInteger OooO0O0() {
        return this.f17554OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6106iIiIl)) {
            return false;
        }
        C6106iIiIl iiiil = (C6106iIiIl) obj;
        return OooO00o().OooO00o(iiiil.OooO00o()) && m16969OooO00o().m21806OooO00o(iiiil.m16969OooO00o());
    }

    public int hashCode() {
        return OooO00o().hashCode() ^ m16969OooO00o().hashCode();
    }
}
