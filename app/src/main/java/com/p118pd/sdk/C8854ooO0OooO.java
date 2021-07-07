package com.p118pd.sdk;

import android.os.Build;

/* renamed from: com.pd.sdk.ooO0OooO  reason: case insensitive filesystem */
public class C8854ooO0OooO {
    @Deprecated
    public static boolean OooO00o() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Deprecated
    public static boolean OooO0O0() {
        return Build.VERSION.SDK_INT >= 25;
    }

    public static boolean OooO0OO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean OooO0Oo() {
        return Build.VERSION.CODENAME.startsWith("OMR") || OooO0o0();
    }

    public static boolean OooO0o0() {
        return Build.VERSION.CODENAME.equals("P");
    }
}
