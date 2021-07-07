package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.umeng.message.MsgConstant;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.xiaomi.mipush.sdk.x */
public class C4237x {

    /* renamed from: com.xiaomi.mipush.sdk.x$a */
    public static class C4238a extends RuntimeException {
        public C4238a(String str) {
            super(str);
        }
    }

    /* renamed from: com.xiaomi.mipush.sdk.x$b */
    public static class C4239b {

        /* renamed from: a */
        public String f11330a;

        /* renamed from: a */
        public boolean f11331a;

        /* renamed from: b */
        public String f11332b;

        /* renamed from: b */
        public boolean f11333b;

        public C4239b(String str, boolean z, boolean z2, String str2) {
            this.f11330a = str;
            this.f11331a = z;
            this.f11333b = z2;
            this.f11332b = str2;
        }
    }

    /* renamed from: a */
    public static ActivityInfo m11605a(PackageManager packageManager, Intent intent, Class<?> cls) {
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 16384)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && cls.getCanonicalName().equals(activityInfo.name)) {
                return activityInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m11606a(Context context) {
        new Thread(new RunnableC4240y(context)).start();
    }

    /* renamed from: a */
    public static void m11608a(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(str);
        intent.setPackage(packageName);
        boolean z = false;
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 16384)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo == null || TextUtils.isEmpty(activityInfo.name) || !activityInfo.name.equals(str2)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (!z) {
            throw new C4238a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", str2));
        }
    }

    /* renamed from: a */
    public static void m11609a(ActivityInfo activityInfo, Boolean[] boolArr) {
        if (boolArr[0].booleanValue() != activityInfo.enabled) {
            throw new C4238a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", activityInfo.name, boolArr[0]));
        } else if (boolArr[1].booleanValue() != activityInfo.exported) {
            throw new C4238a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", activityInfo.name, boolArr[1]));
        }
    }

    /* renamed from: a */
    public static boolean m11610a(PackageInfo packageInfo, String[] strArr) {
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (m11611a(strArr, serviceInfo.name)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m11611a(String[] strArr, String str) {
        if (!(strArr == null || str == null)) {
            for (String str2 : strArr) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00aa A[EDGE_INSN: B:39:0x00aa->B:29:0x00aa ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11614c(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C4237x.m11614c(android.content.Context):void");
    }

    /* renamed from: c */
    public static void m11615c(Context context, PackageInfo packageInfo) {
        boolean z;
        HashSet hashSet = new HashSet();
        String str = context.getPackageName() + ".permission.MIPUSH_RECEIVE";
        hashSet.addAll(Arrays.asList(MsgConstant.PERMISSION_INTERNET, "android.permission.ACCESS_NETWORK_STATE", str, MsgConstant.PERMISSION_ACCESS_WIFI_STATE, MsgConstant.PERMISSION_READ_PHONE_STATE, MsgConstant.PERMISSION_GET_TASKS, "android.permission.VIBRATE"));
        PermissionInfo[] permissionInfoArr = packageInfo.permissions;
        if (permissionInfoArr != null) {
            int length = permissionInfoArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (str.equals(permissionInfoArr[i].name)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        z = false;
        if (z) {
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (!TextUtils.isEmpty(str2) && hashSet.contains(str2)) {
                        hashSet.remove(str2);
                        if (hashSet.isEmpty()) {
                            break;
                        }
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                throw new C4238a(String.format("<uses-permission android:name=\"%1$s\"/> is missing in AndroidManifest.", hashSet.iterator().next()));
            }
            return;
        }
        throw new C4238a(String.format("<permission android:name=\"%1$s\" .../> is undefined in AndroidManifest.", str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004b, code lost:
        if (m11610a(r14, new java.lang.String[]{"com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"}) != false) goto L_0x004d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11616d(android.content.Context r13, android.content.pm.PackageInfo r14) {
        /*
        // Method dump skipped, instructions count: 432
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C4237x.m11616d(android.content.Context, android.content.pm.PackageInfo):void");
    }
}
