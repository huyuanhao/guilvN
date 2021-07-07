package com.huawei.hms.support.api.push.p046b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.huawei.hms.support.log.C1202a;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.huawei.hms.support.api.push.b.a */
public abstract class AbstractC1187a {

    /* renamed from: a */
    public static final Object f1296a = new Object();

    /* renamed from: b */
    public static int f1297b = -1;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (1 != com.huawei.hms.support.api.push.p046b.AbstractC1187a.f1297b) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1263a(android.content.Context r5) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "existFrameworkPush:"
            r0.append(r1)
            int r1 = com.huawei.hms.support.api.push.p046b.AbstractC1187a.f1297b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CommFun"
            com.huawei.hms.support.log.C1202a.m1316a(r1, r0)
            java.lang.Object r0 = com.huawei.hms.support.api.push.p046b.AbstractC1187a.f1296a
            monitor-enter(r0)
            r1 = -1
            int r2 = com.huawei.hms.support.api.push.p046b.AbstractC1187a.f1297b     // Catch:{ all -> 0x003b }
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x0029
            int r5 = com.huawei.hms.support.api.push.p046b.AbstractC1187a.f1297b     // Catch:{ all -> 0x003b }
            if (r4 != r5) goto L_0x0027
            r3 = 1
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return r3
        L_0x0029:
            boolean r5 = m1266d(r5)     // Catch:{ all -> 0x003b }
            if (r5 == 0) goto L_0x0032
            com.huawei.hms.support.api.push.p046b.AbstractC1187a.f1297b = r4     // Catch:{ all -> 0x003b }
            goto L_0x0034
        L_0x0032:
            com.huawei.hms.support.api.push.p046b.AbstractC1187a.f1297b = r3     // Catch:{ all -> 0x003b }
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            int r5 = com.huawei.hms.support.api.push.p046b.AbstractC1187a.f1297b
            if (r4 != r5) goto L_0x003a
            r3 = 1
        L_0x003a:
            return r3
        L_0x003b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.support.api.push.p046b.AbstractC1187a.m1263a(android.content.Context):boolean");
    }

    /* renamed from: b */
    public static String m1264b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            C1202a.m1316a("CommFun", "package not exist");
        } catch (Exception e) {
            C1202a.m1320d("CommFun", "getApkVersionName error" + e.getMessage());
        }
        return "0.0";
    }

    /* renamed from: c */
    public static long m1265c(Context context) {
        try {
            return (long) context.getPackageManager().getPackageInfo("com.huawei.android.pushagent", 0).versionCode;
        } catch (Exception unused) {
            C1202a.m1320d("CommFun", "get nc versionCode error");
            return -1;
        }
    }

    /* renamed from: d */
    public static boolean m1266d(Context context) {
        C1202a.m1316a("CommFun", "existFrameworkPush:" + f1297b);
        try {
            File file = new File("/system/framework/" + "hwpush.jar");
            if (m1262a()) {
                C1202a.m1316a("CommFun", "push jarFile is exist");
            } else {
                if (file.isFile()) {
                    C1202a.m1316a("CommFun", "push jarFile is exist");
                }
                return false;
            }
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setClassName("android", "com.huawei.android.pushagentproxy.PushService"), 128);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                C1202a.m1318b("CommFun", "framework push not exist, need vote apk or sdk to support pushservice");
                return false;
            }
            C1202a.m1318b("CommFun", "framework push exist, use framework push first");
            return true;
        } catch (Exception e) {
            C1202a.m1320d("CommFun", "get Apk version faild ,Exception e= " + e.toString());
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m1262a() {
        try {
            Class<?> cls = Class.forName("huawei.cust.HwCfgFilePolicy");
            int intValue = ((Integer) cls.getDeclaredField("CUST_TYPE_CONFIG").get(cls)).intValue();
            File file = (File) cls.getDeclaredMethod("getCfgFile", String.class, Integer.TYPE).invoke(cls, "jars/hwpush.jar", Integer.valueOf(intValue));
            if (file != null && file.exists()) {
                C1202a.m1316a("CommFun", "get push cust File path is " + file.getCanonicalPath());
                return true;
            }
        } catch (ClassNotFoundException unused) {
            C1202a.m1320d("CommFun", "HwCfgFilePolicy ClassNotFoundException");
        } catch (SecurityException unused2) {
            C1202a.m1320d("CommFun", "check cust exist push SecurityException.");
        } catch (NoSuchFieldException unused3) {
            C1202a.m1320d("CommFun", "check cust exist push NoSuchFieldException.");
        } catch (NoSuchMethodException unused4) {
            C1202a.m1320d("CommFun", "check cust exist push NoSuchMethodException.");
        } catch (IllegalArgumentException unused5) {
            C1202a.m1320d("CommFun", "check cust exist push IllegalArgumentException.");
        } catch (IllegalAccessException unused6) {
            C1202a.m1320d("CommFun", "check cust exist push IllegalAccessException.");
        } catch (InvocationTargetException unused7) {
            C1202a.m1320d("CommFun", "check cust exist push InvocationTargetException.");
        } catch (IOException unused8) {
            C1202a.m1320d("CommFun", "check jarFile exist but get not path");
        }
        return false;
    }
}
