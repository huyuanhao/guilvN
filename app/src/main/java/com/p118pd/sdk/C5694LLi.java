package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LL丨丨i丨  reason: invalid class name and case insensitive filesystem */
public final class C5694LLi implements AbstractC93201li {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16545OooO00o;
    public byte[] OooO0O0;
    public byte[] OooO0OO;

    public C5694LLi(byte[] bArr, byte[] bArr2, int i) {
        this(bArr, null, bArr2, i);
    }

    public C5694LLi(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        if (bArr != null) {
            this.f16545OooO00o = C9586iIILl.m21630OooO00o(bArr);
            if (bArr2 == null) {
                this.OooO0O0 = new byte[0];
            } else {
                this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
            }
            if (bArr3 == null) {
                this.OooO0OO = new byte[0];
            } else {
                this.OooO0OO = C9586iIILl.m21630OooO00o(bArr3);
            }
            if (i == 8 || i == 16 || i == 24 || i == 32) {
                this.OooO00o = i;
                return;
            }
            throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
        }
        throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16273OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO0OO);
    }

    public byte[] OooO0O0() {
        return C9586iIILl.m21630OooO00o(this.OooO0O0);
    }

    public byte[] OooO0OO() {
        return C9586iIILl.m21630OooO00o(this.OooO0OO);
    }

    public byte[] OooO0Oo() {
        return this.f16545OooO00o;
    }
}
