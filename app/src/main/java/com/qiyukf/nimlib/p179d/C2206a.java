package com.qiyukf.nimlib.p179d;

import android.os.Handler;
import android.util.SparseArray;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.nimlib.p179d.C2218i;

/* renamed from: com.qiyukf.nimlib.d.a */
public final class C2206a {

    /* renamed from: e */
    public static C2206a f4397e;

    /* renamed from: a */
    public final SparseArray<C2225k> f4398a = new SparseArray<>();

    /* renamed from: b */
    public final C2210c f4399b;

    /* renamed from: c */
    public final C2222j f4400c;

    /* renamed from: d */
    public final Handler f4401d;

    public C2206a() {
        Handler b = C1805a.m3404b();
        this.f4401d = b;
        this.f4399b = new C2210c(b);
        this.f4400c = new C2222j();
    }

    /* renamed from: a */
    public static Object m4588a(C2218i iVar) {
        m4591b();
        return f4397e.m4594d(iVar);
    }

    /* renamed from: a */
    public static void m4589a() {
        f4397e = new C2206a();
    }

    /* renamed from: a */
    public static void m4590a(String str, Object obj) {
        m4591b();
        final C2218i iVar = new C2218i();
        iVar.f4416a.f4422a = str;
        iVar.mo34828a(new Object[]{obj});
        C2206a aVar = f4397e;
        C1709a.m3011a("InvocationMgr", "on notify: " + iVar);
        aVar.f4401d.post(new Runnable() {
            /* class com.qiyukf.nimlib.p179d.C2206a.RunnableC22082 */

            public final void run() {
                C2206a.this.f4399b.mo34819b(iVar);
            }
        });
    }

    /* renamed from: b */
    public static void m4591b() {
        if (f4397e == null) {
            throw new IllegalStateException("SDK not inited!");
        }
    }

    /* renamed from: b */
    public static boolean m4592b(C2218i iVar) {
        m4591b();
        return f4397e.m4595e(iVar);
    }

    /* renamed from: c */
    public static void m4593c(C2218i iVar) {
        final C2225k kVar;
        m4591b();
        C2206a aVar = f4397e;
        C1709a.m3011a("InvocationMgr", "execution result: " + iVar);
        synchronized (aVar.f4398a) {
            kVar = aVar.f4398a.get(iVar.mo34833c());
            aVar.f4398a.remove(iVar.mo34833c());
        }
        if (kVar != null) {
            C2218i.C2221c cVar = iVar.f4417b;
            kVar.mo34845a(cVar.f4424a, cVar.f4425b);
            aVar.f4400c.mo34841d(iVar);
            aVar.f4401d.post(new Runnable() {
                /* class com.qiyukf.nimlib.p179d.C2206a.RunnableC22071 */

                public final void run() {
                    kVar.mo34844a();
                }
            });
        }
    }

    /* renamed from: d */
    private Object m4594d(C2218i iVar) {
        C2225k kVar;
        if (this.f4399b.mo34818a(iVar)) {
            return null;
        }
        if (iVar.mo34834d()) {
            return this.f4400c.mo34838a(iVar);
        }
        synchronized (this.f4398a) {
            kVar = new C2225k(iVar);
            this.f4398a.put(iVar.mo34833c(), kVar);
            this.f4400c.mo34839b(iVar);
        }
        return kVar;
    }

    /* renamed from: e */
    private boolean m4595e(C2218i iVar) {
        synchronized (this.f4398a) {
            if (this.f4398a.get(iVar.mo34833c()) == null) {
                return false;
            }
            this.f4398a.remove(iVar.mo34833c());
            try {
                this.f4400c.mo34840c(iVar);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
