package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.umeng.commonsdk.proguard.f */
public class C3606f {

    /* renamed from: a */
    public static AbstractC3605e f9298a;

    /* renamed from: b */
    public static boolean f9299b;

    /* renamed from: a */
    public static String m9485a(Context context) {
        if (context == null) {
            throw new RuntimeException("Context is null");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            m9486b(context);
            AbstractC3605e eVar = f9298a;
            if (eVar == null) {
                return null;
            }
            try {
                return eVar.mo38983a(context);
            } catch (Exception unused) {
                return null;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    /* renamed from: b */
    public static void m9486b(Context context) {
        if (f9298a == null && !f9299b) {
            synchronized (C3606f.class) {
                if (f9298a == null && !f9299b) {
                    f9298a = m9487c(context);
                    f9299b = true;
                }
            }
        }
    }

    /* renamed from: c */
    public static AbstractC3605e m9487c(Context context) {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_HUAWEI) || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new C3601d();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("小米")) {
            return new C3609i();
        }
        if (str.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO)) {
            return new C3608h();
        }
        if (str.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_OPPO) || str.equalsIgnoreCase("oneplus")) {
            return new C3607g(context);
        }
        return null;
    }
}
