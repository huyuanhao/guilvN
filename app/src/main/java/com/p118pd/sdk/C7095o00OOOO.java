package com.p118pd.sdk;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: com.pd.sdk.o00OOOO  reason: case insensitive filesystem */
public final class C7095o00OOOO {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18371OooO00o(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.isMarginRelative();
        }
        return false;
    }

    public static int OooO0O0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    public static int OooO0OO(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }

    public static void OooO0Oo(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i);
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }

    public static int OooO00o(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getLayoutDirection() : 0;
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    public static void OooO0O0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setLayoutDirection(i);
        }
    }

    public static void OooO0OO(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }

    public static void OooO00o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.resolveLayoutDirection(i);
        }
    }
}
