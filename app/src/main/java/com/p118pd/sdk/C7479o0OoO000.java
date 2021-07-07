package com.p118pd.sdk;

import com.alipay.sdk.app.EnumC0405k;

/* renamed from: com.pd.sdk.o0OoO000  reason: case insensitive filesystem */
public class C7479o0OoO000 {
    public static String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f20301OooO00o;

    public static void OooO00o(String str) {
        OooO00o = str;
    }

    public static String OooO0O0() {
        EnumC0405k b = EnumC0405k.m832b(EnumC0405k.CANCELED.mo4240a());
        return OooO00o(b.mo4240a(), b.mo4243b(), "");
    }

    public static String OooO0OO() {
        EnumC0405k b = EnumC0405k.m832b(EnumC0405k.DOUBLE_REQUEST.mo4240a());
        return OooO00o(b.mo4240a(), b.mo4243b(), "");
    }

    public static String OooO0Oo() {
        EnumC0405k b = EnumC0405k.m832b(EnumC0405k.PARAMS_ERROR.mo4240a());
        return OooO00o(b.mo4240a(), b.mo4243b(), "");
    }

    public static String OooO00o() {
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19107OooO00o() {
        return f20301OooO00o;
    }

    public static void OooO00o(boolean z) {
        f20301OooO00o = z;
    }

    public static String OooO00o(int i, String str, String str2) {
        return "resultStatus={" + i + "};memo={" + str + "};result={" + str2 + C7522o0Ooo0o.OooO0Oo;
    }
}
