package com.xiaomi.push;

import android.content.Context;

/* renamed from: com.xiaomi.push.m */
public class C4564m {
    /* renamed from: a */
    public static boolean m13732a(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
