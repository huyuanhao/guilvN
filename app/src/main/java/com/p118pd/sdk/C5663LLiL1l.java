package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LLiL1l  reason: case insensitive filesystem */
public class C5663LLiL1l implements AbstractC6370iIIIl {
    public byte[] OooO00o;
    public int o00oO0O;

    public C5663LLiL1l(byte[] bArr, int i) {
        if (bArr.length <= 255) {
            byte[] bArr2 = new byte[bArr.length];
            this.OooO00o = bArr2;
            this.o00oO0O = i;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return;
        }
        throw new IllegalArgumentException("RC5 key length can be no greater than 255");
    }

    public int OooO00o() {
        return this.o00oO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16235OooO00o() {
        return this.OooO00o;
    }
}
