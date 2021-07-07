package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨iLl1丨  reason: invalid class name and case insensitive filesystem */
public class C9610iLl1 extends iilI1iI {
    public C5184I1l OooO00o;

    public C9610iLl1(C5184I1l i1l) {
        super(0);
        this.OooO00o = i1l;
    }

    public C9610iLl1(l1LILI1 r2, BigInteger bigInteger) {
        this(r2, bigInteger, null);
    }

    public C9610iLl1(l1LILI1 r2, BigInteger bigInteger, byte[] bArr) {
        this(new C5184I1l(r2, bigInteger, bArr));
    }

    public C9610iLl1(byte[] bArr) {
        this(null, null, bArr);
    }

    @Override // com.p118pd.sdk.iilI1iI
    public l1LILI1 OooO00o() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.iilI1iI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21667OooO00o() {
        return this.OooO00o.m15304OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        return obj instanceof C6431iL ? ((C6431iL) obj).m17967OooO00o().equals(this) : this.OooO00o.OooO00o(obj);
    }

    @Override // com.p118pd.sdk.iilI1iI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21668OooO00o() {
        return this.OooO00o.m15305OooO00o();
    }

    @Override // com.p118pd.sdk.iilI1iI, java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return new C9610iLl1(this.OooO00o);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9610iLl1)) {
            return false;
        }
        return this.OooO00o.equals(((C9610iLl1) obj).OooO00o);
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }
}
