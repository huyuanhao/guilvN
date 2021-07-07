package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.Il丨1Li丨  reason: invalid class name and case insensitive filesystem */
public class C5478Il1Li {
    public static int OooO00o(SecureRandom secureRandom, int i) {
        int nextInt;
        int i2;
        if (((-i) & i) == i) {
            return (int) ((((long) i) * ((long) (secureRandom.nextInt() >>> 1))) >> 31);
        }
        do {
            nextInt = secureRandom.nextInt() >>> 1;
            i2 = nextInt % i;
        } while ((nextInt - i2) + (i - 1) < 0);
        return i2;
    }
}
