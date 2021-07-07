package com.umeng.message.proguard;

import android.content.Context;

/* renamed from: com.umeng.message.proguard.j */
public class C3846j {

    /* renamed from: a */
    public static float f10375a = 1.0f;

    /* renamed from: a */
    public static void m10572a(Context context) {
        f10375a = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    public static int m10573b(Context context, float f) {
        m10572a(context);
        return (int) ((f / f10375a) + 0.5f);
    }

    /* renamed from: c */
    public static int m10574c(Context context, float f) {
        m10572a(context);
        return (int) ((f * f10375a) + 0.5f);
    }

    /* renamed from: d */
    public static int m10575d(Context context, float f) {
        m10572a(context);
        return (int) ((f / f10375a) + 0.5f);
    }

    /* renamed from: a */
    public static int m10571a(Context context, float f) {
        m10572a(context);
        return (int) ((f * f10375a) + 0.5f);
    }
}
