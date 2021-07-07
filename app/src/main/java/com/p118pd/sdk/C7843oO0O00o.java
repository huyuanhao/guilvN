package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: com.pd.sdk.oO0O00o  reason: case insensitive filesystem */
public final class C7843oO0O00o {
    public static final double OooO00o;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        OooO00o = d;
    }

    @TargetApi(17)
    public static long OooO00o() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }

    public static double OooO00o(long j) {
        double OooO00o2 = (double) (OooO00o() - j);
        double d = OooO00o;
        Double.isNaN(OooO00o2);
        return OooO00o2 * d;
    }
}
