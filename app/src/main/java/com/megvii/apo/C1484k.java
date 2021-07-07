package com.megvii.apo;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.megvii.apo.util.C1492b;
import com.megvii.apo.util.C1493c;
import com.megvii.apo.util.C1495e;
import com.megvii.apo.util.C1497g;
import com.megvii.apo.util.C1500j;
import com.megvii.apo.util.C1501k;
import com.megvii.apo.util.C1502l;
import com.megvii.apo.util.DeltaEncode;
import com.umeng.message.MsgConstant;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.megvii.apo.k */
public final class C1484k extends AbstractC1486m {
    public C1484k(Context context) {
        super(context);
    }

    /* renamed from: b */
    private String m2223b() {
        try {
            return Settings.System.getString(this.f1983a.getContentResolver(), "x_c_s");
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return "";
        }
    }

    /* renamed from: c */
    public static String m2224c() {
        try {
            Class<?> cls = Class.forName(C1493c.m2253a("md885t/s6Jva+pGPvGnEFfBS1vgobP6JTZSRcxRkgz4="));
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, C1493c.m2253a("6oMif8usps1JxYvp5yPYQSeC5FBBs2gc4xe5jDAHrgo="), "unknown");
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return null;
        }
    }

    /* renamed from: d */
    public static String m2225d() {
        try {
            Class<?> cls = Class.forName(C1493c.m2253a("md885t/s6Jva+pGPvGnEFfBS1vgobP6JTZSRcxRkgz4="));
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, C1493c.m2253a("4sQVmAtX177jNws5rvuGrvsIYxoVhCl7iylsf9sdGp4="), "unknown");
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return null;
        }
    }

    /* renamed from: e */
    public static String m2226e() {
        BufferedReader bufferedReader;
        Throwable th;
        String str = "";
        try {
            bufferedReader = new BufferedReader(new FileReader(C1493c.m2253a("KgYaMbI7KeOOjPm04LMPdw==")));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String[] split = readLine.split(" +");
                        if (split != null && split.length >= 4) {
                            String str2 = split[0];
                            String str3 = split[3];
                            if (str3.matches(C1493c.m2253a("a4VIrlVd7LWsQqijpZWaTslnloNvRW3XQBpJoLXbc3g="))) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put(str2, str3);
                                    str = jSONObject.toString();
                                } catch (Throwable th2) {
                                    C1495e.m2258a(th2);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    try {
                        bufferedReader.close();
                        break;
                    } catch (Throwable th3) {
                        C1495e.m2258a(th3);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        C1495e.m2258a(th);
                        bufferedReader.close();
                        return str;
                    } catch (Throwable th5) {
                        C1495e.m2258a(th5);
                    }
                }
            }
        } catch (Throwable th6) {
            bufferedReader = null;
            th = th6;
            C1495e.m2258a(th);
            bufferedReader.close();
            return str;
        }
        return str;
        throw th;
    }

    /* renamed from: f */
    public static String m2227f() {
        try {
            return DeltaEncode.m2248ma();
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e A[SYNTHETIC, Splitter:B:27:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0058  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m2228g() {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.apo.C1484k.m2228g():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m2229h() {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "S+KjPdPczKs5HfYJLFLmdGlUd1QLUBKiRiQ6SiGuqvk="
            java.lang.String r1 = com.megvii.apo.util.C1493c.m2253a(r1)
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0029 }
            r3.<init>(r1)     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = m2222a(r3)     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = r0.toUpperCase()     // Catch:{ all -> 0x0026 }
            r2 = 0
            r4 = 17
            java.lang.String r0 = r1.substring(r2, r4)     // Catch:{ all -> 0x0026 }
            r3.close()     // Catch:{ all -> 0x0021 }
            goto L_0x0032
        L_0x0021:
            r1 = move-exception
            com.megvii.apo.util.C1495e.m2258a(r1)
            goto L_0x0032
        L_0x0026:
            r1 = move-exception
            r2 = r3
            goto L_0x002a
        L_0x0029:
            r1 = move-exception
        L_0x002a:
            com.megvii.apo.util.C1495e.m2258a(r1)     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0032
            r2.close()
        L_0x0032:
            return r0
        L_0x0033:
            r0 = move-exception
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ all -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r1 = move-exception
            com.megvii.apo.util.C1495e.m2258a(r1)
        L_0x003e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.apo.C1484k.m2229h():java.lang.String");
    }

    @Override // com.megvii.apo.AbstractC1486m
    /* renamed from: a */
    public final void mo16948a(Map<String, Object> map) {
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        if (C1500j.f2052g == 1) {
            try {
                map.put("101010008", Build.SERIAL);
                Object obj10 = "";
                if (!mo16961a(MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                    obj = obj10;
                } else {
                    obj = ((TelephonyManager) this.f1983a.getSystemService("phone")).getDeviceId();
                }
                map.put("101010014", obj);
                if (!mo16961a(MsgConstant.PERMISSION_ACCESS_WIFI_STATE)) {
                    str = obj10;
                } else {
                    str = ((WifiManager) this.f1983a.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
                    if (TextUtils.isEmpty(str) || str.equals(C1493c.m2253a("3hiEzTB+U3i95wtCyV5rTXhs8bQQKex0xy37N2nWj5Y="))) {
                        str = m2228g();
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = m2229h();
                    }
                }
                map.put("101010015", str);
                map.put("101010016", obj10);
                map.put("101010017", (String) C1501k.m2275b(this.f1983a, "x_c_s", obj10));
                map.put("101010018", m2223b());
                map.put("101010019", C1492b.m2252a(this.f1983a));
                map.put("101030002", Settings.Secure.getString(this.f1983a.getContentResolver(), "android_id"));
                map.put("101040001", C1497g.m2265a(C1493c.m2253a("VknC2CcEX52fpPZYEEEB9Q==")));
                if (!mo16961a(MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                    obj2 = obj10;
                } else {
                    obj2 = ((TelephonyManager) this.f1983a.getSystemService("phone")).getSimSerialNumber();
                }
                map.put("101061005", obj2);
                if (!mo16961a(MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                    obj3 = obj10;
                } else {
                    obj3 = ((TelephonyManager) this.f1983a.getSystemService("phone")).getSubscriberId();
                }
                map.put("101061006", obj3);
                map.put("101010020", m2224c());
                map.put("101010021", m2225d());
                map.put("101010027", m2226e());
                map.put("101010028", m2227f());
                if (!mo16961a(MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                    obj4 = obj10;
                } else {
                    obj4 = C1502l.m2277a(this.f1983a, 0, 1, C1493c.m2253a("NpHXHdKnskMfQbVNbb5BEw=="), 21) + "_" + C1502l.m2277a(this.f1983a, 1, 1, C1493c.m2253a("NpHXHdKnskMfQbVNbb5BEw=="), 21);
                }
                map.put("101010022", obj4);
                if (!mo16961a(MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                    obj5 = obj10;
                } else {
                    obj5 = C1502l.m2277a(this.f1983a, -1, 0, C1493c.m2253a("ThjHWu5NAYSorpz/8V3hnQ=="), 26);
                }
                map.put("101010023", obj5);
                if (!mo16961a(MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                    obj6 = obj10;
                } else {
                    obj6 = C1502l.m2277a(this.f1983a, 0, 1, C1493c.m2253a("ThjHWu5NAYSorpz/8V3hnQ=="), 26) + "_" + C1502l.m2277a(this.f1983a, 1, 1, C1493c.m2253a("ThjHWu5NAYSorpz/8V3hnQ=="), 26);
                }
                map.put("101010024", obj6);
                if (!mo16961a(MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                    obj7 = obj10;
                } else {
                    obj7 = C1502l.m2277a(this.f1983a, -1, 0, C1493c.m2253a("p8TjCc5SJzgp6VpT+65KYA=="), 26);
                }
                map.put("101010025", obj7);
                if (!mo16961a(MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                    obj8 = obj10;
                } else {
                    obj8 = C1502l.m2277a(this.f1983a, 0, 1, C1493c.m2253a("p8TjCc5SJzgp6VpT+65KYA=="), 26) + "_" + C1502l.m2277a(this.f1983a, 1, 1, C1493c.m2253a("p8TjCc5SJzgp6VpT+65KYA=="), 26);
                }
                map.put("101010026", obj8);
                if (!mo16961a(MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                    obj9 = obj10;
                } else {
                    int a = C1502l.m2276a(this.f1983a, 0);
                    int a2 = C1502l.m2276a(this.f1983a, 1);
                    obj9 = C1502l.m2277a(this.f1983a, a, 1, C1493c.m2253a("2SkG6Dr4jU6VhALgzd8DrQ=="), 21) + "_" + C1502l.m2277a(this.f1983a, a2, 1, C1493c.m2253a("2SkG6Dr4jU6VhALgzd8DrQ=="), 21);
                }
                map.put("101061012", obj9);
                if (mo16961a(MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                    obj10 = C1502l.m2277a(this.f1983a, 0, 1, C1493c.m2253a("l+YtLvJgUDVTCpAMAyPYV8R9xPjbibmM0PwecHSBQuU="), 21) + "_" + C1502l.m2277a(this.f1983a, 1, 1, C1493c.m2253a("l+YtLvJgUDVTCpAMAyPYV8R9xPjbibmM0PwecHSBQuU="), 21);
                }
                map.put("101061011", obj10);
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }

    /* renamed from: a */
    public static String m2222a(Reader reader) {
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[4096];
            int read = reader.read(cArr);
            while (read >= 0) {
                sb.append(cArr, 0, read);
                read = reader.read(cArr);
            }
            return sb.toString();
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return null;
        }
    }
}
