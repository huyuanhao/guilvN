package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.alibaba.sdk.android.httpdns.b */
public class C0258b {

    /* renamed from: a */
    public static SharedPreferences f570a = null;

    /* renamed from: a */
    public static boolean f571a = true;

    /* renamed from: b */
    public static boolean f572b = true;

    /* renamed from: a */
    public static void m429a(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("httpdns_config_enable", 0);
            f570a = sharedPreferences;
            if (sharedPreferences != null) {
                f571a = sharedPreferences.getBoolean("key_enable", true);
            }
        }
    }

    /* renamed from: a */
    public static void m430a(boolean z) {
        f571a = z;
        SharedPreferences sharedPreferences = f570a;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("key_enable", z);
            edit.apply();
        }
    }

    /* renamed from: a */
    public static boolean m431a() {
        return f571a && f572b;
    }

    /* renamed from: b */
    public static void m432b(boolean z) {
        f572b = z;
    }
}
