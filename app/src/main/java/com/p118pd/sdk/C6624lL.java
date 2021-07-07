package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lL丨  reason: invalid class name and case insensitive filesystem */
public class C6624lL implements AbstractC93201li {
    public byte[] OooO00o;

    public C6624lL(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C6624lL(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.OooO00o = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public byte[] OooO00o() {
        return this.OooO00o;
    }
}
