package com.p118pd.sdk;

import android.os.Build;

/* renamed from: com.pd.sdk.o00O0O0O  reason: case insensitive filesystem */
public class C7055o00O0O0O {
    @Deprecated
    public static boolean OooO00o() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Deprecated
    public static boolean OooO0O0() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @Deprecated
    public static boolean OooO0OO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Deprecated
    public static boolean OooO0Oo() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public static boolean OooO0o() {
        if (Build.VERSION.CODENAME.length() != 1 || Build.VERSION.CODENAME.charAt(0) < 'Q' || Build.VERSION.CODENAME.charAt(0) > 'Z') {
            return false;
        }
        return true;
    }

    @Deprecated
    public static boolean OooO0o0() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
