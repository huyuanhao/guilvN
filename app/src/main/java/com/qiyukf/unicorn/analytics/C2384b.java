package com.qiyukf.unicorn.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import com.megvii.apo.PhoneFingerManager;
import java.util.Random;

/* renamed from: com.qiyukf.unicorn.analytics.b */
public final class C2384b {

    /* renamed from: a */
    public static Context f4771a;

    /* renamed from: a */
    public static void m5210a(float f) {
        if (f != m5220d().getFloat("YSF_SAMPLING_RATE", 0.0f)) {
            m5220d().edit().putFloat("YSF_SAMPLING_RATE", f).commit();
            m5220d().edit().putBoolean("YSF_SWITCH", new Random().nextFloat() < f).commit();
        }
    }

    /* renamed from: a */
    public static void m5211a(long j) {
        m5219c("YSF_DISTINCT_PERIOD", j * 60000);
    }

    /* renamed from: a */
    public static void m5212a(Context context) {
        f4771a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m5213a(String str, long j) {
        m5219c("YSF_ERROR_" + str, j);
    }

    /* renamed from: a */
    public static boolean m5214a() {
        return m5220d().getBoolean("YSF_SWITCH", false);
    }

    /* renamed from: a */
    public static boolean m5215a(String str) {
        if (!m5214a()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("YSF_ERROR_");
        sb.append(str);
        return System.currentTimeMillis() - m5216b(sb.toString(), 0) > m5216b("YSF_DISTINCT_PERIOD", PhoneFingerManager.PER_HOUR_MILLISECOND);
    }

    /* renamed from: b */
    public static long m5216b(String str, long j) {
        return m5220d().getLong(str, j);
    }

    /* renamed from: b */
    public static boolean m5217b() {
        return System.currentTimeMillis() - m5216b("YSF_LAST_CONFIG_TIME", 0) >= 86400000;
    }

    /* renamed from: c */
    public static void m5218c() {
        m5219c("YSF_LAST_CONFIG_TIME", System.currentTimeMillis());
    }

    /* renamed from: c */
    public static void m5219c(String str, long j) {
        m5220d().edit().putLong(str, j).commit();
    }

    /* renamed from: d */
    public static SharedPreferences m5220d() {
        return f4771a.getSharedPreferences("com.qiyukf.analytics", 0);
    }
}
