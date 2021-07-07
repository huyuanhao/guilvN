package com.p118pd.sdk;

import android.content.Context;
import android.os.Build;

/* renamed from: com.pd.sdk.ooO0oOoo  reason: case insensitive filesystem */
public class C8880ooO0oOoo {
    public static boolean OooO00o(Context context) {
        return Build.VERSION.SDK_INT >= 26 && context.getApplicationInfo().targetSdkVersion >= 26;
    }

    public static boolean OooO0O0() {
        return OooO00o(24);
    }

    public static boolean OooO0OO() {
        return OooO00o(26);
    }

    public static boolean OooO0O0(int i) {
        return Build.VERSION.SDK_INT > i;
    }

    public static boolean OooO00o() {
        return OooO00o(23);
    }

    public static boolean OooO00o(int i) {
        return Build.VERSION.SDK_INT >= i;
    }
}
