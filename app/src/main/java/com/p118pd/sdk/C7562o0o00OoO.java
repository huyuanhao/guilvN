package com.p118pd.sdk;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.baidu.idl.face.platform.common.ConstantHelper;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.message.MsgConstant;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0o00OoO  reason: case insensitive filesystem */
public final class C7562o0o00OoO {
    public static C7562o0o00OoO OooO00o = new C7562o0o00OoO();

    public static String OooO() {
        long j = 0;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                j = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(j);
    }

    public static String OooO(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.widthPixels);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static C7562o0o00OoO OooO00o() {
        return OooO00o;
    }

    public static String OooO00o(Context context) {
        if (OooO00o(context, MsgConstant.PERMISSION_READ_PHONE_STATE)) {
            return "";
        }
        String str = null;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    str = telephonyManager.getDeviceId();
                }
            } catch (Throwable unused) {
            }
        }
        return str == null ? "" : str;
    }

    public static boolean OooO00o(Context context, String str) {
        return !(context.getPackageManager().checkPermission(str, context.getPackageName()) == 0);
    }

    public static String OooO0O0() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            j = 0;
        }
        return String.valueOf(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO0O0(android.content.Context r2) {
        /*
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r0 = OooO00o(r2, r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            if (r2 == 0) goto L_0x001c
            java.lang.String r0 = "phone"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch:{ all -> 0x001c }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = r2.getSubscriberId()     // Catch:{ all -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r2 = r1
        L_0x001d:
            if (r2 != 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7562o0o00OoO.OooO0O0(android.content.Context):java.lang.String");
    }

    public static String OooO0OO() {
        long j = 0;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(C7559o0o00OOo.OooO00o().getPath());
                j = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(j);
    }

    public static String OooO0OO(Context context) {
        int i = 0;
        try {
            i = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
        }
        return i == 1 ? "1" : "0";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(8:1|2|3|4|5|6|7|(2:8|(3:10|11|(2:13|(2:42|15)(1:16))(0))(0)))|23|24|(1:41)(1:43)|(1:(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0066, code lost:
        if (r2 != null) goto L_0x004c;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a A[SYNTHETIC, Splitter:B:32:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061 A[SYNTHETIC, Splitter:B:36:0x0061] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO0Oo() {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7562o0o00OoO.OooO0Oo():java.lang.String");
    }

    public static String OooO0Oo(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int i = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", String.valueOf(i));
            jSONObject.put("call", String.valueOf(streamVolume));
            jSONObject.put(ConstantHelper.LOG_OS, String.valueOf(streamVolume2));
            jSONObject.put("ring", String.valueOf(streamVolume3));
            jSONObject.put("music", String.valueOf(streamVolume4));
            jSONObject.put("alarm", String.valueOf(streamVolume5));
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0023 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002a */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0034 A[SYNTHETIC, Splitter:B:28:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO0o() {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "/proc/cpuinfo"
            r1.<init>(r2)     // Catch:{ all -> 0x0031 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002e }
            r2.<init>(r1)     // Catch:{ all -> 0x002e }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x002f }
            java.lang.String r3 = ":\\s+"
            r4 = 2
            java.lang.String[] r0 = r0.split(r3, r4)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0027
            int r3 = r0.length     // Catch:{ all -> 0x002f }
            r4 = 1
            if (r3 <= r4) goto L_0x0027
            r0 = r0[r4]     // Catch:{ all -> 0x002f }
            r1.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r2.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            return r0
        L_0x0027:
            r1.close()     // Catch:{ all -> 0x002a }
        L_0x002a:
            r2.close()     // Catch:{ all -> 0x003c }
            goto L_0x003c
        L_0x002e:
            r2 = r0
        L_0x002f:
            r0 = r1
            goto L_0x0032
        L_0x0031:
            r2 = r0
        L_0x0032:
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ all -> 0x0038 }
            goto L_0x0039
        L_0x0038:
        L_0x0039:
            if (r2 == 0) goto L_0x003c
            goto L_0x002a
        L_0x003c:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7562o0o00OoO.OooO0o():java.lang.String");
    }

    public static String OooO0o(Context context) {
        List<Sensor> sensorList;
        String str = null;
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(C3617o.f9339Z);
                if (!(sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0)) {
                    StringBuilder sb = new StringBuilder();
                    for (Sensor sensor : sensorList) {
                        sb.append(sensor.getName());
                        sb.append(sensor.getVersion());
                        sb.append(sensor.getVendor());
                    }
                    str = C7559o0o00OOo.OooO0O0(sb.toString());
                }
            } catch (Throwable unused) {
            }
        }
        return str == null ? "" : str;
    }

    public static String OooO0o0() {
        String OooOo0 = OooOo0();
        return !C7559o0o00OOo.m19210OooO00o(OooOo0) ? OooOo0 : OooOo0O();
    }

    public static String OooO0o0(Context context) {
        String str = null;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    str = telephonyManager.getNetworkOperatorName();
                }
            } catch (Throwable unused) {
            }
        }
        return (str == null || "null".equals(str)) ? "" : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r0 == null) goto L_0x003b;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0029 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033 A[SYNTHETIC, Splitter:B:21:0x0033] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO0oO() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r2 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0030 }
            r4.<init>(r0)     // Catch:{ all -> 0x0030 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x002d }
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch:{ all -> 0x002d }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0026
            java.lang.String r5 = "\\s+"
            java.lang.String[] r1 = r1.split(r5)     // Catch:{ all -> 0x002e }
            r5 = 1
            r1 = r1[r5]     // Catch:{ all -> 0x002e }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x002e }
            long r1 = (long) r1
            r2 = r1
        L_0x0026:
            r4.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0.close()     // Catch:{ all -> 0x003b }
            goto L_0x003b
        L_0x002d:
            r0 = r1
        L_0x002e:
            r1 = r4
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            if (r1 == 0) goto L_0x0038
            r1.close()     // Catch:{ all -> 0x0037 }
            goto L_0x0038
        L_0x0037:
        L_0x0038:
            if (r0 == 0) goto L_0x003b
            goto L_0x0029
        L_0x003b:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7562o0o00OoO.OooO0oO():java.lang.String");
    }

    public static String OooO0oO(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(C3617o.f9339Z);
                if (!(sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0)) {
                    for (Sensor sensor : sensorList) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    public static String OooO0oo() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            j = 0;
        }
        return String.valueOf(j);
    }

    public static String OooO0oo(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + "*" + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String OooOO0() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String OooOO0(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.heightPixels);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String OooOO0O() {
        String str;
        try {
            str = Locale.getDefault().toString();
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String OooOO0O(Context context) {
        String str = "";
        if (OooO00o(context, MsgConstant.PERMISSION_ACCESS_WIFI_STATE)) {
            return str;
        }
        try {
            str = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            if (str == null || str.length() == 0 || "02:00:00:00:00:00".equals(str)) {
                return OooOo00();
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    public static String OooOO0o() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String OooOO0o(Context context) {
        if (OooO00o(context, MsgConstant.PERMISSION_READ_PHONE_STATE)) {
            return "";
        }
        try {
            String simSerialNumber = ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
            if (simSerialNumber == null) {
                return "";
            }
            if (simSerialNumber != null) {
                try {
                    if (simSerialNumber.length() == 0) {
                        return "";
                    }
                } catch (Throwable unused) {
                }
            }
            return simSerialNumber;
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String OooOOO() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String OooOOO(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String OooOOO0() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis - (currentTimeMillis % 1000));
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String OooOOO0(Context context) {
        String str;
        try {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String OooOOOO() {
        try {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb.append("00" + Constants.COLON_SEPARATOR);
            for (int i = 0; i < 7; i++) {
                sb.append(new File(strArr[i]).exists() ? "1" : "0");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooOOOO(android.content.Context r2) {
        /*
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            boolean r0 = OooO00o(r2, r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            java.lang.String r0 = "wifi"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch:{ all -> 0x0022 }
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2     // Catch:{ all -> 0x0022 }
            boolean r0 = r2.isWifiEnabled()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0022
            android.net.wifi.WifiInfo r2 = r2.getConnectionInfo()     // Catch:{ all -> 0x0022 }
            java.lang.String r2 = r2.getBSSID()     // Catch:{ all -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r2 = r1
        L_0x0023:
            if (r2 != 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = r2
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7562o0o00OoO.OooOOOO(android.content.Context):java.lang.String");
    }

    public static String OooOOOo() {
        String[] strArr = {"dalvik.system.Taint"};
        StringBuilder sb = new StringBuilder();
        sb.append("00");
        sb.append(Constants.COLON_SEPARATOR);
        for (int i = 0; i <= 0; i++) {
            try {
                Class.forName(strArr[0]);
                sb.append("1");
            } catch (Throwable unused) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooOOOo(android.content.Context r3) {
        /*
            java.lang.String r0 = ""
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0021 }
            r2 = 29
            if (r1 < r2) goto L_0x000f
            goto L_0x0021
        L_0x000f:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0021 }
            r2 = 26
            if (r1 < r2) goto L_0x001e
            r1 = 28
            if (r3 < r1) goto L_0x001e
            java.lang.String r3 = android.os.Build.getSerial()     // Catch:{ all -> 0x0021 }
            goto L_0x0022
        L_0x001e:
            java.lang.String r3 = android.os.Build.SERIAL     // Catch:{ all -> 0x0021 }
            goto L_0x0022
        L_0x0021:
            r3 = r0
        L_0x0022:
            if (r3 != 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r0 = r3
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7562o0o00OoO.OooOOOo(android.content.Context):java.lang.String");
    }

    public static String OooOOo() {
        StringBuilder sb = new StringBuilder();
        sb.append("00" + Constants.COLON_SEPARATOR);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", "unknown");
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put("PRODUCT", "sdk");
        linkedHashMap.put("MODEL", "sdk");
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            try {
                String str2 = null;
                String str3 = (String) Build.class.getField(str).get(null);
                String str4 = (String) linkedHashMap.get(str);
                if (str3 != null) {
                    str2 = str3.toLowerCase();
                }
                if (str2 != null && str2.contains(str4)) {
                    c = '1';
                }
            } catch (Throwable unused) {
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String OooOOo(Context context) {
        try {
            long j = 0;
            if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                return "0:0";
            }
            String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
            for (int i = 0; i < 5; i++) {
                long j2 = -1;
                try {
                    j2 = new File(strArr[i]).lastModified();
                } catch (Throwable unused) {
                }
                j = Math.max(j2, j);
            }
            return "1:" + j;
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooOOo0() {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7562o0o00OoO.OooOOo0():java.lang.String");
    }

    public static String OooOOo0(Context context) {
        try {
            String OooOo00 = OooOo00(context);
            String OooOo0o = OooOo0o();
            if (!C7559o0o00OOo.m19212OooO0O0(OooOo00) || !C7559o0o00OOo.m19212OooO0O0(OooOo0o)) {
                return "";
            }
            return OooOo00 + Constants.COLON_SEPARATOR + OooOo0o();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String OooOOoo() {
        StringBuilder sb = new StringBuilder();
        sb.append("00" + Constants.COLON_SEPARATOR);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", "sdk");
        linkedHashMap.put("ro.product.brand", "generic");
        linkedHashMap.put("ro.product.name", "sdk");
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            String str2 = (String) linkedHashMap.get(str);
            String OooO00o2 = C7559o0o00OOo.OooO00o(str, "");
            if (OooO00o2 != null && OooO00o2.contains(str2)) {
                c = '1';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a A[Catch:{ all -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d A[Catch:{ all -> 0x003f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooOOoo(android.content.Context r3) {
        /*
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)     // Catch:{ all -> 0x003f }
            r1 = 0
            android.content.Intent r3 = r3.registerReceiver(r1, r0)     // Catch:{ all -> 0x003f }
            java.lang.String r0 = "level"
            r1 = -1
            int r0 = r3.getIntExtra(r0, r1)     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "status"
            int r3 = r3.getIntExtra(r2, r1)     // Catch:{ all -> 0x003f }
            r1 = 2
            if (r3 == r1) goto L_0x0022
            r1 = 5
            if (r3 != r1) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r3 = 0
            goto L_0x0023
        L_0x0022:
            r3 = 1
        L_0x0023:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r1.<init>()     // Catch:{ all -> 0x003f }
            if (r3 == 0) goto L_0x002d
            java.lang.String r3 = "1"
            goto L_0x002f
        L_0x002d:
            java.lang.String r3 = "0"
        L_0x002f:
            r1.append(r3)     // Catch:{ all -> 0x003f }
            java.lang.String r3 = ":"
            r1.append(r3)     // Catch:{ all -> 0x003f }
            r1.append(r0)     // Catch:{ all -> 0x003f }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x003f }
            return r3
        L_0x003f:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7562o0o00OoO.OooOOoo(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0020 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0030 A[SYNTHETIC, Splitter:B:25:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooOo0() {
        /*
            java.lang.String r0 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x002d }
            r2.<init>(r0)     // Catch:{ all -> 0x002d }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x002e }
            r3 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r2, r3)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x002b }
            boolean r3 = com.p118pd.sdk.C7559o0o00OOo.m19210OooO00o(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0024
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x002b }
            r0.close()     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r2.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            return r1
        L_0x0024:
            r0.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r2.close()     // Catch:{ all -> 0x0038 }
            goto L_0x0038
        L_0x002b:
            r1 = r0
            goto L_0x002e
        L_0x002d:
            r2 = r1
        L_0x002e:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ all -> 0x0034 }
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            if (r2 == 0) goto L_0x0038
            goto L_0x0027
        L_0x0038:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7562o0o00OoO.OooOo0():java.lang.String");
    }

    public static String OooOo00() {
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            if (list == null) {
                return "02:00:00:00:00:00";
            }
            for (NetworkInterface networkInterface : list) {
                if (!(networkInterface == null || networkInterface.getName() == null || !networkInterface.getName().equalsIgnoreCase("wlan0"))) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "02:00:00:00:00:00";
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = hardwareAddress.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(String.format("%02X:", Integer.valueOf(hardwareAddress[i] & 255)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "02:00:00:00:00:00";
        } catch (Throwable unused) {
            return "02:00:00:00:00:00";
        }
    }

    public static String OooOo00(Context context) {
        if (OooO00o(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() != 0) {
                return null;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (!(subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7)) {
                if (subtype != 11) {
                    if (!(subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14)) {
                        if (subtype != 15) {
                            return subtype == 13 ? "4G" : "UNKNOW";
                        }
                    }
                    return "3G";
                }
            }
            return "2G";
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (r0 == null) goto L_0x004f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003d */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0047 A[SYNTHETIC, Splitter:B:28:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooOo0O() {
        /*
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String r1 = ""
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0044 }
            r3.<init>(r0)     // Catch:{ all -> 0x0044 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0041 }
            r4 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0041 }
        L_0x0011:
            java.lang.String r2 = r0.readLine()     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x003a
            boolean r4 = com.p118pd.sdk.C7559o0o00OOo.m19210OooO00o(r2)     // Catch:{ all -> 0x0042 }
            if (r4 != 0) goto L_0x0011
            java.lang.String r4 = ":"
            java.lang.String[] r2 = r2.split(r4)     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x0011
            int r4 = r2.length     // Catch:{ all -> 0x0042 }
            r5 = 1
            if (r4 <= r5) goto L_0x0011
            r4 = 0
            r4 = r2[r4]     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = "BogoMIPS"
            boolean r4 = r4.contains(r6)     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0011
            r2 = r2[r5]     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = r2.trim()     // Catch:{ all -> 0x0042 }
        L_0x003a:
            r3.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0.close()     // Catch:{ all -> 0x004f }
            goto L_0x004f
        L_0x0041:
            r0 = r2
        L_0x0042:
            r2 = r3
            goto L_0x0045
        L_0x0044:
            r0 = r2
        L_0x0045:
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ all -> 0x004b }
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            if (r0 == 0) goto L_0x004f
            goto L_0x003d
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7562o0o00OoO.OooOo0O():java.lang.String");
    }

    public static String OooOo0o() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                            return nextElement.getHostAddress().toString();
                        }
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final String m19214OooO00o() {
        try {
            return String.valueOf(new File(C7748o0oooOOo.OooO0OO).listFiles(new C7563o0o00Ooo(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }
}
