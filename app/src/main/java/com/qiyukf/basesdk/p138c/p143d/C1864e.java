package com.qiyukf.basesdk.p138c.p143d;

import java.math.BigDecimal;

/* renamed from: com.qiyukf.basesdk.c.d.e */
public final class C1864e {
    /* renamed from: a */
    public static long m3551a(long j) {
        return (long) new BigDecimal((double) (((float) j) / 1000.0f)).setScale(0, 4).intValue();
    }

    /* renamed from: a */
    public static String m3552a(int i) {
        if (i < 0 || i >= 10) {
            return String.valueOf(i);
        }
        return "0" + Integer.toString(i);
    }
}
