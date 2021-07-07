package com.huawei.hms.support.api.push.p046b.p049b;

import android.text.TextUtils;

/* renamed from: com.huawei.hms.support.api.push.b.b.c */
public class C1196c {
    /* renamed from: a */
    public static String m1294a(char c, int i) {
        StringBuffer stringBuffer = new StringBuffer(i);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m1295a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() < 2) {
            return str;
        }
        try {
            double length = (double) (str.length() * 25);
            Double.isNaN(length);
            int ceil = (int) Math.ceil(length / 100.0d);
            double length2 = (double) (str.length() * 50);
            Double.isNaN(length2);
            int ceil2 = (int) Math.ceil(length2 / 100.0d);
            return str.substring(0, ceil) + m1294a('*', ceil2) + str.substring(ceil + ceil2);
        } catch (IndexOutOfBoundsException unused) {
            return "";
        }
    }
}
