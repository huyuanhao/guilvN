package com.megvii.meglive_sdk.p106f;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: com.megvii.meglive_sdk.f.w */
public final class C1582w {

    /* renamed from: a */
    public static float f2632a = 0.15f;

    /* renamed from: b */
    public static int f2633b;

    /* renamed from: c */
    public static int f2634c;

    /* renamed from: d */
    public static int f2635d;

    /* renamed from: e */
    public static int f2636e;

    /* renamed from: f */
    public static int f2637f;

    /* renamed from: g */
    public static float f2638g;

    /* renamed from: h */
    public static float f2639h;

    /* renamed from: i */
    public static float f2640i;

    /* renamed from: j */
    public static float f2641j;

    /* renamed from: k */
    public static float f2642k;

    /* renamed from: l */
    public static float f2643l;

    /* renamed from: m */
    public static float f2644m;

    /* renamed from: n */
    public static float f2645n;

    /* renamed from: o */
    public static float f2646o;

    /* renamed from: a */
    public static void m2688a(Context context) {
        if (f2640i == 0.0f || f2641j == 0.0f || f2636e == 0 || f2637f == 0 || f2639h == 0.0f) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics2);
            f2636e = displayMetrics2.widthPixels;
            f2637f = displayMetrics2.heightPixels;
            float f = displayMetrics.density;
            f2639h = f;
            f2633b = (int) (f * 35.0f);
            C1571m.m2655a("screen", "mNotificationBarHeight =" + f2633b);
            C1571m.m2655a("screen", "mWidth =" + f2636e);
            C1571m.m2655a("screen", "mHeight =" + f2637f);
            f2634c = displayMetrics.widthPixels;
            f2635d = displayMetrics.heightPixels;
            C1571m.m2655a("screen", "mScreenWidth =" + f2634c);
            C1571m.m2655a("screen", "mScreenHeight =" + f2635d);
            f2638g = (float) displayMetrics.densityDpi;
            float f2 = f2639h;
            float f3 = f2 * 30.0f;
            f2642k = f3;
            float f4 = 30.0f * f2;
            f2643l = f4;
            float f5 = 50.0f * f2;
            f2644m = f5;
            float f6 = f2 * 40.0f;
            f2645n = f6;
            f2640i = (((float) f2636e) - f3) - f4;
            f2641j = (((float) f2637f) - f5) - f6;
        }
    }

    /* renamed from: a */
    public static int m2687a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
