package com.megvii.meglive_sdk.p106f;

import android.content.Context;

/* renamed from: com.megvii.meglive_sdk.f.e */
public final class C1563e {
    /* renamed from: a */
    public static long m2627a(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        C1571m.m2655a("current", String.valueOf(currentTimeMillis));
        long b = C1565g.m2632b(context);
        C1571m.m2655a("cacheExpire", String.valueOf(b));
        if (b > currentTimeMillis) {
            return b;
        }
        return 0;
    }
}
