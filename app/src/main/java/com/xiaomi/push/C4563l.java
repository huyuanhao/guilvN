package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.xiaomi.push.l */
public class C4563l {

    /* renamed from: a */
    public static int f13046a = 0;

    /* renamed from: a */
    public static Map<String, EnumC4566o> f13047a = null;

    /* renamed from: b */
    public static int f13048b = -1;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028 A[Catch:{ all -> 0x002c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int m13721a() {
        /*
            java.lang.Class<com.xiaomi.push.l> r0 = com.xiaomi.push.C4563l.class
            monitor-enter(r0)
            int r1 = com.xiaomi.push.C4563l.f13046a     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x004a
            r1 = 0
            java.lang.String r2 = "ro.miui.ui.version.code"
            java.lang.String r2 = m13724a(r2)     // Catch:{ all -> 0x002c }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x002c }
            r3 = 1
            if (r2 == 0) goto L_0x0024
            java.lang.String r2 = "ro.miui.ui.version.name"
            java.lang.String r2 = m13724a(r2)     // Catch:{ all -> 0x002c }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r2 = 0
            goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            if (r2 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r3 = 2
        L_0x0029:
            com.xiaomi.push.C4563l.f13046a = r3     // Catch:{ all -> 0x002c }
            goto L_0x0034
        L_0x002c:
            r2 = move-exception
            java.lang.String r3 = "get isMIUI failed"
            com.xiaomi.channel.commonutils.logger.AbstractC4163b.m11302a(r3, r2)
            com.xiaomi.push.C4563l.f13046a = r1
        L_0x0034:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isMIUI's value is: "
            r1.append(r2)
            int r2 = com.xiaomi.push.C4563l.f13046a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.xiaomi.channel.commonutils.logger.AbstractC4163b.m11304b(r1)
        L_0x004a:
            int r1 = com.xiaomi.push.C4563l.f13046a
            monitor-exit(r0)
            return r1
        L_0x004e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4563l.m13721a():int");
    }

    /* renamed from: a */
    public static EnumC4566o m13722a(String str) {
        EnumC4566o b = m13727b(str);
        return b == null ? EnumC4566o.Global : b;
    }

    /* renamed from: a */
    public static synchronized String m13723a() {
        synchronized (C4563l.class) {
            int a = C4688t.m14217a();
            return (!m13726a() || a <= 0) ? "" : a < 2 ? "alpha" : a < 3 ? "development" : "stable";
        }
    }

    /* renamed from: a */
    public static String m13724a(String str) {
        try {
            return (String) C4278ba.m11774a("android.os.SystemProperties", "get", str, "");
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static void m13725a() {
        if (f13047a == null) {
            HashMap hashMap = new HashMap();
            f13047a = hashMap;
            hashMap.put("CN", EnumC4566o.China);
            f13047a.put("FI", EnumC4566o.Europe);
            f13047a.put("SE", EnumC4566o.Europe);
            f13047a.put("NO", EnumC4566o.Europe);
            f13047a.put("FO", EnumC4566o.Europe);
            f13047a.put("EE", EnumC4566o.Europe);
            f13047a.put("LV", EnumC4566o.Europe);
            f13047a.put("LT", EnumC4566o.Europe);
            f13047a.put("BY", EnumC4566o.Europe);
            f13047a.put("MD", EnumC4566o.Europe);
            f13047a.put("UA", EnumC4566o.Europe);
            f13047a.put("PL", EnumC4566o.Europe);
            f13047a.put("CZ", EnumC4566o.Europe);
            f13047a.put("SK", EnumC4566o.Europe);
            f13047a.put("HU", EnumC4566o.Europe);
            f13047a.put("DE", EnumC4566o.Europe);
            f13047a.put("AT", EnumC4566o.Europe);
            f13047a.put("CH", EnumC4566o.Europe);
            f13047a.put("LI", EnumC4566o.Europe);
            f13047a.put("GB", EnumC4566o.Europe);
            f13047a.put("IE", EnumC4566o.Europe);
            f13047a.put("NL", EnumC4566o.Europe);
            f13047a.put("BE", EnumC4566o.Europe);
            f13047a.put("LU", EnumC4566o.Europe);
            f13047a.put("FR", EnumC4566o.Europe);
            f13047a.put("RO", EnumC4566o.Europe);
            f13047a.put("BG", EnumC4566o.Europe);
            f13047a.put("RS", EnumC4566o.Europe);
            f13047a.put("MK", EnumC4566o.Europe);
            f13047a.put("AL", EnumC4566o.Europe);
            f13047a.put("GR", EnumC4566o.Europe);
            f13047a.put("SI", EnumC4566o.Europe);
            f13047a.put("HR", EnumC4566o.Europe);
            f13047a.put("IT", EnumC4566o.Europe);
            f13047a.put("SM", EnumC4566o.Europe);
            f13047a.put("MT", EnumC4566o.Europe);
            f13047a.put("ES", EnumC4566o.Europe);
            f13047a.put("PT", EnumC4566o.Europe);
            f13047a.put("AD", EnumC4566o.Europe);
            f13047a.put("CY", EnumC4566o.Europe);
            f13047a.put("DK", EnumC4566o.Europe);
            f13047a.put("RU", EnumC4566o.Russia);
            f13047a.put("IN", EnumC4566o.India);
        }
    }

    /* renamed from: a */
    public static synchronized boolean m13726a() {
        boolean z;
        synchronized (C4563l.class) {
            z = true;
            if (m13721a() != 1) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static EnumC4566o m13727b(String str) {
        m13725a();
        return f13047a.get(str.toUpperCase());
    }

    /* renamed from: b */
    public static String m13728b() {
        String a = C4571s.m13745a("ro.miui.region", "");
        if (TextUtils.isEmpty(a)) {
            a = C4571s.m13745a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4571s.m13745a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4571s.m13745a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4571s.m13745a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4571s.m13745a("ro.product.country.region", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4571s.m13745a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4571s.m13745a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4571s.m13745a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4571s.m13745a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(a)) {
            AbstractC4163b.m11301a("get region from system, region = " + a);
        }
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String country = Locale.getDefault().getCountry();
        AbstractC4163b.m11301a("locale.default.country = " + country);
        return country;
    }

    /* renamed from: b */
    public static synchronized boolean m13729b() {
        boolean z;
        synchronized (C4563l.class) {
            z = m13721a() == 2;
        }
        return z;
    }

    /* renamed from: c */
    public static boolean m13730c() {
        if (f13048b < 0) {
            Object a = C4278ba.m11774a("miui.external.SdkHelper", "isMiuiSystem", new Object[0]);
            f13048b = 0;
            if (a != null && (a instanceof Boolean) && !((Boolean) Boolean.class.cast(a)).booleanValue()) {
                f13048b = 1;
            }
        }
        return f13048b > 0;
    }

    /* renamed from: d */
    public static boolean m13731d() {
        return !EnumC4566o.China.name().equalsIgnoreCase(m13722a(m13728b()).name());
    }
}
