package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.Li丨1  reason: invalid class name and case insensitive filesystem */
public class C5750Li1 extends iilI1iI {
    public C5184I1l OooO00o;

    public C5750Li1(C5184I1l i1l) {
        super(2);
        this.OooO00o = i1l;
    }

    public C5750Li1(l1LILI1 r2, BigInteger bigInteger) {
        this(r2, bigInteger, null);
    }

    public C5750Li1(l1LILI1 r2, BigInteger bigInteger, byte[] bArr) {
        this(new C5184I1l(r2, bigInteger, bArr));
    }

    public C5750Li1(byte[] bArr) {
        this(null, null, bArr);
    }

    @Override // com.p118pd.sdk.iilI1iI
    public BigInteger OooO00o() {
        return this.OooO00o.m15304OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        return obj instanceof L11l11 ? ((L11l11) obj).m17967OooO00o().equals(this) : this.OooO00o.OooO00o(obj);
    }

    @Override // com.p118pd.sdk.iilI1iI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16340OooO00o() {
        return this.OooO00o.m15305OooO00o();
    }

    @Override // com.p118pd.sdk.iilI1iI, java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return new C5750Li1(this.OooO00o);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5750Li1)) {
            return false;
        }
        return this.OooO00o.equals(((C5750Li1) obj).OooO00o);
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }
}
