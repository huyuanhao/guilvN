package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.config.b */
public class C3498b implements AbstractC3508f {

    /* renamed from: a */
    public static C3502d f8872a = new C3502d();

    /* renamed from: b */
    public static Map<String, Boolean> f8873b = new HashMap();

    /* renamed from: c */
    public static Object f8874c = new Object();

    /* renamed from: com.umeng.commonsdk.config.b$a */
    public static class C3500a {

        /* renamed from: a */
        public static final C3498b f8875a = new C3498b();
    }

    /* renamed from: a */
    public static C3498b m8994a() {
        return C3500a.f8875a;
    }

    public C3498b() {
    }

    /* renamed from: a */
    public static boolean m8995a(String str) {
        if (!C3502d.m8999a(str)) {
            return false;
        }
        synchronized (f8874c) {
            if (!f8873b.containsKey(str)) {
                return true;
            }
            return f8873b.get(str).booleanValue();
        }
    }

    @Override // com.umeng.commonsdk.config.AbstractC3508f
    /* renamed from: a */
    public void mo38838a(String str, Boolean bool) {
        if (C3502d.m8999a(str)) {
            synchronized (f8874c) {
                if (f8873b != null) {
                    f8873b.put(str, bool);
                }
            }
        }
    }
}
