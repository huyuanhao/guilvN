package com.alibaba.sdk.android.httpdns;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.alibaba.sdk.android.httpdns.a */
public class C0254a {

    /* renamed from: a */
    public static long f561a;
    public static String sSecretKey;

    /* renamed from: a */
    public static String m417a(String str, String str2) {
        if (!C0301k.m539b(str)) {
            return "";
        }
        try {
            return C0301k.m538a(str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + sSecretKey + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m418a() {
        return !TextUtils.isEmpty(sSecretKey);
    }

    public static String getTimestamp() {
        return String.valueOf((System.currentTimeMillis() / 1000) + f561a + 600);
    }

    public static void setAuthCurrentTime(long j) {
        f561a = j - (System.currentTimeMillis() / 1000);
    }

    public static void setSecretKey(String str) {
        sSecretKey = str;
    }
}
