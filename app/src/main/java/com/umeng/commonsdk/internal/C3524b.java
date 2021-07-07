package com.umeng.commonsdk.internal;

import android.content.Context;

/* renamed from: com.umeng.commonsdk.internal.b */
public class C3524b {

    /* renamed from: b */
    public static C3524b f9045b;

    /* renamed from: a */
    public Context f9046a;

    /* renamed from: c */
    public C3525c f9047c;

    public C3524b(Context context) {
        this.f9046a = context;
        this.f9047c = new C3525c(context);
    }

    /* renamed from: a */
    public static synchronized C3524b m9071a(Context context) {
        C3524b bVar;
        synchronized (C3524b.class) {
            if (f9045b == null) {
                f9045b = new C3524b(context.getApplicationContext());
            }
            bVar = f9045b;
        }
        return bVar;
    }

    /* renamed from: a */
    public C3525c mo38849a() {
        return this.f9047c;
    }
}
