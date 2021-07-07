package org.android.agoo.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.utl.ALog;

public class Config {
    public static final String AGOO_CLEAR_TIME = "agoo_clear_time";
    public static final String AGOO_ENABLE_DAEMONSERVER = "agoo_enable_daemonserver";
    public static final String AGOO_UNREPORT_TIMES = "agoo_UnReport_times";
    public static final String KEY_DEVICE_TOKEN = "deviceId";
    public static final String PREFERENCES = "Agoo_AppStore";
    public static final String PROPERTY_AGOO_SERVICE_MODE = "agoo_service_mode";
    public static final String PROPERTY_APP_KEY = "agoo_app_key";
    public static final String PROPERTY_APP_VERSION = "app_version";
    public static final String PROPERTY_DEVICE_TOKEN = "app_device_token";
    public static final String PROPERTY_PUSH_USER_TOKEN = "app_push_user_token";
    public static final String PROPERTY_TT_ID = "app_tt_id";
    public static final String TAG = "Config";

    /* renamed from: a */
    public static String f13429a;

    /* renamed from: b */
    public static String f13430b;

    /* renamed from: c */
    public static String f13431c;

    /* renamed from: a */
    public static String m14266a(Context context) {
        String str = f13430b;
        try {
            str = context.getSharedPreferences("Agoo_AppStore", 4).getString(PROPERTY_APP_KEY, f13430b);
        } catch (Throwable th) {
            ALog.m7598e(TAG, "getAgooAppKey", th, new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            ALog.m7599e(TAG, "getAgooAppKey null!!", new Object[0]);
        }
        ALog.m7597d(TAG, "getAgooAppKey", "appkey", str);
        return str;
    }

    /* renamed from: b */
    public static String m14271b(Context context) {
        if (TextUtils.isEmpty(f13429a)) {
            return ACCSManager.getDefaultConfig(context);
        }
        return f13429a;
    }

    /* renamed from: c */
    public static boolean m14274c(Context context) {
        try {
            if (context.getSharedPreferences("Agoo_AppStore", 4).getInt(AGOO_UNREPORT_TIMES, 0) > 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static void m14275d(Context context) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("Agoo_AppStore", 4).edit();
            edit.putInt(AGOO_UNREPORT_TIMES, 0);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public static int m14276e(Context context) {
        try {
            return context.getSharedPreferences("Agoo_AppStore", 4).getInt(AGOO_UNREPORT_TIMES, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: f */
    public static boolean m14277f(Context context) {
        try {
            return context.getSharedPreferences("Agoo_AppStore", 4).getBoolean(AGOO_ENABLE_DAEMONSERVER, true);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static String m14278g(Context context) {
        String str = f13431c;
        try {
            str = context.getSharedPreferences("Agoo_AppStore", 4).getString("deviceId", f13431c);
        } catch (Throwable th) {
            ALog.m7598e(TAG, "getDeviceToken", th, new Object[0]);
        }
        ALog.m7600i(TAG, "getDeviceToken", "token", str);
        return str;
    }

    /* renamed from: h */
    public static String m14279h(Context context) {
        try {
            return context.getSharedPreferences("Agoo_AppStore", 4).getString(PROPERTY_PUSH_USER_TOKEN, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void setAgooAppKey(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                ALog.m7599e(TAG, "setAgooAppKey appkey null", new Object[0]);
                return;
            }
            f13430b = str;
            SharedPreferences.Editor edit = context.getSharedPreferences("Agoo_AppStore", 4).edit();
            edit.putString(PROPERTY_APP_KEY, str);
            edit.apply();
            ALog.m7597d(TAG, "setAgooAppKey", "appkey", str);
        } catch (Throwable th) {
            ALog.m7598e(TAG, "setAgooAppKey", th, new Object[0]);
        }
    }

    /* renamed from: b */
    public static boolean m14273b(Context context, long j) {
        try {
            long j2 = context.getSharedPreferences("Agoo_AppStore", 4).getLong(AGOO_CLEAR_TIME, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("now=");
            sb.append(j);
            sb.append(",now - lastTime=");
            long j3 = j - j2;
            sb.append(j3);
            sb.append(",istrue=");
            sb.append(j3 > 86400000);
            ALog.m7597d("isClearTime", sb.toString(), new Object[0]);
            if (j == 0 || j3 <= 86400000) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static void m14272b(Context context, String str) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("Agoo_AppStore", 4).edit();
            if (!TextUtils.isEmpty(str)) {
                edit.putString(PROPERTY_PUSH_USER_TOKEN, str);
            }
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m14269a(Context context, String str) {
        ALog.m7600i(TAG, "setDeviceToken", "token", str);
        if (!TextUtils.isEmpty(str)) {
            f13431c = str;
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Agoo_AppStore", 4).edit();
                edit.putString("deviceId", str);
                edit.apply();
            } catch (Throwable th) {
                ALog.m7598e(TAG, "setDeviceToken", th, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m14267a(Context context, int i) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("Agoo_AppStore", 4);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(AGOO_UNREPORT_TIMES, sharedPreferences.getInt(AGOO_UNREPORT_TIMES, 0) + i);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m14268a(Context context, long j) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("Agoo_AppStore", 4).edit();
            edit.putLong(AGOO_CLEAR_TIME, j);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m14270a(Context context, boolean z) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("Agoo_AppStore", 4).edit();
            edit.putBoolean(AGOO_ENABLE_DAEMONSERVER, z);
            edit.apply();
        } catch (Throwable unused) {
        }
    }
}
