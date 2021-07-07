package com.megvii.apo;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.megvii.apo.util.C1493c;
import com.megvii.apo.util.C1495e;
import com.megvii.apo.util.C1500j;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.megvii.apo.a */
public final class C1465a extends AbstractC1486m {
    public C1465a(Context context) {
        super(context);
    }

    /* renamed from: b */
    public static boolean m2173b(String str) {
        try {
            if (new File(str).exists()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return false;
        }
    }

    /* renamed from: c */
    private String m2174c() {
        try {
            return this.f1983a.getPackageManager().getPackageInfo(C1493c.m2253a("JASFBHiha0VMGUCGLGDV2ywPazWLritWnQyxd5r3zh0="), 0).versionName;
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m2175d() {
        /*
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = ""
            r2 = 0
            r0[r2] = r1
            r1 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0033 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0033 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = "xNnxmnRYtygV7vmTvKcfmg=="
            java.lang.String r6 = com.megvii.apo.util.C1493c.m2253a(r6)     // Catch:{ all -> 0x0033 }
            r5.<init>(r6)     // Catch:{ all -> 0x0033 }
            r4.<init>(r5)     // Catch:{ all -> 0x0033 }
            r3.<init>(r4)     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = " "
            java.lang.String[] r0 = r1.split(r4)     // Catch:{ all -> 0x0031 }
            r3.close()     // Catch:{ all -> 0x002c }
            goto L_0x003f
        L_0x002c:
            r1 = move-exception
            com.megvii.apo.util.C1495e.m2258a(r1)
            goto L_0x003f
        L_0x0031:
            r1 = move-exception
            goto L_0x0037
        L_0x0033:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
        L_0x0037:
            com.megvii.apo.util.C1495e.m2258a(r1)     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x003f
            r3.close()
        L_0x003f:
            r0 = r0[r2]
            return r0
        L_0x0042:
            r0 = move-exception
            if (r3 == 0) goto L_0x004d
            r3.close()     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r1 = move-exception
            com.megvii.apo.util.C1495e.m2258a(r1)
        L_0x004d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.apo.C1465a.m2175d():java.lang.String");
    }

    @Override // com.megvii.apo.AbstractC1486m
    /* renamed from: a */
    public final void mo16948a(Map<String, Object> map) {
        boolean z = true;
        if (C1500j.f2064s == 1) {
            try {
                map.put("101030001", Build.VERSION.RELEASE);
                StringBuilder sb = new StringBuilder();
                sb.append(Build.VERSION.SDK_INT);
                map.put("101030018", sb.toString());
                if (!m2173b(C1493c.m2253a("ltz8ndzqbXSA+d9ZeRI+AA==")) && !m2173b(C1493c.m2253a("a83SWKl2MIqEA+IDx16fUQ==")) && !m2173b(C1493c.m2253a("uRdnUKd8L7ALcDs7apOIyA==")) && !m2173b(C1493c.m2253a("pLDoOid7Pm0tLC+XeB0aMQ==")) && !m2173b(C1493c.m2253a("WPM2O2jRUj1CnGWZzB+T29vIKsC5rjYyK6zFmxtnerY=")) && !m2173b(C1493c.m2253a("wkfroYRvQLcfA/vOLh6yw18M+yyQpvVsXX6c4eV3mbk=")) && !m2173b(C1493c.m2253a("WIKHDxO7DP3AeRArgziBwQ=="))) {
                    if (!m2173b(C1493c.m2253a("sjGGh25CKk+x+cnSgavYUEOMjTvTGoXEWTi/8SsOj/I="))) {
                        z = false;
                    }
                }
                map.put("101030020", z ? "1" : "0");
                map.put("101031001", Build.DISPLAY);
                map.put("101030004", Build.ID);
                map.put("101030005", Build.VERSION.INCREMENTAL);
                map.put("101032001", System.getProperty(C1493c.m2253a("Km1OTSEFtKGMFZCsLygxVzhvJ851wCA5AVwqtyZr8G0=")) + System.getProperty(C1493c.m2253a("hPGmNX0ruNIPpMSrvmZ3WQLCscMq+E08/RU8rc0msA4=")));
                map.put("101030006", System.getProperty(C1493c.m2253a("p1sKaUZLovpe0a2tcT0R9A==")) + System.getProperty(C1493c.m2253a("faLHu+3KOFrJLqgMRkIxfQ==")));
                Runtime runtime = Runtime.getRuntime();
                StringBuilder sb2 = new StringBuilder();
                sb2.append((runtime.maxMemory() / 1024) / 1024);
                map.put("101030011", sb2.toString());
                map.put("101033001", System.getProperty(C1493c.m2253a("QuOtNagPOSuNDo2tgJLYHQ==")));
                map.put("101033002", m2172b());
                map.put("101031002", Build.TAGS);
                map.put("101031003", Build.TYPE);
                map.put("101030012", m2174c());
                map.put("101030013", System.getProperty(C1493c.m2253a("r9jRtVsT05V4PpQLvhMox39c25tn23ofdxeWAfUyEEk=")));
                map.put("101030014", System.getProperty(C1493c.m2253a("oa1Kf+CnhK764oCXyonf9ldJV+fCABoLxwNXsarm+Cg=")));
                map.put("101034001", System.getProperty(C1493c.m2253a("kW+kY2ze0AlO7hxmL3I7EHhUazH8dGl4y8b3OCP0TJg=")));
                map.put("101034002", System.getProperty(C1493c.m2253a("eYHNHacCrVAMPF+Up5QPooYak7pkYOyNm77JlwjWObM=")));
                map.put("101034003", System.getProperty(C1493c.m2253a("hUbuQyVF5460ljdl69c/4Pnhhu8MkRDeNdl11+k/rtk=")));
                map.put("101030015", Locale.getDefault().getLanguage() + Locale.getDefault().getCountry());
                map.put("101030016", TimeZone.getDefault().getDisplayName());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(SystemClock.elapsedRealtime());
                map.put("101030017", sb3.toString());
                map.put("101030018", m2175d());
                map.put("101033003", System.getProperty(C1493c.m2253a("2XiYzdzr9CmLuMWAs4w5ew==")));
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }

    /* renamed from: b */
    public static String m2172b() {
        try {
            FileInputStream fileInputStream = new FileInputStream(C1493c.m2253a("fIF4tUPWLCBJg1heknPbhA=="));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream), 8192);
            String str = "";
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        str = str + readLine;
                    } else {
                        try {
                            break;
                        } catch (Throwable th) {
                            C1495e.m2258a(th);
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        C1495e.m2258a(th3);
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
            fileInputStream.close();
            if (str == "") {
                return "";
            }
            try {
                String a = C1493c.m2253a("J/Pam6Wgbibvc7zxxLWGJQ==");
                String substring = str.substring(str.indexOf(a) + a.length());
                return substring.substring(0, substring.indexOf(" "));
            } catch (Throwable th4) {
                C1495e.m2258a(th4);
                return "";
            }
        } catch (Throwable th5) {
            C1495e.m2258a(th5);
            return "";
        }
    }
}
