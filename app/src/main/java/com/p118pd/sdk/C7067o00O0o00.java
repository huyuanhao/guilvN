package com.p118pd.sdk;

import android.os.Build;
import android.os.Trace;

/* renamed from: com.pd.sdk.o00O0o00  reason: case insensitive filesystem */
public final class C7067o00O0o00 {
    public static void OooO00o(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void OooO00o() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
