package com.p118pd.sdk;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: com.pd.sdk.o00OOO0  reason: case insensitive filesystem */
public final class C7092o00OOO0 {
    public static final int OooO00o = 8388608;
    public static final int OooO0O0 = 8388611;
    public static final int OooO0OO = 8388613;
    public static final int OooO0Oo = 8388615;

    public static void OooO00o(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    public static void OooO00o(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        } else {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2);
        }
    }

    public static void OooO00o(int i, Rect rect, Rect rect2, int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        } else {
            Gravity.applyDisplay(i, rect, rect2);
        }
    }

    public static int OooO00o(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }
}
