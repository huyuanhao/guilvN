package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨L1丨  reason: invalid class name and case insensitive filesystem */
public class C6377iL1 implements AbstractC6370iIIIl {
    public AbstractC6370iIIIl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18163OooO00o;

    public C6377iL1(AbstractC6370iIIIl r3, byte[] bArr) {
        this(r3, bArr, 0, bArr.length);
    }

    public C6377iL1(AbstractC6370iIIIl r2, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f18163OooO00o = bArr2;
        this.OooO00o = r2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public AbstractC6370iIIIl OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17490OooO00o() {
        return this.f18163OooO00o;
    }
}
