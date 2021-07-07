package com.qiyukf.nimlib.p155a;

import android.content.Context;
import android.content.SharedPreferences;
import com.qiyukf.basesdk.p138c.C1847c;
import com.qiyukf.nimlib.C2180b;

/* renamed from: com.qiyukf.nimlib.a.d */
public final class C2147d {
    /* renamed from: a */
    public static int m4397a() {
        return (int) m4401c().getLong("k_sys_msg_unread_c", 0);
    }

    /* renamed from: a */
    public static void m4398a(int i) {
        C1847c.m3501a(m4401c(), "k_sys_msg_unread_c", (long) i);
    }

    /* renamed from: a */
    public static void m4399a(String str) {
        C1847c.m3502a(m4401c(), "k_client_ip", str);
    }

    /* renamed from: b */
    public static String m4400b() {
        return m4401c().getString("k_client_ip", null);
    }

    /* renamed from: c */
    public static SharedPreferences m4401c() {
        Context a = C2180b.m4471a();
        return a.getSharedPreferences("NIMSDK_Config_" + C2180b.m4482g() + "_" + C2180b.m4477b(), 0);
    }
}
