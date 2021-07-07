package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.pd.sdk.oo0ooOOo  reason: case insensitive filesystem */
public class C8770oo0ooOOo {
    public static final String OooO00o = "k_mix_push_token";
    public static final String OooO0O0 = "k_mix_push_enable";

    public static void OooO00o(boolean z) {
        OooO00o(OooO0O0, z);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20408OooO00o() {
        return m20409OooO00o(OooO0O0, true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20407OooO00o(String str) {
        OooO00o(OooO00o, str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20405OooO00o() {
        return m20406OooO00o(OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20409OooO00o(String str, boolean z) {
        return OooO00o().getBoolean(str, z);
    }

    public static void OooO00o(String str, boolean z) {
        SharedPreferences.Editor edit = OooO00o().edit();
        edit.putBoolean(str, z);
        edit.commit();
    }

    public static void OooO00o(String str, long j) {
        SharedPreferences.Editor edit = OooO00o().edit();
        edit.putLong(str, j);
        edit.commit();
    }

    public static long OooO00o(String str) {
        return OooO00o().getLong(str, 0);
    }

    public static void OooO00o(String str, String str2) {
        SharedPreferences.Editor edit = OooO00o().edit();
        edit.putString(str, str2);
        edit.commit();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20406OooO00o(String str) {
        return OooO00o().getString(str, null);
    }

    public static SharedPreferences OooO00o() {
        Context OooO00o2 = C8769oo0ooOOO.OooO00o();
        return OooO00o2.getSharedPreferences("NIMSDK_RnLib_Config_" + C8769oo0ooOOO.m20404OooO00o(), 4);
    }
}
