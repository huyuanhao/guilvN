package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.learnium.RNDeviceInfo.Util;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;

/* renamed from: com.xiaomi.push.t */
public class C4688t {

    /* renamed from: a */
    public static Context f13402a;

    /* renamed from: a */
    public static String f13403a;

    /* renamed from: a */
    public static int m14217a() {
        try {
            Class<?> a = m14219a(null, "miui.os.Build");
            if (a.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return a.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static Context m14218a() {
        return f13402a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:3|(1:5)(1:6)|(3:10|11|12)|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        com.xiaomi.channel.commonutils.logger.AbstractC4163b.m11301a(java.lang.String.format("loadClass fail hasContext= %s, errMsg = %s", java.lang.Boolean.valueOf(r2), r5.getLocalizedMessage()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        throw new java.lang.ClassNotFoundException("loadClass fail ", r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0024 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<?> m14219a(android.content.Context r5, java.lang.String r6) {
        /*
            if (r6 == 0) goto L_0x004a
            java.lang.String r0 = r6.trim()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x004a
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0024
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L_0x0024
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0024 }
            java.lang.Class r5 = r5.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x0024 }
            return r5
        L_0x0024:
            java.lang.Class r5 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0029 }
            return r5
        L_0x0029:
            r5 = move-exception
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6[r1] = r2
            java.lang.String r1 = r5.getLocalizedMessage()
            r6[r0] = r1
            java.lang.String r0 = "loadClass fail hasContext= %s, errMsg = %s"
            java.lang.String r6 = java.lang.String.format(r0, r6)
            com.xiaomi.channel.commonutils.logger.AbstractC4163b.m11301a(r6)
            java.lang.ClassNotFoundException r6 = new java.lang.ClassNotFoundException
            java.lang.String r0 = "loadClass fail "
            r6.<init>(r0, r5)
            throw r6
        L_0x004a:
            java.lang.ClassNotFoundException r5 = new java.lang.ClassNotFoundException
            java.lang.String r6 = "class is empty"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4688t.m14219a(android.content.Context, java.lang.String):java.lang.Class");
    }

    /* renamed from: a */
    public static synchronized String m14220a() {
        synchronized (C4688t.class) {
            if (f13403a != null) {
                return f13403a;
            }
            String str = Build.VERSION.INCREMENTAL;
            if (m14217a() <= 0) {
                String b = m14225b();
                if (TextUtils.isEmpty(b)) {
                    b = m14227c();
                    if (TextUtils.isEmpty(b)) {
                        b = m14228d();
                        if (TextUtils.isEmpty(b)) {
                            str = String.valueOf(C4571s.m13745a("ro.product.brand", "Android") + "_" + str);
                        }
                    }
                }
                str = b;
            }
            f13403a = str;
            return str;
        }
    }

    /* renamed from: a */
    public static String m14221a(Context context) {
        if (C4563l.m13729b()) {
            return "";
        }
        String str = (String) C4278ba.m11774a("com.xiaomi.xmsf.helper.MIIDAccountHelper", "getMIID", context);
        return TextUtils.isEmpty(str) ? "0" : str;
    }

    /* renamed from: a */
    public static void m14222a(Context context) {
        f13402a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static boolean m14223a() {
        return TextUtils.equals((String) C4278ba.m11774a("android.os.SystemProperties", "get", "sys.boot_completed"), "1");
    }

    /* renamed from: a */
    public static boolean m14224a(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
            return false;
        }
    }

    /* renamed from: b */
    public static String m14225b() {
        String a = C4571s.m13745a("ro.build.version.emui", "");
        f13403a = a;
        return a;
    }

    /* renamed from: b */
    public static boolean m14226b() {
        try {
            return m14219a(null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(false);
        } catch (ClassNotFoundException unused) {
            AbstractC4163b.m11306d("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
            return false;
        }
    }

    /* renamed from: c */
    public static String m14227c() {
        String a = C4571s.m13745a(Util.KEY_VERSION_OPPO, "");
        if (!TextUtils.isEmpty(a) && !a.startsWith("ColorOS_")) {
            f13403a = "ColorOS_" + a;
        }
        return f13403a;
    }

    /* renamed from: d */
    public static String m14228d() {
        String a = C4571s.m13745a(Util.KEY_VERSION_VIVO, "");
        if (!TextUtils.isEmpty(a) && !a.startsWith("FuntouchOS_")) {
            f13403a = "FuntouchOS_" + a;
        }
        return f13403a;
    }
}
