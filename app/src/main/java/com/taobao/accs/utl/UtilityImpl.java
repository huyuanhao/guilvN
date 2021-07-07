package com.taobao.accs.utl;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import anet.channel.util.HMacUtil;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.C3103a;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.android.spdy.SpdyProtocol;

public class UtilityImpl {
    public static final String NET_TYPE_2G = "2g";
    public static final String NET_TYPE_3G = "3g";
    public static final String NET_TYPE_4G = "4g";
    public static final String NET_TYPE_UNKNOWN = "unknown";
    public static final String NET_TYPE_WIFI = "wifi";
    public static final int TNET_FILE_NUM = 5;
    public static final int TNET_FILE_SIZE = 5242880;

    /* renamed from: a */
    public static final byte[] f7186a = new byte[0];

    /* renamed from: a */
    public static String m7609a(Context context) {
        String string = context.getSharedPreferences(Constants.SP_FILE_NAME, 4).getString(Constants.KEY_PROXY_HOST, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String b = m7623b();
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        return b;
    }

    /* renamed from: b */
    public static int m7621b(Context context) {
        int i = context.getSharedPreferences(Constants.SP_FILE_NAME, 4).getInt(Constants.KEY_PROXY_PORT, -1);
        if (i > 0) {
            return i;
        }
        if (m7609a(context) == null) {
            return -1;
        }
        try {
            return m7626c();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static boolean m7630c(Context context) {
        int i;
        String str;
        synchronized (f7186a) {
            PackageInfo packageInfo = GlobalClientInfo.getInstance(context).getPackageInfo();
            int i2 = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getInt(Constants.KEY_APP_VERSION_CODE, -1);
            String string = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getString(Constants.KEY_APP_VERSION_NAME, "");
            if (packageInfo != null) {
                i = packageInfo.versionCode;
                str = packageInfo.versionName;
            } else {
                str = null;
                i = 0;
            }
            if (i2 == i) {
                if (string.equals(str)) {
                    return false;
                }
            }
            m7652t(context);
            ALog.m7600i("UtilityImpl", "appVersionChanged", "oldV", Integer.valueOf(i2), "nowV", Integer.valueOf(i), "oldN", string, "nowN", str);
            return true;
        }
    }

    public static void clearSharePreferences(Context context) {
        try {
            synchronized (f7186a) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
                String string = sharedPreferences.getString("appkey", null);
                String string2 = sharedPreferences.getString("app_sercet", null);
                String string3 = sharedPreferences.getString(Constants.KEY_PROXY_HOST, null);
                int i = sharedPreferences.getInt(Constants.KEY_PROXY_PORT, -1);
                int i2 = sharedPreferences.getInt("version", -1);
                int i3 = sharedPreferences.getInt(Constants.SP_KEY_DEBUG_MODE, 0);
                SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                edit.clear();
                if (!TextUtils.isEmpty(string)) {
                    edit.putString("appkey", string);
                }
                if (!TextUtils.isEmpty(string2)) {
                    edit.putString("app_sercet", string2);
                }
                if (!TextUtils.isEmpty(string3)) {
                    edit.putString(Constants.KEY_PROXY_HOST, string3);
                }
                if (i > 0) {
                    edit.putInt(Constants.KEY_PROXY_PORT, i);
                }
                if (i2 > 0) {
                    edit.putInt("version", i2);
                }
                if (i3 == 2 || i3 == 1) {
                    edit.putInt(Constants.SP_KEY_DEBUG_MODE, i3);
                }
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "clearSharePreferences", th, new Object[0]);
        }
    }

    /* renamed from: d */
    public static boolean m7634d(Context context) {
        boolean z;
        Exception e;
        boolean z2;
        if (context == null) {
            return false;
        }
        try {
            synchronized (f7186a) {
                try {
                    z = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getBoolean(Constants.KEY_FOUCE_DISABLE, false);
                } catch (Throwable th) {
                    th = th;
                    z2 = context;
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
            ALog.m7598e("UtilityImpl", "getFocusDisableStatus", e, new Object[0]);
            return z;
        }
    }

    public static void disableService(Context context) {
        ComponentName componentName = new ComponentName(context, C3178j.channelService);
        PackageManager packageManager = context.getPackageManager();
        try {
            ALog.m7597d("UtilityImpl", "disableService,comptName=" + componentName.toString(), new Object[0]);
            if (packageManager.getServiceInfo(componentName, 128).enabled) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
                killService(context);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: e */
    public static boolean m7637e(Context context) {
        try {
            if (context.getPackageManager().getServiceInfo(new ComponentName(context, C3178j.channelService), 128).enabled) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            ALog.m7599e("UtilityImpl", C3178j.m7660a(e), new Object[0]);
        }
    }

    public static void enableService(Context context) {
        ComponentName componentName = new ComponentName(context, C3178j.channelService);
        ALog.m7597d("UtilityImpl", "enableService", "comptName", componentName);
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        } catch (Exception e) {
            ALog.m7602w("UtilityImpl", "enableService", e, new Object[0]);
        }
    }

    /* renamed from: f */
    public static boolean m7638f(Context context) {
        ComponentName componentName = new ComponentName(context, C3103a.m7296a(context.getPackageName()));
        PackageManager packageManager = context.getPackageManager();
        try {
            if (componentName.getPackageName().equals("!")) {
                ALog.m7599e("UtilityImpl", "getAgooServiceEnabled,exception,comptName.getPackageName()=" + componentName.getPackageName(), new Object[0]);
                return false;
            } else if (packageManager.getServiceInfo(componentName, 128).enabled) {
                return true;
            } else {
                return false;
            }
        } catch (Exception unused) {
        }
    }

    public static void focusDisableService(Context context) {
        try {
            synchronized (f7186a) {
                SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                edit.putBoolean(Constants.KEY_FOUCE_DISABLE, true);
                edit.apply();
                disableService(context);
            }
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "focusDisableService", th, new Object[0]);
        }
    }

    public static void focusEnableService(Context context) {
        try {
            synchronized (f7186a) {
                SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                edit.putBoolean(Constants.KEY_FOUCE_DISABLE, false);
                edit.apply();
                enableService(context);
            }
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "focusEnableService", th, new Object[0]);
        }
    }

    /* renamed from: g */
    public static String m7639g(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "unknown";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        String subtypeName = activeNetworkInfo.getSubtypeName();
        if (!TextUtils.isEmpty(subtypeName)) {
            return subtypeName.replaceAll(" ", "");
        }
        return "";
    }

    /* renamed from: h */
    public static String m7640h(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "unknown";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2g";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3g";
                case 13:
                    return "4g";
                default:
                    String subtypeName = activeNetworkInfo.getSubtypeName();
                    if (TextUtils.isEmpty(subtypeName)) {
                        return "unknown";
                    }
                    if (subtypeName.equalsIgnoreCase("td-scdma") || subtypeName.equalsIgnoreCase("td_scdma") || subtypeName.equalsIgnoreCase("tds_hsdpa")) {
                        return "3g";
                    }
                    return "unknown";
            }
        } catch (Exception e) {
            ALog.m7598e("UtilityImpl", "getNetworkTypeExt", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: i */
    public static String m7641i(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean isMainProcess(Context context) {
        return C3178j.m7661a(context);
    }

    /* renamed from: j */
    public static boolean m7642j(Context context) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String packageName = GlobalClientInfo.getInstance(context).getActivityManager().getRunningTasks(1).get(0).topActivity.getPackageName();
            if (!TextUtils.isEmpty(packageName) && packageName.equals(context.getPackageName())) {
                return true;
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m7597d("UtilityImpl", "isForeground time " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            }
            return false;
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "isForeground error ", th, new Object[0]);
        }
    }

    /* renamed from: k */
    public static boolean m7643k(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = GlobalClientInfo.getInstance(context).getConnectivityManager().getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void killService(Context context) {
        try {
            int myUid = Process.myUid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.uid == myUid) {
                        if (!TextUtils.isEmpty(C3103a.f6875e) && C3103a.f6875e.equals(runningAppProcessInfo.processName)) {
                            ALog.m7599e("UtilityImpl", "killService", "processName", runningAppProcessInfo.processName);
                            Process.killProcess(runningAppProcessInfo.pid);
                            return;
                        } else if (runningAppProcessInfo.processName.endsWith(":channel")) {
                            ALog.m7599e("UtilityImpl", "killService", "processName", runningAppProcessInfo.processName);
                            Process.killProcess(runningAppProcessInfo.pid);
                            return;
                        }
                    }
                }
                ALog.m7599e("UtilityImpl", "kill nothing", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "killService", th, new Object[0]);
        }
    }

    /* renamed from: l */
    public static String m7644l(Context context) {
        return C3178j.m7663b(context);
    }

    /* renamed from: m */
    public static String m7645m(Context context) {
        String i = m7641i(context);
        return (i == null || i.length() <= 5) ? "null" : i.substring(0, 5);
    }

    /* renamed from: n */
    public static long m7646n(Context context) {
        Throwable th;
        long j = 0;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_CHANNEL_FILE_NAME, 0);
            long j2 = sharedPreferences.getLong(Constants.SP_KEY_SERVICE_START, 0);
            long j3 = j2 > 0 ? sharedPreferences.getLong(Constants.SP_KEY_SERVICE_END, 0) - j2 : 0;
            try {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(Constants.SP_KEY_SERVICE_START, 0);
                edit.putLong(Constants.SP_KEY_SERVICE_END, 0);
                edit.apply();
                return j3;
            } catch (Throwable th2) {
                th = th2;
                j = j3;
            }
        } catch (Throwable th3) {
            th = th3;
            ALog.m7598e("UtilityImpl", "getServiceAliveTime:", th, new Object[0]);
            return j;
        }
    }

