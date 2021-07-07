package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import com.huawei.hianalytics.util.C1105e;
import com.umeng.message.MsgConstant;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.pd.sdk.oOoooO0O  reason: case insensitive filesystem */
public abstract class AbstractC8475oOoooO0O {
    public static Pair<String, String> OooO00o(Context context) {
        if (C1105e.OooO00o(context, MsgConstant.PERMISSION_READ_PHONE_STATE)) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "getMccAndMnc() Pair value is empty");
            return new Pair<>("", "");
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return new Pair<>("", "");
        }
        if (telephonyManager.getSimState() != 5) {
            return new Pair<>("", "");
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        return (TextUtils.isEmpty(networkOperator) || TextUtils.equals(networkOperator, "null")) ? new Pair<>("", "") : networkOperator.length() > 3 ? new Pair<>(networkOperator.substring(0, 3), networkOperator.substring(3)) : new Pair<>("", "");
    }

    public static String OooO00o() {
        String str;
        String str2 = "";
        try {
            String str3 = (String) Class.forName("com.huawei.android.os.BuildEx").getMethod("getUDID", new Class[0]).invoke(null, new Object[0]);
            try {
                AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "getUDID success");
                return str3;
            } catch (ClassNotFoundException unused) {
                str2 = str3;
            } catch (AndroidRuntimeException unused2) {
                str2 = str3;
                str = "getUDID getudid failed, RuntimeException is AndroidRuntimeException";
                AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str);
                return str2;
            } catch (NoSuchMethodException unused3) {
                str2 = str3;
                str = "getUDID method invoke failed : NoSuchMethodException";
                AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str);
                return str2;
            } catch (IllegalAccessException unused4) {
                str2 = str3;
                str = "getUDID method invoke failed : Illegal AccessException";
                AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str);
                return str2;
            } catch (IllegalArgumentException unused5) {
                str2 = str3;
                str = "getUDID method invoke failed : Illegal ArgumentException";
                AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str);
                return str2;
            } catch (InvocationTargetException unused6) {
                str2 = str3;
                str = "getUDID method invoke failed : InvocationTargetException";
                AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str);
                return str2;
            }
        } catch (ClassNotFoundException unused7) {
            str = "getUDID method invoke failed";
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str);
            return str2;
        } catch (AndroidRuntimeException unused8) {
            str = "getUDID getudid failed, RuntimeException is AndroidRuntimeException";
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str);
            return str2;
        } catch (NoSuchMethodException unused9) {
            str = "getUDID method invoke failed : NoSuchMethodException";
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str);
            return str2;
        } catch (IllegalAccessException unused10) {
            str = "getUDID method invoke failed : Illegal AccessException";
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str);
            return str2;
        } catch (IllegalArgumentException unused11) {
            str = "getUDID method invoke failed : Illegal ArgumentException";
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str);
            return str2;
        } catch (InvocationTargetException unused12) {
            str = "getUDID method invoke failed : InvocationTargetException";
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str);
            return str2;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20134OooO00o(Context context) {
        return context == null ? "" : context.getPackageName();
    }

    public static String OooO0O0() {
        return C1105e.OooO0O0("ro.build.version.emui", "");
    }

    public static String OooO0O0(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(m20134OooO00o(context), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "getVersion(): The package name is not correct!");
            return "";
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String OooO0OO(Context context) {
        if (C1105e.OooO00o(context, MsgConstant.PERMISSION_READ_PHONE_STATE)) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getDeviceId() : "";
        } catch (SecurityException unused) {
            AbstractC8536oo00OO0O.OooO0Oo("HianalyticsSDK", "getDeviceID Incorrect permissions!");
            return "";
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String OooO0Oo(Context context) {
        return context == null ? "" : Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String OooO0o(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get(C8754oo0oo00O.OooO0o0)) == null) {
                return "Unknown";
            }
            String obj2 = obj.toString();
            return obj2.length() > 256 ? "Unknown" : obj2;
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "getChannel(): The packageName is not correct!");
            return "Unknown";
        }
    }

    public static String OooO0o0(Context context) {
        String str = Build.SERIAL;
        return (TextUtils.isEmpty(str) || str.equalsIgnoreCase("unknown")) ? OooO0oO(context) : str;
    }

    @TargetApi(26)
    public static String OooO0oO(Context context) {
        AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "getSerial : is executed.");
        if (context == null || C1105e.OooO00o(context, MsgConstant.PERMISSION_READ_PHONE_STATE)) {
            return "";
        }
        try {
            return Build.getSerial();
        } catch (SecurityException unused) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "getSerial() Incorrect permissions!");
            return "";
        }
    }
}
