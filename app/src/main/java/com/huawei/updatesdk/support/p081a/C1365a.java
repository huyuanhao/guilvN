package com.huawei.updatesdk.support.p081a;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.AbstractC1293e;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;

/* renamed from: com.huawei.updatesdk.support.a.a */
public final class C1365a {

    /* renamed from: a */
    public static final String f1650a = "a";

    /* renamed from: b */
    public static String f1651b;

    /* renamed from: a */
    public static String m2024a() {
        return "com.huawei.updatesdk";
    }

    /* renamed from: a */
    public static void m2025a(String str) {
        f1651b = str;
    }

    /* renamed from: b */
    public static String m2026b() {
        String str = f1651b;
        if (str != null) {
            return str;
        }
        try {
            String packageName = C1294a.m1650a().mo15900b().getPackageName();
            PackageInfo packageInfo = C1294a.m1650a().mo15900b().getPackageManager().getPackageInfo(C1294a.m1650a().mo15900b().getPackageName(), 0);
            if (packageInfo != null) {
                packageName = packageName + packageInfo.versionName;
            }
            String str2 = Build.BRAND;
            if (AbstractC1293e.m1646a(str2)) {
                str2 = DispatchConstants.OTHER;
            }
            m2025a(packageName + "_" + str2);
            return f1651b;
        } catch (PackageManager.NameNotFoundException e) {
            C1278a.m1584d(f1650a, "getUserAgent() " + e.toString());
            return null;
        }
    }
}
