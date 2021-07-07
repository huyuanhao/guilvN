package com.huawei.hms.p035a;

import com.umeng.commonsdk.statistics.common.DeviceConfig;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.huawei.hms.a.a */
public class C1107a {

    /* renamed from: com.huawei.hms.a.a$a */
    public static class C1108a {

        /* renamed from: a */
        public static final int f1094a = C1107a.m991a(DeviceConfig.KEY_EMUI_VERSION_CODE, 0);
    }

    /* renamed from: a */
    public static int m991a(String str, int i) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(cls, str, Integer.valueOf(i))).intValue();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return i;
        }
    }
}
