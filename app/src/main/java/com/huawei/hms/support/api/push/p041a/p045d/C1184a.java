package com.huawei.hms.support.api.push.p041a.p045d;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.support.log.C1202a;
import com.p118pd.sdk.C7997oO0ooOO0;
import com.umeng.message.entity.UMessage;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.huawei.hms.support.api.push.a.d.a */
public class C1184a {

    /* renamed from: a */
    public static final char[] f1295a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static String m1239a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            C1202a.m1318b("PushSelfShowLog", "get the app name of package:" + str + " failed.");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m1245b(Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception unused) {
            C1202a.m1319c("PushSelfShowLog", str + "not have launch activity");
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m1250c(Context context, String str) {
        if (!(context == null || str == null || "".equals(str))) {
            try {
                if (context.getPackageManager().getApplicationInfo(str, 8192) == null) {
                    return false;
                }
                C1202a.m1316a("PushSelfShowLog", str + " is installed");
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public static void m1251d(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            C1202a.m1318b("PushSelfShowLog", "url is null.");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(402653184);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            String str2 = null;
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = it.next().activityInfo.packageName;
                if (m1252e(context, str3)) {
                    str2 = str3;
                    break;
                }
            }
            if (str2 == null) {
                Iterator<ResolveInfo> it2 = queryIntentActivities.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str4 = it2.next().activityInfo.packageName;
                    if ("com.android.browser".equalsIgnoreCase(str4)) {
                        str2 = str4;
                        break;
                    }
                }
            }
            if (str2 != null) {
                intent.setPackage(str2);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            C1202a.m1320d("PushSelfShowLog", "start browser activity failed, exception:" + e.getMessage());
        }
    }

    /* renamed from: e */
    public static boolean m1252e(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        context.getPackageManager().getPreferredActivities(arrayList, arrayList2, str);
        return arrayList2.size() > 0;
    }

    /* renamed from: b */
    public static boolean m1247b() {
        return Build.VERSION.SDK_INT >= 16;
    }

    /* renamed from: a */
    public static Boolean m1238a(Context context, String str, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                int size = queryIntentActivities.size();
                for (int i = 0; i < size; i++) {
                    if (queryIntentActivities.get(i).activityInfo != null && str.equals(queryIntentActivities.get(i).activityInfo.applicationInfo.packageName)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            C1202a.m1317a("PushSelfShowLog", e.toString(), e);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m1248b(Context context) {
        return "com.huawei.android.pushagent".equals(context.getPackageName());
    }

    /* renamed from: c */
    public static boolean m1249c(Context context) {
        return HuaweiApiAvailability.SERVICES_PACKAGE.equals(context.getPackageName());
    }

    /* renamed from: b */
    public static void m1246b(Context context, Intent intent) {
        try {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            int i = 0;
            if (intent.hasExtra("selfshow_notify_id")) {
                i = intent.getIntExtra("selfshow_notify_id", 0) + 3;
            }
            C1202a.m1316a("PushSelfShowLog", "setDelayAlarm(cancel) alarmNotityId " + i + " and intent is " + intent.toURI());
            Intent intent2 = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
            intent2.setPackage(context.getPackageName()).setFlags(32);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent2, 536870912);
            if (broadcast == null || alarmManager == null) {
                C1202a.m1316a("PushSelfShowLog", "alarm not exist");
                return;
            }
            C1202a.m1316a("PushSelfShowLog", "  alarm cancel");
            alarmManager.cancel(broadcast);
        } catch (Exception e) {
            C1202a.m1320d("PushSelfShowLog", "cancelAlarm err:" + e.toString());
        }
    }

    /* renamed from: a */
    public static boolean m1243a(Context context) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setPackage("com.android.email");
        intent.setData(Uri.fromParts("mailto", "xxxx@xxxx.com", null));
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m1242a() {
        return Build.VERSION.SDK_INT >= 11;
    }

    /* renamed from: a */
    public static long m1237a(String str) {
        if (str == null) {
            str = "";
        }
        try {
            Date date = new Date();
            int hours = (date.getHours() * 2) + (date.getMinutes() / 30);
            String concat = str.concat(str);
            C1202a.m1318b("PushSelfShowLog", "startIndex is " + hours + ",ap is:" + concat + ",length is:" + concat.length());
            int length = concat.length();
            for (int i = hours; i < length; i++) {
                if (concat.charAt(i) != '0') {
                    long minutes = ((long) (((i - hours) * 30) - (date.getMinutes() % 30))) * 60000;
                    C1202a.m1316a("PushSelfShowLog", "startIndex is:" + hours + " i is:" + i + " delay:" + minutes);
                    if (minutes >= 0) {
                        return minutes;
                    }
                    return 0;
                }
            }
        } catch (Exception e) {
            C1202a.m1317a("PushSelfShowLog", "error ", e);
        }
        return 0;
    }

    @SuppressLint({"TrulyRandom"})
    /* renamed from: a */
    public static void m1241a(Context context, Intent intent, long j) {
        try {
            C1202a.m1316a("PushSelfShowLog", "enter setAPDelayAlarm(intent:" + intent.toURI() + " interval:" + j + "ms, context:" + context);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            if (alarmManager != null) {
                alarmManager.set(0, System.currentTimeMillis() + j, PendingIntent.getBroadcast(context, new SecureRandom().nextInt(), intent, 0));
            }
        } catch (RuntimeException unused) {
            C1202a.m1319c("PushSelfShowLog", "set DelayAlarm error");
        } catch (Exception unused2) {
            C1202a.m1319c("PushSelfShowLog", "set DelayAlarm error");
        }
    }

    /* renamed from: a */
    public static boolean m1244a(Context context, Intent intent) {
        if (context == null) {
            C1202a.m1318b("PushSelfShowLog", "context is null");
            return false;
        } else if (intent == null) {
            C1202a.m1318b("PushSelfShowLog", "intent is null");
            return false;
        } else {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, C7997oO0ooOO0.OooOoO);
            if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                C1202a.m1320d("PushSelfShowLog", "no activity exist, may be system Err!! pkgName:");
                return false;
            }
            boolean z = queryIntentActivities.get(0).activityInfo.exported;
            C1202a.m1318b("PushSelfShowLog", "exportedFlag:" + z);
            String str = queryIntentActivities.get(0).activityInfo.permission;
            C1202a.m1318b("PushSelfShowLog", "need permission:" + str);
            if (!z) {
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            C1202a.m1320d("PushSelfShowLog", "does't have the permission to open this activity");
            return false;
        }
    }

    /* renamed from: a */
    public static void m1240a(Context context, int i) {
        if (context == null) {
            C1202a.m1320d("PushSelfShowLog", "context is null");
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
            if (notificationManager != null) {
                notificationManager.cancel(i);
            }
        } catch (Exception e) {
            C1202a.m1320d("PushSelfShowLog", "removeNotifiCationById err:" + e.toString());
        }
    }
}
