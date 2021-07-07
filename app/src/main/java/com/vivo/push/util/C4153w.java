package com.vivo.push.util;

import android.content.Context;

/* renamed from: com.vivo.push.util.w */
public final class C4153w extends C4131a {

    /* renamed from: b */
    public static C4153w f11133b;

    /* renamed from: b */
    public static synchronized C4153w m11245b() {
        C4153w wVar;
        synchronized (C4153w.class) {
            if (f11133b == null) {
                f11133b = new C4153w();
            }
            wVar = f11133b;
        }
        return wVar;
    }

    /* renamed from: a */
    public final void mo41205a(Context context) {
        if (this.f11086a == null) {
            this.f11086a = context;
            mo41180a(context, "com.vivo.push_preferences");
        }
    }
}
