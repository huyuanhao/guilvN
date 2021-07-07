package com.p118pd.sdk;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o000o00  reason: case insensitive filesystem */
public final class C7014o000o00 {
    public static long OooO00o(@NonNull PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }
}