    /* renamed from: o */
    public static String m7647o(Context context) {
        try {
            return GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: p */
    public static String m7648p(Context context) {
        try {
            return context.getSharedPreferences(Constants.SP_COOKIE_FILE_NAME, 4).getString(Constants.SP_KEY_COOKIE_SEC, null);
        } catch (Exception e) {
            ALog.m7598e("UtilityImpl", "reStoreCookie fail", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: q */
    public static void m7649q(Context context) {
        try {
            GlobalClientInfo.f6860c = null;
            SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_COOKIE_FILE_NAME, 0).edit();
            edit.clear();
            edit.apply();
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "clearCookie fail", th, new Object[0]);
        }
    }

    /* renamed from: r */
    public static String m7650r(Context context) {
        return C3178j.m7665d(context);
    }

    /* renamed from: s */
    public static String[] m7651s(Context context) {
        String[] appkey;
        synchronized (f7186a) {
            appkey = ACCSManager.getAppkey(context);
        }
        return appkey;
    }

    /* renamed from: t */
    public static void m7652t(Context context) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            edit.putInt(Constants.KEY_APP_VERSION_CODE, GlobalClientInfo.getInstance(context).getPackageInfo().versionCode);
            edit.putString(Constants.KEY_APP_VERSION_NAME, GlobalClientInfo.getInstance(context).getPackageInfo().versionName);
            edit.apply();
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "saveAppVersion", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:4:0x0004 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r3 = r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m7625b(java.lang.String r3, android.content.Context r4) {
        /*
            r0 = 0
            byte[] r1 = com.taobao.accs.utl.UtilityImpl.f7186a     // Catch:{ all -> 0x0025 }
            monitor-enter(r1)     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = com.taobao.accs.utl.C3178j.m7665d(r4)     // Catch:{ all -> 0x001d }
            android.content.SharedPreferences r3 = r4.getSharedPreferences(r3, r0)     // Catch:{ all -> 0x001d }
            java.lang.String r4 = "notification_state"
            java.lang.String r3 = r3.getString(r4, r2)     // Catch:{ all -> 0x001d }
            boolean r3 = r3.equals(r2)     // Catch:{ all -> 0x001d }
            if (r3 != 0) goto L_0x001a
            r3 = 1
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            goto L_0x0030
        L_0x001d:
            r4 = move-exception
            r3 = 0
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            throw r4     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r4 = move-exception
            goto L_0x0027
        L_0x0023:
            r4 = move-exception
            goto L_0x001f
        L_0x0025:
            r4 = move-exception
            r3 = 0
        L_0x0027:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "UtilityImpl"
            java.lang.String r2 = "notificationStateChanged"
            com.taobao.accs.utl.ALog.m7598e(r1, r2, r4, r0)
        L_0x0030:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.UtilityImpl.m7625b(java.lang.String, android.content.Context):boolean");
    }

    /* renamed from: d */
    public static boolean m7635d(String str) {
        int i;
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag == null) {
            i = 0;
        } else {
            i = configByTag.getSecurity();
        }
        if (i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m7608a(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Long.valueOf(j));
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "formatDay", th, new Object[0]);
            return "";
        }
    }

    /* renamed from: d */
    public static String m7632d(String str, Context context) {
        String string;
        try {
            synchronized (f7186a) {
                string = context.getSharedPreferences(str, 0).getString("utdid", C3178j.m7663b(context));
            }
            return string;
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "getUtdid", th, new Object[0]);
            return "";
        }
    }

    /* renamed from: e */
    public static String m7636e() {
        Class<?>[] clsArr = {String.class};
        Object[] objArr = {"ro.build.version.emui"};
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod("get", clsArr).invoke(cls, objArr);
            ALog.m7597d("UtilityImpl", "getEmuiVersion", "result", str);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        } catch (Exception e) {
            ALog.m7598e("UtilityImpl", "getEmuiVersion", e, new Object[0]);
            return "";
        }
    }

