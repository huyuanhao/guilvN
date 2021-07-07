package com.p118pd.sdk;

import android.util.LruCache;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.ooO0oOO0  reason: case insensitive filesystem */
public class C8874ooO0oOO0 {
    public static final int OooO00o = 512;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Map<String, LruCache<Object, Object>> f22084OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f22085OooO00o;

    /* renamed from: com.pd.sdk.ooO0oOO0$OooO0O0 */
    public static class OooO0O0 {
        public static final C8874ooO0oOO0 OooO00o = new C8874ooO0oOO0();
    }

    public void OooO00o(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            synchronized (this.f22085OooO00o) {
                OooO00o((Class) obj2.getClass()).put(obj, obj2);
            }
        }
    }

    public void OooO0O0(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            synchronized (this.f22085OooO00o) {
                OooO00o((Class) obj2.getClass()).remove(obj);
            }
        }
    }

    public C8874ooO0oOO0() {
        this.f22085OooO00o = new Object();
        f22084OooO00o = new HashMap();
    }

    public <T> T OooO00o(Class<T> cls, Object obj) {
        T t;
        if (obj == null || cls == null) {
            return null;
        }
        synchronized (this.f22085OooO00o) {
            t = (T) OooO00o((Class) cls).get(obj);
        }
        return t;
    }

    public void OooO00o(Class cls, int i) {
        if (cls != null) {
            synchronized (this.f22085OooO00o) {
                OooO00o(cls).resize(i);
            }
        }
    }

    private LruCache<Object, Object> OooO00o(Class cls) {
        String name = cls.getName();
        LruCache<Object, Object> lruCache = f22084OooO00o.get(name);
        if (lruCache != null) {
            return lruCache;
        }
        LruCache<Object, Object> lruCache2 = new LruCache<>(512);
        f22084OooO00o.put(name, lruCache2);
        return lruCache2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20521OooO00o(Class cls) {
        if (cls != null) {
            synchronized (this.f22085OooO00o) {
                OooO00o(cls).evictAll();
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20520OooO00o() {
        synchronized (this.f22085OooO00o) {
            f22084OooO00o.clear();
        }
    }

    public static C8874ooO0oOO0 OooO00o() {
        return OooO0O0.OooO00o;
    }
}
