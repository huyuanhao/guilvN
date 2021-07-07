package com.megvii.meglive_sdk.volley.toolbox;

import com.megvii.meglive_sdk.volley.AbstractC1616b;
import com.megvii.meglive_sdk.volley.C1625j;
import com.megvii.meglive_sdk.volley.p107a.p108a.p109a.C1595a;
import com.umeng.message.util.HttpRequest;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;

/* renamed from: com.megvii.meglive_sdk.volley.toolbox.d */
public final class C1642d {
    /* renamed from: a */
    public static AbstractC1616b.C1617a m2850a(C1625j jVar) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = jVar.f2879c;
        String str = map.get(HttpRequest.HEADER_DATE);
        long a = str != null ? m2849a(str) : 0;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = map.get(HttpRequest.HEADER_EXPIRES);
        long a2 = str3 != null ? m2849a(str3) : 0;
        String str4 = map.get(HttpRequest.HEADER_LAST_MODIFIED);
        long a3 = str4 != null ? m2849a(str4) : 0;
        String str5 = map.get(HttpRequest.HEADER_ETAG);
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (a <= 0 || a2 < a) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (a2 - a);
                j3 = j4;
            }
        }
        AbstractC1616b.C1617a aVar = new AbstractC1616b.C1617a();
        aVar.f2854a = jVar.f2878b;
        aVar.f2855b = str5;
        aVar.f2859f = j4;
        aVar.f2858e = j3;
        aVar.f2856c = a;
        aVar.f2857d = a3;
        aVar.f2860g = map;
        return aVar;
    }

    /* renamed from: a */
    public static long m2849a(String str) {
        try {
            return C1595a.m2745a(str).getTime();
        } catch (Exception unused) {
            return 0;
        }
    }
}
