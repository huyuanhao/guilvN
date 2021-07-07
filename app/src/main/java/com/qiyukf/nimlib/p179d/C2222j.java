package com.qiyukf.nimlib.p179d;

import android.os.Handler;
import android.util.SparseArray;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.nimlib.p155a.p174e.C2167a;
import com.qiyukf.nimlib.p155a.p174e.C2169b;
import com.qiyukf.nimlib.p155a.p174e.C2174c;
import com.qiyukf.nimlib.sdk.auth.AuthService;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.SystemMessageService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.qiyukf.nimlib.d.j */
public final class C2222j {

    /* renamed from: a */
    public final Map<String, C2224a> f4426a = new HashMap();

    /* renamed from: b */
    public final SparseArray<AbstractC2215f> f4427b = new SparseArray<>();

    /* renamed from: c */
    public final Handler f4428c = C1805a.m3403a().mo34072a("bg_executor");

    /* renamed from: com.qiyukf.nimlib.d.j$a */
    public static class C2224a {

        /* renamed from: a */
        public final Map<String, Method> f4431a = new HashMap();

        /* renamed from: b */
        public AbstractC2217h f4432b;

        public C2224a(Class<?> cls, Class<? extends AbstractC2217h> cls2) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                this.f4431a.put(method.getName(), method);
            }
            try {
                this.f4432b = (AbstractC2217h) cls2.newInstance();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        /* renamed from: a */
        public final Object mo34843a(C2218i iVar) {
            return this.f4431a.get(iVar.mo34829a()).invoke(this.f4432b, iVar.f4416a.f4423b);
        }
    }

    public C2222j() {
        m4624a(AuthService.class, C2167a.class);
        m4624a(MsgService.class, C2169b.class);
        m4624a(SystemMessageService.class, C2174c.class);
    }

    /* renamed from: a */
    private void m4624a(Class<?> cls, Class<? extends AbstractC2217h> cls2) {
        this.f4426a.put(cls.getSimpleName(), new C2224a(cls, cls2));
    }

    /* renamed from: a */
    public final Object mo34838a(C2218i iVar) {
        Map<String, C2224a> map = this.f4426a;
        String str = iVar.f4416a.f4422a;
        C2224a aVar = map.get(str.substring(0, str.indexOf(47)));
        if (aVar == null) {
            return null;
        }
        AbstractC2217h.m4610a(iVar);
        try {
            C1709a.m3011a("TransEx", "execute " + iVar);
            return aVar.mo34843a(iVar);
        } catch (Throwable th) {
            th = th;
            if ((th instanceof InvocationTargetException) && th.getCause() != null) {
                th = th.getCause();
            }
            C1709a.m3013a("TransEx", "execute " + iVar + " exception", th);
            iVar.f4417b.f4424a = 1000;
            iVar.f4417b.f4425b = th;
            C2206a.m4593c(iVar);
            return null;
        } finally {
            AbstractC2217h.m4609a();
        }
    }

    /* renamed from: b */
    public final void mo34839b(final C2218i iVar) {
        this.f4428c.post(new Runnable() {
            /* class com.qiyukf.nimlib.p179d.C2222j.RunnableC22231 */

            public final void run() {
                Object a = C2222j.this.mo34838a(iVar);
                if (a instanceof AbstractC2215f) {
                    synchronized (C2222j.this.f4427b) {
                        C2222j.this.f4427b.put(iVar.mo34833c(), (AbstractC2215f) a);
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo34840c(C2218i iVar) {
        AbstractC2215f fVar;
        C1709a.m3011a("TransEx", "abort " + iVar);
        synchronized (this.f4427b) {
            fVar = this.f4427b.get(iVar.mo34833c());
            this.f4427b.remove(iVar.mo34833c());
        }
        if (fVar != null) {
            fVar.abort();
        }
    }

    /* renamed from: d */
    public final void mo34841d(C2218i iVar) {
        synchronized (this.f4427b) {
            this.f4427b.remove(iVar.mo34833c());
        }
    }
}
