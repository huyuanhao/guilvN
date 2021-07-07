package com.umeng.socialize.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

public class DeviceConfigInternal {
    public static final String LOG_TAG = "DeviceConfig";
    public static final String MOBILE_NETWORK = "2G/3G";
    public static final String UNKNOW = "Unknown";
    public static final String WIFI = "Wi-Fi";
    public static Context context;
    public static Object object = new Object();

    public static boolean checkPermission(Context context2, String str) {
        return DeviceConfig.checkPermission(context2, str);
    }

    public static String getAndroidID(Context context2) {
        return context2 == null ? "" : Settings.Secure.getString(context2.getContentResolver(), "android_id");
    }

    public static String getAppVersion(String str, Context context2) {
        if (context2 == null) {
            return "";
        }
        try {
            return context2.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getDeviceId(Context context2) {
        return DeviceConfig.getDeviceId(context2);
    }

    public static String getDeviceSN() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.serialno", "unknown");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getMac(Context context2) {
        return DeviceConfig.getMac(context2);
    }

    public static String[] getNetworkAccessMode(Context context2) {
        return DeviceConfig.getNetworkAccessMode(context2);
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getPackageName(Context context2) {
        return context2 == null ? "" : context2.getPackageName();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isAppInstalled(java.lang.String r3, android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Object r1 = com.umeng.socialize.utils.DeviceConfigInternal.object
            monitor-enter(r1)
            r2 = 1
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException | RuntimeException -> 0x0013 }
            r4.getPackageInfo(r3, r2)     // Catch:{ NameNotFoundException | RuntimeException -> 0x0013 }
            r0 = 1
            goto L_0x0013
        L_0x0011:
            r3 = move-exception
            goto L_0x0015
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
            return r0
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.utils.DeviceConfigInternal.isAppInstalled(java.lang.String, android.content.Context):boolean");
    }

    public static boolean isNetworkAvailable(Context context2) {
        if (context2 != null && DeviceConfig.checkPermission(context2, "android.permission.ACCESS_NETWORK_STATE") && DeviceConfig.isOnline(context2)) {
            return true;
        }
        return false;
    }

    public static boolean isOnline(Context context2) {
        return DeviceConfig.isOnline(context2);
    }

    public static boolean isSdCardWrittenable() {
        return Environment.getExternalStorageState().equals("mounted");
    }
}
