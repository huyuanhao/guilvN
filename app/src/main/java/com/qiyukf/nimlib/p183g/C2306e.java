package com.qiyukf.nimlib.p183g;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1847c;
import com.qiyukf.nimlib.C2180b;
import java.util.UUID;

/* renamed from: com.qiyukf.nimlib.g.e */
public final class C2306e {
    /* renamed from: a */
    public static String m4923a() {
        String d = m4931d("k_s_did");
        if (!TextUtils.isEmpty(d)) {
            return d;
        }
        String uuid = UUID.randomUUID().toString();
        m4925a("k_s_did", uuid);
        return uuid;
    }

    /* renamed from: a */
    public static void m4924a(String str) {
        m4925a("k_default_link", str);
    }

    /* renamed from: a */
    public static void m4925a(String str, String str2) {
        C1847c.m3502a(m4932e(), str, str2);
    }

    /* renamed from: b */
    public static String m4926b() {
        return m4931d("k_default_link");
    }

    /* renamed from: b */
    public static void m4927b(String str) {
        m4925a("k_default_link_test", str);
    }

    /* renamed from: c */
    public static String m4928c() {
        return m4931d("k_default_link_test");
    }

    /* renamed from: c */
    public static void m4929c(String str) {
        m4925a("k_default_link_pre", str);
    }

    /* renamed from: d */
    public static String m4930d() {
        return m4931d("k_default_link_pre");
    }

    /* renamed from: d */
    public static String m4931d(String str) {
        return m4932e().getString(str, null);
    }

    /* renamed from: e */
    public static SharedPreferences m4932e() {
        Context a = C2180b.m4471a();
        return a.getSharedPreferences("NIMSDK_Config_" + C2180b.m4482g(), 0);
    }
}
