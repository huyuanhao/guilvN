package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.pd.sdk.oo0OOo00  reason: case insensitive filesystem */
public class C8643oo0OOo00 {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20265OooO00o(Context context, String str, String str2, Boolean bool) {
        return context.getSharedPreferences(str, 0).getBoolean(str2, bool.booleanValue());
    }

    public static void OooO00o(Context context, String str, String str2, Boolean bool) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putBoolean(str2, bool.booleanValue());
        edit.commit();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20264OooO00o(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.commit();
    }

    public static String OooO00o(Context context, String str, String str2, String str3) {
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20263OooO00o(Context context, String str, String str2, Long l) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putLong(str2, l.longValue());
        edit.commit();
    }

    public static Long OooO00o(Context context, String str, String str2, Long l) {
        return Long.valueOf(context.getSharedPreferences(str, 0).getLong(str2, l.longValue()));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20262OooO00o(Context context, String str, String str2, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putInt(str2, i);
        edit.commit();
    }

    public static int OooO00o(Context context, String str, String str2, int i) {
        return context.getSharedPreferences(str, 0).getInt(str2, i);
    }
}
