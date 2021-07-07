package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.pd.sdk.ooOoOOo0  reason: case insensitive filesystem */
public class C9050ooOoOOo0 {
    public static String OooO00o = "com.rxhui.pay";

    public C9050ooOoOOo0() {
        throw new AssertionError();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20715OooO00o(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(OooO00o, 0).edit();
        edit.putString(str, str2);
        return edit.commit();
    }

    public static boolean OooO0O0(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences(OooO00o, 0).edit();
        edit.putBoolean(str, z);
        return edit.commit();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20710OooO00o(Context context, String str) {
        return OooO00o(context, str, (String) null);
    }

    public static String OooO00o(Context context, String str, String str2) {
        return context.getSharedPreferences(OooO00o, 0).getString(str, str2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20713OooO00o(Context context, String str, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences(OooO00o, 0).edit();
        edit.putInt(str, i);
        return edit.commit();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m20708OooO00o(Context context, String str) {
        return OooO00o(context, str, -1);
    }

    public static int OooO00o(Context context, String str, int i) {
        return context.getSharedPreferences(OooO00o, 0).getInt(str, i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20714OooO00o(Context context, String str, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences(OooO00o, 0).edit();
        edit.putLong(str, j);
        return edit.commit();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m20709OooO00o(Context context, String str) {
        return OooO00o(context, str, -1L);
    }

    public static long OooO00o(Context context, String str, long j) {
        return context.getSharedPreferences(OooO00o, 0).getLong(str, j);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20712OooO00o(Context context, String str, float f) {
        SharedPreferences.Editor edit = context.getSharedPreferences(OooO00o, 0).edit();
        edit.putFloat(str, f);
        return edit.commit();
    }

    public static float OooO00o(Context context, String str) {
        return OooO00o(context, str, -1.0f);
    }

    public static float OooO00o(Context context, String str, float f) {
        return context.getSharedPreferences(OooO00o, 0).getFloat(str, f);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20711OooO00o(Context context, String str) {
        return OooO00o(context, str, false);
    }

    public static boolean OooO00o(Context context, String str, boolean z) {
        return context.getSharedPreferences(OooO00o, 0).getBoolean(str, z);
    }
}
