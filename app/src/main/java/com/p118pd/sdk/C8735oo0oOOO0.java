package com.p118pd.sdk;

import java.math.BigDecimal;

/* renamed from: com.pd.sdk.oo0oOOO0  reason: case insensitive filesystem */
public class C8735oo0oOOO0 {
    public static final int OooO00o = 20;

    public static BigDecimal OooO00o(String str) {
        return new BigDecimal(str);
    }

    public static BigDecimal OooO0O0(String str, String str2) {
        return OooO00o(str, str2, 20);
    }

    public static BigDecimal OooO0OO(String str, String str2) {
        return new BigDecimal(str).multiply(new BigDecimal(str2));
    }

    public static BigDecimal OooO0Oo(String str, String str2) {
        return new BigDecimal(str).subtract(new BigDecimal(str2));
    }

    public static BigDecimal OooO00o(String str, String str2) {
        return new BigDecimal(str).add(new BigDecimal(str2));
    }

    public static BigDecimal OooO0O0(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return OooO00o(bigDecimal, bigDecimal2, 20);
    }

    public static BigDecimal OooO0OO(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.multiply(bigDecimal2);
    }

    public static BigDecimal OooO0Oo(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.subtract(bigDecimal2);
    }

    public static BigDecimal OooO00o(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.add(bigDecimal2);
    }

    public static BigDecimal OooO00o(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) {
        if (i >= 0) {
            return bigDecimal.divide(bigDecimal2, i, 1);
        }
        throw new IllegalArgumentException("The scale must be a positive integer or zero");
    }

    public static BigDecimal OooO00o(String str, String str2, int i) {
        if (i >= 0) {
            return new BigDecimal(str).divide(new BigDecimal(str2), i, 3);
        }
        throw new IllegalArgumentException("The scale must be a positive integer or zero");
    }
}
