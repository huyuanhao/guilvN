package com.umeng.socialize.utils;

import java.lang.reflect.Method;

public class ShareConfigFields {
    public static final String LAST_FIELD = "_LAST_FIELD";

    public enum Field_Share {
        share_device_id,
        share_imsi,
        share_iccid,
        share_sn,
        share_net_accmode,
        share_android_id,
        share_wifi_mac,
        share_sd_size,
        share_ssid,
        share_resolution,
        share_conn_type,
        _LAST_FIELD
    }

    public static Boolean allow(String str) {
        Method method;
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.config.FieldManager");
            if (!(cls == null || (method = cls.getMethod("allow", String.class)) == null)) {
                return (Boolean) method.invoke(null, str);
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public static boolean isSupportConfig() {
        try {
            return Class.forName("com.umeng.commonsdk.config.FieldManager") != null;
        } catch (Throwable unused) {
            return false;
        }
    }
}
