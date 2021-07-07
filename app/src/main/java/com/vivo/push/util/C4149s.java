package com.vivo.push.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.umeng.message.proguard.C3848l;
import com.vivo.push.cache.AbstractC4103e;
import com.vivo.push.cache.C4100b;
import com.vivo.push.model.C4118b;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.vivo.push.util.s */
public final class C4149s {

    /* renamed from: a */
    public static Boolean f11126a;

    /* renamed from: a */
    public static C4118b m11222a(Context context) {
        C4118b bVar;
        C4118b e;
        Context applicationContext = context.getApplicationContext();
        C4118b e2 = m11232e(applicationContext);
        if (e2 != null) {
            C4146p.m11216d("PushPackageUtils", "get system push info :" + e2);
            return e2;
        }
        List<String> f = m11235f(applicationContext);
        C4118b e3 = m11233e(applicationContext, applicationContext.getPackageName());
        if (f.size() <= 0) {
            if (e3 != null && e3.mo41089d()) {
                e2 = e3;
            }
            C4146p.m11204a("PushPackageUtils", "findAllPushPackages error: find no package!");
        } else {
            C4118b bVar2 = null;
            String a = C4155y.m11251b(applicationContext).mo41187a("com.vivo.push.cur_pkg", null);
            if (TextUtils.isEmpty(a) || !m11225a(applicationContext, a, "com.vivo.pushservice.action.METHOD") || (bVar = m11233e(applicationContext, a)) == null || !bVar.mo41089d()) {
                bVar = null;
            }
            if (e3 == null || !e3.mo41089d()) {
                e3 = null;
            }
            if (bVar == null) {
                bVar = null;
            }
            if (e3 == null || (bVar != null && (!e3.mo41088c() ? !(bVar.mo41088c() || e3.mo41086b() > bVar.mo41086b()) : !(bVar.mo41088c() && e3.mo41086b() > bVar.mo41086b())))) {
                e3 = bVar;
            }
            HashMap hashMap = new HashMap();
            if (e3 == null) {
                e3 = null;
            } else if (e3.mo41088c()) {
                bVar2 = e3;
                e3 = null;
            }
            int size = f.size();
            for (int i = 0; i < size; i++) {
                String str = f.get(i);
                if (!TextUtils.isEmpty(str) && (e = m11233e(applicationContext, str)) != null) {
                    hashMap.put(str, e);
                    if (e.mo41089d()) {
                        if (e.mo41088c()) {
                            if (bVar2 == null || e.mo41086b() > bVar2.mo41086b()) {
                                bVar2 = e;
                            }
                        } else if (e3 == null || e.mo41086b() > e3.mo41086b()) {
                            e3 = e;
                        }
                    }
                }
            }
            if (e3 != null) {
                e2 = e3;
            } else {
                C4146p.m11216d("PushPackageUtils", "findSuitablePushPackage, all push app in balck list.");
                e2 = bVar2;
            }
        }
        if (e2 == null) {
            C4146p.m11213b(applicationContext, "查找最优包为空!");
            C4146p.m11216d("PushPackageUtils", "finSuitablePushPackage is null");
        } else if (e2.mo41088c()) {
            C4146p.m11208a(applicationContext, "查找最优包为:" + e2.mo41081a() + C3848l.f10401s + e2.mo41086b() + ", Black)");
            C4146p.m11216d("PushPackageUtils", "finSuitablePushPackage" + e2.mo41081a() + C3848l.f10401s + e2.mo41086b() + ", Black)");
        } else {
            C4146p.m11208a(applicationContext, "查找最优包为:" + e2.mo41081a() + C3848l.f10401s + e2.mo41086b() + C3848l.f10402t);
            C4146p.m11216d("PushPackageUtils", "finSuitablePushPackage" + e2.mo41081a() + C3848l.f10401s + e2.mo41086b() + C3848l.f10402t);
        }
        return e2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0094, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0095, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0097, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00af, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b0, code lost:
        com.vivo.push.util.C4146p.m11205a("PushPackageUtils", "close", r10);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0019, B:16:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ab A[SYNTHETIC, Splitter:B:60:0x00ab] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m11226b(android.content.Context r10) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.C4149s.m11226b(android.content.Context):java.lang.String");
    }

