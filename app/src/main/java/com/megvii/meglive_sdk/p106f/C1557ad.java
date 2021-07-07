package com.megvii.meglive_sdk.p106f;

import android.content.Context;
import com.megvii.meglive_sdk.volley.AbstractC1628m;
import com.megvii.meglive_sdk.volley.C1620e;
import com.megvii.meglive_sdk.volley.C1630n;
import com.megvii.meglive_sdk.volley.toolbox.C1653k;

/* renamed from: com.megvii.meglive_sdk.f.ad */
public final class C1557ad {

    /* renamed from: a */
    public static C1557ad f2555a;

    /* renamed from: c */
    public static Context f2556c;

    /* renamed from: b */
    public C1630n f2557b = m2623a();

    public C1557ad(Context context) {
        f2556c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized C1557ad m2622a(Context context) {
        C1557ad adVar;
        synchronized (C1557ad.class) {
            if (f2555a == null) {
                f2555a = new C1557ad(context);
            }
            adVar = f2555a;
        }
        return adVar;
    }

    /* renamed from: a */
    private C1630n m2623a() {
        if (this.f2557b == null) {
            Context context = f2556c;
            if (context == null) {
                return null;
            }
            this.f2557b = C1653k.m2871a(context.getApplicationContext(), null);
        }
        return this.f2557b;
    }

    /* renamed from: a */
    public final <T> boolean mo17176a(AbstractC1628m<T> mVar) {
        if (m2623a() == null) {
            return false;
        }
        mVar.f2893n = new C1620e(2000, 0, 1.0f);
        m2623a().mo17357a(mVar);
        return true;
    }
}
