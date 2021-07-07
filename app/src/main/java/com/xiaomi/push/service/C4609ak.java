package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.C4285bf;

/* renamed from: com.xiaomi.push.service.ak */
public class C4609ak {

    /* renamed from: a */
    public static long f13169a = 0;

    /* renamed from: a */
    public static String f13170a = "";

    /* renamed from: a */
    public static String m13938a() {
        if (TextUtils.isEmpty(f13170a)) {
            f13170a = C4285bf.m11799a(4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f13170a);
        long j = f13169a;
        f13169a = 1 + j;
        sb.append(j);
        return sb.toString();
    }
}
