package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C3441h;
import com.umeng.analytics.pro.C3472z;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;

public class AnalyticsConfig {
    public static MobclickAgent.PageMode AUTO_ACTIVITY_PAGE_COLLECTION = MobclickAgent.PageMode.LEGACY_AUTO;
    public static boolean CATCH_EXCEPTION = true;
    public static boolean CHANGE_CATCH_EXCEPTION_NOTALLOW = false;
    public static boolean CLEAR_EKV_BL = false;
    public static boolean CLEAR_EKV_WL = false;
    public static String GPU_RENDERER = "";
    public static String GPU_VENDER = "";

    /* renamed from: a */
    public static double[] f8355a = null;

    /* renamed from: b */
    public static String f8356b;

    /* renamed from: c */
    public static String f8357c;

    /* renamed from: d */
    public static String f8358d;

    /* renamed from: e */
    public static int f8359e;
    public static long kContinueSessionMillis = 30000;
    public static String mWrapperType;
    public static String mWrapperVersion;

    /* renamed from: a */
    public static void m8665a(String str) {
        f8357c = str;
    }

    public static String getAppkey(Context context) {
        return UMUtils.getAppkey(context);
    }

    public static String getChannel(Context context) {
        return UMUtils.getChannel(context);
    }

    public static double[] getLocation() {
        return f8355a;
    }

    public static String getSecretKey(Context context) {
        if (TextUtils.isEmpty(f8358d)) {
            f8358d = C3472z.m8945a(context).mo38808c();
        }
        return f8358d;
    }

    public static int getVerticalType(Context context) {
        if (f8359e == 0) {
            f8359e = C3472z.m8945a(context).mo38809d();
        }
        return f8359e;
    }

    /* renamed from: a */
    public static void m8664a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            f8358d = str;
            C3472z.m8945a(context).mo38804a(f8358d);
            return;
        }
        UMLog.m9005aq(C3441h.f8595A, 0, "\\|");
    }

    /* renamed from: a */
    public static void m8663a(Context context, int i) {
        f8359e = i;
        C3472z.m8945a(context).mo38803a(f8359e);
    }
}
