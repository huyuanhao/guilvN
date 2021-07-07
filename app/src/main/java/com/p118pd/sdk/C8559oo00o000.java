package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.pd.sdk.oo00o000  reason: case insensitive filesystem */
public class C8559oo00o000 {
    public static SharedPreferences OooO00o(Context context) {
        return context.getSharedPreferences(m20212OooO00o(context), 0);
    }

    public static SharedPreferences OooO00o(Context context, String str) {
        return C8592oo0O00O0.OooO00o(context, str);
    }

    public static Object OooO00o(SharedPreferences sharedPreferences, String str, Object obj) {
        return C8592oo0O00O0.OooO00o(sharedPreferences, str, obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20212OooO00o(Context context) {
        return "hianalytics_log_" + context.getPackageName();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20213OooO00o(SharedPreferences sharedPreferences, String str, Object obj) {
        C8592oo0O00O0.m20238OooO00o(sharedPreferences, str, obj);
    }
}
