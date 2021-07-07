package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4278ba;

/* renamed from: com.xiaomi.mipush.sdk.m */
public class C4226m {

    /* renamed from: a */
    public static int f11314a = -1;

    /* renamed from: a */
    public static EnumC4195an m11575a(Context context) {
        try {
            return (context.getPackageManager().getServiceInfo(new ComponentName(HuaweiApiAvailability.SERVICES_PACKAGE, "com.huawei.hms.core.service.HMSCoreService"), 128) == null || !m11576a()) ? EnumC4195an.OTHER : EnumC4195an.HUAWEI;
        } catch (Exception unused) {
            return EnumC4195an.OTHER;
        }
    }

    /* renamed from: a */
    public static boolean m11576a() {
        try {
            String str = (String) C4278ba.m11774a("android.os.SystemProperties", "get", DeviceConfig.KEY_EMUI_VERSION_CODE, "");
            return !TextUtils.isEmpty(str) && Integer.parseInt(str) >= 9;
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
    }

    /* renamed from: a */
    public static boolean m11577a(Context context) {
        Object a = C4278ba.m11772a(C4278ba.m11774a("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object a2 = C4278ba.m11773a("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (a2 == null || !(a2 instanceof Integer)) {
            AbstractC4163b.m11305c("google service is not avaliable");
            f11314a = 0;
            return false;
        }
        int intValue = ((Integer) Integer.class.cast(a2)).intValue();
        if (a != null) {
            if (a instanceof Integer) {
                f11314a = ((Integer) Integer.class.cast(a)).intValue() == intValue ? 1 : 0;
            } else {
                f11314a = 0;
                AbstractC4163b.m11305c("google service is not avaliable");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("is google service can be used");
        sb.append(f11314a > 0);
        AbstractC4163b.m11305c(sb.toString());
        return f11314a > 0;
    }

    /* renamed from: b */
    public static boolean m11578b(Context context) {
        boolean z = false;
        Object a = C4278ba.m11774a("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        if (a != null && (a instanceof Boolean)) {
            z = ((Boolean) Boolean.class.cast(a)).booleanValue();
        }
        AbstractC4163b.m11305c("color os push  is avaliable ? :" + z);
        return z;
    }

    /* renamed from: c */
    public static boolean m11579c(Context context) {
        boolean z = false;
        Object a = C4278ba.m11774a("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        if (a != null && (a instanceof Boolean)) {
            z = ((Boolean) Boolean.class.cast(a)).booleanValue();
        }
        AbstractC4163b.m11305c("fun touch os push  is avaliable ? :" + z);
        return z;
    }
}
