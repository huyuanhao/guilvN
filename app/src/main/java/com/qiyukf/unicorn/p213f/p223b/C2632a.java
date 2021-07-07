package com.qiyukf.unicorn.p213f.p223b;

import android.text.TextUtils;
import com.p118pd.sdk.C7383o0OOO0O;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p121a.p130c.C1757a;
import com.qiyukf.nimlib.p176b.C2187d;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: com.qiyukf.unicorn.f.b.a */
public final class C2632a {
    /* renamed from: a */
    public static String m5991a() {
        int a = C2187d.m4514a();
        return a == 1 ? "http://qytest.netease.com" : a == 2 ? "http://qiyukf.netease.com" : a == 3 ? "http://qydev.netease.com" : "https://nim.qiyukf.com";
    }

    /* renamed from: a */
    public static String m5992a(String str, String str2, Map<String, String> map) {
        try {
            return C1757a.m3231a(m5996c(str, str2, map), "GET", "Common");
        } catch (IOException e) {
            throw new C2633b("get request error", e);
        }
    }

    /* renamed from: a */
    public static String m5993a(String str, Map<String, String> map) {
        return m5992a(m5991a(), str, map);
    }

    /* renamed from: b */
    public static String m5994b(String str, String str2, Map<String, String> map) {
        try {
            return C1757a.m3231a(m5996c(str, str2, map), "POST", "Common");
        } catch (IOException e) {
            throw new C2633b("post request error", e);
        }
    }

    /* renamed from: b */
    public static String m5995b(String str, Map<String, String> map) {
        return m5994b(m5991a(), str, map);
    }

    /* renamed from: c */
    public static String m5996c(String str, String str2, Map<String, String> map) {
        String str3 = str + str2;
        if (map != null) {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(i == 0 ? C8932ooOOO0o.f22176OooO00o : "&");
                    str3 = sb.toString() + entry.getKey() + C8932ooOOO0o.OooO0Oo + URLEncoder.encode(entry.getValue());
                    i++;
                }
            }
        }
        C1709a.m3014b(C7383o0OOO0O.OooOOO0, "http request: " + str3);
        return str3;
    }
}
