package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.xiaomi.push.gs */
public class C4466gs {

    /* renamed from: a */
    public static C4466gs f12108a;

    /* renamed from: a */
    public Map<String, Object> f12109a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map<String, Object> f12110b = new ConcurrentHashMap();

    public C4466gs() {
        m12817a();
    }

    /* renamed from: a */
    public static synchronized C4466gs mo41986a() {
        C4466gs gsVar;
        synchronized (C4466gs.class) {
            if (f12108a == null) {
                f12108a = new C4466gs();
            }
            gsVar = f12108a;
        }
        return gsVar;
    }

    /* renamed from: a */
    private String mo41985a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(str);
        sb.append("/>");
        if (str != null) {
            sb.append("<");
            sb.append(str2);
            sb.append("/>");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private ClassLoader[] m12815a() {
        ClassLoader[] classLoaderArr = {C4466gs.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    /* renamed from: a */
    public Object m12816a(String str, String str2) {
        return this.f12109a.get(mo41985a(str, str2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f6 A[SYNTHETIC, Splitter:B:42:0x00f6] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m12817a() {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4466gs.m12817a():void");
    }

    /* renamed from: a */
    public void mo41987a(String str, String str2, Object obj) {
        if ((obj instanceof AbstractC4465gr) || (obj instanceof Class)) {
            this.f12109a.put(mo41985a(str, str2), obj);
            return;
        }
        throw new IllegalArgumentException("Provider must be a PacketExtensionProvider or a Class instance.");
    }
}
