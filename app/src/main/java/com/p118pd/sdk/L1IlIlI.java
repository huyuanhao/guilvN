package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;

/* renamed from: com.pd.sdk.L丨1IlIlI  reason: invalid class name */
public class L1IlIlI {
    public static final int OooO00o = 16;

    public static void OooO00o(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            OooO0O0(view, runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }

    @TargetApi(5)
    public static int OooO0O0(int i) {
        return (i & 65280) >> 8;
    }

    @TargetApi(16)
    public static void OooO0O0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @TargetApi(11)
    public static int OooO0OO(int i) {
        return (i & 65280) >> 8;
    }

    public static int OooO00o(int i) {
        if (Build.VERSION.SDK_INT >= 11) {
            return OooO0OO(i);
        }
        return OooO0O0(i);
    }
}
