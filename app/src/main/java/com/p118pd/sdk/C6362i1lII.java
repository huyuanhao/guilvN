package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨1lII  reason: invalid class name and case insensitive filesystem */
public class C6362i1lII {
    public static final int OooO00o = 4;
    public static final int OooO0O0 = 16;
    public static final int OooO0OO = 64;
    public static final int OooO0Oo = 67;
    public static final int OooO0o = 2144;
    public static final int OooO0o0 = 7;

    public static void OooO00o(II1i111L iI1i111L, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < 32; i6++) {
            bArr[i6 + i] = bArr2[i6 + i2];
        }
        while (i5 < i4 && i5 < 16) {
            iI1i111L.OooO0O0(bArr, i, bArr, i, bArr3, i3 + (i5 * 32));
            i5++;
        }
    }

    public static void OooO00o(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 != i2; i3++) {
            bArr[i3 + i] = 0;
        }
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        OooO00o(bArr, i, OooO0o);
        C5779LlIl.OooO00o(bArr, i, 2144, bArr2, i2);
    }

    public void OooO00o(II1i111L iI1i111L, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        OooO00o(bArr, i, bArr2, i2);
        for (int i4 = 0; i4 < 67; i4++) {
            int i5 = i + (i4 * 32);
            OooO00o(iI1i111L, bArr, i5, bArr, i5, bArr3, i3, 15);
        }
    }

    public void OooO00o(II1i111L iI1i111L, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 64) {
            int i4 = i2 / 2;
            iArr[i2] = bArr2[i4] & 15;
            int i5 = i2 + 1;
            iArr[i5] = (bArr2[i4] & 255) >>> 4;
            i3 = i3 + (15 - iArr[i2]) + (15 - iArr[i5]);
            i2 += 2;
        }
        while (i2 < 67) {
            iArr[i2] = i3 & 15;
            i3 >>>= 4;
            i2++;
        }
        OooO00o(bArr, i, bArr3, 0);
        for (int i6 = 0; i6 < 67; i6++) {
            int i7 = i + (i6 * 32);
            OooO00o(iI1i111L, bArr, i7, bArr, i7, bArr4, 0, iArr[i6]);
        }
    }

    public void OooO00o(II1i111L iI1i111L, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 64) {
            int i4 = i2 / 2;
            iArr[i2] = bArr3[i4] & 15;
            int i5 = i2 + 1;
            iArr[i5] = (bArr3[i4] & 255) >>> 4;
            i3 = i3 + (15 - iArr[i2]) + (15 - iArr[i5]);
            i2 += 2;
        }
        while (i2 < 67) {
            iArr[i2] = i3 & 15;
            i3 >>>= 4;
            i2++;
        }
        for (int i6 = 0; i6 < 67; i6++) {
            int i7 = i6 * 32;
            OooO00o(iI1i111L, bArr, i7, bArr2, i + i7, bArr4, iArr[i6] * 32, 15 - iArr[i6]);
        }
    }
}
