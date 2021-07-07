package com.megvii.meglive_sdk.p106f;

/* renamed from: com.megvii.meglive_sdk.f.v */
public final class C1581v {
    /* renamed from: a */
    public static byte[] m2684a(byte[] bArr, int i, int i2, int i3) {
        if (i3 == 90) {
            return m2683a(bArr, i, i2);
        }
        if (i3 != 180) {
            return i3 != 270 ? bArr : m2686c(bArr, i, i2);
        }
        return m2685b(bArr, i, i2);
    }

    /* renamed from: b */
    public static byte[] m2685b(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = (i3 * 3) / 2;
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        for (int i6 = i3 - 1; i6 >= 0; i6--) {
            bArr2[i5] = bArr[i6];
            i5++;
        }
        for (int i7 = i4 - 1; i7 >= i3; i7 -= 2) {
            int i8 = i5 + 1;
            bArr2[i5] = bArr[i7 - 1];
            i5 = i8 + 1;
            bArr2[i8] = bArr[i7];
        }
        return bArr2;
    }

    /* renamed from: c */
    public static byte[] m2686c(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[((i3 * 3) / 2)];
        int i4 = i - 1;
        int i5 = 0;
        for (int i6 = i4; i6 >= 0; i6--) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                bArr2[i5] = bArr[i7 + i6];
                i5++;
                i7 += i;
            }
        }
        int i9 = i3;
        while (i4 > 0) {
            int i10 = i3;
            for (int i11 = 0; i11 < i2 / 2; i11++) {
                bArr2[i9] = bArr[(i4 - 1) + i10];
                int i12 = i9 + 1;
                bArr2[i12] = bArr[i10 + i4];
                i9 = i12 + 1;
                i10 += i;
            }
            i4 -= 2;
        }
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m2683a(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = (i3 * 3) / 2;
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            for (int i7 = i2 - 1; i7 >= 0; i7--) {
                bArr2[i5] = bArr[(i7 * i) + i6];
                i5++;
            }
        }
        int i8 = i4 - 1;
        for (int i9 = i - 1; i9 > 0; i9 -= 2) {
            for (int i10 = 0; i10 < i2 / 2; i10++) {
                int i11 = (i10 * i) + i3;
                bArr2[i8] = bArr[i11 + i9];
                int i12 = i8 - 1;
                bArr2[i12] = bArr[i11 + (i9 - 1)];
                i8 = i12 - 1;
            }
        }
        return bArr2;
    }
}
