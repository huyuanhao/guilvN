package com.huawei.hms.api;

import android.content.Context;
import android.os.Build;
import com.huawei.hms.p037c.C1131a;
import com.huawei.hms.p037c.C1137g;
import com.huawei.hms.support.log.C1202a;

public abstract class HuaweiMobileServicesUtil {
    public static int isHuaweiMobileServicesAvailable(Context context, int i) {
        C1131a.m1062a(context, "context must not be null.");
        if (Build.VERSION.SDK_INT < 16) {
            return 21;
        }
        C1137g gVar = new C1137g(context);
        C1137g.EnumC1138a a = gVar.mo15416a(HuaweiApiAvailability.SERVICES_PACKAGE);
        if (C1137g.EnumC1138a.NOT_INSTALLED.equals(a)) {
            return 1;
        }
        if (C1137g.EnumC1138a.DISABLED.equals(a)) {
            return 3;
        }
        if (!HuaweiApiAvailability.SERVICES_SIGNATURE.equalsIgnoreCase(gVar.mo15419c(HuaweiApiAvailability.SERVICES_PACKAGE))) {
            return 9;
        }
        int b = gVar.mo15418b(HuaweiApiAvailability.SERVICES_PACKAGE);
        C1202a.m1318b("HuaweiMobileServicesUtil", "connect versionCode:" + b);
        return b < i ? 2 : 0;
    }
}
