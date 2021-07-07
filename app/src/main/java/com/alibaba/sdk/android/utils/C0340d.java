package com.alibaba.sdk.android.utils;

import android.util.Log;

/* renamed from: com.alibaba.sdk.android.utils.d */
public class C0340d {

    /* renamed from: c */
    public static boolean f768c;

    /* renamed from: a */
    public static void m631a(String str, String str2) {
        boolean z = f768c;
    }

    /* renamed from: b */
    public static void m633b(String str, String str2) {
        if (f768c) {
            Log.i(str, str2);
        }
    }

    /* renamed from: c */
    public static boolean m635c() {
        return f768c;
    }

    public static void setLogEnabled(boolean z) {
        f768c = z;
    }

    /* renamed from: a */
    public static void m632a(String str, Throwable th) {
        if (f768c && th != null) {
            th.toString();
        }
    }

    /* renamed from: c */
    public static void m634c(String str, String str2) {
        boolean z = f768c;
    }
}
