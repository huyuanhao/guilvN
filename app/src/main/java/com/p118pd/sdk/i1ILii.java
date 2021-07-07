package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.i1ILii丨  reason: invalid class name */
public abstract class i1ILii {
    public static BigInteger OooO00o(long[] jArr) {
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC6464l1l.OooO00o(j, bArr, (6 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void OooO00o(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2 + 0] = jArr[i + 0];
        jArr2[i2 + 1] = jArr[i + 1];
        jArr2[i2 + 2] = jArr[i + 2];
        jArr2[i2 + 3] = jArr[i + 3];
        jArr2[i2 + 4] = jArr[i + 4];
        jArr2[i2 + 5] = jArr[i + 5];
        jArr2[i2 + 6] = jArr[i + 6];
    }

    public static void OooO00o(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m16859OooO00o(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m16860OooO00o(long[] jArr, long[] jArr2) {
        for (int i = 6; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long[] OooO00o() {
        return new long[7];
    }

    public static long[] OooO00o(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 448) {
            throw new IllegalArgumentException();
        }
        long[] OooO00o = OooO00o();
        int i = 0;
        while (bigInteger.signum() != 0) {
            OooO00o[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return OooO00o;
    }

    public static boolean OooO0O0(long[] jArr) {
        for (int i = 0; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static long[] OooO0O0() {
        return new long[14];
    }
}
