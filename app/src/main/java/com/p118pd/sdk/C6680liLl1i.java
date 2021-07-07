package com.p118pd.sdk;

import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.liLl1i  reason: case insensitive filesystem */
public class C6680liLl1i implements AlgorithmParameterSpec {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18620OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18621OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18622OooO0O0;
    public byte[] OooO0OO;

    public C6680liLl1i(byte[] bArr, byte[] bArr2, int i) {
        this(bArr, bArr2, i, -1, null, false);
    }

    public C6680liLl1i(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        this(bArr, bArr2, i, i2, bArr3, false);
    }

    public C6680liLl1i(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, boolean z) {
        if (bArr != null) {
            byte[] bArr4 = new byte[bArr.length];
            this.f18621OooO00o = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        } else {
            this.f18621OooO00o = null;
        }
        if (bArr2 != null) {
            byte[] bArr5 = new byte[bArr2.length];
            this.f18622OooO0O0 = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        } else {
            this.f18622OooO0O0 = null;
        }
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = C9586iIILl.m21630OooO00o(bArr3);
        this.f18620OooO00o = z;
    }

    public int OooO00o() {
        return this.OooO0O0;
    }

    public void OooO00o(boolean z) {
        this.f18620OooO00o = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17755OooO00o() {
        return this.f18620OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17756OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f18621OooO00o);
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m17757OooO0O0() {
        return C9586iIILl.m21630OooO00o(this.f18622OooO0O0);
    }

    public byte[] OooO0OO() {
        return C9586iIILl.m21630OooO00o(this.OooO0OO);
    }
}