    /* renamed from: c */
    public static Set<String> m11228c(Context context) {
        List<ResolveInfo> list;
        HashSet hashSet = new HashSet();
        List<ResolveInfo> list2 = null;
        try {
            list = context.getPackageManager().queryBroadcastReceivers(new Intent("com.vivo.pushservice.action.RECEIVE"), 576);
        } catch (Exception unused) {
            list = null;
        }
        try {
            list2 = context.getPackageManager().queryBroadcastReceivers(new Intent("com.vivo.pushclient.action.RECEIVE"), 576);
        } catch (Exception unused2) {
        }
        if (list == null || list.size() <= 0) {
            list = list2;
        } else if (list2 != null && list2.size() > 0) {
            list.addAll(list2);
        }
        if (list != null && list.size() > 0) {
            for (ResolveInfo resolveInfo : list) {
                if (resolveInfo != null) {
                    String str = resolveInfo.activityInfo.packageName;
                    if (!TextUtils.isEmpty(str)) {
                        hashSet.add(str);
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: d */
    public static boolean m11231d(Context context, String str) {
        return m11225a(context, str, "com.vivo.pushservice.action.METHOD");
    }

    /* renamed from: e */
    public static C4118b m11232e(Context context) {
        String b = m11226b(context);
        ApplicationInfo applicationInfo = null;
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        C4118b bVar = new C4118b(b);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(b, 128);
            if (packageInfo != null) {
                bVar.mo41082a(packageInfo.versionCode);
                bVar.mo41084a(packageInfo.versionName);
                applicationInfo = packageInfo.applicationInfo;
            }
            if (applicationInfo != null) {
                bVar.mo41083a(C4156z.m11256a(context, b));
            }
            bVar.mo41085a(m11223a(context, bVar.mo41086b()));
            bVar.mo41087b(m11224a(context, b));
            return bVar;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            C4146p.m11216d("PushPackageUtils", "PackageManager NameNotFoundException is null");
            return null;
        }
    }

    /* renamed from: f */
    public static List<String> m11235f(Context context) {
        List<ResolveInfo> list;
        C4138h.m11169a("findAllCoreClientPush");
        ArrayList arrayList = new ArrayList();
        try {
            list = context.getPackageManager().queryIntentServices(new Intent("com.vivo.pushservice.action.PUSH_SERVICE"), 576);
        } catch (Exception unused) {
            list = null;
        }
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ResolveInfo resolveInfo = list.get(i);
                if (resolveInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            C4146p.m11216d("PushPackageUtils", "get all push packages is null");
        }
        return arrayList;
    }

    /* renamed from: d */
    public static boolean m11230d(Context context) {
        ProviderInfo resolveContentProvider;
        Boolean bool = f11126a;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = null;
        if (!(context == null || TextUtils.isEmpty("com.vivo.push.sdk.service.SystemPushConfig") || (resolveContentProvider = context.getPackageManager().resolveContentProvider("com.vivo.push.sdk.service.SystemPushConfig", 128)) == null)) {
            str = resolveContentProvider.packageName;
        }
        Boolean valueOf = Boolean.valueOf("BCC35D4D3606F154F0402AB7634E8490C0B244C2675C3C6238986987024F0C02".equals(m11234f(context, str)));
        f11126a = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: f */
    public static String m11234f(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA256").digest(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b : digest) {
                    String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.US);
                    if (upperCase.length() == 1) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(upperCase);
                }
                return stringBuffer.toString();
            } catch (Exception e) {
                C4146p.m11206a("PushPackageUtils", e);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m11229c(Context context, String str) {
        return m11225a(context, str, "com.vivo.pushservice.action.RECEIVE");
    }

    /* renamed from: e */
    public static C4118b m11233e(Context context, String str) {
        ApplicationInfo applicationInfo = null;
        if (!TextUtils.isEmpty(str)) {
            if (m11225a(context, str, "com.vivo.pushservice.action.METHOD") || m11225a(context, str, "com.vivo.pushservice.action.RECEIVE")) {
                C4118b bVar = new C4118b(str);
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                    if (packageInfo != null) {
                        bVar.mo41082a(packageInfo.versionCode);
                        bVar.mo41084a(packageInfo.versionName);
                        applicationInfo = packageInfo.applicationInfo;
                    }
                    if (applicationInfo != null) {
                        bVar.mo41083a(C4156z.m11256a(context, str));
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    C4146p.m11205a("PushPackageUtils", "getPushPackageInfo exception: ", e);
                }
                bVar.mo41087b(m11224a(context, str));
                bVar.mo41085a(m11223a(context, bVar.mo41086b()));
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m11227b(Context context, String str) {
        return m11225a(context, str, "com.vivo.pushclient.action.RECEIVE");
    }

    /* renamed from: a */
    public static boolean m11224a(Context context, String str) {
        ServiceInfo serviceInfo;
        if (!TextUtils.isEmpty(str) && context != null) {
            Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
            intent.setPackage(str);
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
            if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                C4146p.m11204a("PushPackageUtils", "isEnablePush error: can not find push service.");
            } else {
                int size = queryIntentServices.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    ResolveInfo resolveInfo = queryIntentServices.get(i);
                    if (!(resolveInfo == null || (serviceInfo = resolveInfo.serviceInfo) == null)) {
                        String str2 = serviceInfo.name;
                        boolean z2 = serviceInfo.exported;
                        if ("com.vivo.push.sdk.service.PushService".equals(str2) && z2) {
                            boolean z3 = resolveInfo.serviceInfo.enabled;
                            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(str, "com.vivo.push.sdk.service.PushService"));
                            z = componentEnabledSetting == 1 || (componentEnabledSetting == 0 && z3);
                        }
                    }
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m11223a(Context context, long j) {
        AbstractC4103e a = C4100b.m11057a().mo40990a(context);
        if (a != null) {
            return a.isInBlackList(j);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m11225a(Context context, String str, String str2) {
        List<ResolveInfo> list;
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            list = null;
        }
        return list != null && list.size() > 0;
    }
}
