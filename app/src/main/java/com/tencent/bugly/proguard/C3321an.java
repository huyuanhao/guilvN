package com.tencent.bugly.proguard;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.tencent.bugly.proguard.an */
public class C3321an {

    /* renamed from: a */
    public static String f8050a = "CrashReportInfo";

    /* renamed from: b */
    public static String f8051b = "CrashReport";

    /* renamed from: c */
    public static boolean f8052c;

    /* renamed from: a */
    public static boolean m8346a(int i, String str, Object... objArr) {
        if (!f8052c) {
            return false;
        }
        String f = m8358f(str, objArr);
        if (i != 0) {
            if (!(i == 1 || i == 2 || i == 3)) {
                if (i != 5) {
                    return false;
                }
                Log.i(f8050a, f);
            }
            return true;
        }
        Log.i(f8051b, f);
        return true;
    }

    /* renamed from: b */
    public static boolean m8352b(String str, Object... objArr) {
        return m8346a(5, str, objArr);
    }

    /* renamed from: c */
    public static boolean m8355c(String str, Object... objArr) {
        return m8346a(1, str, objArr);
    }

    /* renamed from: d */
    public static boolean m8356d(String str, Object... objArr) {
        return m8346a(2, str, objArr);
    }

    /* renamed from: e */
    public static boolean m8357e(String str, Object... objArr) {
        return m8346a(3, str, objArr);
    }

    /* renamed from: f */
    public static String m8358f(String str, Object... objArr) {
        if (str == null) {
            return "null";
        }
        return (objArr == null || objArr.length == 0) ? str : String.format(Locale.US, str, objArr);
    }

    /* renamed from: b */
    public static boolean m8351b(Class cls, String str, Object... objArr) {
        return m8346a(1, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    /* renamed from: c */
    public static boolean m8354c(Class cls, String str, Object... objArr) {
        return m8346a(3, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    /* renamed from: b */
    public static boolean m8353b(Throwable th) {
        return m8347a(3, th);
    }

    /* renamed from: a */
    public static boolean m8347a(int i, Throwable th) {
        if (!f8052c) {
            return false;
        }
        return m8346a(i, C3325ap.m8391a(th), new Object[0]);
    }

    /* renamed from: a */
    public static boolean m8349a(String str, Object... objArr) {
        return m8346a(0, str, objArr);
    }

    /* renamed from: a */
    public static boolean m8348a(Class cls, String str, Object... objArr) {
        return m8346a(0, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    /* renamed from: a */
    public static boolean m8350a(Throwable th) {
        return m8347a(2, th);
    }
}
