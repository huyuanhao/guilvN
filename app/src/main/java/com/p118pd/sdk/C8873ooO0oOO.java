package com.p118pd.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: com.pd.sdk.ooO0oOO  reason: case insensitive filesystem */
public class C8873ooO0oOO {
    public static boolean OooO00o(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || context.getPackageManager().checkPermission(str, context.getApplicationInfo().packageName) != 0) {
            return false;
        }
        return true;
    }

    public static boolean OooO00o(Context context, String[] strArr) {
        if (context == null || strArr == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        String str = context.getApplicationInfo().packageName;
        for (String str2 : strArr) {
            if (packageManager.checkPermission(str2, str) != 0) {
                return false;
            }
        }
        return true;
    }
}
