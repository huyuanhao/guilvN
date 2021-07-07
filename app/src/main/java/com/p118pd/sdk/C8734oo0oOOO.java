package com.p118pd.sdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.learnium.RNDeviceInfo.SystemBarTintManager;

/* renamed from: com.pd.sdk.oo0oOOO  reason: case insensitive filesystem */
public class C8734oo0oOOO {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static DisplayMetrics m20349OooO00o(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static float OooO0O0(Context context) {
        return (float) m20349OooO00o(context).densityDpi;
    }

    public static float OooO0OO(Context context) {
        return m20349OooO00o(context).scaledDensity;
    }

    public static float OooO0Oo(Context context) {
        return (float) m20349OooO00o(context).heightPixels;
    }

    public static float OooO0o0(Context context) {
        return (float) m20349OooO00o(context).widthPixels;
    }

    public static int OooO0O0(Context context, float f) {
        return (int) ((f / OooO00o(context)) + 0.5f);
    }

    public static int OooO0OO(Context context, float f) {
        return (int) ((f / OooO0OO(context)) + 0.5f);
    }

    public static int OooO0Oo(Context context, float f) {
        return (int) ((f * OooO0OO(context)) + 0.5f);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m20348OooO00o(Context context) {
        int identifier = context.getResources().getIdentifier(SystemBarTintManager.SystemBarConfig.STATUS_BAR_HEIGHT_RES_NAME, "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static float OooO00o(Context context) {
        return m20349OooO00o(context).density;
    }

    public static int OooO00o(Context context, float f) {
        return (int) ((f * OooO00o(context)) + 0.5f);
    }
}
