package com.vivo.push.p282c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.netease.nis.captcha.Captcha;
import com.vivo.push.AbstractC4160y;
import com.vivo.push.AbstractRunnableC4157v;
import com.vivo.push.C4121p;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.C4118b;
import com.vivo.push.p280a.C4027a;
import com.vivo.push.p281b.C4037c;
import com.vivo.push.p281b.C4039e;
import com.vivo.push.p281b.C4060z;
import com.vivo.push.util.C4131a;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4148r;
import com.vivo.push.util.C4149s;
import java.util.List;

/* renamed from: com.vivo.push.c.aj */
public final class C4072aj extends AbstractRunnableC4157v {
    public C4072aj(AbstractC4160y yVar) {
        super(yVar);
    }

    @Override // com.vivo.push.AbstractRunnableC4157v
    /* renamed from: a */
    public final void mo40942a(AbstractC4160y yVar) {
        Context context = this.f11150a;
        if (context == null) {
            C4146p.m11216d("SendCommandTask", "SendCommandTask " + yVar + " ; mContext is Null");
        } else if (yVar == null) {
            C4146p.m11216d("SendCommandTask", "SendCommandTask pushCommand is Null");
        } else {
            C4118b a = C4149s.m11222a(context);
            int b = yVar.mo41216b();
            if (b != 0) {
                if (b == 2009) {
                    C4146p.m11209a(ClientConfigManagerImpl.getInstance(this.f11150a).isDebug());
                    if (C4146p.m11210a()) {
                        C4121p.m11080a().mo41126k();
                        C4131a aVar = new C4131a();
                        aVar.mo41180a(this.f11150a, "com.vivo.push_preferences.hybridapptoken_v1");
                        aVar.mo41179a();
                        C4131a aVar2 = new C4131a();
                        aVar2.mo41180a(this.f11150a, "com.vivo.push_preferences.appconfig_v1");
                        aVar2.mo41179a();
                        if (!C4121p.m11080a().mo41120e()) {
                            ClientConfigManagerImpl.getInstance(this.f11150a).clearPush();
                        }
                    }
                } else if (b != 2011) {
                    switch (b) {
                        case 2002:
                        case Captcha.WEB_VIEW_HTTP_ERROR:
                        case Captcha.WEB_VIEW_HTTPS_ERROR:
                        case 2005:
                            if (a == null || a.mo41088c()) {
                                C4121p.m11080a().mo41098a(((C4037c) yVar).mo40909h(), 1005);
                                break;
                            } else {
                                C4037c cVar = (C4037c) yVar;
                                int a2 = C4148r.m11221a(cVar);
                                if (a2 != 0) {
                                    C4121p.m11080a().mo41098a(cVar.mo40909h(), a2);
                                    return;
                                }
                            }
                            break;
                    }
                } else {
                    C4146p.m11209a(ClientConfigManagerImpl.getInstance(this.f11150a).isDebug(((C4060z) yVar).mo40940d()));
                }
            } else if (C4121p.m11080a().mo41120e()) {
                Context context2 = this.f11150a;
                Intent intent = new Intent();
                intent.setPackage(context2.getPackageName());
                intent.setClassName(context2.getPackageName(), "com.vivo.push.sdk.service.CommandService");
                List<ResolveInfo> queryIntentServices = context2.getPackageManager().queryIntentServices(intent, 128);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    C4146p.m11216d("ModuleUtil", "disableDeprecatedService is null");
                } else {
                    PackageManager packageManager = context2.getPackageManager();
                    ComponentName componentName = new ComponentName(context2, queryIntentServices.get(0).serviceInfo.name);
                    if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                        packageManager.setComponentEnabledSetting(componentName, 2, 1);
                    }
                }
                Context context3 = this.f11150a;
                Intent intent2 = new Intent();
                intent2.setPackage(context3.getPackageName());
                intent2.setClassName(context3.getPackageName(), "com.vivo.push.sdk.service.LinkProxyActivity");
                List<ResolveInfo> queryIntentActivities = context3.getPackageManager().queryIntentActivities(intent2, 128);
                if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                    C4146p.m11216d("ModuleUtil", "disableDeprecatedActivity is null");
                } else {
                    PackageManager packageManager2 = context3.getPackageManager();
                    ComponentName componentName2 = new ComponentName(context3, queryIntentActivities.get(0).activityInfo.name);
                    if (packageManager2.getComponentEnabledSetting(componentName2) != 2) {
                        packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
                    }
                }
            }
            if (a == null) {
                C4146p.m11216d("SendCommandTask", "SendCommandTask " + yVar + " ; pushPkgInfo is Null");
                return;
            }
            String a3 = a.mo41081a();
            if (a.mo41088c()) {
                C4121p.m11080a().mo41098a(((C4037c) yVar).mo40909h(), 1004);
                yVar = new C4039e();
                C4146p.m11216d("SendCommandTask", "SendCommandTask " + yVar + " ; pkgName is InBlackList ");
            }
            C4027a.m10883a(this.f11150a, a3, yVar);
        }
    }
}
