package com.umeng.commonsdk.internal.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.learnium.RNDeviceInfo.SystemBarTintManager;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.message.MsgConstant;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.umeng.commonsdk.internal.utils.a */
public class C3529a {

    /* renamed from: com.umeng.commonsdk.internal.utils.a$a */
    public static class C3530a {

        /* renamed from: a */
        public String f9060a;

        /* renamed from: b */
        public String f9061b;
    }

    /* renamed from: com.umeng.commonsdk.internal.utils.a$b */
    public static class C3531b {

        /* renamed from: a */
        public int f9062a;

        /* renamed from: b */
        public String f9063b;

        /* renamed from: c */
        public String f9064c;

        /* renamed from: d */
        public int f9065d;

        /* renamed from: e */
        public int f9066e;

        /* renamed from: f */
        public int f9067f;

        /* renamed from: g */
        public int f9068g;

        /* renamed from: h */
        public String f9069h;

        /* renamed from: i */
        public int f9070i;

        /* renamed from: j */
        public int f9071j;

        /* renamed from: k */
        public int f9072k;

        /* renamed from: l */
        public long f9073l;
    }

    /* renamed from: a */
    public static long m9106a(Context context, String str) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            UMCrashManager.reportCrash(context, e);
            ULog.m9823e("getAppFirstInstallTime" + e.getMessage());
            return 0;
        }
    }

    /* renamed from: b */
    public static long m9108b(Context context, String str) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            UMCrashManager.reportCrash(context, e);
            ULog.m9823e("getAppLastUpdateTime:" + e.getMessage());
            return 0;
        }
    }

    /* renamed from: c */
    public static String m9113c(Context context, String str) {
        try {
            return context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            ULog.m9823e("getAppInstaller:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public static int m9114d(Context context, String str) {
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(str, 0).applicationInfo;
            if (applicationInfo != null) {
                return applicationInfo.uid;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException e) {
            UMCrashManager.reportCrash(context, e);
            ULog.m9823e("getAppUid:" + e.getMessage());
            return 0;
        }
    }

    /* renamed from: e */
    public static JSONArray m9119e(Context context) {
        if (context == null) {
            return null;
        }
        return C3542f.m9159a(context);
    }

    /* renamed from: f */
    public static void m9121f(Context context) {
        if (context != null) {
            C3542f.m9162b(context);
        }
    }

    /* renamed from: g */
    public static int m9122g(Context context) {
        WifiManager wifiManager;
        if (context == null || !DeviceConfig.checkPermission(context, MsgConstant.PERMISSION_ACCESS_WIFI_STATE) || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null) {
            return -1;
        }
        return wifiManager.getWifiState();
    }

    /* renamed from: h */
    public static int m9124h(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier(SystemBarTintManager.SystemBarConfig.STATUS_BAR_HEIGHT_RES_NAME, "dimen", "android"));
    }

    /* renamed from: i */
    public static int m9126i(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier(SystemBarTintManager.SystemBarConfig.NAV_BAR_HEIGHT_RES_NAME, "dimen", "android"));
    }

    /* renamed from: j */
    public static DisplayMetrics m9128j(Context context) {
        if (context == null) {
            return null;
        }
        return context.getResources().getDisplayMetrics();
    }

    /* renamed from: k */
    public static String m9130k(Context context) {
        TelephonyManager telephonyManager;
        if (context == null || !DeviceConfig.checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE) || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return null;
        }
        return telephonyManager.getSubscriberId();
    }

    /* renamed from: l */
    public static String m9131l(Context context) {
        TelephonyManager telephonyManager;
        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null || !DeviceConfig.checkPermission(context, MsgConstant.PERMISSION_READ_PHONE_STATE) || telephonyManager == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return telephonyManager.getDeviceId();
        }
        try {
            String r = m9137r(context);
            try {
                if (TextUtils.isEmpty(r)) {
                    r = telephonyManager.getDeviceId();
                }
            } catch (Throwable unused) {
            }
            return r;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: m */
    public static List<InputMethodInfo> m9132m(Context context) {
        InputMethodManager inputMethodManager;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return null;
        }
        return inputMethodManager.getInputMethodList();
    }

    /* renamed from: n */
    public static List<C3530a> m9133n(Context context) {
        String[] list;
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(Environment.getExternalStorageDirectory() + "/Android/data/");
            if (file.isDirectory() && (list = file.list()) != null && list.length > 0) {
                for (String str : list) {
                    if (str != null && !str.startsWith(C9058ooOoOoOO.OooOO0)) {
                        C3530a aVar = new C3530a();
                        aVar.f9060a = str;
                        aVar.f9061b = m9118e(context, str);
                        arrayList.add(aVar);
                    }
                }
            }
        } catch (Exception e) {
            ULog.m9823e("getAppList:" + e.getMessage());
        }
        return arrayList;
    }

    /* renamed from: o */
    public static ActivityManager.MemoryInfo m9134o(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    /* renamed from: p */
    public static String m9135p(Context context) {
        if (context == null) {
        }
        return null;
    }

    /* renamed from: q */
    public static String m9136q(Context context) {
        return null;
    }

    /* renamed from: r */
    public static String m9137r(Context context) {
        if (context == null) {
            return null;
        }
        try {
            Object invoke = Class.forName("android.telephony.TelephonyManager").getMethod("getMeid", new Class[0]).invoke(null, new Object[0]);
            if (invoke == null || !(invoke instanceof String)) {
                return null;
            }
            return (String) invoke;
        } catch (Exception e) {
            ULog.m9823e("meid:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: e */
    public static String m9117e() {
        return C3543g.m9164a("df");
    }

    /* renamed from: f */
    public static long m9120f() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* renamed from: j */
    public static boolean m9129j() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    /* renamed from: e */
    public static String m9118e(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                return (String) applicationInfo.loadLabel(context.getPackageManager());
            }
            return null;
        } catch (Exception e) {
            ULog.m9823e("getLabel:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public static WifiInfo m9112c(Context context) {
        WifiManager wifiManager;
        if (context == null || !DeviceConfig.checkPermission(context, MsgConstant.PERMISSION_ACCESS_WIFI_STATE) || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null) {
            return null;
        }
        return wifiManager.getConnectionInfo();
    }

    /* renamed from: g */
    public static String m9123g() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            String obj = declaredMethod.invoke(null, "net.hostname").toString();
            if (obj == null || obj.equalsIgnoreCase("")) {
                return obj;
            }
            return HelperUtils.getUmengMD5(obj);
        } catch (Exception e) {
            ULog.m9823e("getHostName:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    public static long m9125h() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: i */
    public static long m9127i() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m9107a() {
        return C3544h.m9169a();
    }

    /* renamed from: b */
    public static String m9109b() {
        return new SimpleDateFormat().format(new Date());
    }

    /* renamed from: a */
    public static float m9105a(Context context) {
        if (context == null) {
            return 0.0f;
        }
        Configuration configuration = new Configuration();
        try {
            configuration.updateFrom(context.getResources().getConfiguration());
            return configuration.fontScale;
        } catch (Exception e) {
            ULog.m9823e("getFontSize:" + e.getMessage());
            return 0.0f;
        }
    }

    /* renamed from: d */
    public static void m9116d(Context context) {
        WifiInfo c;
        if (context != null && (c = m9112c(context)) != null) {
            C3531b bVar = new C3531b();
            bVar.f9062a = c.describeContents();
            bVar.f9063b = c.getBSSID();
            bVar.f9064c = c.getSSID();
            if (Build.VERSION.SDK_INT >= 21) {
                bVar.f9065d = c.getFrequency();
            } else {
                bVar.f9065d = -1;
            }
            boolean z = true;
            if (c.getHiddenSSID()) {
                bVar.f9066e = 1;
            } else {
                bVar.f9066e = 0;
            }
            bVar.f9067f = c.getIpAddress();
            bVar.f9068g = c.getLinkSpeed();
            bVar.f9069h = DeviceConfig.getMac(context);
            bVar.f9070i = c.getNetworkId();
            bVar.f9071j = c.getRssi();
            bVar.f9072k = m9122g(context);
            bVar.f9073l = System.currentTimeMillis();
            if (c != null) {
                try {
                    JSONArray a = C3542f.m9159a(context);
                    if (a != null && a.length() > 0) {
                        int i = 0;
                        while (true) {
                            if (i >= a.length()) {
                                break;
                            }
                            String optString = a.optJSONObject(i).optString(C3542f.f9105d, null);
                            if (optString != null && optString.equals(bVar.f9064c)) {
                                break;
                            }
                            i++;
                        }
                    }
                    z = false;
                    if (!z) {
                        C3542f.m9160a(context, bVar);
                    }
                } catch (Exception e) {
                    ULog.m9823e("wifiChange:" + e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public static List<ScanResult> m9110b(Context context) {
        WifiManager wifiManager;
        List<ScanResult> list = null;
        if (context == null || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null) {
            return null;
        }
        if (!DeviceConfig.checkPermission(context, MsgConstant.PERMISSION_ACCESS_WIFI_STATE) || ((!DeviceConfig.checkPermission(context, "android.permission.ACCESS_COARSE_LOCATION") && !DeviceConfig.checkPermission(context, "android.permission.ACCESS_FINE_LOCATION")) || (list = wifiManager.getScanResults()) == null || list.size() != 0)) {
        }
        return list;
    }

    /* renamed from: c */
    public static long m9111c() {
        if (!m9129j() || Build.VERSION.SDK_INT < 9) {
            return 0;
        }
        return Environment.getExternalStorageDirectory().getFreeSpace();
    }

    /* renamed from: d */
    public static long m9115d() {
        if (!m9129j() || Build.VERSION.SDK_INT < 9) {
            return 0;
        }
        return Environment.getExternalStorageDirectory().getTotalSpace();
    }
}
