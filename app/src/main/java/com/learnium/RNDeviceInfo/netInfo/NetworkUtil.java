package com.learnium.RNDeviceInfo.netInfo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RequiresPermission;

public class NetworkUtil {
    public NetworkUtil() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean checkNetWork(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return connectivityManager != null && connectivityManager.getActiveNetworkInfo().getState() == NetworkInfo.State.CONNECTED;
        } catch (Exception unused) {
            return false;
        }
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkInfo getActiveNetworkInfo(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkType getNetworkType(Context context) {
        NetworkType networkType;
        NetworkType networkType2 = NetworkType.NETWORK_NO;
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return networkType2;
        }
        if (activeNetworkInfo.getType() == 1) {
            return NetworkType.NETWORK_WIFI;
        }
        if (activeNetworkInfo.getType() != 0) {
            return NetworkType.NETWORK_UNKNOWN;
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                networkType = NetworkType.NETWORK_2G;
                break;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                networkType = NetworkType.NETWORK_3G;
                break;
            case 13:
            case 18:
                networkType = NetworkType.NETWORK_4G;
                break;
            case 19:
            default:
                String subtypeName = activeNetworkInfo.getSubtypeName();
                if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                    networkType = NetworkType.NETWORK_UNKNOWN;
                    break;
                } else {
                    networkType = NetworkType.NETWORK_3G;
                    break;
                }
                break;
            case 20:
                networkType = NetworkType.NETWORK_5G;
                break;
        }
        return networkType;
    }
}
