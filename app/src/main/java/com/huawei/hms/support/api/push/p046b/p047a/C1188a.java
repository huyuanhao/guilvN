package com.huawei.hms.support.api.push.p046b.p047a;

import android.annotation.SuppressLint;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.p118pd.sdk.C6996o000OOo0;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.huawei.hms.support.api.push.b.a.a */
public class C1188a {
    /* renamed from: a */
    public static boolean m1267a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return m1268b(context);
        }
        if (i >= 19) {
            return m1268b(context);
        }
        return true;
    }

    @SuppressLint({"NewApi", "InlinedApi"})
    /* renamed from: b */
    public static boolean m1268b(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            if (((Integer) cls.getMethod(C6996o000OOo0.f19223OooO0O0, Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField(C6996o000OOo0.f19224OooO0OO).get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
