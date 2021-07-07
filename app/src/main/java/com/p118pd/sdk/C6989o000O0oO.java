package com.p118pd.sdk;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o000O0oO  reason: case insensitive filesystem */
public final class C6989o000O0oO {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;

    @Nullable
    public static String OooO00o(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }

    public static int OooO0O0(@NonNull Context context, @NonNull String str, int i, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i, str2);
        }
        return 1;
    }

    public static int OooO00o(@NonNull Context context, @NonNull String str, int i, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i, str2);
        }
        return 1;
    }

    public static int OooO0O0(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    public static int OooO00o(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
        }
        return 1;
    }
}
