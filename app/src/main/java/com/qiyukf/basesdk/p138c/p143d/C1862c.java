package com.qiyukf.basesdk.p138c.p143d;

import android.content.Context;
import android.content.res.Resources;
import com.learnium.RNDeviceInfo.SystemBarTintManager;

/* renamed from: com.qiyukf.basesdk.c.d.c */
public final class C1862c {

    /* renamed from: a */
    public static Context f3434a;

    /* renamed from: a */
    public static int m3539a() {
        return f3434a.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: a */
    public static int m3540a(float f) {
        return (int) ((f * f3434a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static void m3541a(Context context) {
        f3434a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static int m3542b() {
        return f3434a.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: c */
    public static int m3543c() {
        return Math.min(m3539a(), m3542b());
    }

    /* renamed from: d */
    public static int m3544d() {
        Resources resources;
        int identifier;
        Context context = f3434a;
        if (context != null && (identifier = (resources = context.getResources()).getIdentifier(SystemBarTintManager.SystemBarConfig.STATUS_BAR_HEIGHT_RES_NAME, "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: e */
    public static int m3545e() {
        Resources resources = f3434a.getResources();
        int identifier = resources.getIdentifier(SystemBarTintManager.SystemBarConfig.NAV_BAR_HEIGHT_RES_NAME, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
