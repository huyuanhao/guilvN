package com.huawei.hms.p037c;

import android.content.Context;

/* renamed from: com.huawei.hms.c.h */
public abstract class AbstractC1139h {

    /* renamed from: a */
    public static Context f1177a;

    /* renamed from: b */
    public static String f1178b;

    /* renamed from: a */
    public static Context m1081a() {
        return f1177a;
    }

    /* renamed from: b */
    public static int m1084b(String str) {
        return f1177a.getResources().getIdentifier(str, "id", f1178b);
    }

    /* renamed from: c */
    public static int m1085c(String str) {
        return f1177a.getResources().getIdentifier(str, "string", f1178b);
    }

    /* renamed from: d */
    public static String m1086d(String str) {
        String string = f1177a.getResources().getString(m1085c(str));
        return string == null ? "" : string;
    }

    /* renamed from: a */
    public static void m1083a(Context context) {
        f1177a = context;
        f1178b = context.getPackageName();
    }

    /* renamed from: a */
    public static int m1080a(String str) {
        return f1177a.getResources().getIdentifier(str, "layout", f1178b);
    }

    /* renamed from: a */
    public static String m1082a(String str, Object... objArr) {
        String string = f1177a.getResources().getString(m1085c(str), objArr);
        return string == null ? "" : string;
    }
}
