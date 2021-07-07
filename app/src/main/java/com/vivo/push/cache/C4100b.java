package com.vivo.push.cache;

import android.content.Context;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4156z;
import java.lang.reflect.Method;

/* renamed from: com.vivo.push.cache.b */
public final class C4100b {

    /* renamed from: a */
    public static final Object f10999a = new Object();

    /* renamed from: b */
    public static volatile C4100b f11000b;

    /* renamed from: c */
    public AbstractC4103e f11001c;

    /* renamed from: a */
    public static C4100b m11057a() {
        if (f11000b == null) {
            synchronized (f10999a) {
                if (f11000b == null) {
                    f11000b = new C4100b();
                }
            }
        }
        return f11000b;
    }

    /* renamed from: a */
    public final AbstractC4103e mo40990a(Context context) {
        AbstractC4103e eVar = this.f11001c;
        if (eVar != null) {
            return eVar;
        }
        try {
            String str = C4156z.m11262a(context) ? "com.vivo.push.cache.ServerConfigManagerImpl" : "com.vivo.push.cache.ClientConfigManagerImpl";
            Method method = Class.forName(str).getMethod("getInstance", Context.class);
            C4146p.m11216d("ConfigManagerFactory", "createConfig success is " + str);
            AbstractC4103e eVar2 = (AbstractC4103e) method.invoke(null, context);
            this.f11001c = eVar2;
            return eVar2;
        } catch (Exception e) {
            e.printStackTrace();
            C4146p.m11212b("ConfigManagerFactory", "createConfig error", e);
            return null;
        }
    }
}
