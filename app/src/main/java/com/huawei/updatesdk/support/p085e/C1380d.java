package com.huawei.updatesdk.support.p085e;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.react.uimanager.ViewProps;

/* renamed from: com.huawei.updatesdk.support.e.d */
public final class C1380d {

    /* renamed from: a */
    public static String f1679a;

    /* renamed from: b */
    public static Resources f1680b;

    /* renamed from: a */
    public static int m2078a(Context context, String str) {
        return m2079a(context, str, "id");
    }

    /* renamed from: a */
    public static int m2079a(Context context, String str, String str2) {
        if (f1680b == null) {
            f1680b = context.getResources();
        }
        return f1680b.getIdentifier(str, str2, m2080a(context));
    }

    /* renamed from: a */
    public static String m2080a(Context context) {
        if (f1679a == null) {
            f1679a = context.getPackageName();
        }
        return f1679a;
    }

    /* renamed from: b */
    public static int m2081b(Context context, String str) {
        return m2079a(context, str, "string");
    }

    /* renamed from: c */
    public static int m2082c(Context context, String str) {
        return m2079a(context, str, "layout");
    }

    /* renamed from: d */
    public static int m2083d(Context context, String str) {
        return m2079a(context, str, "drawable");
    }

    /* renamed from: e */
    public static int m2084e(Context context, String str) {
        return m2079a(context, str, ViewProps.COLOR);
    }
}
