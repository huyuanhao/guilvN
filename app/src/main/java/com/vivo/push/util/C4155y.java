package com.vivo.push.util;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.vivo.push.util.y */
public final class C4155y implements AbstractC4133c {

    /* renamed from: a */
    public static final HashMap<String, Integer> f11137a = new HashMap<>();

    /* renamed from: b */
    public static final HashMap<String, Long> f11138b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, String> f11139c = new HashMap<>();

    /* renamed from: d */
    public static C4155y f11140d;

    /* renamed from: e */
    public Context f11141e;

    /* renamed from: f */
    public AbstractC4133c f11142f;

    /* renamed from: g */
    public boolean f11143g = false;

    public C4155y(Context context) {
        this.f11141e = context;
        this.f11143g = mo41188a(context);
        C4146p.m11216d("SystemCache", "init status is " + this.f11143g + ";  curCache is " + this.f11142f);
    }

    /* renamed from: b */
    public static synchronized C4155y m11251b(Context context) {
        C4155y yVar;
        synchronized (C4155y.class) {
            if (f11140d == null) {
                f11140d = new C4155y(context.getApplicationContext());
            }
            yVar = f11140d;
        }
        return yVar;
    }

    /* renamed from: a */
    public final void mo41207a() {
        C4154x xVar = new C4154x();
        if (xVar.mo41188a(this.f11141e)) {
            xVar.mo41206a();
            C4146p.m11216d("SystemCache", "sp cache is cleared");
        }
    }

    @Override // com.vivo.push.util.AbstractC4133c
    /* renamed from: b */
    public final void mo41189b(String str, String str2) {
        AbstractC4133c cVar;
        f11139c.put(str, str2);
        if (this.f11143g && (cVar = this.f11142f) != null) {
            cVar.mo41189b(str, str2);
        }
    }

    @Override // com.vivo.push.util.AbstractC4133c
    /* renamed from: a */
    public final boolean mo41188a(Context context) {
        C4152v vVar = new C4152v();
        this.f11142f = vVar;
        boolean a = vVar.mo41188a(context);
        if (!a) {
            C4151u uVar = new C4151u();
            this.f11142f = uVar;
            a = uVar.mo41188a(context);
        }
        if (!a) {
            C4154x xVar = new C4154x();
            this.f11142f = xVar;
            a = xVar.mo41188a(context);
        }
        if (!a) {
            this.f11142f = null;
        }
        return a;
    }

    @Override // com.vivo.push.util.AbstractC4133c
    /* renamed from: a */
    public final String mo41187a(String str, String str2) {
        AbstractC4133c cVar;
        String str3 = f11139c.get(str);
        return (str3 != null || (cVar = this.f11142f) == null) ? str3 : cVar.mo41187a(str, str2);
    }
}
