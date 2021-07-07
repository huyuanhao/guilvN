package com.megvii.meglive_sdk.p095a;

/* renamed from: com.megvii.meglive_sdk.a.b */
public final class C1508b {

    /* renamed from: a */
    public static char[] f2074a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();

    /* renamed from: b */
    public static byte[] f2075b = new byte[256];

    static {
        for (int i = 0; i < 256; i++) {
            f2075b[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f2075b[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            f2075b[i3] = (byte) ((i3 + 26) - 97);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            f2075b[i4] = (byte) ((i4 + 52) - 48);
        }
        byte[] bArr = f2075b;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    /* renamed from: a */
    public static String m2279a(String str) {
        return new String(m2280a(str.getBytes()));
    }

    /* renamed from: a */
    public static char[] m2280a(byte[] bArr) {
        boolean z;
        char[] cArr = new char[(((bArr.length + 2) / 3) * 4)];
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = (bArr[i] & 255) << 8;
            int i4 = i + 1;
            boolean z2 = true;
            if (i4 < bArr.length) {
                i3 |= bArr[i4] & 255;
                z = true;
            } else {
                z = false;
            }
            int i5 = i3 << 8;
            int i6 = i + 2;
            if (i6 < bArr.length) {
                i5 |= bArr[i6] & 255;
            } else {
                z2 = false;
            }
            int i7 = 64;
            cArr[i2 + 3] = f2074a[z2 ? i5 & 63 : 64];
            int i8 = i5 >> 6;
            int i9 = i2 + 2;
            char[] cArr2 = f2074a;
            if (z) {
                i7 = i8 & 63;
            }
            cArr[i9] = cArr2[i7];
            int i10 = i8 >> 6;
            char[] cArr3 = f2074a;
            cArr[i2 + 1] = cArr3[i10 & 63];
            cArr[i2 + 0] = cArr3[(i10 >> 6) & 63];
            i += 3;
            i2 += 4;
        }
        return cArr;
    }
}
