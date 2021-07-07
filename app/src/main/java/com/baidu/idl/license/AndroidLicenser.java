package com.baidu.idl.license;

import android.content.Context;

public class AndroidLicenser {
    public static String deviceID = "";
    public static AndroidLicenser mInstance;
    public boolean is_remote_authorize = true;
    public LicenseReader reader = new LicenseReader();

    public enum ErrorCode {
        SUCCESS,
        LICENSE_INIT_ERROR,
        LICENSE_DECRYPT_ERROR,
        LICENSE_INFO_FORMAT_ERROR,
        LICENSE_EXPIRED,
        LICENSE_MISS_REQUIRED_INFO,
        LICENSE_INFO_CHECK_ERROR,
        LICENSE_LOCAL_FILE_ERROR,
        LICENSE_REMOTE_DATA_ERROR
    }

    public static synchronized AndroidLicenser getInstance() {
        AndroidLicenser androidLicenser;
        synchronized (AndroidLicenser.class) {
            if (mInstance == null) {
                mInstance = new AndroidLicenser();
            }
            androidLicenser = mInstance;
        }
        return androidLicenser;
    }

    public static String get_device_id(Context context) {
        if ("".equals(deviceID)) {
            deviceID = LicenseDevice.getDeviceID(context).toUpperCase();
        }
        return deviceID;
    }

    private String[] get_local_license(Context context) {
        return this.reader.get_local_license(context);
    }

    private String[] get_remote_license(Context context, String str) {
        return this.reader.get_remote_license(context, str);
    }

    private native int init_with_algorithm(Context context, String str, String str2, int i);

    private int reader_init(String str) {
        return this.reader.init(str);
    }

    private native int remote_authenticate(Context context);

    public native int authenticate(Context context);

    public native String get_decrypted_license();

    public native String get_env_device_id(Context context);

    public native String get_env_package_name(Context context);

    public native String get_env_signature_md5(Context context);

    public native long get_expire_time();

    public native String get_license_algorithm();

    public native String get_license_api_key();

    public native String get_license_device_id();

    public native String get_license_info(String str);

    public native String get_license_package_name();

    public native String get_license_signature_md5();

    public native int init(Context context, String str, String str2);

    public int init(Context context, String str, String str2, int i) {
        return init_with_algorithm(context, str, str2, i);
    }

    public int put_local_license(Context context, String[] strArr) {
        return this.reader.put_local_license(context, strArr);
    }
}
