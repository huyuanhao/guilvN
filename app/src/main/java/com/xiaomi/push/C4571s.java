package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;

/* renamed from: com.xiaomi.push.s */
public class C4571s {
    /* renamed from: a */
    public static String m13745a(String str, String str2) {
        try {
            return (String) C4688t.m14219a(null, "android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            AbstractC4163b.m11301a("SystemProperties.get: " + e);
            return str2;
        }
    }
}
