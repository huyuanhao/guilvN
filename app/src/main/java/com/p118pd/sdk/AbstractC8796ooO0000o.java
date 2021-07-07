package com.p118pd.sdk;

import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8784oo0oooo;

/* renamed from: com.pd.sdk.ooO0000o  reason: case insensitive filesystem */
public abstract class AbstractC8796ooO0000o {
    public static AbstractC8784oo0oooo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f22006OooO00o;

    public static String OooO00o(String str) {
        return str;
    }

    public static void OooO00o(AbstractC8784oo0oooo oo0oooo, String str, String str2, String str3, int i, int i2, int i3, boolean z, AbstractC8784oo0oooo.AbstractC8786OooO0o0 oooO0o0) {
        OooO00o = oo0oooo;
        f22006OooO00o = str;
        oo0oooo.OooO00o(str2, str3, i, i2, i3, z, oooO0o0);
    }

    public static void OooO0O0() {
        AbstractC8784oo0oooo oo0oooo = OooO00o;
        if (oo0oooo != null) {
            oo0oooo.OooO0Oo();
        }
    }

    public static void OooO0OO(String str, String str2) {
        OooO00o().OooO0OO(OooO0O0(str), OooO00o(str2));
    }

    public static void OooO0Oo(String str, String str2) {
        OooO00o.OooO0Oo(OooO0O0(str), OooO00o(str2));
    }

    public static void OooO0o0(String str, String str2) {
        OooO00o().OooO0o0(OooO0O0(str), OooO00o(str2));
    }

    public static void OooO0OO(String str, String str2, Throwable th) {
        OooO00o().OooO0OO(OooO0O0(str), OooO00o(str2), th);
    }

    public static void OooO0Oo(String str, String str2, Throwable th) {
        OooO00o().OooO0Oo(OooO0O0(str), OooO00o(str2), th);
    }

    public static void OooO0o0(String str, String str2, Throwable th) {
        OooO00o().OooO0o0(OooO0O0(str), OooO00o(str2), th);
    }

    public static void OooO0O0(String str, String str2) {
        OooO00o().OooO0O0(OooO0O0(str), OooO00o(str2));
    }

    public static void OooO0OO(String str) {
        OooO00o().OooO0OO(OooO0O0(C8783oo0oooOO.OooO0OO), OooO00o(str));
    }

    public static AbstractC8784oo0oooo OooO00o() {
        if (OooO00o == null) {
            m20435OooO00o();
        }
        return OooO00o;
    }

    public static void OooO0O0(String str, String str2, Throwable th) {
        OooO00o().OooO0O0(OooO0O0(str), OooO00o(str2), th);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m20437OooO0O0(String str) {
        OooO00o().OooO00o(OooO0O0(C7383o0OOO0O.OooOOO0), OooO00o(str));
    }

    public static String OooO0O0(String str) {
        if (TextUtils.isEmpty(f22006OooO00o)) {
            return str;
        }
        return "[" + f22006OooO00o + "]" + str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20435OooO00o() {
        OooO00o(new C1701oo(), null, null, null, 3, 0, 0, false, null);
    }

    public static void OooO00o(String str, String str2) {
        OooO00o().OooO00o(OooO0O0(str), OooO00o(str2));
    }

    public static void OooO00o(String str, String str2, Throwable th) {
        OooO00o().OooO00o(OooO0O0(str), OooO00o(str2), th);
    }

    public static void OooO00o(String str, Throwable th) {
        OooO00o().OooO0o0(OooO0O0(str), OooO00o(""), th);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20436OooO00o(String str) {
        OooO00o().OooO0OO(OooO0O0("core"), OooO00o(str));
    }
}
