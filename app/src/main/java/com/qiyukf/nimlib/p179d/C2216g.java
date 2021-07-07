package com.qiyukf.nimlib.p179d;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.qiyukf.nimlib.d.g */
public final class C2216g {

    /* renamed from: a */
    public final Map<Class<?>, Object> f4414a = new HashMap();

    /* renamed from: a */
    public final <T> T mo34824a(Class<T> cls) {
        T t;
        if (cls.isInterface()) {
            synchronized (this.f4414a) {
                t = (T) this.f4414a.get(cls);
                if (t == null) {
                    t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C2213e());
                    if (t != null) {
                        this.f4414a.put(cls, t);
                    }
                }
            }
            return t;
        }
        throw new IllegalArgumentException("Only accept interface: " + cls);
    }
}
