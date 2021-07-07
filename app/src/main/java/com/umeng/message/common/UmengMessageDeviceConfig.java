package com.umeng.message.common;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C6996o000OOo0;
import com.p254ta.utdid2.device.UTDevice;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import com.umeng.message.proguard.C3814c;
import com.umeng.message.proguard.C3819h;
import com.umeng.message.util.C3891a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class UmengMessageDeviceConfig {
    public static final int DEFAULT_TIMEZONE = 8;

    /* renamed from: a */
    public static final String f10008a = "Unknown";

    /* renamed from: b */
    public static final String f10009b = "UmengMessageDeviceConfig";

    /* renamed from: c */
    public static final String f10010c = "2G/3G";

    /* renamed from: d */
    public static final String f10011d = "Wi-Fi";

    /* renamed from: e */
    public static boolean f10012e;

    /* renamed from: a */
    public static Locale m10299a(Context context) {
        Locale locale;
        try {
            Configuration configuration = new Configuration();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Exception unused) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10009b, 0, "fail to read user config locale");
            locale = null;
        }
        return locale == null ? Locale.getDefault() : locale;
    }

    /* renamed from: b */
    public static String m10300b(Context context) {
        return UMUtils.getUMId(context);
    }

    public static boolean checkPermission(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static String getAndroidId(Context context) {
        if (!isCommonConfigNew(C3777a.f10030f)) {
            return null;
        }
        String string = Settings.System.getString(context.getContentResolver(), "android_id");
        return string == null ? "" : string;
    }

    public static String getAppVersionCode(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            return "Unknown";
        }
    }

    public static String getAppVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "Unknown";
        }
    }

    public static String getApplicationLable(Context context) {
        return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    public static String getCPU() {
        String str = null;
        if (!isCommonConfigNew(C3777a.f10025a)) {
            return null;
        }
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
                str = bufferedReader.readLine();
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f10009b, 0, "Could not read from file /proc/cpuinfo", e.getMessage());
            }
        } catch (FileNotFoundException e2) {
            UMLog uMLog2 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10009b, 0, "Could not open file /proc/cpuinfo", e2.getMessage());
        }
        return str != null ? str.substring(str.indexOf(58) + 1).trim() : str;
    }

    public static String getChannel(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get("UMENG_CHANNEL")) == null) {
                return "Unknown";
            }
            String obj2 = obj.toString();
            if (obj2 != null) {
                return obj2;
            }
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10009b, 2, "在AndroidManifest.xml中读取不到UMENG_CHANNEL meta-data");
            return "Unknown";
        } catch (Exception e) {
            UMLog uMLog2 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10009b, 2, "在AndroidManifest.xml中读取不到UMENG_CHANNEL meta-data");
            e.printStackTrace();
            return "Unknown";
        }
    }

    public static String getDIN(Context context) {
        if (!isCommonConfigNew(C3777a.f10026b)) {
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10009b, 1, "No IMEI.");
        }
        try {
            if (!checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                return "";
            }
            String deviceId = telephonyManager.getDeviceId();
            if (!TextUtils.isEmpty(deviceId)) {
                return deviceId;
            }
            return "";
        } catch (Exception e) {
            UMLog uMLog2 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10009b, 1, "No IMEI.", e.getMessage());
            return "";
        }
    }

    public static String getDINAes(Context context) {
        Exception e;
        String str;
        try {
            str = getDIN(context);
            try {
                String messageAppkey = PushAgent.getInstance(context).getMessageAppkey();
                if (messageAppkey == null || 24 != messageAppkey.length()) {
                    return C3814c.m10491a(str, "utf-8");
                }
                return C3814c.m10491a(str, "utf-8", messageAppkey.substring(0, 16));
            } catch (Exception e2) {
                e = e2;
                UMLog uMLog = UMConfigure.umDebugLog;
                String str2 = f10009b;
                UMLog.mutlInfo(str2, 1, "getDINAes:" + e.getMessage());
                return str;
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
            UMLog uMLog2 = UMConfigure.umDebugLog;
            String str22 = f10009b;
            UMLog.mutlInfo(str22, 1, "getDINAes:" + e.getMessage());
            return str;
        }
    }

    public static boolean getDataData(String str) {
        if (!isCommonConfigNew(C3777a.f10041q)) {
            return false;
        }
        boolean exists = new File("/data/app/" + str + "-1.apk").exists();
        if (!exists) {
            exists = new File("/data/app/" + str + "-2.apk").exists();
        }
        if (!exists) {
            exists = new File("/data/app/" + str + ".apk").exists();
        }
        if (!exists) {
            exists = new File("/data/app/" + str + "-1").exists();
        }
        if (exists) {
            return exists;
        }
        return new File("/data/app/" + str + "-2").exists();
    }

    public static String getDeviceId(Context context) {
        String str = "";
        if (isCommonConfigNew(C3777a.f10026b)) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f10009b, 1, "No IMEI.");
            }
            try {
                if (checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE)) {
                    str = telephonyManager.getDeviceId();
                }
            } catch (Exception e) {
                UMLog uMLog2 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f10009b, 1, "No IMEI.", e.getMessage());
            }
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str)) {
            UMLog uMLog3 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10009b, 1, "Failed to take imei as IMEI. Try to use Secure.ANDROID_ID instead.");
            if (isCommonConfigNew(C3777a.f10028d)) {
                str = Settings.Secure.getString(context.getContentResolver(), "android_id");
            }
            UMLog uMLog4 = UMConfigure.umDebugLog;
            String str2 = f10009b;
            UMLog.mutlInfo(str2, 2, "getDeviceId: Secure.ANDROID_ID: " + str);
            if (TextUtils.isEmpty(str)) {
                UMLog uMLog5 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f10009b, 1, "Failed to take Secure.ANDROID_ID as IMEI. Try to use Serial_number instead.");
                if (isCommonConfigNew(C3777a.f10029e)) {
                    str = getSerial_number();
                }
                UMLog uMLog6 = UMConfigure.umDebugLog;
                String str3 = f10009b;
                UMLog.mutlInfo(str3, 2, "getDeviceId: Serial_number: " + str);
            }
        }
        return str;
    }

    public static String getDeviceIdMD5(Context context) {
        return C3819h.m10542a(getDeviceId(context));
    }

    public static String getDummyId(Context context) {
        return "02:00:00:00:00:00";
    }

    public static String[] getLocaleInfo(Context context) {
        String[] strArr = new String[2];
        if (isCommonConfigNew(C3777a.f10034j)) {
            try {
                Locale a = m10299a(context);
                if (a != null) {
                    strArr[0] = a.getCountry();
                    strArr[1] = a.getLanguage();
                }
                if (TextUtils.isEmpty(strArr[0])) {
                    strArr[0] = "Unknown";
                }
                if (TextUtils.isEmpty(strArr[1])) {
                    strArr[1] = "Unknown";
                }
                return strArr;
            } catch (Exception e) {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f10009b, 0, "error in getLocaleInfo", e.getMessage());
            }
        }
        return strArr;
    }

    public static String getMetaData(Context context, String str) {
        String string;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (!(applicationInfo == null || (string = applicationInfo.metaData.getString(str)) == null)) {
                return string.trim();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        UMLog uMLog = UMConfigure.umDebugLog;
        UMLog.mutlInfo(f10009b, 0, String.format("Could not read meta-data %s from AndroidManifest.xml.", str));
        return null;
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        if (isCommonConfigNew(C3777a.f10031g)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
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
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    public static String getOperator(Context context) {
        if (!isCommonConfigNew(C3777a.f10036l)) {
            return "Unknown";
        }
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception e) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10009b, 2, "read carrier fail", e.getMessage());
            return "Unknown";
        }
    }

    public static String getPackageName(Context context) {
        return context.getPackageName();
    }

    public static String getResolution(Context context) {
        int i;
        int i2;
        if (!isCommonConfigNew(C3777a.f10035k)) {
            return "Unknown";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            if ((context.getApplicationInfo().flags & 8192) == 0) {
                i = m10298a(displayMetrics, "noncompatWidthPixels");
                i2 = m10298a(displayMetrics, "noncompatHeightPixels");
            } else {
                i = -1;
                i2 = -1;
            }
            if (i == -1 || i2 == -1) {
                i = displayMetrics.widthPixels;
                i2 = displayMetrics.heightPixels;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i);
            stringBuffer.append("*");
            stringBuffer.append(i2);
            return stringBuffer.toString();
        } catch (Exception e) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10009b, 0, "read resolution fail", e.getMessage());
            return "Unknown";
        }
    }

    public static String getSerial_number() {
        String str;
        if (!isCommonConfigNew(C3777a.f10029e)) {
            return "";
        }
        if (Build.VERSION.SDK_INT <= 25) {
            str = Build.SERIAL;
        } else {
            try {
                Class<?> cls = Class.forName("android.os.Build");
                str = (String) cls.getMethod("getSerial", new Class[0]).invoke(cls, new Object[0]);
            } catch (Throwable unused) {
                str = "";
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String getServiceName(Context context, String str, String str2) {
        if (!isCommonConfigNew(C3777a.f10039o)) {
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setAction(str);
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        ArrayList arrayList = new ArrayList();
        if (queryIntentServices != null && queryIntentServices.size() > 0) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (resolveInfo.serviceInfo.packageName.equals(str2)) {
                    arrayList.add(resolveInfo);
                }
            }
        }
        if (arrayList.size() > 0) {
            return ((ResolveInfo) arrayList.get(0)).serviceInfo.name;
        }
        return null;
    }

    public static int getTimeZone(Context context) {
        if (!isCommonConfigNew(C3777a.f10033i)) {
            return 8;
        }
        try {
            Calendar instance = Calendar.getInstance(m10299a(context));
            if (instance != null) {
                return instance.getTimeZone().getRawOffset() / 3600000;
            }
            return 8;
        } catch (Exception e) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10009b, 2, "error in getTimeZone", e.getMessage());
            return 8;
        }
    }

    public static String getUmid(Context context) {
        String b = m10300b(context);
        return b == null ? "" : b;
    }

    public static String getUtdid(Context context) {
        if (!isCommonConfigNew(C3777a.f10037m)) {
            return "";
        }
        try {
            return UTDevice.getUtdid(context);
        } catch (Throwable th) {
            UMLog uMLog = UMConfigure.umDebugLog;
            String str = f10009b;
            UMLog.mutlInfo(str, 0, "获取utdid失败. " + th.getMessage());
            return "";
        }
    }

    public static boolean isCommonConfig(String str) {
        try {
            return FieldManager.allow(str);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean isCommonConfigNew(String str) {
        Method method;
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.config.FieldManager");
            if (!(cls == null || (method = cls.getMethod("allow", String.class)) == null)) {
                return ((Boolean) method.invoke(null, str)).booleanValue();
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public static boolean isIntentExist(Context context, String str, String str2) {
        if (!isCommonConfigNew(C3777a.f10040p)) {
            return false;
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        if (queryIntentActivities.isEmpty()) {
            return false;
        }
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            if (queryIntentActivities.get(i).activityInfo.packageName.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMiui8() {
        try {
            String a = C3891a.m10687g().mo40143a("ro.miui.ui.version.name");
            if (a == null || !a.contains("8")) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String isNotificationEnabled(Context context) {
        if (isCommonConfigNew(C3777a.f10042r) && Build.VERSION.SDK_INT >= 19) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i = applicationInfo.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                return String.valueOf(((Integer) cls.getMethod(C6996o000OOo0.f19223OooO0O0, new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField(C6996o000OOo0.f19224OooO0OO).get(appOpsManager)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0);
            } catch (Exception unused) {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f10009b, 0, "通知开关是否打开异常");
            }
        }
        return "unknown";
    }

    public static boolean isOnline(Context context) {
        NetworkInfo networkInfo = null;
        try {
            if (isCommonConfigNew(C3777a.f10032h)) {
                networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            }
            if (networkInfo != null) {
                return networkInfo.isConnectedOrConnecting();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isServiceWork(Context context, String str, String str2) {
        if (!isCommonConfigNew(C3777a.f10038n)) {
            return false;
        }
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningServices(Integer.MAX_VALUE);
        if (runningServices.size() <= 0) {
            return false;
        }
        for (int i = 0; i < runningServices.size(); i++) {
            String str3 = runningServices.get(i).service.getClassName().toString();
            String str4 = runningServices.get(i).service.getPackageName().toString();
            if (str3.equals(str) && str4.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int m10298a(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            if (declaredField == null) {
                return -1;
            }
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
