package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.丨l1l丨  reason: invalid class name and case insensitive filesystem */
public class C9661l1l {
    public static void OooO00o(byte[] bArr) {
        if (bArr != null) {
            C9586iIILl.OooO00o(bArr, (byte) 0);
        }
    }

    public static void OooO00o(int[] iArr) {
        if (iArr != null) {
            C9586iIILl.OooO00o(iArr, 0);
        }
    }

    public static void OooO00o(int[] iArr, int i, int i2, int i3) {
        int i4 = i3 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[i4];
        int[][] iArr6 = new int[i2][];
        try {
            System.arraycopy(iArr, i, iArr5, 0, i4);
            for (int i5 = 0; i5 < i2; i5++) {
                iArr6[i5] = C9586iIILl.m21635OooO00o(iArr5);
                OooO00o(iArr5, iArr2, iArr3, iArr4, i3);
            }
            int i6 = i2 - 1;
            for (int i7 = 0; i7 < i2; i7++) {
                OooO00o(iArr5, iArr6[iArr5[i4 - 16] & i6], 0, iArr5);
                OooO00o(iArr5, iArr2, iArr3, iArr4, i3);
            }
            System.arraycopy(iArr5, 0, iArr, i, i4);
            OooO00o(iArr6);
            OooO00o(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th) {
            OooO00o(iArr6);
            OooO00o(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th;
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int i, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i + length];
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i * 2; i4 > 0; i4--) {
            OooO00o(iArr2, iArr, i2, iArr3);
            C9611iLlI.OooO00o(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i3, 16);
            i3 = (length + i2) - i3;
            i2 += 16;
        }
        System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
    }

    public static void OooO00o(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            OooO00o(iArr2);
        }
    }

    public static boolean OooO00o(int i) {
        return (i & (i + -1)) == 0;
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2, int i) {
        C6928llIL r0 = new C6928llIL(new I1li1Ll());
        r0.OooO00o(bArr, bArr2, 1);
        return ((C6642li1LI) r0.m18075OooO00o(i * 8)).OooO00o();
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        int i5 = i2 * 128;
        byte[] OooO00o = OooO00o(bArr, bArr2, i3 * i5);
        int[] iArr = null;
        try {
            int length = OooO00o.length >>> 2;
            iArr = new int[length];
            AbstractC6464l1l.OooO0O0(OooO00o, 0, iArr);
            int i6 = i5 >>> 2;
            for (int i7 = 0; i7 < length; i7 += i6) {
                OooO00o(iArr, i7, i, i2);
            }
            AbstractC6464l1l.OooO0O0(iArr, OooO00o, 0);
            return OooO00o(bArr, OooO00o, i4);
        } finally {
            OooO00o(OooO00o);
            OooO00o(iArr);
        }
    }

    public static byte[] OooO0O0(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if (bArr == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        } else if (bArr2 == null) {
            throw new IllegalArgumentException("Salt S must be provided.");
        } else if (i <= 1 || !OooO00o(i)) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
        } else if (i2 == 1 && i >= 65536) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
        } else if (i2 >= 1) {
            int i5 = Integer.MAX_VALUE / ((i2 * 128) * 8);
            if (i3 < 1 || i3 > i5) {
                throw new IllegalArgumentException("Parallelisation parameter p must be >= 1 and <= " + i5 + " (based on block size r of " + i2 + C3848l.f10402t);
            } else if (i4 >= 1) {
                return OooO00o(bArr, bArr2, i, i2, i3, i4);
            } else {
                throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
            }
        } else {
            throw new IllegalArgumentException("Block size r must be >= 1.");
        }
    }
}
