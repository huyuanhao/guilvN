package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o000O0o0  reason: case insensitive filesystem */
public class C6988o000O0o0 {
    public static final String OooO00o = "android.support.AppLaunchChecker";
    public static final String OooO0O0 = "startedFromLauncher";

    public static boolean OooO00o(@NonNull Context context) {
        return context.getSharedPreferences(OooO00o, 0).getBoolean(OooO0O0, false);
    }

    public static void OooO00o(@NonNull Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(OooO00o, 0);
        if (sharedPreferences.getBoolean(OooO0O0, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(C7011o000Ooo0.OooO0OO)) {
            sharedPreferences.edit().putBoolean(OooO0O0, true).apply();
        }
    }
}
