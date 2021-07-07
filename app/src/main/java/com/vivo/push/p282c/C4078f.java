package com.vivo.push.p282c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.vivo.push.AbstractC4160y;
import com.vivo.push.AbstractRunnableC4157v;
import com.vivo.push.p281b.C4046l;
import com.vivo.push.sdk.C4127a;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4149s;
import java.util.List;

/* renamed from: com.vivo.push.c.f */
public final class C4078f extends AbstractRunnableC4157v {
    public C4078f(AbstractC4160y yVar) {
        super(yVar);
    }

    /* renamed from: a */
    public static boolean m11020a(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            C4146p.m11204a("OnChangePushStatusTask", "enableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) != 1) {
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
            C4146p.m11216d("OnChangePushStatusTask", "enableService push service.");
            return true;
        }
        C4146p.m11216d("OnChangePushStatusTask", "push service has enabled");
        return false;
    }

    /* renamed from: b */
    public static boolean m11021b(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            C4146p.m11204a("OnChangePushStatusTask", "disableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) != 2) {
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
            C4146p.m11216d("OnChangePushStatusTask", "disableService push service.");
            return true;
        }
        C4146p.m11216d("OnChangePushStatusTask", "push service has disabled");
        return false;
    }

    /* renamed from: c */
    public static List<ResolveInfo> m11022c(Context context) {
        List<ResolveInfo> list;
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            list = null;
        }
        if (list != null && list.size() > 0) {
            return list;
        }
        Intent intent2 = new Intent("com.vivo.pushclient.action.RECEIVE");
        intent2.setPackage(context.getPackageName());
        try {
            return context.getPackageManager().queryBroadcastReceivers(intent2, 576);
        } catch (Exception unused2) {
            return list;
        }
    }

    @Override // com.vivo.push.AbstractRunnableC4157v
    /* renamed from: a */
    public final void mo40942a(AbstractC4160y yVar) {
        if (!this.f11150a.getPackageName().equals(C4149s.m11226b(this.f11150a))) {
            C4046l lVar = (C4046l) yVar;
            int d = lVar.mo40914d();
            int e = lVar.mo40915e();
            C4146p.m11216d("OnChangePushStatusTask", "OnChangePushStatusTask serviceStatus is " + d + " ; receiverStatus is " + e);
            if (d == 2) {
                m11021b(this.f11150a);
            } else if (d == 1) {
                m11020a(this.f11150a);
            } else if (d == 0) {
                Context context = this.f11150a;
                Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    C4146p.m11204a("OnChangePushStatusTask", "defaultService error: can not find push service.");
                } else {
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
                    if (packageManager.getComponentEnabledSetting(componentName) != 0) {
                        packageManager.setComponentEnabledSetting(componentName, 0, 1);
                        C4146p.m11216d("OnChangePushStatusTask", "defaultService push service.");
                    } else {
                        C4146p.m11216d("OnChangePushStatusTask", "push service has defaulted");
                    }
                }
            }
            if (e == 2) {
                Context context2 = this.f11150a;
                List<ResolveInfo> c = m11022c(context2);
                if (c == null || c.size() <= 0) {
                    C4146p.m11204a("OnChangePushStatusTask", "disableReceiver error: can not find push service.");
                } else {
                    String str = c.get(0).activityInfo.name;
                    if (TextUtils.isEmpty(str)) {
                        C4146p.m11216d("OnChangePushStatusTask", "disableReceiver error: className is null. ");
                    } else {
                        PackageManager packageManager2 = context2.getPackageManager();
                        ComponentName componentName2 = new ComponentName(context2, str);
                        if (packageManager2.getComponentEnabledSetting(componentName2) != 2) {
                            packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
                            C4146p.m11216d("OnChangePushStatusTask", "push service disableReceiver ");
                        } else {
                            C4146p.m11216d("OnChangePushStatusTask", "push service has disableReceiver ");
                        }
                    }
                }
                C4127a.m11143a().mo41157b();
            } else if (e == 1) {
                Context context3 = this.f11150a;
                List<ResolveInfo> c2 = m11022c(context3);
                if (c2 == null || c2.size() <= 0) {
                    C4146p.m11204a("OnChangePushStatusTask", "enableReceiver error: can not find push service.");
                    return;
                }
                String str2 = c2.get(0).activityInfo.name;
                if (TextUtils.isEmpty(str2)) {
                    C4146p.m11216d("OnChangePushStatusTask", "enableReceiver error: className is null. ");
                    return;
                }
                PackageManager packageManager3 = context3.getPackageManager();
                ComponentName componentName3 = new ComponentName(context3, str2);
                if (packageManager3.getComponentEnabledSetting(componentName3) != 1) {
                    packageManager3.setComponentEnabledSetting(componentName3, 1, 1);
                    C4146p.m11216d("OnChangePushStatusTask", "push service enableReceiver ");
                    return;
                }
                C4146p.m11216d("OnChangePushStatusTask", "push service has enableReceiver ");
            } else if (e == 0) {
                Context context4 = this.f11150a;
                List<ResolveInfo> c3 = m11022c(context4);
                if (c3 == null || c3.size() <= 0) {
                    C4146p.m11204a("OnChangePushStatusTask", "defaultReceiver error: can not find push service.");
                    return;
                }
                String str3 = c3.get(0).activityInfo.name;
                if (TextUtils.isEmpty(str3)) {
                    C4146p.m11216d("OnChangePushStatusTask", "defaultReceiver error: className is null. ");
                    return;
                }
                PackageManager packageManager4 = context4.getPackageManager();
                ComponentName componentName4 = new ComponentName(context4, str3);
                if (packageManager4.getComponentEnabledSetting(componentName4) != 0) {
                    packageManager4.setComponentEnabledSetting(componentName4, 0, 1);
                    C4146p.m11216d("OnChangePushStatusTask", "push service defaultReceiver ");
                    return;
                }
                C4146p.m11216d("OnChangePushStatusTask", "push service has defaulted");
            }
        }
    }
}
