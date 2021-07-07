package com.qiyukf.unicorn.p232k;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.qiyukf.basesdk.p119a.C1709a;
import com.umeng.message.MsgConstant;

/* renamed from: com.qiyukf.unicorn.k.a */
public final class C2693a {
    /* renamed from: a */
    public static String m6232a(Context context) {
        String str;
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            return null;
        }
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (packageManager == null) {
            str = "getActiveMacAddress pm null, fuck!";
        } else if (packageManager.checkPermission(MsgConstant.PERMISSION_ACCESS_WIFI_STATE, context.getApplicationContext().getPackageName()) != 0) {
            str = "getActiveMacAddress without permission!";
        } else {
            try {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo != null) {
                    return connectionInfo.getMacAddress();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                C1709a.m3016c("AppUtils", "getActiveMacAddress error, e=" + th.getMessage());
            }
            return null;
        }
        C1709a.m3016c("AppUtils", str);
        return null;
    }

    /* renamed from: b */
    public static String m6233b(Context context) {
        PackageManager packageManager;
        if (context == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return Settings.System.getString(context.getContentResolver(), "android_id");
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            C1709a.m3016c("AppUtils", "getIMEI tm null, fuck!");
            return null;
        }
        boolean z = false;
        if (context != null && !TextUtils.isEmpty(MsgConstant.PERMISSION_READ_PHONE_STATE) && (packageManager = context.getPackageManager()) != null && packageManager.checkPermission(MsgConstant.PERMISSION_READ_PHONE_STATE, context.getApplicationInfo().packageName) == 0) {
            z = true;
        }
        if (!z) {
            C1709a.m3016c("AppUtils", "getIMEI without permission!");
            return null;
        }
        try {
            return telephonyManager.getDeviceId();
        } catch (Exception e) {
            C1709a.m3015b("AppUtil", "getIMEI is error", e);
            return null;
        }
    }

    /* renamed from: c */
    public static String m6234c(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            th.printStackTrace();
            C1709a.m3016c("AppUtils", "get android id error, e=" + th.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public static int m6235d(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 1).versionCode;
        } catch (Exception e) {
            C1709a.m3016c("get package name fail,threadId = {}, e={}", Thread.currentThread().getId() + e.getMessage());
            return -1;
        }
    }
}
