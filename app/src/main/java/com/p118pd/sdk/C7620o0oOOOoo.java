package com.p118pd.sdk;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.pd.sdk.o0oOOOoo  reason: case insensitive filesystem */
public class C7620o0oOOOoo {
    public static final String OooO00o = "alipaysdk";

    public static String OooO00o(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return String.format("[%s][%s]", str, str2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m19256OooO00o(String str, String str2) {
    }

    public static void OooO00o(String str, String str2, Throwable th) {
    }

    public static void OooO00o(String str, Throwable th) {
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m19257OooO00o(Throwable th) {
        if (th == null) {
        }
    }

    public static void OooO0O0(String str, String str2) {
    }

    public static void OooO0OO(String str, String str2) {
    }

    public static void OooO0Oo(String str, String str2) {
    }

    public static void OooO0o0(String str, String str2) {
    }

    public static String OooO00o(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
