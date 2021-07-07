package com.megvii.apo.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* renamed from: com.megvii.apo.util.f */
public final class C1496f {
    /* renamed from: a */
    public static int m2259a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                return 1;
            }
            if (type == 0) {
                return m2262d(context);
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m2260b(Context context) {
        int a = m2259a(context);
        return a == 2 || a == 3 || a == 4;
    }

    /* renamed from: c */
    public static boolean m2261c(Context context) {
        return m2259a(context) == 1;
    }

    /* renamed from: d */
    public static int m2262d(Context context) {
        switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }
}
