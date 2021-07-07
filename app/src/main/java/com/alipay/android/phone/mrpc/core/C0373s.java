package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* renamed from: com.alipay.android.phone.mrpc.core.s */
public final class C0373s {

    /* renamed from: a */
    public static Boolean f849a;

    /* renamed from: a */
    public static final boolean m720a(Context context) {
        Boolean bool = f849a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0);
            f849a = valueOf;
            return valueOf.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