    /* renamed from: a */
    public static String m7610a(Context context, String str, String str2, String str3, String str4) {
        String signRequest;
        if (TextUtils.isEmpty(str)) {
            ALog.m7599e("UtilityImpl", "getAppsign appkey null", new Object[0]);
            return null;
        }
        try {
            if (!m7635d(str4)) {
                SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
                if (instance != null) {
                    ALog.m7597d("UtilityImpl", "getAppsign SecurityGuardManager not null!", new Object[0]);
                    ISecureSignatureComponent secureSignatureComp = instance.getSecureSignatureComp();
                    SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                    securityGuardParamContext.appKey = str;
                    Map map = securityGuardParamContext.paramMap;
                    map.put("INPUT", str3 + str);
                    securityGuardParamContext.requestType = 3;
                    AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str4);
                    signRequest = secureSignatureComp.signRequest(securityGuardParamContext, configByTag != null ? configByTag.getAuthCode() : null);
                } else {
                    ALog.m7597d("UtilityImpl", "getAppsign SecurityGuardManager is null", new Object[0]);
                    return null;
                }
            } else if (!TextUtils.isEmpty(str2)) {
                byte[] bytes = str2.getBytes();
                signRequest = HMacUtil.hmacSha1Hex(bytes, (str + str3).getBytes());
            } else {
                ALog.m7599e("UtilityImpl", "getAppsign secret null", new Object[0]);
                return null;
            }
            return signRequest;
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "getAppsign", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static void m7624b(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                GlobalClientInfo.f6860c = str;
                SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_COOKIE_FILE_NAME, 0).edit();
                edit.putString(Constants.SP_KEY_COOKIE_SEC, str);
                edit.apply();
            }
        } catch (Exception e) {
            ALog.m7598e("UtilityImpl", "storeCookie fail", e, new Object[0]);
        }
    }

    /* renamed from: c */
    public static void m7629c(String str, Context context) {
        try {
            synchronized (f7186a) {
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
                edit.putString("utdid", C3178j.m7663b(context));
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "saveUtdid", th, new Object[0]);
        }
    }

    /* renamed from: d */
    public static String m7631d() {
        String str = m7623b() + com.xiaomi.mipush.sdk.Constants.COLON_SEPARATOR + m7626c();
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m7597d("UtilityImpl", "getProxy:" + str, new Object[0]);
        }
        return str;
    }

    /* renamed from: d */
    public static void m7633d(Context context, String str) {
        try {
            synchronized (f7186a) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
                String string = sharedPreferences.getString("appkey", "");
                if (!TextUtils.isEmpty(str) && !string.equals(str)) {
                    if (!string.contains(str)) {
                        if (!TextUtils.isEmpty(string)) {
                            str = string + "|" + str;
                        }
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString("appkey", str);
                        edit.apply();
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static String m7623b() {
        if (Build.VERSION.SDK_INT < 11) {
            return Proxy.getDefaultHost();
        }
        return System.getProperty("http.proxyHost");
    }

    /* renamed from: c */
    public static int m7626c() {
        if (Build.VERSION.SDK_INT < 11) {
            return Proxy.getDefaultPort();
        }
        try {
            return Integer.parseInt(System.getProperty("http.proxyPort"));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static int m7622b(String str) {
        try {
            return Integer.valueOf(str).intValue();
        } catch (Exception e) {
            ALog.m7598e("UtilityImpl", "String2Int", e, new Object[0]);
            return 0;
        }
    }

    /* renamed from: c */
    public static String m7627c(Context context, String str) {
        try {
            File externalFilesDir = context.getExternalFilesDir("tnetlogs");
            if (externalFilesDir == null || !externalFilesDir.exists() || !externalFilesDir.canWrite()) {
                externalFilesDir = context.getDir("logs", 0);
            }
            ALog.m7597d("UtilityImpl", "getTnetLogFilePath :" + externalFilesDir, new Object[0]);
            return externalFilesDir + C8932ooOOO0o.OooO0OO + str.toLowerCase();
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "getTnetLogFilePath", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m7620a(Context context, String str, String str2, byte[] bArr) {
        IStaticDataEncryptComponent staticDataEncryptComp;
        byte[] bArr2 = null;
        if (m7635d(str)) {
            return null;
        }
        if (context == null || bArr == null) {
            ALog.m7599e("UtilityImpl", "staticBinarySafeDecryptNoB64 input null!", new Object[0]);
            return null;
        }
        try {
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            String authCode = configByTag != null ? configByTag.getAuthCode() : null;
            ALog.m7600i("UtilityImpl", "staticBinarySafeDecryptNoB64", "appkey", str2, "authcode", authCode);
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (!(instance == null || (staticDataEncryptComp = instance.getStaticDataEncryptComp()) == null)) {
                bArr2 = staticDataEncryptComp.staticBinarySafeDecryptNoB64(16, SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr, authCode);
            }
            if (bArr2 == null) {
                ALog.m7599e("UtilityImpl", "staticBinarySafeDecryptNoB64 null", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "staticBinarySafeDecryptNoB64", th, new Object[0]);
        }
        return bArr2;
    }

    /* renamed from: c */
    public static String m7628c(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static int m7604a(Context context, String str, String str2, String str3, byte[] bArr) {
        SecurityGuardManager instance;
        IDynamicDataStoreComponent dynamicDataStoreComp;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || context == null || bArr == null) {
            return -1;
        }
        try {
            if (m7635d(str) || (instance = SecurityGuardManager.getInstance(context)) == null || (dynamicDataStoreComp = instance.getDynamicDataStoreComp()) == null) {
                return -1;
            }
            return dynamicDataStoreComp.putByteArray("accs_ssl_key2_" + str3, bArr);
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "SecurityGuardPutSslTicket2", th, new Object[0]);
            return -1;
        }
    }

    /* renamed from: a */
    public static byte[] m7619a(Context context, String str, String str2, String str3) {
        SecurityGuardManager instance;
        IDynamicDataStoreComponent dynamicDataStoreComp;
        if (context == null || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            ALog.m7600i("UtilityImpl", "get sslticket input null", new Object[0]);
            return null;
        }
        try {
            if (m7635d(str) || (instance = SecurityGuardManager.getInstance(context)) == null || (dynamicDataStoreComp = instance.getDynamicDataStoreComp()) == null) {
                return null;
            }
            return dynamicDataStoreComp.getByteArray("accs_ssl_key2_" + str3);
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "SecurityGuardGetSslTicket2", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m7617a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            ALog.m7599e("UtilityImpl", "package not exist", "pkg", str);
            return false;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:4:0x0004 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r3 = r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m7618a(java.lang.String r3, android.content.Context r4) {
        /*
            r0 = 0
            byte[] r1 = com.taobao.accs.utl.UtilityImpl.f7186a     // Catch:{ all -> 0x0025 }
            monitor-enter(r1)     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = com.taobao.accs.utl.C3178j.m7663b(r4)     // Catch:{ all -> 0x001d }
            android.content.SharedPreferences r3 = r4.getSharedPreferences(r3, r0)     // Catch:{ all -> 0x001d }
            java.lang.String r4 = "utdid"
            java.lang.String r3 = r3.getString(r4, r2)     // Catch:{ all -> 0x001d }
            boolean r3 = r3.equals(r2)     // Catch:{ all -> 0x001d }
            if (r3 != 0) goto L_0x001a
            r3 = 1
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            goto L_0x0030
        L_0x001d:
            r4 = move-exception
            r3 = 0
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            throw r4     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r4 = move-exception
            goto L_0x0027
        L_0x0023:
            r4 = move-exception
            goto L_0x001f
        L_0x0025:
            r4 = move-exception
            r3 = 0
        L_0x0027:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "UtilityImpl"
            java.lang.String r2 = "utdidChanged"
            com.taobao.accs.utl.ALog.m7598e(r1, r2, r4, r0)
        L_0x0030:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.UtilityImpl.m7618a(java.lang.String, android.content.Context):boolean");
    }

    /* renamed from: a */
    public static void m7614a(Context context, String str, long j) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_CHANNEL_FILE_NAME, 0).edit();
            edit.putLong(str, j);
            edit.apply();
            ALog.m7597d("UtilityImpl", "setServiceTime:" + j, new Object[0]);
        } catch (Throwable th) {
            ALog.m7598e("UtilityImpl", "setServiceTime:", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m7615a(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 4).edit();
            edit.putString(Constants.SP_KEY_NOTIFICATION_STATE, str2);
            edit.apply();
        } catch (Exception e) {
            ALog.m7598e("UtilityImpl", "saveNotificationState fail", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public static int m7605a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes("utf-8").length;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static String m7611a(Throwable th) {
        return C3178j.m7660a(th);
    }

    /* renamed from: a */
    public static long m7606a() {
        return C3178j.m7658a();
    }

    /* renamed from: a */
    public static String m7607a(int i) {
        try {
            return String.valueOf(i);
        } catch (Exception e) {
            ALog.m7598e("UtilityImpl", "int2String", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static final Map<String, String> m7613a(Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String a = m7612a(entry.getValue());
                    if (!TextUtils.isEmpty(a)) {
                        if (!key.startsWith(com.xiaomi.mipush.sdk.Constants.COLON_SEPARATOR)) {
                            key = key.toLowerCase(Locale.US);
                        }
                        hashMap.put(key, a);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    /* renamed from: a */
    public static final String m7612a(List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            stringBuffer.append(list.get(i));
            if (i < size - 1) {
                stringBuffer.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static boolean m7616a(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date(j2));
        if (instance.get(1) == instance2.get(1) && instance.get(2) == instance2.get(2) && instance.get(5) == instance2.get(5)) {
            return true;
        }
        return false;
    }
}
