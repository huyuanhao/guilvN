package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.L1 */
public class C1679L1 implements AbstractC6317ilLi {
    public C5184I1l OooO00o;

    public C1679L1(C5184I1l i1l) {
        this.OooO00o = i1l;
    }

    public C1679L1(l1LILI1 r2, BigInteger bigInteger) {
        this(r2, bigInteger, null);
    }

    public C1679L1(l1LILI1 r2, BigInteger bigInteger, byte[] bArr) {
        this(new C5184I1l(r2, bigInteger, bArr));
    }

    public C1679L1(byte[] bArr) {
        this(null, null, bArr);
    }

    public l1LILI1 OooO00o() {
        return this.OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15874OooO00o() {
        return this.OooO00o.m15304OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        return obj instanceof C5510IIl ? ((C5510IIl) obj).m15762OooO00o().equals(this) : this.OooO00o.OooO00o(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15875OooO00o() {
        return this.OooO00o.m15305OooO00o();
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return new C1679L1(this.OooO00o);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1679L1)) {
            return false;
        }
        return this.OooO00o.equals(((C1679L1) obj).OooO00o);
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }
}
