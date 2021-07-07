package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.config.d */
public class C3502d {

    /* renamed from: a */
    public static final long f8876a = 1000;

    /* renamed from: b */
    public static final String f8877b = "_LAST_FIELD";

    /* renamed from: c */
    public static final String f8878c = "1073741823";

    /* renamed from: d */
    public static final String f8879d = "536870911";

    /* renamed from: e */
    public static final String f8880e = "262143";

    /* renamed from: f */
    public static final String f8881f = "2047";

    /* renamed from: g */
    public static final int f8882g = 64;

    /* renamed from: h */
    public static String[] f8883h = new String[EnumC3503a.values().length];

    /* renamed from: i */
    public static String[] f8884i = new String[EnumC3504b.values().length];

    /* renamed from: j */
    public static String[] f8885j = new String[EnumC3505c.values().length];

    /* renamed from: k */
    public static String[] f8886k = new String[EnumC3506d.values().length];

    /* renamed from: l */
    public static Map<String, String[]> f8887l = new HashMap();

    /* renamed from: com.umeng.commonsdk.config.d$a */
    public enum EnumC3503a {
        header_utoken,
        header_cpu,
        header_mccmnc,
        header_sub_os_name,
        header_sub_os_version,
        header_device_type,
        header_device_id_imei,
        header_device_id_mac,
        header_device_id_android_id,
        header_device_id_serialNo,
        header_bulid,
        header_os_version,
        header_resolution,
        header_mc,
        header_timezone,
        header_local_info,
        header_carrier,
        header_access,
        header_tracking_imei,
        header_tracking_android_id,
        header_tracking_utdid,
        header_tracking_idmd5,
        header_tracking_idfa,
        header_tracking_mac,
        header_tracking_serial,
        header_tracking_uuid,
        header_tracking_uop,
        header_tracking_oldumid,
        header_tracking_newumid,
        header_tracking_umtt,
        _LAST_FIELD
    }

    /* renamed from: com.umeng.commonsdk.config.d$b */
    public enum EnumC3504b {
        inner_rs,
        inner_by,
        inner_gp,
        inner_to,
        inner_mo,
        inner_ca,
        inner_fl,
        inner_gdf_r,
        inner_thm_z,
        inner_dsk_s,
        inner_sd,
        inner_build,
        inner_sr,
        inner_scr,
        inner_sinfo,
        inner_winfo,
        inner_input,
        inner_bt,
        inner_mem,
        inner_cpu,
        inner_rom,
        inner_bstn,
        inner_cam,
        inner_appls,
        inner_lbs,
        internal_run_server,
        internal_imsi,
        internal_meid,
        tp_tp,
        _LAST_FIELD
    }

    /* renamed from: com.umeng.commonsdk.config.d$c */
    public enum EnumC3505c {
        push_cpu,
        push_imei,
        push_mac,
        push_android_id,
        push_serialNo,
        push_settings_android_id,
        push_network_access_mode,
        push_on_line,
        push_time_zone,
        push_locale_info,
        push_resolution,
        push_operator,
        push_utdid,
        push_service_work,
        push_service_name,
        push_intent_exist,
        push_data_data,
        push_notification_enabled,
        _LAST_FIELD
    }

    /* renamed from: com.umeng.commonsdk.config.d$d */
    public enum EnumC3506d {
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

    static {
        String[] strArr = f8883h;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < EnumC3503a.values().length; i++) {
                f8883h[i] = EnumC3503a.values()[i].toString();
            }
            Map<String, String[]> map = f8887l;
            if (map != null) {
                map.put(EnumC3503a.class.getName(), f8883h);
            }
        }
        String[] strArr2 = f8884i;
        if (strArr2 != null && strArr2.length > 0) {
            for (int i2 = 0; i2 < EnumC3504b.values().length; i2++) {
                f8884i[i2] = EnumC3504b.values()[i2].toString();
            }
            Map<String, String[]> map2 = f8887l;
            if (map2 != null) {
                map2.put(EnumC3504b.class.getName(), f8884i);
            }
        }
        String[] strArr3 = f8885j;
        if (strArr3 != null && strArr3.length > 0) {
            for (int i3 = 0; i3 < EnumC3505c.values().length; i3++) {
                f8885j[i3] = EnumC3505c.values()[i3].toString();
            }
            Map<String, String[]> map3 = f8887l;
            if (map3 != null) {
                map3.put(EnumC3505c.class.getName(), f8885j);
            }
        }
        String[] strArr4 = f8886k;
        if (strArr4 != null && strArr4.length > 0) {
            for (int i4 = 0; i4 < EnumC3506d.values().length; i4++) {
                f8886k[i4] = EnumC3506d.values()[i4].toString();
            }
            Map<String, String[]> map4 = f8887l;
            if (map4 != null) {
                map4.put(EnumC3506d.class.getName(), f8886k);
            }
        }
    }

    /* renamed from: a */
    public static boolean m8999a(String str) {
        return str != null && str.length() > 0 && !"_LAST_FIELD".equalsIgnoreCase(str);
    }

    /* renamed from: b */
    public static String[] m9000b(String str) {
        if (str == null || str.length() <= 0 || !f8887l.containsKey(str)) {
            return null;
        }
        return f8887l.get(str);
    }
}
