package com.qiyukf.basesdk.p138c;

import android.content.SharedPreferences;
import android.os.Build;

/* renamed from: com.qiyukf.basesdk.c.c */
public final class C1847c {
    /* renamed from: a */
    public static void m3499a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    /* renamed from: a */
    public static void m3500a(SharedPreferences sharedPreferences, String str, int i) {
        m3499a(sharedPreferences.edit().putInt(str, i));
    }

    /* renamed from: a */
    public static void m3501a(SharedPreferences sharedPreferences, String str, long j) {
        m3499a(sharedPreferences.edit().putLong(str, j));
    }

    /* renamed from: a */
    public static void m3502a(SharedPreferences sharedPreferences, String str, String str2) {
        m3499a(sharedPreferences.edit().putString(str, str2));
    }

    /* renamed from: a */
    public static void m3503a(SharedPreferences sharedPreferences, String str, boolean z) {
        m3499a(sharedPreferences.edit().putBoolean(str, z));
    }
}
