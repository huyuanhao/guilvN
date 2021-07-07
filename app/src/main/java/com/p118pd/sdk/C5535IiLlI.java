package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I丨iLlI  reason: invalid class name and case insensitive filesystem */
public class C5535IiLlI {
    public static short OooO00o(short s) {
        short OooO00o = i111I.OooO00o(s);
        int i = OooO00o - 12289;
        return (short) (((OooO00o ^ i) & (i >> 31)) ^ i);
    }

    public static void OooO00o(byte[] bArr, short[] sArr) {
        for (int i = 0; i < 256; i++) {
            int i2 = i * 4;
            short OooO00o = OooO00o(sArr[i2 + 0]);
            short OooO00o2 = OooO00o(sArr[i2 + 1]);
            short OooO00o3 = OooO00o(sArr[i2 + 2]);
            short OooO00o4 = OooO00o(sArr[i2 + 3]);
            int i3 = i * 7;
            bArr[i3 + 0] = (byte) OooO00o;
            bArr[i3 + 1] = (byte) ((OooO00o >> 8) | (OooO00o2 << 6));
            bArr[i3 + 2] = (byte) (OooO00o2 >> 2);
            bArr[i3 + 3] = (byte) ((OooO00o2 >> 10) | (OooO00o3 << 4));
            bArr[i3 + 4] = (byte) (OooO00o3 >> 4);
            bArr[i3 + 5] = (byte) ((OooO00o3 >> 12) | (OooO00o4 << 2));
            bArr[i3 + 6] = (byte) (OooO00o4 >> 6);
        }
    }

    public static void OooO00o(short[] sArr) {
        C5641LIlLL.OooO00o(sArr);
        C5641LIlLL.OooO00o(sArr, C5740LilI.OooO0O0);
        C5641LIlLL.OooO0O0(sArr, C5740LilI.OooO0Oo);
    }

    public static void OooO00o(short[] sArr, byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            int i2 = i * 7;
            int i3 = bArr[i2 + 1] & 255;
            int i4 = bArr[i2 + 3] & 255;
            int i5 = bArr[i2 + 5] & 255;
            int i6 = i * 4;
            sArr[i6 + 0] = (short) ((bArr[i2 + 0] & 255) | ((i3 & 63) << 8));
            sArr[i6 + 1] = (short) ((i3 >>> 6) | ((bArr[i2 + 2] & 255) << 2) | ((i4 & 15) << 10));
            sArr[i6 + 2] = (short) ((i4 >>> 4) | ((bArr[i2 + 4] & 255) << 4) | ((i5 & 3) << 12));
            sArr[i6 + 3] = (short) (((bArr[i2 + 6] & 255) << 6) | (i5 >>> 2));
        }
    }

    public static void OooO00o(short[] sArr, byte[] bArr, byte b) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b;
        byte[] bArr3 = new byte[4096];
        C9533Llii.OooO00o(bArr, bArr2, bArr3, 0, 4096);
        for (int i = 0; i < 1024; i++) {
            int OooO00o = AbstractC6464l1l.OooO00o(bArr3, i * 4);
            int i2 = 0;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 += (OooO00o >> i3) & 16843009;
            }
            sArr[i] = (short) (((((i2 >>> 24) + (i2 >>> 0)) & 255) + 12289) - (((i2 >>> 16) + (i2 >>> 8)) & 255));
        }
    }

    public static void OooO00o(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < 1024; i++) {
            sArr3[i] = i111I.OooO00o((short) (sArr[i] + sArr2[i]));
        }
    }

    public static void OooO0O0(short[] sArr) {
        C5641LIlLL.OooO0O0(sArr, C5740LilI.OooO0OO);
        C5641LIlLL.OooO00o(sArr, C5740LilI.OooO00o);
    }

    public static void OooO0O0(short[] sArr, byte[] bArr) {
        C6423iIii r0 = new C6423iIii(128);
        r0.update(bArr, 0, bArr.length);
        int i = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            r0.OooO00o(bArr2, 0, 256);
            int i2 = 0;
            while (true) {
                if (i2 < 256) {
                    int i3 = (bArr2[i2] & 255) | ((bArr2[i2 + 1] & 255) << 8);
                    if (i3 < 61445) {
                        int i4 = i + 1;
                        sArr[i] = (short) i3;
                        if (i4 != 1024) {
                            i = i4;
                        } else {
                            return;
                        }
                    }
                    i2 += 2;
                }
            }
        }
    }

    public static void OooO0O0(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < 1024; i++) {
            sArr3[i] = i111I.OooO00o((sArr[i] & UShort.OooO0OO) * (65535 & i111I.OooO00o((sArr2[i] & UShort.OooO0OO) * 3186)));
        }
    }
}
