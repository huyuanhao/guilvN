package com.p118pd.sdk;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;

/* renamed from: com.pd.sdk.I1丨丨  reason: invalid class name and case insensitive filesystem */
public class C5194I1 extends DHParameterSpec {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5388Ii1 f15427OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger f15428OooO00o;
    public final BigInteger OooO0O0;

    public C5194I1(C6017i1Il i1il) {
        this(i1il.OooO0OO(), i1il.OooO0Oo(), i1il.m16863OooO00o(), i1il.m16864OooO0O0(), i1il.OooO0O0(), i1il.OooO00o());
        this.f15427OooO00o = i1il.m16862OooO00o();
    }

    public C5194I1(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, null, 0);
    }

    public C5194I1(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this(bigInteger, bigInteger2, bigInteger3, null, i);
    }

    public C5194I1(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i);
    }

    public C5194I1(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, int i2) {
        super(bigInteger, bigInteger3, i2);
        this.f15428OooO00o = bigInteger2;
        this.OooO0O0 = bigInteger4;
        this.OooO00o = i;
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6017i1Il m15342OooO00o() {
        return new C6017i1Il(getP(), getG(), this.f15428OooO00o, this.OooO00o, getL(), this.OooO0O0, this.f15427OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15343OooO00o() {
        return this.OooO0O0;
    }

    public BigInteger OooO0O0() {
        return this.f15428OooO00o;
    }
}
