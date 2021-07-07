package com.qiyukf.basesdk.p138c.p143d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;

/* renamed from: com.qiyukf.basesdk.c.d.b */
public final class C1861b {

    /* renamed from: a */
    public static byte f3432a = 0;

    /* renamed from: b */
    public static final Uri f3433b = Uri.parse("content://telephony/carriers/preferapn");

    /* renamed from: a */
    public static int m3528a(Context context) {
        NetworkInfo k = m3538k(context);
        if (k == null) {
            return -1;
        }
        return k.getType();
    }

    /* renamed from: b */
    public static boolean m3529b(Context context) {
        NetworkInfo k = m3538k(context);
        if (k != null) {
            return k.isAvailable();
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m3530c(Context context) {
        NetworkInfo k = m3538k(context);
        if (k != null) {
            return k.isConnected();
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m3531d(Context context) {
        return !(m3533f(context) ? true : m3532e(context));
    }

    /* renamed from: e */
    public static boolean m3532e(Context context) {
        int i = m3536i(context);
        return i == 2 || i == 3;
    }

    /* renamed from: f */
    public static boolean m3533f(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static String m3534g(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        return connectionInfo != null ? connectionInfo.getMacAddress() : "";
    }

    /* renamed from: h */
    public static String m3535h(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "";
        }
        if (activeNetworkInfo.getType() == 1) {
            return activeNetworkInfo.getTypeName();
        }
        StringBuilder sb = new StringBuilder();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        sb.append(activeNetworkInfo.getTypeName());
        sb.append(" [");
        if (telephonyManager != null) {
            sb.append(telephonyManager.getNetworkOperatorName());
            sb.append("#");
        }
        sb.append(activeNetworkInfo.getSubtypeName());
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: i */
    public static int m3536i(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
            if (activeNetworkInfo.getType() == 0) {
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 1;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 2;
                    case 13:
                        return 3;
                    default:
                        return 0;
                }
            } else if (activeNetworkInfo.getType() == 1) {
                return 10;
            }
        }
        return 0;
    }

    /* renamed from: j */
    public static String m3537j(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getSimOperator();
        }
        return null;
    }

    /* renamed from: k */
    public static NetworkInfo m3538k(Context context) {
        try {
            return ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }
}
