package com.tencent.bugly.crashreport.inner;

import com.tencent.bugly.crashreport.crash.C3290d;
import com.tencent.bugly.proguard.C3321an;
import java.util.Map;

public class InnerApi {
    public static void postCocos2dxCrashAsync(int i, String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            C3321an.m8357e("post cocos2d-x fail args null", new Object[0]);
        } else if (i == 5 || i == 6) {
            C3321an.m8349a("post cocos2d-x crash %s %s", str, str2);
            C3290d.m8171a(Thread.currentThread(), i, str, str2, str3, null);
        } else {
            C3321an.m8357e("post cocos2d-x fail category illeagle: %d", Integer.valueOf(i));
        }
    }

    public static void postH5CrashAsync(Thread thread, String str, String str2, String str3, Map<String, String> map) {
        if (str == null || str2 == null || str3 == null) {
            C3321an.m8357e("post h5 fail args null", new Object[0]);
            return;
        }
        C3321an.m8349a("post h5 crash %s %s", str, str2);
        C3290d.m8171a(thread, 8, str, str2, str3, map);
    }

    public static void postU3dCrashAsync(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            C3321an.m8357e("post u3d fail args null", new Object[0]);
        }
        C3321an.m8349a("post u3d crash %s %s", str, str2);
        C3290d.m8171a(Thread.currentThread(), 4, str, str2, str3, null);
    }
}
