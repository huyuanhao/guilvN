package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1lLii  reason: case insensitive filesystem */
public final class C6460l1lLii implements AbstractC93201li {
    public static final int OooO0O0 = -1;
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f18304OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f18305OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final byte[] f18306OooO0O0;
    public final byte[] OooO0OO;

    public C6460l1lLii(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, boolean z) {
        if (bArr != null) {
            this.f18305OooO00o = C9586iIILl.m21630OooO00o(bArr);
            if (bArr3 == null) {
                this.OooO0OO = new byte[0];
            } else {
                this.OooO0OO = C9586iIILl.m21630OooO00o(bArr3);
            }
            this.OooO00o = i;
            if (bArr2 == null) {
                this.f18306OooO0O0 = new byte[0];
            } else {
                this.f18306OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
            }
            this.f18304OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
    }

    public static C6460l1lLii OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new C6460l1lLii(bArr, bArr2, bArr3, -1, false);
    }

    public static C6460l1lLii OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        if (i == 8 || i == 16 || i == 24 || i == 32) {
            return new C6460l1lLii(bArr, bArr2, bArr3, i, true);
        }
        throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17594OooO00o() {
        return this.f18304OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17595OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO0OO);
    }

    public byte[] OooO0O0() {
        return this.f18306OooO0O0;
    }

    public byte[] OooO0OO() {
        return this.f18305OooO00o;
    }
}
