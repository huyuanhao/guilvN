package com.umeng.commonsdk.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.C3525c;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.C3681i;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.opengles.GL10;

public class UMUtils {
    public static final int DEFAULT_TIMEZONE = 8;
    public static final String KEY_APP_KEY = "appkey";
    public static final String KEY_CHANNEL = "channel";
    public static final String KEY_LAST_APP_KEY = "last_appkey";
    public static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    public static final String KEY_SHARED_PREFERENCES_NAME = "umeng_common_config";
    public static final String MOBILE_NETWORK = "2G/3G";
    public static final String SD_PERMISSION = "android.permission.WRITE_EXTERNAL_STORAGE";
    public static final String TAG = "UMUtils";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";
    public static final Pattern pattern = Pattern.compile("UTDID\">([^<]+)");
    public static Object spLock = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        return r9.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        r0 = "MD5 e is " + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040 A[ExcHandler: all (r9v3 'th' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:3:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String MD5(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.MD5(java.lang.String):java.lang.String");
    }

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
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static String bytes2Hex(byte[] bArr) {
        String str = "";
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                str = str + "0";
            }
            str = str + hexString;
        }
        return str;
    }

    public static boolean checkAndroidManifest(Context context, String str) {
        try {
            context.getApplicationContext().getPackageManager().getActivityInfo(new ComponentName(context.getApplicationContext().getPackageName(), str), 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean checkIntentFilterData(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse(SocializeProtocolConstants.PROTOCOL_KEY_TENCENT + str + Constants.COLON_SEPARATOR));
        List<ResolveInfo> queryIntentActivities = context.getApplicationContext().getPackageManager().queryIntentActivities(intent, 64);
        if (queryIntentActivities.size() > 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && activityInfo.packageName.equals(context.getApplicationContext().getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkMetaData(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData.get(str) == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean checkPath(String str) {
        try {
            return Class.forName(str) != null;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041 A[ORIG_RETURN, RETURN, SYNTHETIC] */
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
            if (r1 < r2) goto L_0x0033
            java.lang.String r1 = "android.content.Context"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "checkSelfPermission"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x002e }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch:{ Exception -> 0x002e }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ Exception -> 0x002e }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x002e }
            r2[r0] = r7     // Catch:{ Exception -> 0x002e }
            java.lang.Object r7 = r1.invoke(r6, r2)     // Catch:{ Exception -> 0x002e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x002e }
            int r6 = r7.intValue()     // Catch:{ Exception -> 0x002e }
            if (r6 != 0) goto L_0x0042
            goto L_0x0041
        L_0x002e:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r7)
            goto L_0x0042
        L_0x0033:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String r6 = r6.getPackageName()
            int r6 = r1.checkPermission(r7, r6)
            if (r6 != 0) goto L_0x0042
        L_0x0041:
            r0 = 1
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.checkPermission(android.content.Context, java.lang.String):boolean");
    }

    public static boolean checkResource(Context context, String str, String str2) {
        return context.getApplicationContext().getResources().getIdentifier(str, str2, context.getApplicationContext().getPackageName()) > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r0 = "encrypt by SHA1 e is " + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r0 = "encrypt by SHA1 e is " + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a A[ExcHandler: all (r3v2 'th' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String encryptBySHA1(java.lang.String r3) {
        /*
            java.lang.String r0 = "encrypt by SHA1 e is "
            r1 = 0
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x002e, all -> 0x001a }
            java.lang.String r2 = "SHA1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ Exception -> 0x0019, all -> 0x001a }
            r2.update(r3)     // Catch:{ Exception -> 0x0019, all -> 0x001a }
            byte[] r3 = r2.digest()     // Catch:{ Exception -> 0x0019, all -> 0x001a }
            java.lang.String r3 = bytes2Hex(r3)     // Catch:{ Exception -> 0x0019, all -> 0x001a }
            return r3
        L_0x0019:
            return r1
        L_0x001a:
            r3 = move-exception
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L_0x002d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r3)
            r2.toString()
        L_0x002d:
            return r1
        L_0x002e:
            r3 = move-exception
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L_0x0041
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r3)
            r2.toString()
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.encryptBySHA1(java.lang.String):java.lang.String");
    }

    public static String getAppHashKey(Context context) {
        return DeviceConfig.getAppHashKey(context);
    }

    public static String getAppMD5Signature(Context context) {
        String appMD5Signature = DeviceConfig.getAppMD5Signature(context);
        return !TextUtils.isEmpty(appMD5Signature) ? appMD5Signature.replace(Constants.COLON_SEPARATOR, "").toLowerCase() : appMD5Signature;
    }

    public static String getAppName(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get app name e is " + e;
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get app name e is " + th;
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    public static String getAppSHA1Key(Context context) {
        return DeviceConfig.getAppSHA1Key(context);
    }

    public static String getAppVersinoCode(Context context, String str) {
        if (!(context == null || str == null)) {
            try {
                return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
            } catch (Exception e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str2 = "get app version code e is " + e;
                }
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str3 = "get app version code e is " + th;
                }
                return "";
            }
        }
        return "";
    }

    public static String getAppVersionCode(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get app version code e is " + e;
            }
            return "";
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get app version code e is " + th;
            }
            return "";
        }
    }

    public static String getAppVersionName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get app version name e is " + e;
            }
            return "";
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get app version name e is " + th;
            }
            return "";
        }
    }

    public static String getAppkey(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return getMultiProcessSP(context, "appkey");
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get app key e is " + e;
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get app key e is " + th;
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    public static String getAppkeyByXML(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                return null;
            }
            String string = applicationInfo.metaData.getString("UMENG_APPKEY");
            if (string != null) {
                return string.trim();
            }
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.m9802i(AnalyticsConstants.LOG_TAG, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[SYNTHETIC, Splitter:B:13:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Properties getBuildProp() {
        /*
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0029, all -> 0x0022 }
            r0.load(r2)     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x002f
        L_0x001d:
            r0 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x002a
        L_0x0022:
            r0 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            throw r0
        L_0x0029:
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getBuildProp():java.util.Properties");
    }

    public static String getCPU() {
        String str = null;
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
                str = bufferedReader.readLine();
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str2 = "Could not read from file /proc/cpuinfo, e is " + e;
                }
            }
        } catch (FileNotFoundException e2) {
            try {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str3 = "Could not read from file /proc/cpuinfo, e is " + e2;
                }
            } catch (Exception e3) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str4 = "get cpu e is " + e3;
                }
                return "";
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str5 = "get cpu e is " + th;
                }
                return "";
            }
        }
        if (str != null) {
            return str.substring(str.indexOf(58) + 1).trim();
        }
        return "";
    }

    public static String getChannel(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return getMultiProcessSP(context, "channel");
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get channel e is " + e;
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get channel e is " + th;
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    public static String getChannelByXML(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get("UMENG_CHANNEL")) == null) {
                return null;
            }
            String obj2 = obj.toString();
            if (obj2 != null) {
                return obj2.trim();
            }
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.m9802i(AnalyticsConstants.LOG_TAG, "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getDeviceToken(Context context) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            Class<?> cls = Class.forName(MessageSharedPrefs.f9872a);
            if (cls == null || (method = cls.getMethod("getInstance", Context.class)) == null || (invoke = method.invoke(cls, applicationContext)) == null || (method2 = cls.getMethod("getDeviceToken", new Class[0])) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null || !(invoke2 instanceof String)) {
                return null;
            }
            return (String) invoke2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getDeviceType(Context context) {
        if (context == null) {
            return "Phone";
        }
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? "Tablet" : "Phone";
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get device type e is " + e;
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get device type e is " + th;
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    public static String getDisplayResolution(Context context) {
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return "";
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            return String.valueOf(i2) + "*" + String.valueOf(i);
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get display resolution e is " + e;
            }
            UMCrashManager.reportCrash(context, e);
            return "";
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get display resolution e is " + th;
            }
            UMCrashManager.reportCrash(context, th);
            return "";
        }
    }

    public static File getFile(Context context) {
        if (context != null && checkPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") && Environment.getExternalStorageState().equals("mounted")) {
            try {
                return new File(Environment.getExternalStorageDirectory().getCanonicalPath(), ".UTSystemConfig/Global/Alvin2.xml");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r0 = "get file MD5 e is " + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r0 = "get file MD5 e is " + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[ExcHandler: all (r8v2 'th' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileMD5(java.io.File r8) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getFileMD5(java.io.File):java.lang.String");
    }

    public static String getFlymeVersion(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "Could not read gpu infor, e is " + e;
            }
            return new String[0];
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "Could not read gpu infor, e is " + th;
            }
            return new String[0];
        }
    }

    public static String getImsi(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (!checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE) || telephonyManager == null) {
                return null;
            }
            return telephonyManager.getSubscriberId();
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get imei e is " + e;
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get imei e is " + th;
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    public static String getLastAppkey(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return getMultiProcessSP(context, KEY_LAST_APP_KEY);
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get last app key e is " + e;
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get last app key e is " + th;
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r0 = "get locale e is " + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        r0 = "get locale e is " + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0018 A[ExcHandler: all (r2v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Locale getLocale(android.content.Context r5) {
        /*
            java.lang.String r0 = "get locale e is "
            r1 = 0
            if (r5 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.content.res.Configuration r2 = new android.content.res.Configuration     // Catch:{ Exception -> 0x001a, all -> 0x0018 }
            r2.<init>()     // Catch:{ Exception -> 0x001a, all -> 0x0018 }
            r2.setToDefaults()     // Catch:{ Exception -> 0x001a, all -> 0x0018 }
            android.content.ContentResolver r3 = r5.getContentResolver()     // Catch:{ Exception -> 0x001a, all -> 0x0018 }
            android.provider.Settings.System.getConfiguration(r3, r2)     // Catch:{ Exception -> 0x001a, all -> 0x0018 }
            java.util.Locale r2 = r2.locale     // Catch:{ Exception -> 0x001a, all -> 0x0018 }
            goto L_0x0030
        L_0x0018:
            r2 = move-exception
            goto L_0x0037
        L_0x001a:
            r2 = move-exception
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch:{ Exception -> 0x004d, all -> 0x0018 }
            if (r3 == 0) goto L_0x002f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d, all -> 0x0018 }
            r3.<init>()     // Catch:{ Exception -> 0x004d, all -> 0x0018 }
            java.lang.String r4 = "fail to read user config locale, e is "
            r3.append(r4)     // Catch:{ Exception -> 0x004d, all -> 0x0018 }
            r3.append(r2)     // Catch:{ Exception -> 0x004d, all -> 0x0018 }
            r3.toString()     // Catch:{ Exception -> 0x004d, all -> 0x0018 }
        L_0x002f:
            r2 = r1
        L_0x0030:
            if (r2 != 0) goto L_0x0036
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x004d, all -> 0x0018 }
        L_0x0036:
            return r2
        L_0x0037:
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r3 == 0) goto L_0x0049
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            r3.toString()
        L_0x0049:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
            return r1
        L_0x004d:
            r2 = move-exception
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r3 == 0) goto L_0x0060
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            r3.toString()
        L_0x0060:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getLocale(android.content.Context):java.util.Locale");
    }

    public static String getMac(Context context) {
        if (context == null) {
            return null;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return null;
            }
            if (checkPermission(context, MsgConstant.PERMISSION_ACCESS_WIFI_STATE)) {
                return wifiManager.getConnectionInfo().getMacAddress();
            }
            boolean z = AnalyticsConstants.UM_DEBUG;
            return "";
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get mac e is " + e;
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get mac e is " + th;
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMultiProcessSP(android.content.Context r5, java.lang.String r6) {
        /*
            r0 = 0
            java.lang.Object r1 = com.umeng.commonsdk.utils.UMUtils.spLock
            monitor-enter(r1)
            if (r5 == 0) goto L_0x004b
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x000d
            goto L_0x004b
        L_0x000d:
            boolean r2 = isMainProgress(r5)     // Catch:{ all -> 0x004d }
            r3 = 0
            if (r2 == 0) goto L_0x001f
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "umeng_common_config"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x004d }
            goto L_0x0041
        L_0x001f:
            java.lang.String r2 = com.umeng.commonsdk.framework.UMFrUtils.getSubProcessName(r5)     // Catch:{ all -> 0x004d }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r4.<init>()     // Catch:{ all -> 0x004d }
            r4.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "_"
            r4.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "umeng_common_config"
            r4.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x004d }
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x004d }
        L_0x0041:
            if (r5 == 0) goto L_0x0049
            java.lang.String r5 = r5.getString(r6, r0)     // Catch:{ all -> 0x004d }
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            return r5
        L_0x0049:
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            return r0
        L_0x004b:
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            return r0
        L_0x004d:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            throw r5     // Catch:{ Exception -> 0x0050 }
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getMultiProcessSP(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"", ""};
        if (context == null) {
            return strArr;
        }
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
                    return strArr;
                }
                return strArr;
            }
            strArr[0] = "Wi-Fi";
            return strArr;
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get network access mode e is " + e;
            }
            UMCrashManager.reportCrash(context, e);
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get network access mode e is " + th;
            }
            UMCrashManager.reportCrash(context, th);
        }
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE) && telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
            return "";
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get network operator e is " + e;
            }
            UMCrashManager.reportCrash(context, e);
            return "";
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get network operator e is " + th;
            }
            UMCrashManager.reportCrash(context, th);
            return "";
        }
    }

    public static String getOaidRequiredTime(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(C3681i.f9649a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(C3681i.f9651c, "");
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getOperator(Context context) {
        if (context == null) {
            return "Unknown";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "Unknown";
            }
            return telephonyManager.getNetworkOperator();
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get get operator e is " + e;
            }
            UMCrashManager.reportCrash(context, e);
            return "Unknown";
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get get operator e is " + th;
            }
            UMCrashManager.reportCrash(context, th);
            return "Unknown";
        }
    }

    public static String getRegisteredOperator(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                return telephonyManager.getNetworkOperator();
            }
            return null;
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str = "get registered operator e is " + e;
            }
            UMCrashManager.reportCrash(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                String str2 = "get registered operator e is " + th;
            }
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r0 = "get sub os name e is " + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037 A[ExcHandler: all (r2v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getSubOSName(android.content.Context r5) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getSubOSName(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        r0 = "get sub os version e is " + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e A[ExcHandler: all (r2v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getSubOSVersion(android.content.Context r5) {
        /*
            java.lang.String r0 = "get sub os version e is "
            r1 = 0
            if (r5 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.Properties r2 = getBuildProp()     // Catch:{ Exception -> 0x0045, all -> 0x002e }
            java.lang.String r3 = "ro.miui.ui.version.name"
            java.lang.String r3 = r2.getProperty(r3)     // Catch:{ Exception -> 0x0029, all -> 0x002e }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0029, all -> 0x002e }
            if (r4 == 0) goto L_0x0027
            boolean r4 = isFlyMe()     // Catch:{ Exception -> 0x0029, all -> 0x002e }
            if (r4 == 0) goto L_0x0021
            java.lang.String r5 = getFlymeVersion(r2)     // Catch:{ Exception -> 0x0027, all -> 0x002e }
            goto L_0x0025
        L_0x0021:
            java.lang.String r5 = getYunOSVersion(r2)     // Catch:{ Exception -> 0x0027, all -> 0x002e }
        L_0x0025:
            r1 = r5
            goto L_0x002d
        L_0x0027:
            r1 = r3
            goto L_0x002d
        L_0x0029:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
        L_0x002d:
            return r1
        L_0x002e:
            r2 = move-exception
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r3 == 0) goto L_0x0041
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            r3.toString()
        L_0x0041:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
            return r1
        L_0x0045:
            r2 = move-exception
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r3 == 0) goto L_0x0058
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            r3.toString()
        L_0x0058:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getSubOSVersion(android.content.Context):java.lang.String");
    }

    public static int getTargetSdkVersion(Context context) {
        return context.getApplicationInfo().targetSdkVersion;
    }

    public static String getUMId(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return UMEnvelopeBuild.imprintProperty(context.getApplicationContext(), "umid", null);
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r0 = "get utiid e is " + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r0 = "get utiid e is " + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029 A[ExcHandler: all (r8v3 'th' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:4:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getUTDID(android.content.Context r8) {
        /*
            java.lang.String r0 = "get utiid e is "
            r1 = 0
            if (r8 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "com.ut.device.UTDevice"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            java.lang.String r3 = "getUtdid"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            android.content.Context r4 = r8.getApplicationContext()     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            r3[r7] = r4     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            return r2
        L_0x0029:
            r8 = move-exception
            goto L_0x0030
        L_0x002b:
            java.lang.String r8 = readUTDId(r8)     // Catch:{ Exception -> 0x0043, all -> 0x0029 }
            return r8
        L_0x0030:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L_0x0042
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r8)
            r2.toString()
        L_0x0042:
            return r1
        L_0x0043:
            r8 = move-exception
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L_0x0056
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r8)
            r2.toString()
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.getUTDID(android.content.Context):java.lang.String");
    }

    public static String getUmengToken(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return UMEnvelopeBuild.imprintProperty(context.getApplicationContext(), "ztoken", null);
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return null;
        }
    }

    public static String getYunOSVersion(Properties properties) {
        String property = properties.getProperty("ro.yunos.version");
        if (!TextUtils.isEmpty(property)) {
            return property;
        }
        return null;
    }

    public static String getZData(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(C3525c.f9048a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(C3525c.f9049b, "");
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static long getZDataRequestTime(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(C3525c.f9048a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getLong(C3525c.f9050c, 0);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean isApplication(Context context) {
        try {
            String name = context.getApplicationContext().getClass().getSuperclass().getName();
            if (TextUtils.isEmpty(name) || !name.equals("android.app.Application")) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isDebug(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return false;
        }
    }

    public static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isMainProgress(Context context) {
        try {
            String currentProcessName = UMFrUtils.getCurrentProcessName(context);
            String packageName = context.getApplicationContext().getPackageName();
            if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSdCardWrittenable() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static String parseId(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static String readStreamToString(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[1024];
        StringWriter stringWriter = new StringWriter();
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, read);
        }
    }

    public static String readUTDId(Context context) {
        File file;
        if (!(context == null || (file = getFile(context)) == null || !file.exists())) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    return parseId(readStreamToString(fileInputStream));
                } finally {
                    safeClose(fileInputStream);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void setAppkey(Context context, String str) {
        if (context != null && str != null) {
            try {
                setMultiProcessSP(context, "appkey", str);
            } catch (Exception e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str2 = "set app key e is " + e;
                }
                UMCrashManager.reportCrash(context, e);
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str3 = "set app key e is " + th;
                }
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    public static void setChannel(Context context, String str) {
        if (context != null && str != null) {
            try {
                setMultiProcessSP(context, "channel", str);
            } catch (Exception e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str2 = "set channel e is " + e;
                }
                UMCrashManager.reportCrash(context, e);
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str3 = "set channel e is " + th;
                }
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    public static void setLastAppkey(Context context, String str) {
        if (context != null && str != null) {
            try {
                setMultiProcessSP(context, KEY_LAST_APP_KEY, str);
            } catch (Exception e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str2 = "set last app key e is " + e;
                }
                UMCrashManager.reportCrash(context, e);
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str3 = "set last app key e is " + th;
                }
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setMultiProcessSP(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = com.umeng.commonsdk.utils.UMUtils.spLock
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0051
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x0051
            if (r6 != 0) goto L_0x000e
            goto L_0x0051
        L_0x000e:
            boolean r1 = isMainProgress(r4)     // Catch:{ all -> 0x0053 }
            r2 = 0
            if (r1 == 0) goto L_0x0020
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "umeng_common_config"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)     // Catch:{ all -> 0x0053 }
            goto L_0x0042
        L_0x0020:
            java.lang.String r1 = com.umeng.commonsdk.framework.UMFrUtils.getSubProcessName(r4)     // Catch:{ all -> 0x0053 }
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x0053 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
            r3.<init>()     // Catch:{ all -> 0x0053 }
            r3.append(r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "_"
            r3.append(r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "umeng_common_config"
            r3.append(r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0053 }
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)     // Catch:{ all -> 0x0053 }
        L_0x0042:
            if (r4 == 0) goto L_0x004f
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x0053 }
            android.content.SharedPreferences$Editor r4 = r4.putString(r5, r6)     // Catch:{ all -> 0x0053 }
            r4.commit()     // Catch:{ all -> 0x0053 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            goto L_0x0056
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return
        L_0x0053:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            throw r4     // Catch:{ Exception -> 0x0056 }
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.UMUtils.setMultiProcessSP(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static String getAppVersionName(Context context, String str) {
        if (!(context == null || str == null)) {
            try {
                return context.getPackageManager().getPackageInfo(str, 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str2 = "get app version name e is " + e;
                }
                UMCrashManager.reportCrash(context, e);
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    String str3 = "get app version name e is " + th;
                }
                UMCrashManager.reportCrash(context, th);
                return "";
            }
        }
        return "";
    }
}
