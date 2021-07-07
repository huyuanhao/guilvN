package com.alipay.apmobilesecuritysdk.p023e;

import com.p118pd.sdk.C7559o0o00OOo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.e.i */
public final class C0399i {

    /* renamed from: a */
    public static String f885a = "";

    /* renamed from: b */
    public static String f886b = "";

    /* renamed from: c */
    public static String f887c = "";

    /* renamed from: d */
    public static String f888d = "";

    /* renamed from: e */
    public static String f889e = "";

    /* renamed from: f */
    public static Map<String, String> f890f = new HashMap();

    /* renamed from: a */
    public static synchronized String m804a(String str) {
        synchronized (C0399i.class) {
            String str2 = "apdidTokenCache" + str;
            if (f890f.containsKey(str2)) {
                String str3 = f890f.get(str2);
                if (C7559o0o00OOo.m19212OooO0O0(str3)) {
                    return str3;
                }
            }
            return "";
        }
    }

    /* renamed from: a */
    public static synchronized void m805a() {
        synchronized (C0399i.class) {
        }
    }

    /* renamed from: a */
    public static synchronized void m806a(C0392b bVar) {
        synchronized (C0399i.class) {
            if (bVar != null) {
                f885a = bVar.f871a;
                f886b = bVar.f872b;
                f887c = bVar.f873c;
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m807a(C0393c cVar) {
        synchronized (C0399i.class) {
            if (cVar != null) {
                f885a = cVar.f874a;
                f886b = cVar.f875b;
                f888d = cVar.f877d;
                f889e = cVar.f878e;
                f887c = cVar.f876c;
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m808a(String str, String str2) {
        synchronized (C0399i.class) {
            String str3 = "apdidTokenCache" + str;
            if (f890f.containsKey(str3)) {
                f890f.remove(str3);
            }
            f890f.put(str3, str2);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m809a(android.content.Context r8, java.lang.String r9) {
        /*
            java.lang.Class<com.alipay.apmobilesecuritysdk.e.i> r0 = com.alipay.apmobilesecuritysdk.p023e.C0399i.class
            monitor-enter(r0)
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = com.alipay.apmobilesecuritysdk.p023e.C0398h.m787a(r8)     // Catch:{ all -> 0x0012 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = r3
        L_0x0012:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0026 }
            long r8 = com.alipay.apmobilesecuritysdk.p023e.C0398h.m803h(r8, r9)     // Catch:{ all -> 0x0026 }
            long r3 = r3 - r8
            long r8 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x0026 }
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x002a
            r8 = 1
            monitor-exit(r0)
            return r8
        L_0x0026:
            r8 = move-exception
            com.alipay.apmobilesecuritysdk.p021c.C0383a.m744a(r8)     // Catch:{ all -> 0x002d }
        L_0x002a:
            r8 = 0
            monitor-exit(r0)
            return r8
        L_0x002d:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.p023e.C0399i.m809a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static synchronized String m810b() {
        String str;
        synchronized (C0399i.class) {
            str = f885a;
        }
        return str;
    }

    /* renamed from: b */
    public static void m811b(String str) {
        f885a = str;
    }

    /* renamed from: c */
    public static synchronized String m812c() {
        String str;
        synchronized (C0399i.class) {
            str = f886b;
        }
        return str;
    }

    /* renamed from: c */
    public static void m813c(String str) {
        f886b = str;
    }

    /* renamed from: d */
    public static synchronized String m814d() {
        String str;
        synchronized (C0399i.class) {
            str = f888d;
        }
        return str;
    }

    /* renamed from: d */
    public static void m815d(String str) {
        f887c = str;
    }

    /* renamed from: e */
    public static synchronized String m816e() {
        String str;
        synchronized (C0399i.class) {
            str = f889e;
        }
        return str;
    }

    /* renamed from: e */
    public static void m817e(String str) {
        f888d = str;
    }

    /* renamed from: f */
    public static synchronized String m818f() {
        String str;
        synchronized (C0399i.class) {
            str = f887c;
        }
        return str;
    }

    /* renamed from: f */
    public static void m819f(String str) {
        f889e = str;
    }

    /* renamed from: g */
    public static synchronized C0393c m820g() {
        C0393c cVar;
        synchronized (C0399i.class) {
            cVar = new C0393c(f885a, f886b, f887c, f888d, f889e);
        }
        return cVar;
    }

    /* renamed from: h */
    public static void m821h() {
        f890f.clear();
        f885a = "";
        f886b = "";
        f888d = "";
        f889e = "";
        f887c = "";
    }
}
