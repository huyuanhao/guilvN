package com.p118pd.sdk;

import java.nio.charset.Charset;

/* renamed from: com.pd.sdk.ooOOoO00  reason: case insensitive filesystem */
public final class C8976ooOOoO00 {
    public static final Charset OooO00o = Charset.forName("UTF-8");

    public static int OooO00o(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static long OooO00o(long j) {
        return ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static short OooO00o(short s) {
        int i = s & UShort.OooO0OO;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    public static void OooO00o(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static <T extends Throwable> void OooO0O0(Throwable th) throws Throwable {
        throw th;
    }

    public static void OooO00o(Throwable th) {
        OooO0O0(th);
    }

    public static boolean OooO00o(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
