package com.megvii.meglive_sdk.p106f;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;

/* renamed from: com.megvii.meglive_sdk.f.u */
public final class C1580u {

    /* renamed from: a */
    public static C1580u f2620a;

    /* renamed from: b */
    public static String f2621b;

    /* renamed from: c */
    public static Class<?> f2622c;

    /* renamed from: d */
    public static Class<?> f2623d;

    /* renamed from: e */
    public static Class<?> f2624e;

    /* renamed from: f */
    public static Class<?> f2625f;

    /* renamed from: g */
    public static Class<?> f2626g;

    /* renamed from: h */
    public static Class<?> f2627h;

    /* renamed from: i */
    public static Class<?> f2628i;

    /* renamed from: j */
    public static Class<?> f2629j;

    /* renamed from: k */
    public static Class<?> f2630k;

    /* renamed from: l */
    public Context f2631l;

    public C1580u(Context context) {
        this.f2631l = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C1580u m2676a(Context context) {
        if (f2620a == null) {
            String str = f2621b;
            if (str == null) {
                str = context.getPackageName();
            }
            f2621b = str;
            f2620a = new C1580u(context);
        }
        return f2620a;
    }

    /* renamed from: b */
    public final int mo17199b(String str) {
        return this.f2631l.getResources().getIdentifier(str, "string", f2621b);
    }

    /* renamed from: c */
    public final int mo17200c(String str) {
        return this.f2631l.getResources().getIdentifier(str, "raw", f2621b);
    }

    /* renamed from: d */
    public final int mo17201d(String str) {
        return this.f2631l.getResources().getIdentifier(str, "mipmap", f2621b);
    }

    /* renamed from: e */
    public final int mo17202e(String str) {
        return this.f2631l.getResources().getIdentifier(str, ViewProps.COLOR, f2621b);
    }

    /* renamed from: f */
    public final int mo17203f(String str) {
        return this.f2631l.getResources().getIdentifier(str, "dimen", f2621b);
    }

    /* renamed from: a */
    public final int mo17198a(String str) {
        return this.f2631l.getResources().getIdentifier(str, "drawable", f2621b);
    }
}
