package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.learnium.RNDeviceInfo.Util;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.idtracking.C3681i;
import com.umeng.commonsdk.utils.C3745b;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MsgConstant;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Properties;
import javax.microedition.khronos.opengles.GL10;

public class DeviceConfig {
    public static final int DEFAULT_TIMEZONE = 8;
    public static final String KEY_EMUI_VERSION_CODE = "ro.build.hw_emui_api_level";
    public static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    public static final String LOG_TAG = "com.umeng.commonsdk.statistics.common.DeviceConfig";
    public static final String MOBILE_NETWORK = "2G/3G";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";

    public static String byte2HexFormatted(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkPermission(android.content.Context r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            r3 = 1
            if (r1 < r2) goto L_0x002e
            java.lang.String r1 = "android.content.Context"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "checkSelfPermission"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x003d }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch:{ all -> 0x003d }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ all -> 0x003d }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x003d }
            r2[r0] = r7     // Catch:{ all -> 0x003d }
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch:{ all -> 0x003d }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x003d }
            int r6 = r6.intValue()     // Catch:{ all -> 0x003d }
            if (r6 != 0) goto L_0x003d
            goto L_0x003c
        L_0x002e:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String r6 = r6.getPackageName()
            int r6 = r1.checkPermission(r7, r6)
            if (r6 != 0) goto L_0x003d
        L_0x003c:
            r0 = 1
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.checkPermission(android.content.Context, java.lang.String):boolean");
    }

    public static String getAndroidId(Context context) {
        if (FieldManager.allow(C3745b.f9863t) && context != null) {
            try {
                return Settings.Secure.getString(context.getContentResolver(), "android_id");
            } catch (Exception unused) {
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m9811w("can't read android id");
                }
            }
        }
        return null;
    }

    public static String getAppHashKey(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures;
            if (signatureArr.length <= 0) {
                return null;
            }
            Signature signature = signatureArr[0];
            MessageDigest instance = MessageDigest.getInstance("SHA");
            instance.update(signature.toByteArray());
            return Base64.encodeToString(instance.digest(), 0).trim();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getAppMD5Signature(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return byte2HexFormatted(MessageDigest.getInstance("MD5").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getAppName(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.m9801i(LOG_TAG, th);
            return null;
        }
    }

    public static String getAppSHA1Key(Context context) {
        try {
            return byte2HexFormatted(MessageDigest.getInstance("SHA1").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getAppVersionCode(Context context) {
        return UMUtils.getAppVersionCode(context);
    }

    public static String getAppVersionName(Context context) {
        return UMUtils.getAppVersionName(context);
    }

    public static String getApplicationLable(Context context) {
        return context == null ? "" : context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[Catch:{ all -> 0x001d, all -> 0x0025 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Properties getBuildProp() {
        /*
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x001f }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x001f }
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch:{ all -> 0x001f }
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x001f }
            r2.<init>(r3)     // Catch:{ all -> 0x001f }
            r0.load(r2)     // Catch:{ all -> 0x001d }
            r2.close()     // Catch:{ all -> 0x0025 }
            goto L_0x0025
        L_0x001d:
            r1 = r2
            goto L_0x0020
        L_0x001f:
        L_0x0020:
            if (r1 == 0) goto L_0x0025
            r1.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getBuildProp():java.util.Properties");
    }

    public static String getCPU() {
        if (!FieldManager.allow(C3745b.f9845b)) {
            return "";
        }
        String str = null;
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
                str = bufferedReader.readLine();
                bufferedReader.close();
                fileReader.close();
            } catch (Throwable th) {
                MLog.m9794e(LOG_TAG, "Could not read from file /proc/cpuinfo", th);
            }
        } catch (FileNotFoundException e) {
            MLog.m9794e(LOG_TAG, "Could not open file /proc/cpuinfo", e);
        }
        return str != null ? str.substring(str.indexOf(58) + 1).trim() : "";
    }

    public static String getDBencryptID(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                str = telephonyManager.getDeviceId();
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (!TextUtils.isEmpty(string) || Build.VERSION.SDK_INT < 9) {
                return string;
            }
            if (Build.VERSION.SDK_INT < 26) {
                return Build.SERIAL;
            }
            Class<?> cls = Class.forName("android.os.Build");
            return (String) cls.getMethod("getSerial", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getDeviceId(Context context) {
        if (AnalyticsConstants.getDeviceType() == 2) {
            return getDeviceIdForBox(context);
        }
        return getDeviceIdForGeneral(context);
    }

    public static String getDeviceIdForBox(Context context) {
        String str = "";
        if (context == null) {
            return str;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            if (FieldManager.allow(C3745b.f9852i)) {
                str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m9802i(LOG_TAG, "getDeviceId, ANDROID_ID: " + str);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String macBySystemInterface = getMacBySystemInterface(context);
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.m9802i(LOG_TAG, "getDeviceId, MAC: " + macBySystemInterface);
            }
            if (!TextUtils.isEmpty(macBySystemInterface)) {
                return macBySystemInterface;
            }
            String serialNo = getSerialNo();
            if (TextUtils.isEmpty(serialNo)) {
                return getIMEI(context);
            }
            return serialNo;
        } else if (i == 23) {
            if (FieldManager.allow(C3745b.f9852i)) {
                str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m9802i(LOG_TAG, "getDeviceId, ANDROID_ID: " + str);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String macByJavaAPI = getMacByJavaAPI();
            if (TextUtils.isEmpty(macByJavaAPI)) {
                if (AnalyticsConstants.CHECK_DEVICE) {
                    macByJavaAPI = getMacShell();
                } else {
                    macByJavaAPI = getMacBySystemInterface(context);
                }
            }
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.m9802i(LOG_TAG, "getDeviceId, MAC: " + macByJavaAPI);
            }
            if (!TextUtils.isEmpty(macByJavaAPI)) {
                return macByJavaAPI;
            }
            String serialNo2 = getSerialNo();
            if (TextUtils.isEmpty(serialNo2)) {
                return getIMEI(context);
            }
            return serialNo2;
        } else if (i >= 29) {
            String oaid = getOaid(context);
            String str2 = "+++++++" + oaid;
            if (!TextUtils.isEmpty(oaid)) {
                return oaid;
            }
            String idfa = getIdfa(context);
            if (!TextUtils.isEmpty(idfa)) {
                return idfa;
            }
            String androidId = getAndroidId(context);
            if (!TextUtils.isEmpty(androidId)) {
                return androidId;
            }
            String serialNo3 = getSerialNo();
            if (!TextUtils.isEmpty(serialNo3)) {
                return serialNo3;
            }
            String macByJavaAPI2 = getMacByJavaAPI();
            if (TextUtils.isEmpty(macByJavaAPI2)) {
                return getMacBySystemInterface(context);
            }
            return macByJavaAPI2;
        } else {
            if (FieldManager.allow(C3745b.f9852i)) {
                str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m9802i(LOG_TAG, "getDeviceId: ANDROID_ID: " + str);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String serialNo4 = getSerialNo();
            if (!TextUtils.isEmpty(serialNo4)) {
                return serialNo4;
            }
            String imei = getIMEI(context);
            if (!TextUtils.isEmpty(imei)) {
                return imei;
            }
            String macByJavaAPI3 = getMacByJavaAPI();
            if (!TextUtils.isEmpty(macByJavaAPI3)) {
                return macByJavaAPI3;
            }
            String macBySystemInterface2 = getMacBySystemInterface(context);
            if (!AnalyticsConstants.UM_DEBUG) {
                return macBySystemInterface2;
            }
            MLog.m9802i(LOG_TAG, "getDeviceId, MAC: " + macBySystemInterface2);
            return macBySystemInterface2;
        }
    }

    public static String getDeviceIdForGeneral(Context context) {
        if (context == null) {
            return "";
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            String imei = getIMEI(context);
            if (!TextUtils.isEmpty(imei)) {
                return imei;
            }
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.m9814w(LOG_TAG, "No IMEI.");
            }
            String macBySystemInterface = getMacBySystemInterface(context);
            if (!TextUtils.isEmpty(macBySystemInterface)) {
                return macBySystemInterface;
            }
            if (FieldManager.allow(C3745b.f9852i)) {
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m9802i(LOG_TAG, "getDeviceId, ANDROID_ID: " + string);
                }
                macBySystemInterface = string;
            }
            if (TextUtils.isEmpty(macBySystemInterface)) {
                return getSerialNo();
            }
            return macBySystemInterface;
        } else if (i == 23) {
            String imei2 = getIMEI(context);
            if (!TextUtils.isEmpty(imei2)) {
                return imei2;
            }
            String macByJavaAPI = getMacByJavaAPI();
            if (TextUtils.isEmpty(macByJavaAPI)) {
                if (AnalyticsConstants.CHECK_DEVICE) {
                    macByJavaAPI = getMacShell();
                } else {
                    macByJavaAPI = getMacBySystemInterface(context);
                }
            }
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.m9802i(LOG_TAG, "getDeviceId, MAC: " + macByJavaAPI);
            }
            if (!TextUtils.isEmpty(macByJavaAPI)) {
                return macByJavaAPI;
            }
            if (FieldManager.allow(C3745b.f9852i)) {
                String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m9802i(LOG_TAG, "getDeviceId, ANDROID_ID: " + string2);
                }
                macByJavaAPI = string2;
            }
            if (TextUtils.isEmpty(macByJavaAPI)) {
                return getSerialNo();
            }
            return macByJavaAPI;
        } else if (i >= 29) {
            String oaid = getOaid(context);
            String str = "+++++++" + oaid;
            if (!TextUtils.isEmpty(oaid)) {
                return oaid;
            }
            String idfa = getIdfa(context);
            if (!TextUtils.isEmpty(idfa)) {
                return idfa;
            }
            String androidId = getAndroidId(context);
            if (!TextUtils.isEmpty(androidId)) {
                return androidId;
            }
            String serialNo = getSerialNo();
            if (!TextUtils.isEmpty(serialNo)) {
                return serialNo;
            }
            String macByJavaAPI2 = getMacByJavaAPI();
            if (TextUtils.isEmpty(macByJavaAPI2)) {
                return getMacBySystemInterface(context);
            }
            return macByJavaAPI2;
        } else {
            String imei3 = getIMEI(context);
            if (!TextUtils.isEmpty(imei3)) {
                return imei3;
            }
            String serialNo2 = getSerialNo();
            if (!TextUtils.isEmpty(serialNo2)) {
                return serialNo2;
            }
            if (FieldManager.allow(C3745b.f9852i)) {
                serialNo2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m9802i(LOG_TAG, "getDeviceId, ANDROID_ID: " + serialNo2);
                }
            }
            if (!TextUtils.isEmpty(serialNo2)) {
                return serialNo2;
            }
            String macByJavaAPI3 = getMacByJavaAPI();
            if (!TextUtils.isEmpty(macByJavaAPI3)) {
                return macByJavaAPI3;
            }
            String macBySystemInterface2 = getMacBySystemInterface(context);
            if (!AnalyticsConstants.UM_DEBUG) {
                return macBySystemInterface2;
            }
            MLog.m9802i(LOG_TAG, "getDeviceId, MAC: " + macBySystemInterface2);
            return macBySystemInterface2;
        }
    }

    public static String getDeviceIdUmengMD5(Context context) {
        return HelperUtils.getUmengMD5(getDeviceId(context));
    }

    public static String getDeviceType(Context context) {
        if (!FieldManager.allow(C3745b.f9849f) || context == null) {
            return "Phone";
        }
        if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            return "Tablet";
        }
        return "Phone";
    }

    public static String getDisplayResolution(Context context) {
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                return String.valueOf(i2) + "*" + String.valueOf(i);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String getEmuiVersion(Properties properties) {
        try {
            return properties.getProperty(KEY_EMUI_VERSION_CODE, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getFlymeVersion(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.m9794e(LOG_TAG, "Could not read gpu infor:", th);
            }
            return new String[0];
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getIMEI(android.content.Context r5) {
        /*
            java.lang.String r0 = "header_device_id_imei"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0054
            if (r5 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 == 0) goto L_0x0054
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r5 = checkPermission(r5, r2)     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x0054
            java.lang.String r5 = r0.getDeviceId()     // Catch:{ all -> 0x0048 }
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch:{ all -> 0x0045 }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0045 }
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r3.<init>()     // Catch:{ all -> 0x0045 }
            java.lang.String r4 = "getDeviceId, IMEI: "
            r3.append(r4)     // Catch:{ all -> 0x0045 }
            r3.append(r5)     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0045 }
            r1[r2] = r3     // Catch:{ all -> 0x0045 }
            com.umeng.commonsdk.statistics.common.MLog.m9802i(r0, r1)     // Catch:{ all -> 0x0045 }
        L_0x0043:
            r1 = r5
            goto L_0x0054
        L_0x0045:
            r0 = move-exception
            r1 = r5
            goto L_0x0049
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            boolean r5 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r5 == 0) goto L_0x0054
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG
            java.lang.String r2 = "No IMEI."
            com.umeng.commonsdk.statistics.common.MLog.m9812w(r5, r2, r0)
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getIMEI(android.content.Context):java.lang.String");
    }

    public static String getIdfa(Context context) {
        try {
            if (FieldManager.allow(C3745b.f9866w)) {
                return C3660a.m9847a(context);
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getImei(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null || !checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                return null;
            }
            return telephonyManager.getDeviceId();
        } catch (Exception e) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.m9813w("No IMEI.", e);
            return null;
        }
    }

    public static String getImeiNew(Context context) {
        TelephonyManager telephonyManager;
        String str = null;
        try {
            if (!FieldManager.allow(C3745b.f9862s) || context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null || !checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                return null;
            }
            if (Build.VERSION.SDK_INT < 26) {
                return telephonyManager.getDeviceId();
            }
            try {
                Method method = telephonyManager.getClass().getMethod("getImei", new Class[0]);
                method.setAccessible(true);
                str = (String) method.invoke(telephonyManager, new Object[0]);
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(str)) {
                return telephonyManager.getDeviceId();
            }
            return str;
        } catch (Exception e) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.m9813w("No IMEI.", e);
            return null;
        }
    }

    public static String getImsi(Context context) {
        if (context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (!checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE) || telephonyManager == null) {
            return null;
        }
        return telephonyManager.getSubscriberId();
    }

    public static Locale getLocale(Context context) {
        Locale locale;
        if (context == null) {
            return Locale.getDefault();
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Throwable unused) {
            MLog.m9796e(LOG_TAG, "fail to read user config locale");
            locale = null;
        }
        return locale == null ? Locale.getDefault() : locale;
    }

    public static String[] getLocaleInfo(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        if (!FieldManager.allow(C3745b.f9859p) || context == null) {
            return strArr;
        }
        try {
            Locale locale = getLocale(context);
            if (locale != null) {
                strArr[0] = locale.getCountry();
                strArr[1] = locale.getLanguage();
            }
            if (TextUtils.isEmpty(strArr[0])) {
                strArr[0] = "Unknown";
            }
            if (TextUtils.isEmpty(strArr[1])) {
                strArr[1] = "Unknown";
            }
            return strArr;
        } catch (Throwable th) {
            MLog.m9794e(LOG_TAG, "error in getLocaleInfo", th);
            return strArr;
        }
    }

    public static String getMCCMNC(Context context) {
        if (!FieldManager.allow(C3745b.f9846c) || context == null || getImsi(context) == null) {
            return null;
        }
        int i = context.getResources().getConfiguration().mcc;
        int i2 = context.getResources().getConfiguration().mnc;
        if (i != 0) {
            String valueOf = String.valueOf(i2);
            if (i2 < 10) {
                valueOf = String.format("%02d", Integer.valueOf(i2));
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(String.valueOf(i));
            stringBuffer.append(valueOf);
            return stringBuffer.toString();
        }
        return null;
    }

    public static String getMac(Context context) {
        if ((!FieldManager.allow(C3745b.f9857n) && !FieldManager.allow(C3745b.f9867x)) || context == null) {
            return "";
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            return getMacBySystemInterface(context);
        }
        if (i == 23) {
            String macByJavaAPI = getMacByJavaAPI();
            if (!TextUtils.isEmpty(macByJavaAPI)) {
                return macByJavaAPI;
            }
            if (AnalyticsConstants.CHECK_DEVICE) {
                return getMacShell();
            }
            return getMacBySystemInterface(context);
        }
        String macByJavaAPI2 = getMacByJavaAPI();
        return TextUtils.isEmpty(macByJavaAPI2) ? getMacBySystemInterface(context) : macByJavaAPI2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[Catch:{ all -> 0x0076 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMacByJavaAPI() {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getMacByJavaAPI():java.lang.String");
    }

    public static String getMacBySystemInterface(Context context) {
        if (context == null) {
            return "";
        }
        try {
            if (FieldManager.allow(C3745b.f9851h)) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (checkPermission(context, MsgConstant.PERMISSION_ACCESS_WIFI_STATE)) {
                    if (wifiManager != null) {
                        return wifiManager.getConnectionInfo().getMacAddress();
                    }
                    return "";
                } else if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m9814w(LOG_TAG, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
                }
            }
            return "";
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = LOG_TAG;
                MLog.m9814w(str, "Could not get mac address." + th.toString());
            }
            return "";
        }
    }

    public static String getMacShell() {
        try {
            if (!FieldManager.allow(C3745b.f9851h)) {
                return null;
            }
            String[] strArr = {"/sys/class/net/wlan0/address", "/sys/class/net/eth0/address", "/sys/devices/virtual/net/wlan0/address"};
            for (int i = 0; i < 3; i++) {
                try {
                    String reaMac = reaMac(strArr[i]);
                    if (reaMac != null) {
                        return reaMac;
                    }
                } catch (Throwable th) {
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.m9794e(LOG_TAG, "open file  Failed", th);
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"", ""};
        if (context != null && FieldManager.allow(C3745b.f9861r)) {
            try {
                if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    strArr[0] = "";
                    return strArr;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    strArr[0] = "";
                    return strArr;
                }
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (networkInfo == null || networkInfo.getState() != NetworkInfo.State.CONNECTED) {
                    NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                    if (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED) {
                        strArr[0] = "2G/3G";
                        strArr[1] = networkInfo2.getSubtypeName();
                    }
                } else {
                    strArr[0] = "Wi-Fi";
                    return strArr;
                }
            } catch (Throwable unused) {
            }
        }
        return strArr;
    }

    public static String getNetworkOperatorName(Context context) {
        if (context != null && FieldManager.allow(C3745b.f9860q)) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE) && telephonyManager != null) {
                    return telephonyManager.getNetworkOperatorName();
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public static String getOaid(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(C3681i.f9649a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(C3681i.f9650b, "");
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getPackageName(Context context) {
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    public static String getRegisteredOperator(Context context) {
        if (context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (!checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE) || telephonyManager == null) {
            return null;
        }
        return telephonyManager.getNetworkOperator();
    }

    public static int[] getResolutionArray(Context context) {
        int i;
        int i2;
        if (context != null && FieldManager.allow(C3745b.f9856m)) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager == null) {
                    return null;
                }
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                if ((context.getApplicationInfo().flags & 8192) == 0) {
                    i = reflectMetrics(displayMetrics, "noncompatWidthPixels");
                    i2 = reflectMetrics(displayMetrics, "noncompatHeightPixels");
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i == -1 || i2 == -1) {
                    i = displayMetrics.widthPixels;
                    i2 = displayMetrics.heightPixels;
                }
                int[] iArr = new int[2];
                if (i > i2) {
                    iArr[0] = i2;
                    iArr[1] = i;
                } else {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                return iArr;
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.m9794e(LOG_TAG, "read resolution fail", th);
                }
            }
        }
        return null;
    }

    public static String getSerial() {
        int i;
        if (!FieldManager.allow(C3745b.f9868y) || (i = Build.VERSION.SDK_INT) < 9) {
            return null;
        }
        if (i < 26) {
            return Build.SERIAL;
        }
        try {
            Class<?> cls = Class.forName("android.os.Build");
            return (String) cls.getMethod("getSerial", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getSerialNo() {
        /*
            java.lang.String r0 = "header_device_id_serialNo"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            r1 = 0
            if (r0 == 0) goto L_0x002d
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 9
            if (r0 < r2) goto L_0x002d
            r2 = 26
            if (r0 < r2) goto L_0x002a
            java.lang.String r0 = "android.os.Build"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "getSerial"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x002d }
            java.lang.reflect.Method r2 = r0.getMethod(r2, r3)     // Catch:{ all -> 0x002d }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x002d }
            goto L_0x002f
        L_0x002a:
            java.lang.String r0 = android.os.Build.SERIAL
            goto L_0x002f
        L_0x002d:
            java.lang.String r0 = ""
        L_0x002f:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L_0x004e
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getDeviceId, serial no: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3[r1] = r4
            com.umeng.commonsdk.statistics.common.MLog.m9802i(r2, r3)
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.getSerialNo():java.lang.String");
    }

    public static String getSubOSName(Context context) {
        String str;
        if (!FieldManager.allow(C3745b.f9847d)) {
            return null;
        }
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty("ro.miui.ui.version.name");
            if (!TextUtils.isEmpty(property)) {
                str = Util.ROM_MIUI;
            } else if (isFlyMe()) {
                str = "Flyme";
            } else if (isEmui(buildProp)) {
                str = "Emui";
            } else if (TextUtils.isEmpty(getYunOSVersion(buildProp))) {
                return property;
            } else {
                str = "YunOS";
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getSubOSVersion(Context context) {
        String yunOSVersion;
        if (!FieldManager.allow(C3745b.f9848e)) {
            return null;
        }
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty("ro.miui.ui.version.name");
            if (TextUtils.isEmpty(property)) {
                if (isFlyMe()) {
                    try {
                        yunOSVersion = getFlymeVersion(buildProp);
                    } catch (Throwable unused) {
                    }
                } else if (isEmui(buildProp)) {
                    yunOSVersion = getEmuiVersion(buildProp);
                } else {
                    yunOSVersion = getYunOSVersion(buildProp);
                }
                return yunOSVersion;
            }
            return property;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int getTimeZone(Context context) {
        if (context != null && FieldManager.allow(C3745b.f9858o)) {
            try {
                Calendar instance = Calendar.getInstance(getLocale(context));
                if (instance != null) {
                    return instance.getTimeZone().getRawOffset() / 3600000;
                }
            } catch (Throwable th) {
                MLog.m9800i(LOG_TAG, "error in getTimeZone", th);
            }
        }
        return 8;
    }

    public static String getYunOSVersion(Properties properties) {
        String property = properties.getProperty("ro.yunos.version");
        if (!TextUtils.isEmpty(property)) {
            return property;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isChineseAera(android.content.Context r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "country"
            java.lang.String r2 = ""
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r5, r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "cn"
            r4 = 1
            if (r2 != 0) goto L_0x001d
            boolean r5 = r1.equals(r3)
            if (r5 == 0) goto L_0x001c
            return r4
        L_0x001c:
            return r0
        L_0x001d:
            java.lang.String r1 = getImsi(r5)
            if (r1 != 0) goto L_0x0036
            java.lang.String[] r5 = getLocaleInfo(r5)
            r5 = r5[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x005e
            boolean r5 = r5.equalsIgnoreCase(r3)
            if (r5 == 0) goto L_0x005e
            return r4
        L_0x0036:
            android.content.res.Resources r1 = r5.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.mcc
            r2 = 460(0x1cc, float:6.45E-43)
            if (r1 == r2) goto L_0x005f
            r2 = 461(0x1cd, float:6.46E-43)
            if (r1 != r2) goto L_0x0049
            goto L_0x005f
        L_0x0049:
            if (r1 != 0) goto L_0x005e
            java.lang.String[] r5 = getLocaleInfo(r5)
            r5 = r5[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x005e
            boolean r5 = r5.equalsIgnoreCase(r3)
            if (r5 == 0) goto L_0x005e
            return r4
        L_0x005e:
            return r0
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.isChineseAera(android.content.Context):boolean");
    }

    public static boolean isEmui(Properties properties) {
        try {
            return properties.getProperty(KEY_EMUI_VERSION_CODE, null) != null;
        } catch (Exception unused) {
        }
    }

    public static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            if (!(!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean isWiFiAvailable(Context context) {
        if (context == null) {
            return false;
        }
        return "Wi-Fi".equals(getNetworkAccessMode(context)[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0023 A[SYNTHETIC, Splitter:B:18:0x0023] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String reaMac(java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x0027 }
            r1.<init>(r3)     // Catch:{ all -> 0x0027 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x001a }
            r2 = 1024(0x400, float:1.435E-42)
            r3.<init>(r1, r2)     // Catch:{ all -> 0x001a }
            java.lang.String r0 = r3.readLine()     // Catch:{ all -> 0x0018 }
            r1.close()     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r3.close()
            goto L_0x0027
        L_0x0018:
            r2 = move-exception
            goto L_0x001c
        L_0x001a:
            r2 = move-exception
            r3 = r0
        L_0x001c:
            r1.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            if (r3 == 0) goto L_0x0026
            r3.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            throw r2
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.DeviceConfig.reaMac(java.lang.String):java.lang.String");
    }

    public static int reflectMetrics(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
