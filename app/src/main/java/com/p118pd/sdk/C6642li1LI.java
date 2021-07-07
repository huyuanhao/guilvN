package com.p118pd.sdk;

/* renamed from: com.pd.sdk.li1丨LI  reason: invalid class name and case insensitive filesystem */
public class C6642li1LI implements AbstractC6370iIIIl {
    public byte[] OooO00o;

    public C6642li1LI(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C6642li1LI(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.OooO00o = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public byte[] OooO00o() {
        return this.OooO00o;
    }
}
