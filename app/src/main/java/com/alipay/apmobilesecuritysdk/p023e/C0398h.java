package com.alipay.apmobilesecuritysdk.p023e;

import android.content.Context;
import android.content.SharedPreferences;
import com.p118pd.sdk.C7557o0o00OO0;
import com.p118pd.sdk.C7559o0o00OOo;
import com.p118pd.sdk.C7565o0o00o0;
import com.p118pd.sdk.C7568o0o00oO;
import java.util.UUID;

/* renamed from: com.alipay.apmobilesecuritysdk.e.h */
public class C0398h {

    /* renamed from: a */
    public static String f884a = "";

    /* renamed from: a */
    public static long m787a(Context context) {
        String OooO00o = C7565o0o00o0.OooO00o(context, "vkeyid_settings", "update_time_interval");
        if (!C7559o0o00OOo.m19212OooO0O0(OooO00o)) {
            return 86400000;
        }
        try {
            return Long.parseLong(OooO00o);
        } catch (Exception unused) {
            return 86400000;
        }
    }

    /* renamed from: a */
    public static void m788a(Context context, String str) {
        m790a(context, "update_time_interval", str);
    }

    /* renamed from: a */
    public static void m789a(Context context, String str, long j) {
        C7565o0o00o0.OooO00o(context, "vkeyid_settings", "vkey_valid" + str, String.valueOf(j));
    }

    /* renamed from: a */
    public static void m790a(Context context, String str, String str2) {
        C7565o0o00o0.OooO00o(context, "vkeyid_settings", str, str2);
    }

    /* renamed from: a */
    public static void m791a(Context context, boolean z) {
        m790a(context, "log_switch", z ? "1" : "0");
    }

    /* renamed from: b */
    public static String m792b(Context context) {
        return C7565o0o00o0.OooO00o(context, "vkeyid_settings", "last_apdid_env");
    }

    /* renamed from: b */
    public static void m793b(Context context, String str) {
        m790a(context, "last_machine_boot_time", str);
    }

    /* renamed from: c */
    public static void m794c(Context context, String str) {
        m790a(context, "last_apdid_env", str);
    }

    /* renamed from: c */
    public static boolean m795c(Context context) {
        String OooO00o = C7565o0o00o0.OooO00o(context, "vkeyid_settings", "log_switch");
        return OooO00o != null && "1".equals(OooO00o);
    }

    /* renamed from: d */
    public static String m796d(Context context) {
        return C7565o0o00o0.OooO00o(context, "vkeyid_settings", "dynamic_key");
    }

    /* renamed from: d */
    public static void m797d(Context context, String str) {
        m790a(context, "agent_switch", str);
    }

    /* renamed from: e */
    public static String m798e(Context context) {
        return C7565o0o00o0.OooO00o(context, "vkeyid_settings", "apse_degrade");
    }

    /* renamed from: e */
    public static void m799e(Context context, String str) {
        m790a(context, "dynamic_key", str);
    }

    /* renamed from: f */
    public static String m800f(Context context) {
        String str;
        SharedPreferences.Editor edit;
        synchronized (C0398h.class) {
            if (C7559o0o00OOo.m19210OooO00o(f884a)) {
                String OooO00o = C7568o0o00oO.OooO00o(context, "alipay_vkey_random", "random", "");
                f884a = OooO00o;
                if (C7559o0o00OOo.m19210OooO00o(OooO00o)) {
                    String OooO00o2 = C7557o0o00OO0.OooO00o(UUID.randomUUID().toString());
                    f884a = OooO00o2;
                    if (!(OooO00o2 == null || (edit = context.getSharedPreferences("alipay_vkey_random", 0).edit()) == null)) {
                        edit.putString("random", OooO00o2);
                        edit.commit();
                    }
                }
            }
            str = f884a;
        }
        return str;
    }

    /* renamed from: f */
    public static void m801f(Context context, String str) {
        m790a(context, "webrtc_url", str);
    }

    /* renamed from: g */
    public static void m802g(Context context, String str) {
        m790a(context, "apse_degrade", str);
    }

    /* renamed from: h */
    public static long m803h(Context context, String str) {
        try {
            String OooO00o = C7565o0o00o0.OooO00o(context, "vkeyid_settings", "vkey_valid" + str);
            if (C7559o0o00OOo.m19210OooO00o(OooO00o)) {
                return 0;
            }
            return Long.parseLong(OooO00o);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
