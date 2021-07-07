package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oO0Oo0o  reason: case insensitive filesystem */
public class C7891oO0Oo0o {
    public static int OooO00o(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = (bArr[i] & 255) << 8;
            i3 = bArr[i + 1] & 255;
        } else {
            i2 = bArr[i] & 255;
            i3 = (bArr[i + 1] & 255) << 8;
        }
        return i3 | i2;
    }

    public static int OooO0O0(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
            i3 = bArr[i + 3] & 255;
        } else {
            i2 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            i3 = (bArr[i + 3] & 255) << 24;
        }
        return i3 | i2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m19571OooO00o(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
            i3 = bArr[i + 7] & 255;
        } else {
            i2 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            i3 = (bArr[i + 7] & 255) << 56;
        }
        return (long) (i3 | i2);
    }
}
