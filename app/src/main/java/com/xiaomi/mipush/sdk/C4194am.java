package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.mipush.sdk.am */
public class C4194am {

    /* renamed from: a */
    public static volatile C4194am f11226a;

    /* renamed from: a */
    public Context f11227a;

    /* renamed from: a */
    public List<C4241z> f11228a = new ArrayList();

    public C4194am(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f11227a = applicationContext;
        if (applicationContext == null) {
            this.f11227a = context;
        }
    }

    /* renamed from: a */
    public static C4194am m11405a(Context context) {
        if (f11226a == null) {
            synchronized (C4194am.class) {
                if (f11226a == null) {
                    f11226a = new C4194am(context);
                }
            }
        }
        return f11226a;
    }

    /* renamed from: a */
    public int mo41386a(String str) {
        synchronized (this.f11228a) {
            C4241z zVar = new C4241z();
            zVar.f11336a = str;
            if (this.f11228a.contains(zVar)) {
                for (C4241z zVar2 : this.f11228a) {
                    if (zVar2.equals(zVar)) {
                        return zVar2.f11335a;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    public synchronized String mo41387a(EnumC4212bb bbVar) {
        return this.f11227a.getSharedPreferences("mipush_extra", 0).getString(bbVar.name(), "");
    }

    /* renamed from: a */
    public synchronized void mo41388a(EnumC4212bb bbVar, String str) {
        SharedPreferences sharedPreferences = this.f11227a.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(bbVar.name(), str).commit();
    }

    /* renamed from: a */
    public void m11409a(String str) {
        synchronized (this.f11228a) {
            C4241z zVar = new C4241z();
            zVar.f11335a = 0;
            zVar.f11336a = str;
            if (this.f11228a.contains(zVar)) {
                this.f11228a.remove(zVar);
            }
            this.f11228a.add(zVar);
        }
    }

    /* renamed from: a */
    public boolean m11410a(String str) {
        synchronized (this.f11228a) {
            C4241z zVar = new C4241z();
            zVar.f11336a = str;
            return this.f11228a.contains(zVar);
        }
    }

    /* renamed from: b */
    public void mo41389b(String str) {
        synchronized (this.f11228a) {
            C4241z zVar = new C4241z();
            zVar.f11336a = str;
            if (this.f11228a.contains(zVar)) {
                Iterator<C4241z> it = this.f11228a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C4241z next = it.next();
                    if (zVar.equals(next)) {
                        zVar = next;
                        break;
                    }
                }
            }
            zVar.f11335a++;
            this.f11228a.remove(zVar);
            this.f11228a.add(zVar);
        }
    }

    /* renamed from: c */
    public void mo41390c(String str) {
        synchronized (this.f11228a) {
            C4241z zVar = new C4241z();
            zVar.f11336a = str;
            if (this.f11228a.contains(zVar)) {
                this.f11228a.remove(zVar);
            }
        }
    }
}
