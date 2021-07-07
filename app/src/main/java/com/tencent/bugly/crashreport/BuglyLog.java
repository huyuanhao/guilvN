package com.tencent.bugly.crashreport;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.C3216b;
import com.tencent.bugly.proguard.C3322ao;

public class BuglyLog {
    /* renamed from: d */
    public static void m7897d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z = C3216b.f7324c;
        C3322ao.m8363a("D", str, str2);
    }

    /* renamed from: e */
    public static void m7898e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z = C3216b.f7324c;
        C3322ao.m8363a(ExifInterface.o000oo00, str, str2);
    }

    /* renamed from: i */
    public static void m7900i(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C3216b.f7324c) {
            Log.i(str, str2);
        }
        C3322ao.m8363a("I", str, str2);
    }

    public static void setCache(int i) {
        C3322ao.m8361a(i);
    }

    /* renamed from: v */
    public static void m7901v(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z = C3216b.f7324c;
        C3322ao.m8363a(ExifInterface.o000oo0o, str, str2);
    }

    /* renamed from: w */
    public static void m7902w(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z = C3216b.f7324c;
        C3322ao.m8363a(ExifInterface.o000oo0, str, str2);
    }

    /* renamed from: e */
    public static void m7899e(String str, String str2, Throwable th) {
        if (str == null) {
            str = "";
        }
        boolean z = C3216b.f7324c;
        C3322ao.m8364a(ExifInterface.o000oo00, str, th);
    }
}
