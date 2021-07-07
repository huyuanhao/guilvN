package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3472z;

/* renamed from: com.umeng.analytics.c */
public class C3410c {

    /* renamed from: a */
    public static String[] f8406a = new String[2];

    /* renamed from: a */
    public static void m8723a(Context context, String str, String str2) {
        String[] strArr = f8406a;
        strArr[0] = str;
        strArr[1] = str2;
        if (context != null) {
            C3472z.m8945a(context).mo38805a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m8725b(Context context) {
        String[] strArr = f8406a;
        strArr[0] = null;
        strArr[1] = null;
        if (context != null) {
            C3472z.m8945a(context).mo38807b();
        }
    }

    /* renamed from: a */
    public static String[] m8724a(Context context) {
        String[] a;
        if (!TextUtils.isEmpty(f8406a[0]) && !TextUtils.isEmpty(f8406a[1])) {
            return f8406a;
        }
        if (context == null || (a = C3472z.m8945a(context).mo38806a()) == null) {
            return null;
        }
        String[] strArr = f8406a;
        strArr[0] = a[0];
        strArr[1] = a[1];
        return strArr;
    }
}
