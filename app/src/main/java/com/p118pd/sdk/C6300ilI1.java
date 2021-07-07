package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.ilI1  reason: case insensitive filesystem */
public class C6300ilI1 implements AbstractC9584iI1I {
    public final IIiLIli OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final lI1II1 f17983OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6872ll1i f17984OooO00o;

    public C6300ilI1(IIiLIli r2, lI1II1 li1ii1) {
        this.OooO00o = r2;
        this.f17983OooO00o = li1ii1;
        this.f17984OooO00o = new C6428ilIli(r2.OooO00o(li1ii1.m17616OooO00o()));
    }

    @Override // com.p118pd.sdk.IILLii1l, com.p118pd.sdk.IILLii1l
    public AbstractC6872ll1i OooO00o() {
        return this.f17984OooO00o;
    }

    public BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i - 1);
        BigInteger shiftRight = multiply.shiftRight(i);
        if (testBit) {
            shiftRight = shiftRight.add(AbstractC5490IlLL.OooO0O0);
        }
        return z ? shiftRight.negate() : shiftRight;
    }

    @Override // com.p118pd.sdk.IILLii1l, com.p118pd.sdk.IILLii1l
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17332OooO00o() {
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC9584iI1I
    public BigInteger[] OooO00o(BigInteger bigInteger) {
        int OooO00o2 = this.f17983OooO00o.OooO00o();
        BigInteger OooO00o3 = OooO00o(bigInteger, this.f17983OooO00o.OooO0O0(), OooO00o2);
        BigInteger OooO00o4 = OooO00o(bigInteger, this.f17983OooO00o.OooO0OO(), OooO00o2);
        lI1II1 li1ii1 = this.f17983OooO00o;
        return new BigInteger[]{bigInteger.subtract(OooO00o3.multiply(li1ii1.OooO0o0()).add(OooO00o4.multiply(li1ii1.OooO0oO()))), OooO00o3.multiply(li1ii1.OooO0o()).add(OooO00o4.multiply(li1ii1.OooO0oo())).negate()};
    }
}
