package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iillli  reason: case insensitive filesystem */
public class C6279iillli {
    public static int OooO00o(int i) {
        int i2 = i >> 31;
        return (i ^ i2) - i2;
    }

    public static int OooO00o(int[] iArr, int i, int i2, int i3) {
        int i4 = (i3 * 2730) >> 25;
        int i5 = i4 - ((12288 - (i3 - (i4 * 12289))) >> 31);
        iArr[i] = (i5 >> 1) + (i5 & 1);
        int i6 = i5 - 1;
        iArr[i2] = (i6 >> 1) + (i6 & 1);
        return OooO00o(i3 - ((iArr[i] * 2) * 12289));
    }

    public static short OooO00o(int i, int i2, int i3, int i4) {
        return (short) (((((OooO0O0(i) + OooO0O0(i2)) + OooO0O0(i3)) + OooO0O0(i4)) - 98312) >>> 31);
    }

    public static void OooO00o(byte[] bArr, short[] sArr, short[] sArr2) {
        C9586iIILl.OooO00o(bArr, (byte) 0);
        int[] iArr = new int[4];
        for (int i = 0; i < 256; i++) {
            int i2 = i + 0;
            int i3 = i + 768;
            iArr[0] = ((sArr[i2] * 8) + 196624) - (((sArr2[i2] * 2) + sArr2[i3]) * 12289);
            int i4 = i + 256;
            iArr[1] = ((sArr[i4] * 8) + 196624) - (((sArr2[i4] * 2) + sArr2[i3]) * 12289);
            int i5 = i + 512;
            iArr[2] = ((sArr[i5] * 8) + 196624) - (((sArr2[i5] * 2) + sArr2[i3]) * 12289);
            iArr[3] = ((sArr[i3] * 8) + 196624) - (sArr2[i3] * 12289);
            int i6 = i >>> 3;
            bArr[i6] = (byte) ((OooO00o(iArr[0], iArr[1], iArr[2], iArr[3]) << (i & 7)) | bArr[i6]);
        }
    }

    public static void OooO00o(short[] sArr, short[] sArr2, byte[] bArr, byte b) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b;
        byte[] bArr3 = new byte[32];
        C9533Llii.OooO00o(bArr, bArr2, bArr3, 0, 32);
        int[] iArr = new int[8];
        int[] iArr2 = new int[4];
        for (int i = 0; i < 256; i++) {
            int i2 = i + 0;
            int i3 = ((bArr3[i >>> 3] >>> (i & 7)) & 1) * 4;
            int i4 = i + 256;
            int i5 = i + 512;
            int i6 = i + 768;
            int OooO00o = (24577 - (((OooO00o(iArr, 0, 4, (sArr2[i2] * 8) + i3) + OooO00o(iArr, 1, 5, (sArr2[i4] * 8) + i3)) + OooO00o(iArr, 2, 6, (sArr2[i5] * 8) + i3)) + OooO00o(iArr, 3, 7, (sArr2[i6] * 8) + i3))) >> 31;
            int i7 = OooO00o ^ -1;
            iArr2[0] = (i7 & iArr[0]) ^ (OooO00o & iArr[4]);
            iArr2[1] = (i7 & iArr[1]) ^ (OooO00o & iArr[5]);
            iArr2[2] = (i7 & iArr[2]) ^ (OooO00o & iArr[6]);
            iArr2[3] = (iArr[7] & OooO00o) ^ (i7 & iArr[3]);
            sArr[i2] = (short) ((iArr2[0] - iArr2[3]) & 3);
            sArr[i4] = (short) ((iArr2[1] - iArr2[3]) & 3);
            sArr[i5] = (short) ((iArr2[2] - iArr2[3]) & 3);
            sArr[i6] = (short) (((-OooO00o) + (iArr2[3] * 2)) & 3);
        }
    }

    public static int OooO0O0(int i) {
        int i2 = (i * 2730) >> 27;
        int i3 = i2 - ((Lillilli.o00000 - (i - (Lillilli.o00000O0 * i2))) >> 31);
        return OooO00o((((i3 >> 1) + (i3 & 1)) * 98312) - i);
    }
}
