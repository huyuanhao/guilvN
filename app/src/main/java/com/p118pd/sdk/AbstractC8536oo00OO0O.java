package com.p118pd.sdk;

import android.content.Context;

/* renamed from: com.pd.sdk.oo00OO0O  reason: case insensitive filesystem */
public abstract class AbstractC8536oo00OO0O {
    public static C8537oo00OO0o OooO00o = new C8537oo00OO0o();

    public static String OooO00o() {
        return "HiAnalytics-2.1.4.301";
    }

    public static void OooO00o(Context context, int i, String str) {
        OooO00o.OooO00o(context, i, str);
        OooO00o.OooO00o(str, '\n' + "============================================================================" + '\n' + "====== " + OooO00o() + "" + '\n' + "============================================================================");
    }

    public static void OooO00o(String str, String str2) {
        OooO00o.m20205OooO00o(3, str, str2);
    }

    public static void OooO00o(String str, String str2, Object... objArr) {
        if (m20204OooO00o() && str2 != null) {
            OooO00o(str, String.format(str2, objArr));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20204OooO00o() {
        return OooO00o.OooO00o(3);
    }

    public static void OooO0O0(String str, String str2) {
        OooO00o.m20205OooO00o(4, str, str2);
    }

    public static void OooO0O0(String str, String str2, Object... objArr) {
        if (OooO0O0() && str2 != null) {
            OooO0O0(str, String.format(str2, objArr));
        }
    }

    public static boolean OooO0O0() {
        return OooO00o.OooO00o(4);
    }

    public static void OooO0OO(String str, String str2) {
        OooO00o.m20205OooO00o(5, str, str2);
    }

    public static void OooO0OO(String str, String str2, Object... objArr) {
        if (OooO0OO() && str2 != null) {
            String format = String.format(str2, objArr);
            OooO0OO("HiAnalytics_" + str, format);
        }
    }

    public static boolean OooO0OO() {
        return OooO00o.OooO00o(5);
    }

    public static void OooO0Oo(String str, String str2) {
        OooO00o.m20205OooO00o(6, str, str2);
    }
}
