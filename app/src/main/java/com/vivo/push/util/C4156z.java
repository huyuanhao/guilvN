package com.vivo.push.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.p118pd.sdk.C5982OoooOoO;
import com.umeng.message.MsgConstant;
import com.vivo.push.C4161z;
import com.xiaomi.mipush.sdk.Constants;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.vivo.push.util.z */
public final class C4156z {

    /* renamed from: a */
    public static String[] f11144a = {"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};

    /* renamed from: b */
    public static String[] f11145b = {MsgConstant.PERMISSION_INTERNET, MsgConstant.PERMISSION_READ_PHONE_STATE, "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", MsgConstant.PERMISSION_ACCESS_WIFI_STATE, MsgConstant.PERMISSION_WAKE_LOCK, "android.permission.GET_ACCOUNTS", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", MsgConstant.PERMISSION_GET_TASKS};

    /* renamed from: c */
    public static Boolean f11146c;

    /* renamed from: d */
    public static String[] f11147d = {"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};

    /* renamed from: e */
    public static String[] f11148e = {"com.vivo.push.sdk.RegistrationReceiver"};

    /* renamed from: f */
    public static String[] f11149f = new String[0];

    /* renamed from: a */
    public static boolean m11262a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Boolean bool = f11146c;
        if (bool != null) {
            return bool.booleanValue();
        }
        String b = C4149s.m11226b(context);
        if (context != null && context.getPackageName().equals(b)) {
            Boolean bool2 = true;
            f11146c = bool2;
            return bool2.booleanValue();
        } else if (context == null) {
            C4146p.m11216d("Utility", "isPushProcess context is null");
            return false;
        } else {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
            String str = null;
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        str = next.processName;
                        break;
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Boolean valueOf = Boolean.valueOf(str.contains(":pushservice"));
            f11146c = valueOf;
            return valueOf.booleanValue();
        }
    }

    /* renamed from: b */
    public static long m11264b(Context context) {
        String b = C4149s.m11226b(context);
        if (!TextUtils.isEmpty(b)) {
            return m11256a(context, b);
        }
        C4146p.m11204a("Utility", "systemPushPkgName is null");
        return -1;
    }

    /* renamed from: c */
    public static void m11268c(Context context) throws VivoPushException {
        String str;
        C4146p.m11216d("Utility", "check PushService AndroidManifest declearation !");
        String b = C4149s.m11226b(context);
        boolean c = C4149s.m11229c(context, context.getPackageName());
        boolean d = C4149s.m11231d(context, context.getPackageName());
        boolean b2 = C4149s.m11227b(context, context.getPackageName());
        if (d) {
            f11144a = new String[]{"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};
            f11145b = new String[]{MsgConstant.PERMISSION_INTERNET, MsgConstant.PERMISSION_READ_PHONE_STATE, "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", MsgConstant.PERMISSION_ACCESS_WIFI_STATE, MsgConstant.PERMISSION_WAKE_LOCK, "android.permission.GET_ACCOUNTS", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", MsgConstant.PERMISSION_GET_TASKS};
            f11147d = new String[]{"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};
            f11148e = new String[]{"com.vivo.push.sdk.RegistrationReceiver"};
        } else if (b2 || c) {
            if (b2) {
                f11147d = new String[]{"com.vivo.push.sdk.service.CommandClientService"};
            } else {
                f11147d = new String[]{"com.vivo.push.sdk.service.CommandService"};
            }
            f11148e = new String[0];
            f11144a = new String[0];
            if (c) {
                f11145b = new String[]{MsgConstant.PERMISSION_INTERNET, "android.permission.WRITE_SETTINGS"};
            } else {
                f11145b = new String[]{MsgConstant.PERMISSION_INTERNET};
            }
        } else {
            throw new VivoPushException("AndroidManifest.xml中receiver配置项错误，详见接入文档");
        }
        if (c || d) {
            long a = m11256a(context, context.getPackageName());
            long j = 293;
            if (context.getPackageName().equals(b)) {
                j = 1293;
            }
            if (a == -1) {
                throw new VivoPushException("AndroidManifest.xml中未配置sdk_version");
            } else if (a != j) {
                throw new VivoPushException("AndroidManifest.xml中sdk_version配置项错误，请配置当前sdk_version版本为:" + j);
            }
        }
        m11275g(context);
        m11272e(context, b);
        m11269c(context, b);
        m11271d(context, b);
        String packageName = context.getPackageName();
        Object b3 = m11265b(context, packageName, "com.vivo.push.api_key");
        if (b3 != null) {
            str = b3.toString();
        } else {
            Object b4 = m11265b(context, packageName, "api_key");
            str = b4 != null ? b4.toString() : "";
        }
        if (TextUtils.isEmpty(str)) {
            throw new VivoPushException("com.vivo.push.api_key is null");
        } else if (TextUtils.isEmpty(m11266b(context, context.getPackageName()))) {
            throw new VivoPushException("com.vivo.push.app_id is null");
        } else if ((c || d) && m11256a(context, context.getPackageName()) == -1) {
            throw new VivoPushException("sdkversion is null");
        } else if (d) {
            m11259a(context, "com.vivo.pushservice.action.METHOD", "com.vivo.push.sdk.RegistrationReceiver", true);
            m11259a(context, "com.vivo.pushservice.action.PUSH_SERVICE", "com.vivo.push.sdk.service.PushService", false);
        }
    }

    /* renamed from: d */
    public static void m11271d(Context context, String str) throws VivoPushException {
        if (f11149f.length > 0) {
            try {
                if (context.getPackageManager() != null) {
                    ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
                    if (activityInfoArr != null) {
                        for (String str2 : f11149f) {
                            m11261a(str2, activityInfoArr, str);
                        }
                        return;
                    }
                    throw new VivoPushException("activityInfos is null");
                }
                throw new VivoPushException("localPackageManager is null");
            } catch (Exception e) {
                throw new VivoPushException("error " + e.getMessage());
            }
        }
    }

    /* renamed from: e */
    public static void m11272e(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() != null) {
                ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 2).receivers;
                if (activityInfoArr != null) {
                    for (String str2 : f11148e) {
                        m11261a(str2, activityInfoArr, str);
                    }
                    return;
                }
                throw new VivoPushException("receivers is null");
            }
            throw new VivoPushException("localPackageManager is null");
        } catch (Exception e) {
            throw new VivoPushException(e.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x006d A[SYNTHETIC, Splitter:B:40:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007a A[SYNTHETIC, Splitter:B:48:0x007a] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> m11274f(android.content.Context r10) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.C4156z.m11274f(android.content.Context):java.util.Map");
    }

    /* renamed from: g */
    public static void m11275g(Context context) throws VivoPushException {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                String[] strArr = packageManager.getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                if (strArr != null) {
                    String[] strArr2 = f11145b;
                    for (String str : strArr2) {
                        for (String str2 : strArr) {
                            if (!str.equals(str2)) {
                            }
                        }
                        throw new VivoPushException("permission : " + str + "  check fail : " + Arrays.toString(strArr));
                    }
                    return;
                }
                throw new VivoPushException("Permissions is null!");
            }
            throw new VivoPushException("localPackageManager is null");
        } catch (Exception e) {
            throw new VivoPushException(e.getMessage());
        }
    }

    /* renamed from: b */
    public static String m11266b(Context context, String str) {
        Object b = m11265b(context, str, "com.vivo.push.app_id");
        if (b != null) {
            return b.toString();
        }
        Object b2 = m11265b(context, str, Constants.APP_ID);
        return b2 != null ? b2.toString() : "";
    }

    /* renamed from: e */
    public static boolean m11273e(Context context) {
        Cursor cursor = null;
        if (context == null) {
            try {
                C4146p.m11204a("Utility", "context is null");
                return false;
            } catch (Exception e) {
                C4146p.m11205a("Utility", "isSupport", e);
                if (0 != 0) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        cursor.close();
                    } catch (Exception e2) {
                        C4146p.m11205a("Utility", "close", e2);
                    }
                }
                throw th;
            }
        } else {
            String packageName = context.getPackageName();
            int i = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
            Cursor query = context.getContentResolver().query(C4161z.f11159b, null, "pushVersion = ? and appPkgName = ? and appCode = ? ", new String[]{"293", packageName, String.valueOf(i)}, null);
            if (query == null) {
                C4146p.m11204a("Utility", "cursor is null");
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e3) {
                        C4146p.m11205a("Utility", "close", e3);
                    }
                }
                return false;
            } else if (!query.moveToFirst() || (query.getInt(query.getColumnIndex("permission")) & 1) == 0) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e4) {
                        C4146p.m11205a("Utility", "close", e4);
                    }
                }
                return false;
            } else {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e5) {
                        C4146p.m11205a("Utility", "close", e5);
                    }
                }
                return true;
            }
        }
    }

    /* renamed from: b */
    public static Object m11265b(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            if (bundle != null) {
                return bundle.get(str2);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static PublicKey m11270d(Context context) {
        Cursor query = context.getContentResolver().query(C4161z.f11158a, null, null, null, null);
        if (query == null) {
            return null;
        }
        do {
            try {
                if (query.moveToNext()) {
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                try {
                    query.close();
                } catch (Exception unused) {
                }
                throw th;
            }
            try {
                query.close();
            } catch (Exception unused2) {
            }
            return null;
        } while (!"pushkey".equals(query.getString(query.getColumnIndex("name"))));
        String string = query.getString(query.getColumnIndex("value"));
        C4146p.m11216d("Utility", "result key : " + string);
        PublicKey a = C4150t.m11236a(string);
        try {
            query.close();
        } catch (Exception unused3) {
        }
        return a;
    }

    /* renamed from: b */
    public static String m11267b(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            e.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    /* renamed from: a */
    public static long m11256a(Context context, String str) {
        Object b = m11265b(context, str, "com.vivo.push.sdk_version");
        if (b == null) {
            b = m11265b(context, str, "sdk_version");
        }
        if (b != null) {
            try {
                return Long.parseLong(b.toString());
            } catch (Exception e) {
                e.printStackTrace();
                C4146p.m11205a("Utility", "getSdkVersionCode error ", e);
                return -1;
            }
        } else {
            C4146p.m11204a("Utility", "getSdkVersionCode sdk version is null");
            return -1;
        }
    }

    /* renamed from: a */
    public static Object m11257a(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        return cls.getField(str2).get(cls);
    }

    /* renamed from: a */
    public static void m11261a(String str, ComponentInfo[] componentInfoArr, String str2) throws VivoPushException {
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (str.equals(componentInfo.name)) {
                if (componentInfo.enabled) {
                    m11260a(componentInfo, str2);
                    return;
                } else {
                    throw new VivoPushException(componentInfo.name + " module Push-SDK need is illegitmacy !");
                }
            }
        }
        throw new VivoPushException(str + " module Push-SDK need is not exist");
    }

    /* renamed from: a */
    public static void m11260a(ComponentInfo componentInfo, String str) throws VivoPushException {
        if (!componentInfo.applicationInfo.packageName.equals(str)) {
            for (String str2 : f11144a) {
                if (str2.equals(componentInfo.name) && !componentInfo.processName.contains(":pushservice")) {
                    throw new VivoPushException("module : " + componentInfo.name + " process :" + componentInfo.processName + "  check process fail");
                }
            }
        }
    }

    /* renamed from: a */
    public static void m11259a(Context context, String str, String str2, boolean z) throws VivoPushException {
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                throw new VivoPushException("localPackageManager is null");
            } else if (z) {
                List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 576);
                if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                    throw new VivoPushException("checkModule " + intent + " has no receivers");
                }
                for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                    if (str2.equals(resolveInfo.activityInfo.name)) {
                        return;
                    }
                }
                throw new VivoPushException(str2 + " is missing");
            } else {
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    throw new VivoPushException("checkModule " + intent + " has no services");
                }
                for (ResolveInfo resolveInfo2 : queryIntentServices) {
                    if (str2.equals(resolveInfo2.serviceInfo.name)) {
                        if (!resolveInfo2.serviceInfo.exported) {
                            throw new VivoPushException(resolveInfo2.serviceInfo.name + " exported is false");
                        }
                        return;
                    }
                }
                throw new VivoPushException(str2 + " is missing");
            }
        } catch (Exception e) {
            C4146p.m11204a("Utility", "error  " + e.getMessage());
            throw new VivoPushException("checkModule error" + e.getMessage());
        }
    }

    /* renamed from: c */
    public static void m11269c(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() != null) {
                ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
                if (serviceInfoArr != null) {
                    for (String str2 : f11147d) {
                        m11261a(str2, serviceInfoArr, str);
                    }
                    return;
                }
                throw new VivoPushException("serviceInfos is null");
            }
            throw new VivoPushException("localPackageManager is null");
        } catch (Exception e) {
            throw new VivoPushException("error " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m11258a(Context context, Intent intent) {
        String b = C4149s.m11226b(context);
        String stringExtra = intent.getStringExtra("client_pkgname");
        if (TextUtils.isEmpty(b)) {
            C4146p.m11204a("Utility", "illegality abe adapter : push pkg is null");
        } else if (TextUtils.isEmpty(stringExtra)) {
            C4146p.m11204a("Utility", "illegality abe adapter : src pkg is null");
        } else if (b.equals(context.getPackageName())) {
            C4146p.m11204a("Utility", "illegality abe adapter : abe is not pushservice");
        } else if (!b.equals(stringExtra)) {
            C4146p.m11216d("Utility", "proxy to core : intent pkg : " + intent.getPackage() + " ; src pkg : " + stringExtra + " ; push pkg : " + b);
            intent.setPackage(b);
            intent.setClassName(b, "com.vivo.push.sdk.service.PushService");
            context.startService(intent);
        } else {
            C4146p.m11204a("Utility", "illegality abe adapter : pushPkg = " + b + " ; srcPkg = " + stringExtra);
        }
    }

    /* renamed from: a */
    public static boolean m11263a(Context context, String str, String str2) {
        Cursor cursor = null;
        if (context == null) {
            try {
                C4146p.m11204a("Utility", "context is null");
                return false;
            } catch (Exception e) {
                C4146p.m11205a("Utility", "isOverdue", e);
                if (0 != 0) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        cursor.close();
                    } catch (Exception e2) {
                        C4146p.m11205a("Utility", "close", e2);
                    }
                }
                throw th;
            }
        } else {
            Cursor query = context.getContentResolver().query(C4161z.f11160c, null, "appPkgName = ? and regId = ? sdkVersion = ? ", new String[]{str, str2, "293"}, null);
            if (query == null) {
                C4146p.m11204a("Utility", "cursor is null");
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e3) {
                        C4146p.m11205a("Utility", "close", e3);
                    }
                }
                return false;
            } else if (query.moveToFirst()) {
                boolean parseBoolean = Boolean.parseBoolean(query.getString(query.getColumnIndex("clientState")));
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e4) {
                        C4146p.m11205a("Utility", "close", e4);
                    }
                }
                return parseBoolean;
            } else {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e5) {
                        C4146p.m11205a("Utility", "close", e5);
                    }
                }
                return false;
            }
        }
    }
}
