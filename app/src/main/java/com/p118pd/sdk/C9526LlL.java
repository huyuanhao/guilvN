package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨LlL  reason: invalid class name and case insensitive filesystem */
public final class C9526LlL implements AbstractC93201li {
    public static final int OooO0O0 = 32;
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f23098OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f23099OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final byte[] f23100OooO0O0;

    public C9526LlL(byte[] bArr, byte[] bArr2, int i, boolean z) {
        if (bArr != null) {
            this.f23099OooO00o = C9586iIILl.m21630OooO00o(bArr);
            if (bArr2 == null) {
                this.f23100OooO0O0 = new byte[0];
            } else {
                this.f23100OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
            }
            if (i == 8 || i == 16 || i == 24 || i == 32) {
                this.OooO00o = i;
                this.f23098OooO00o = z;
                return;
            }
            throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
        }
        throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
    }

    public static C9526LlL OooO00o(byte[] bArr, byte[] bArr2) {
        return new C9526LlL(bArr, bArr2, 32, false);
    }

    public static C9526LlL OooO00o(byte[] bArr, byte[] bArr2, int i) {
        return new C9526LlL(bArr, bArr2, i, true);
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21585OooO00o() {
        return this.f23098OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21586OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f23100OooO0O0);
    }

    public byte[] OooO0O0() {
        return this.f23099OooO00o;
    }
}
