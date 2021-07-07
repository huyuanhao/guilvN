package com.p118pd.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.pd.sdk.oo00o00  reason: case insensitive filesystem */
public class C8558oo00o00 {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static String OooO00o(int i, String str) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                break;
            case 13:
                return "4G";
            default:
                if (!str.equalsIgnoreCase("TD-SCDMA") && !str.equalsIgnoreCase("WCDMA") && !str.equalsIgnoreCase("CDMA2000")) {
                    return str;
                }
        }
        return "3G";
    }

    public static String OooO00o(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "not have network state phone permission!");
            return "";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return "";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() == 0) {
            String subtypeName = activeNetworkInfo.getSubtypeName();
            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "Network getSubtypeName : " + subtypeName);
            return OooO00o(activeNetworkInfo.getSubtype(), subtypeName);
        } else if (activeNetworkInfo.getType() != 16) {
            return "";
        } else {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "type name = " + "COMPANION_PROXY");
            return "COMPANION_PROXY";
        }
    }

    public static void OooO00o(int i, Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                AbstractC8536oo00OO0O.OooO0OO("LogStreamUtil", "closeQuietly(): Exception when closing the closeable!");
            }
        }
    }
}
