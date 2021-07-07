package com.p118pd.sdk;

import android.app.ActivityManager;
import android.os.Build;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o000O0  reason: case insensitive filesystem */
public final class C6978o000O0 {
    public static boolean OooO00o(@NonNull ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}
