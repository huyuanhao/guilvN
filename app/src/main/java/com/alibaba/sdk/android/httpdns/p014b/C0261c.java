package com.alibaba.sdk.android.httpdns.p014b;

import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* renamed from: com.alibaba.sdk.android.httpdns.b.c */
public class C0261c {

    /* renamed from: a */
    public static final SimpleDateFormat f577a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: a */
    public static long m445a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static String m446c(String str) {
        try {
            return f577a.format(Long.valueOf(m445a(str) * 1000));
        } catch (Exception unused) {
            return f577a.format(Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: d */
    public static String m447d(String str) {
        try {
            return String.valueOf(f577a.parse(str).getTime() / 1000);
        } catch (Exception unused) {
            return String.valueOf(System.currentTimeMillis() / 1000);
        }
    }
}
