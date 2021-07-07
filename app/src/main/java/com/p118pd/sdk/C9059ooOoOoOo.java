package com.p118pd.sdk;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.pd.sdk.ooOoOoOo  reason: case insensitive filesystem */
public final class C9059ooOoOoOo {
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22370OooO00o = "RootBeer";
    public static final int OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f22371OooO0O0 = "QLog";
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;
    public static final int OooO0o = 5;
    public static final int OooO0o0 = 4;
    public static int OooO0oO = 5;

    public static void OooO00o(Object obj, Throwable th) {
        if (OooO0O0()) {
            String str = OooO00o() + String.valueOf(obj);
            OooO00o(th);
            String str2 = OooO00o() + String.valueOf(obj);
            OooO00o(th);
        }
    }

    public static void OooO0O0(Object obj) {
        if (OooO0O0()) {
            String str = OooO00o() + String.valueOf(obj);
            String str2 = OooO00o() + String.valueOf(obj);
        }
    }

    public static void OooO0OO(Object obj) {
        if (OooO0OO()) {
            Log.i(f22370OooO00o, OooO00o() + String.valueOf(obj));
        }
    }

    public static void OooO0Oo(Object obj) {
        if (OooO0Oo()) {
            String str = OooO00o() + String.valueOf(obj);
        }
    }

    public static void OooO0o0(Object obj) {
        if (OooO0o0()) {
            String str = OooO00o() + String.valueOf(obj);
            String str2 = OooO00o() + String.valueOf(obj);
        }
    }

    public static boolean OooO0OO() {
        return OooO0oO > 2;
    }

    public static boolean OooO0Oo() {
        return OooO0oO > 4;
    }

    public static void OooO0O0(Object obj, Throwable th) {
        if (OooO0o0()) {
            String str = OooO00o() + String.valueOf(obj);
            OooO00o(th);
            String str2 = OooO00o() + String.valueOf(obj);
            OooO00o(th);
        }
    }

    public static boolean OooO0o0() {
        return OooO0oO > 1;
    }

    public static void OooO00o(Exception exc) {
        if (OooO0O0()) {
            exc.printStackTrace();
        }
    }

    public static void OooO00o(Object obj) {
        if (m20728OooO00o()) {
            String str = OooO00o() + String.valueOf(obj);
        }
    }

    public static boolean OooO0O0() {
        return OooO0oO > 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20728OooO00o() {
        return OooO0oO > 3;
    }

    public static String OooO00o(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String OooO00o() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        String substring = className.substring(className.lastIndexOf(46) + 1);
        return substring + ": " + methodName + "() [" + lineNumber + "] - ";
    }
}
