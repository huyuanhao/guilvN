package com.huawei.hms.p037c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.huawei.hms.c.f */
public abstract class AbstractC1136f {
    /* renamed from: a */
    public static int m1072a(Context context) {
        return m1073a(m1074b(context));
    }

    /* renamed from: b */
    public static NetworkInfo m1074b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    /* renamed from: a */
    public static int m1073a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            if (networkInfo.getType() == 1) {
                return 1;
            }
            if (networkInfo.getType() == 0) {
                switch (networkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 15:
                        return 3;
                    case 13:
                    case 14:
                        return 4;
                    default:
                        return 6;
                }
            }
        }
        return 0;
    }
}
