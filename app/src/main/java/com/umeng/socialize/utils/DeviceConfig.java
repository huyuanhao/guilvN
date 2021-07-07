package com.umeng.socialize.utils;

import android.content.Context;
import android.os.Build;
import com.umeng.socialize.utils.ShareConfigFields;

public class DeviceConfig {
    public static boolean isSupportConfig = ShareConfigFields.isSupportConfig();

    public static boolean checkPermission(Context context, String str) {
        return DeviceConfigInternal.checkPermission(context, str);
    }

    public static String getAndroidID(Context context) {
        if (isSupportConfig) {
            return ShareConfigFields.allow(ShareConfigFields.Field_Share.share_android_id.name()).booleanValue() ? DeviceConfigInternal.getAndroidID(context) : "";
        }
        return DeviceConfigInternal.getAndroidID(context);
    }

    public static String getAppVersion(String str, Context context) {
        return DeviceConfigInternal.getAppVersion(str, context);
    }

    public static String getDeviceId(Context context) {
        if (isSupportConfig) {
            return ShareConfigFields.allow(ShareConfigFields.Field_Share.share_device_id.name()).booleanValue() ? DeviceConfigInternal.getDeviceId(context) : "";
        }
        return DeviceConfigInternal.getDeviceId(context);
    }

    public static String getDeviceSN() {
        if (isSupportConfig) {
            return ShareConfigFields.allow(ShareConfigFields.Field_Share.share_sn.name()).booleanValue() ? DeviceConfigInternal.getDeviceSN() : "";
        }
        return DeviceConfigInternal.getDeviceSN();
    }

    public static String getMac(Context context) {
        if (isSupportConfig) {
            return ShareConfigFields.allow(ShareConfigFields.Field_Share.share_wifi_mac.name()).booleanValue() ? DeviceConfigInternal.getMac(context) : "";
        }
        return DeviceConfigInternal.getMac(context);
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        if (isSupportConfig) {
            return ShareConfigFields.allow(ShareConfigFields.Field_Share.share_net_accmode.name()).booleanValue() ? DeviceConfigInternal.getNetworkAccessMode(context) : strArr;
        }
        return DeviceConfigInternal.getNetworkAccessMode(context);
    }

    public static String getOsVersion() {
        return DeviceConfigInternal.getOsVersion();
    }

    public static String getPackageName(Context context) {
        return DeviceConfigInternal.getPackageName(context);
    }

    public static boolean hasFineLocationPermissionInQ(Context context) {
        if (Build.VERSION.SDK_INT > 28) {
            return checkPermission(context, "android.permission.ACCESS_FINE_LOCATION");
        }
        return true;
    }

    public static boolean isAppInstalled(String str, Context context) {
        return DeviceConfigInternal.isAppInstalled(str, context);
    }

    public static boolean isNetworkAvailable(Context context) {
        return DeviceConfigInternal.isNetworkAvailable(context);
    }

    public static boolean isOnline(Context context) {
        return DeviceConfigInternal.isOnline(context);
    }

    public static boolean isSdCardWrittenable() {
        return DeviceConfigInternal.isSdCardWrittenable();
    }
}
