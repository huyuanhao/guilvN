package com.p118pd.sdk;

import android.os.Build;
import android.view.ScaleGestureDetector;

/* renamed from: com.pd.sdk.o00Oo00o  reason: case insensitive filesystem */
public final class C7108o00Oo00o {
    @Deprecated
    public static void OooO00o(Object obj, boolean z) {
        OooO00o((ScaleGestureDetector) obj, z);
    }

    public static void OooO00o(ScaleGestureDetector scaleGestureDetector, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }
    }

    @Deprecated
    public static boolean OooO00o(Object obj) {
        return OooO00o((ScaleGestureDetector) obj);
    }

    public static boolean OooO00o(ScaleGestureDetector scaleGestureDetector) {
        if (Build.VERSION.SDK_INT >= 19) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }
        return false;
    }
}
