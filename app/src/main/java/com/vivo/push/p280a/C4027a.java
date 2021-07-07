package com.vivo.push.p280a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4026a;
import com.vivo.push.ServiceConnectionC4030b;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4149s;
import java.util.List;

/* renamed from: com.vivo.push.a.a */
public final class C4027a {
    /* renamed from: a */
    public static void m10883a(Context context, String str, AbstractC4160y yVar) {
        boolean c = yVar.mo40902c();
        ServiceConnectionC4030b a = ServiceConnectionC4030b.m10888a(context, c ? "com.vivo.vms.upstageservice" : "com.vivo.vms.aidlservice");
        boolean a2 = a.mo40893a();
        if (TextUtils.isEmpty(yVar.mo41212a())) {
            yVar.mo41215a(context.getPackageName());
        }
        if (a2 && !"com.vivo.pushservice".equals(context.getPackageName())) {
            C4026a aVar = new C4026a(yVar.mo41212a(), str, new Bundle());
            yVar.mo41214a(aVar);
            if (!a.mo40894a(aVar.mo40885b())) {
                C4146p.m11211b("CommandBridge", "send command error by aidl");
                C4146p.m11215c(context, "send command error by aidl");
            } else {
                return;
            }
        }
        Intent intent = new Intent("com.vivo.pushservice.action.METHOD");
        intent.setPackage(str);
        intent.setClassName(str, c ? "com.vivo.push.sdk.service.UpstageService" : "com.vivo.push.sdk.service.PushService");
        yVar.mo41213a(intent);
        try {
            m10881a(context, intent);
        } catch (Exception e) {
            C4146p.m11205a("CommandBridge", "CommandBridge startService exception: ", e);
        }
    }

    /* renamed from: a */
    public static void m10881a(Context context, Intent intent) throws Exception {
        if (context != null) {
            try {
                context.startService(intent);
            } catch (Exception e) {
                C4146p.m11205a("CommandBridge", "start service error", e);
                intent.setComponent(null);
                context.sendBroadcast(intent);
            }
        } else {
            C4146p.m11216d("CommandBridge", "enter startService context is null");
            throw new Exception("context is null");
        }
    }

    /* renamed from: a */
    public static void m10882a(Context context, AbstractC4160y yVar, String str) {
        try {
            boolean b = C4149s.m11227b(context, str);
            String str2 = b ? "com.vivo.pushclient.action.RECEIVE" : "com.vivo.pushservice.action.RECEIVE";
            if (TextUtils.isEmpty(str)) {
                C4146p.m11215c(context, "消息接受者包名为空！");
                throw new Exception("消息接受者包名为空！");
            } else if (m10884a(context, str2, str)) {
                if (TextUtils.isEmpty(yVar.mo41212a())) {
                    yVar.mo41215a(context.getPackageName());
                }
                Intent intent = new Intent();
                intent.setFlags(1048576);
                if (!TextUtils.isEmpty(str2)) {
                    intent.setAction(str2);
                }
                intent.setPackage(str);
                intent.setClassName(str, b ? "com.vivo.push.sdk.service.CommandClientService" : "com.vivo.push.sdk.service.CommandService");
                yVar.mo41217b(intent);
                intent.putExtra("command_type", "reflect_receiver");
                m10881a(context, intent);
            } else {
                throw new Exception("校验action异常");
            }
        } catch (Exception e) {
            C4146p.m11205a("CommandBridge", "CommandBridge sendCommandToClient exception", e);
        }
    }

    /* renamed from: a */
    public static boolean m10884a(Context context, String str, String str2) {
        Intent intent = new Intent(str);
        intent.setPackage(str2);
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 576);
            if (queryBroadcastReceivers != null) {
                if (queryBroadcastReceivers.size() > 0) {
                    return true;
                }
            }
            C4146p.m11211b("CommandBridge", "action check error：action>>" + str + ";pkgname>>" + str2);
            return false;
        } catch (Exception unused) {
            C4146p.m11211b("CommandBridge", "queryBroadcastReceivers error");
            return false;
        }
    }
}
