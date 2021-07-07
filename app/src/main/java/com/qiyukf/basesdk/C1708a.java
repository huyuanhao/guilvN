package com.qiyukf.basesdk;

import android.content.Context;
import com.qiyukf.basesdk.sdk.ServerAddresses;

/* renamed from: com.qiyukf.basesdk.a */
public final class C1708a {

    /* renamed from: a */
    public static Context f3079a;

    /* renamed from: b */
    public static AbstractC1717b f3080b;

    /* renamed from: a */
    public static Context m3001a() {
        return f3079a;
    }

    /* renamed from: a */
    public static void m3002a(Context context, AbstractC1717b bVar) {
        f3079a = context.getApplicationContext();
        f3080b = bVar;
    }

    /* renamed from: b */
    public static String m3003b() {
        return f3080b.mo33870a();
    }

    /* renamed from: c */
    public static int m3004c() {
        return f3080b.mo33871b();
    }

    /* renamed from: d */
    public static ServerAddresses m3005d() {
        return f3080b.mo33872c();
    }

    /* renamed from: e */
    public static String m3006e() {
        return f3080b.mo33873d();
    }

    /* renamed from: f */
    public static String m3007f() {
        return f3080b.mo33874e();
    }

    /* renamed from: g */
    public static void m3008g() {
        f3080b.mo33875f();
    }
}
