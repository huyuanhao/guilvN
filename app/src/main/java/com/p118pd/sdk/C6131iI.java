package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iI丨  reason: invalid class name and case insensitive filesystem */
public class C6131iI {
    public byte[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f17613OooO00o;

    public C6131iI(int[] iArr, byte[] bArr) {
        if (iArr == null || iArr.length < 1 || iArr.length >= 32768) {
            throw new IllegalArgumentException("'protectionProfiles' must have length from 1 to (2^15 - 1)");
        }
        if (bArr == null) {
            bArr = L1LL1Ii.f16174OooO00o;
        } else if (bArr.length > 255) {
            throw new IllegalArgumentException("'mki' cannot be longer than 255 bytes");
        }
        this.f17613OooO00o = iArr;
        this.OooO00o = bArr;
    }

    public byte[] OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m17034OooO00o() {
        return this.f17613OooO00o;
    }
}
