package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0OOo0O  reason: case insensitive filesystem */
public class C7419o0OOo0O {
    public static final byte OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static byte[] f20236OooO00o = {C8027oOO00oo.OooO00o, 66, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte OooO0O0 = -2;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static byte[] f20237OooO0O0 = new byte[255];
    public static final byte OooO0OO = -3;

    static {
        int i = 0;
        for (int i2 = 0; i2 < 255; i2++) {
            f20237OooO0O0[i2] = -1;
        }
        while (true) {
            byte[] bArr = f20236OooO00o;
            if (i < bArr.length) {
                f20237OooO0O0[bArr[i]] = (byte) i;
                i++;
            } else {
                byte[] bArr2 = f20237OooO0O0;
                bArr2[9] = -2;
                bArr2[10] = -2;
                bArr2[13] = -2;
                bArr2[32] = -2;
                bArr2[61] = -3;
                return;
            }
        }
    }

    public static final String OooO00o(String str) {
        return new String(OooO00o(str.getBytes()));
    }

    public static final byte[] OooO00o(byte[] bArr) throws IllegalArgumentException {
        int i = 0;
        int i2 = 0;
        for (byte b : bArr) {
            byte b2 = f20237OooO0O0[b];
            if (b2 >= 0) {
                bArr[i2] = b2;
                i2++;
            } else if (b2 == -1) {
                throw new IllegalArgumentException("Invalid base 64 string");
            }
        }
        while (i2 > 0 && bArr[i2 - 1] == -3) {
            i2--;
        }
        int i3 = (i2 * 3) / 4;
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        while (i < i3 - 2) {
            int i5 = i4 + 1;
            bArr2[i] = (byte) (((bArr[i4] << 2) & 255) | ((bArr[i5] >>> 4) & 3));
            int i6 = i4 + 2;
            bArr2[i + 1] = (byte) (((bArr[i5] << 4) & 255) | ((bArr[i6] >>> 2) & 15));
            bArr2[i + 2] = (byte) (((bArr[i6] << 6) & 255) | (bArr[i4 + 3] & 63));
            i4 += 4;
            i += 3;
        }
        if (i < i3) {
            bArr2[i] = (byte) (((bArr[i4] << 2) & 255) | ((bArr[i4 + 1] >>> 4) & 3));
        }
        int i7 = i + 1;
        if (i7 < i3) {
            bArr2[i7] = (byte) (((bArr[i4 + 2] >>> 2) & 15) | ((bArr[i4 + 1] << 4) & 255));
        }
        return bArr2;
    }

    public static final byte[] OooO00o(byte[] bArr, int i) {
        int i2 = (i / 4) * 4;
        if (i2 < 0) {
            i2 = 0;
        }
        int length = ((bArr.length + 2) / 3) * 4;
        if (i2 > 0) {
            length += (length - 1) / i2;
        }
        byte[] bArr2 = new byte[length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 + 3 <= bArr.length) {
            int i6 = i3 + 1;
            int i7 = i6 + 1;
            int i8 = ((bArr[i3] & 255) << 16) | ((bArr[i6] & 255) << 8);
            int i9 = i7 + 1;
            int i10 = i8 | ((bArr[i7] & 255) << 0);
            int i11 = i4 + 1;
            byte[] bArr3 = f20236OooO00o;
            bArr2[i4] = bArr3[(i10 & 16515072) >> 18];
            int i12 = i11 + 1;
            bArr2[i11] = bArr3[(i10 & 258048) >> 12];
            int i13 = i12 + 1;
            bArr2[i12] = bArr3[(i10 & 4032) >> 6];
            i4 = i13 + 1;
            bArr2[i13] = bArr3[i10 & 63];
            i5 += 4;
            if (i4 < length && i2 > 0 && i5 % i2 == 0) {
                bArr2[i4] = 10;
                i4++;
            }
            i3 = i9;
        }
        if (bArr.length - i3 == 2) {
            int i14 = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16);
            int i15 = i4 + 1;
            byte[] bArr4 = f20236OooO00o;
            bArr2[i4] = bArr4[(i14 & 16515072) >> 18];
            int i16 = i15 + 1;
            bArr2[i15] = bArr4[(i14 & 258048) >> 12];
            bArr2[i16] = bArr4[(i14 & 4032) >> 6];
            bArr2[i16 + 1] = 61;
        } else if (bArr.length - i3 == 1) {
            int i17 = (bArr[i3] & 255) << 16;
            int i18 = i4 + 1;
            byte[] bArr5 = f20236OooO00o;
            bArr2[i4] = bArr5[(i17 & 16515072) >> 18];
            int i19 = i18 + 1;
            bArr2[i18] = bArr5[(i17 & 258048) >> 12];
            bArr2[i19] = 61;
            bArr2[i19 + 1] = 61;
        }
        return bArr2;
    }

    public static final String OooO0O0(String str) {
        return new String(OooO0O0(str.getBytes()));
    }

    public static final byte[] OooO0O0(byte[] bArr) {
        return OooO00o(bArr, 0);
    }
}
