package com.umeng.commonsdk.proguard;

import android.content.Context;

/* renamed from: com.umeng.commonsdk.proguard.l */
public class C3613l {

    /* renamed from: a */
    public static boolean f9304a;

    /* renamed from: b */
    public static boolean f9305b;

    /* renamed from: c */
    public static C3614m f9306c;

    /* renamed from: a */
    public static void m9495a(Context context) {
        if (f9306c == null) {
            synchronized (C3613l.class) {
                if (f9306c == null) {
                    f9306c = new C3614m();
                }
            }
        }
        f9305b = f9306c.mo38993a(context);
        f9304a = true;
    }

    /* renamed from: b */
    public static String m9497b(Context context) {
        if (f9304a) {
            return f9306c.mo38992a(context, "OUID");
        }
        throw new RuntimeException("OpenID SDK Need Init First!");
    }

    /* renamed from: a */
    public static boolean m9496a() {
        if (f9304a) {
            return f9305b;
        }
        throw new RuntimeException("OpenID SDK Need Init First!");
    }
}
