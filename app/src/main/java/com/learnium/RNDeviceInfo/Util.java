package com.learnium.RNDeviceInfo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;

public class Util {
    public static final String KEY_VERSION_EMUI = "ro.build.version.emui";
    public static final String KEY_VERSION_MIUI = "ro.miui.ui.version.name";
    public static final String KEY_VERSION_OPPO = "ro.build.version.opporom";
    public static final String KEY_VERSION_SMARTISAN = "ro.smartisan.version";
    public static final String KEY_VERSION_VIVO = "ro.vivo.os.version";
    public static final String ROM_EMUI = "EMUI";
    public static final String ROM_FLYME = "FLYME";
    public static final String ROM_MIUI = "MIUI";
    public static final String ROM_OPPO = "OPPO";
    public static final String ROM_QIKU = "QIKU";
    public static final String ROM_SMARTISAN = "SMARTISAN";
    public static final String ROM_VIVO = "VIVO";
    public static String sName;
    public static String sVersion;

    public static boolean check(String str) {
        String str2 = sName;
        if (str2 != null) {
            return str2.equals(str);
        }
        String prop = getProp("ro.miui.ui.version.name");
        sVersion = prop;
        if (!TextUtils.isEmpty(prop)) {
            sName = ROM_MIUI;
        } else {
            String prop2 = getProp("ro.build.version.emui");
            sVersion = prop2;
            if (!TextUtils.isEmpty(prop2)) {
                sName = ROM_EMUI;
            } else {
                String prop3 = getProp(KEY_VERSION_OPPO);
                sVersion = prop3;
                if (!TextUtils.isEmpty(prop3)) {
                    sName = ROM_OPPO;
                } else {
                    String prop4 = getProp(KEY_VERSION_VIVO);
                    sVersion = prop4;
                    if (!TextUtils.isEmpty(prop4)) {
                        sName = ROM_VIVO;
                    } else {
                        String prop5 = getProp(KEY_VERSION_SMARTISAN);
                        sVersion = prop5;
                        if (!TextUtils.isEmpty(prop5)) {
                            sName = ROM_SMARTISAN;
                        } else {
                            String str3 = Build.DISPLAY;
                            sVersion = str3;
                            if (str3.toUpperCase().contains(ROM_FLYME)) {
                                sName = ROM_FLYME;
                            } else {
                                sVersion = "unknown";
                                sName = Build.MANUFACTURER.toUpperCase();
                            }
                        }
                    }
                }
            }
        }
        return sName.equals(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042 A[SYNTHETIC, Splitter:B:15:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e A[SYNTHETIC, Splitter:B:23:0x004e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getProp(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            r2.<init>()     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            r2.append(r4)     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            java.lang.Process r4 = r1.exec(r4)     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            r2.<init>(r4)     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x004b, all -> 0x003f }
            java.lang.String r4 = r1.readLine()     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            r1.close()     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            r1.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0039:
            return r4
        L_0x003a:
            r4 = move-exception
            r0 = r1
            goto L_0x0040
        L_0x003d:
            goto L_0x004c
        L_0x003f:
            r4 = move-exception
        L_0x0040:
            if (r0 == 0) goto L_0x004a
            r0.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004a:
            throw r4
        L_0x004b:
            r1 = r0
        L_0x004c:
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.learnium.RNDeviceInfo.Util.getProp(java.lang.String):java.lang.String");
    }

    public static boolean hasNotchHw(Activity activity) {
        try {
            Class<?> loadClass = activity.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean hasNotchInScreen(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (str.equalsIgnoreCase("HUAWEI")) {
                return hasNotchHw(activity);
            }
            if (str.equalsIgnoreCase("xiaomi")) {
                return hasNotchXiaoMi(activity);
            }
            if (str.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_OPPO)) {
                return hasNotchOPPO(activity);
            }
            if (str.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO)) {
                return hasNotchVIVO(activity);
            }
            return false;
        } else if (activity.getWindow().getDecorView().getRootWindowInsets() == null || activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout() == null) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean hasNotchOPPO(Activity activity) {
        return activity.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean hasNotchVIVO(Activity activity) {
        try {
            Class<?> cls = Class.forName("android.util.FtFeature");
            return ((Boolean) cls.getMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean hasNotchXiaoMi(Activity activity) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            if (((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "ro.miui.notch", 0)).intValue() == 1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean is360() {
        return check(ROM_QIKU) || check("360");
    }

    public static boolean isEmui() {
        return check(ROM_EMUI);
    }

    public static boolean isFlyme() {
        return check(ROM_FLYME);
    }

    public static boolean isLightColor(String str) {
        try {
            int parseColor = Color.parseColor(str);
            if (parseColor == -2) {
                return false;
            }
            int red = Color.red(parseColor);
            int green = Color.green(parseColor);
            int blue = Color.blue(parseColor);
            if (Color.alpha(parseColor) < 64) {
                return true;
            }
            double d = (double) red;
            Double.isNaN(d);
            double d2 = (double) green;
            Double.isNaN(d2);
            double d3 = (d * 0.299d) + (d2 * 0.578d);
            double d4 = (double) blue;
            Double.isNaN(d4);
            if (d3 + (d4 * 0.114d) >= 192.0d) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public static boolean isMiui() {
        return check(ROM_MIUI);
    }

    public static boolean isOppo() {
        return check(ROM_OPPO);
    }

    public static boolean isSmartisan() {
        return check(ROM_SMARTISAN);
    }

    public static boolean isVivo() {
        return check(ROM_VIVO);
    }

    public static HashMap<String, String> readableMapToHashMap(ReadableMap readableMap) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (readableMap != null) {
            HashMap<String, Object> hashMap2 = readableMap.toHashMap();
            if (!hashMap2.isEmpty()) {
                for (String str : hashMap2.keySet()) {
                    hashMap.put(str, "" + hashMap2.get(str));
                }
            }
        }
        return hashMap;
    }

    public static String translateColorValid(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("#")) {
            return "#00000000";
        }
        if (str.length() == 4) {
            String substring = str.substring(1);
            return "#" + substring + substring;
        } else if (str.length() == 7 || str.length() == 9) {
            return str;
        } else {
            return "#00000000";
        }
    }

    public static HashMap<String, String> writableMapToHashMap(WritableMap writableMap) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (writableMap != null) {
            HashMap<String, Object> hashMap2 = writableMap.toHashMap();
            if (!hashMap2.isEmpty()) {
                for (String str : hashMap2.keySet()) {
                    hashMap.put(str, "" + hashMap2.get(str));
                }
            }
        }
        return hashMap;
    }
}
