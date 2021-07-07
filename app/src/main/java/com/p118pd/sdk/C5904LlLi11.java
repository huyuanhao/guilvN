package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.L丨lLi11  reason: invalid class name and case insensitive filesystem */
public class C5904LlLi11 implements AbstractC6317ilLi {
    public l1LILI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f16919OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16920OooO00o;

    public C5904LlLi11(l1LILI1 r1, BigInteger bigInteger) {
        OooO00o(r1, bigInteger);
    }

    public C5904LlLi11(l1LILI1 r1, BigInteger bigInteger, byte[] bArr) {
        OooO00o(r1, bigInteger);
        OooO00o(bArr);
    }

    public C5904LlLi11(byte[] bArr) {
        OooO00o(bArr);
    }

    private void OooO00o(l1LILI1 r1, BigInteger bigInteger) {
        this.OooO00o = r1;
        this.f16919OooO00o = bigInteger;
    }

    private void OooO00o(byte[] bArr) {
        this.f16920OooO00o = bArr;
    }

    private boolean OooO00o(Object obj, Object obj2) {
        return obj != null ? obj.equals(obj2) : obj2 == null;
    }

    public l1LILI1 OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        return false;
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return new C5904LlLi11(this.OooO00o, this.f16919OooO00o, this.f16920OooO00o);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5904LlLi11)) {
            return false;
        }
        C5904LlLi11 r4 = (C5904LlLi11) obj;
        return C9586iIILl.m21627OooO00o(this.f16920OooO00o, r4.f16920OooO00o) && OooO00o(this.f16919OooO00o, r4.f16919OooO00o) && OooO00o(this.OooO00o, r4.OooO00o);
    }

    public int hashCode() {
        int OooO00o2 = C9586iIILl.OooO00o(this.f16920OooO00o);
        BigInteger bigInteger = this.f16919OooO00o;
        if (bigInteger != null) {
            OooO00o2 ^= bigInteger.hashCode();
        }
        l1LILI1 r1 = this.OooO00o;
        return r1 != null ? OooO00o2 ^ r1.hashCode() : OooO00o2;
    }
}
