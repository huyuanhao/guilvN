package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.C4209b;
import com.xiaomi.push.AbstractC4532iz;
import com.xiaomi.push.C4285bf;
import com.xiaomi.push.C4442g;
import com.xiaomi.push.C4506i;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4511ie;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4521io;
import com.xiaomi.push.C4522ip;
import com.xiaomi.push.C4527iu;
import com.xiaomi.push.C4528iv;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.C4563l;
import com.xiaomi.push.EnumC4423fi;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4504hy;
import com.xiaomi.push.EnumC4509ic;
import com.xiaomi.push.service.C4592aa;
import com.xiaomi.push.service.C4609ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MiPushClient4Hybrid {
    public static Map<String, C4209b.C4210a> dataMap = new HashMap();
    public static MiPushCallback sCallback;
    public static Map<String, Long> sRegisterTimeMap = new HashMap();

    public static class MiPushCallback {
        public void onCommandResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveRegisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveUnregisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }
    }

    public static void addPullNotificationTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putLong("last_pull_notification_" + str, System.currentTimeMillis()).commit();
    }

    public static short getDeviceStatus(MiPushMessage miPushMessage, boolean z) {
        String str = miPushMessage.getExtra() == null ? "" : miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            i = Integer.valueOf(str).intValue();
        }
        if (!z) {
            i = (i & -4) + C4442g.EnumC4443a.NOT_ALLOWED.mo41918a();
        }
        return (short) i;
    }

    public static boolean isRegistered(Context context, String str) {
        return C4209b.m11491a(context).mo41422a(str) != null;
    }

    public static void onReceiveRegisterResult(Context context, C4522ip ipVar) {
        C4209b.C4210a aVar;
        String b = ipVar.mo42396b();
        if (ipVar.mo42394a() == 0 && (aVar = dataMap.get(b)) != null) {
            aVar.mo41437a(ipVar.f12822e, ipVar.f12823f);
            C4209b.m11491a(context).mo41424a(b, aVar);
        }
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(ipVar.f12822e)) {
            arrayList = new ArrayList();
            arrayList.add(ipVar.f12822e);
        }
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(EnumC4423fi.COMMAND_REGISTER.f11840a, arrayList, ipVar.f12812a, ipVar.f12821d, null);
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveRegisterResult(b, generateCommandMessage);
        }
    }

    public static void onReceiveUnregisterResult(Context context, C4528iv ivVar) {
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(EnumC4423fi.COMMAND_UNREGISTER.f11840a, null, ivVar.f12945a, ivVar.f12953d, null);
        String a = ivVar.mo42510a();
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveUnregisterResult(a, generateCommandMessage);
        }
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        if (C4209b.m11491a(context).m11504a(str2, str3, str)) {
            ArrayList arrayList = new ArrayList();
            C4209b.C4210a a = C4209b.m11491a(context).mo41422a(str);
            if (a != null) {
                arrayList.add(a.f11276c);
                MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(EnumC4423fi.COMMAND_REGISTER.f11840a, arrayList, 0, null, null);
                MiPushCallback miPushCallback = sCallback;
                if (miPushCallback != null) {
                    miPushCallback.onReceiveRegisterResult(str, generateCommandMessage);
                }
            }
            if (shouldPullNotification(context, str)) {
                C4520in inVar = new C4520in();
                inVar.mo42314b(str2);
                inVar.mo42317c(EnumC4504hy.PullOfflineMessage.f12451a);
                inVar.mo42307a(C4609ak.m13938a());
                inVar.mo42310a(false);
                C4204aw.m11444a(context).mo41407a(inVar, EnumC4494ho.Notification, false, true, null, false, str, str2);
                AbstractC4163b.m11304b("MiPushClient4Hybrid pull offline pass through message");
                addPullNotificationTime(context, str);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - (sRegisterTimeMap.get(str) != null ? sRegisterTimeMap.get(str).longValue() : 0)) < WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS) {
            AbstractC4163b.m11301a("MiPushClient4Hybrid  Could not send register message within 5s repeatedly.");
            return;
        }
        sRegisterTimeMap.put(str, Long.valueOf(currentTimeMillis));
        String a2 = C4285bf.m11799a(6);
        C4209b.C4210a aVar = new C4209b.C4210a(context);
        aVar.mo41442c(str2, str3, a2);
        dataMap.put(str, aVar);
        C4521io ioVar = new C4521io();
        ioVar.mo42342a(C4609ak.m13938a());
        ioVar.mo42346b(str2);
        ioVar.mo42357e(str3);
        ioVar.mo42354d(str);
        ioVar.mo42361f(a2);
        ioVar.mo42350c(C4442g.m12699a(context, context.getPackageName()));
        ioVar.mo42345b(C4442g.m12696a(context, context.getPackageName()));
        ioVar.mo42367h("3_7_0");
        ioVar.mo42340a(30700);
        ioVar.mo42370i(C4506i.m13047e(context));
        ioVar.mo42341a(EnumC4509ic.Init);
        if (!C4563l.m13731d()) {
            String g = C4506i.m13049g(context);
            if (!TextUtils.isEmpty(g)) {
                if (C4563l.m13729b()) {
                    ioVar.mo42372j(g);
                }
                ioVar.mo42376l(C4285bf.m11800a(g));
            }
        }
        ioVar.mo42374k(C4506i.m13031a());
        int a3 = C4506i.m13028a();
        if (a3 >= 0) {
            ioVar.mo42349c(a3);
        }
        C4520in inVar2 = new C4520in();
        inVar2.mo42317c(EnumC4504hy.HybridRegister.f12451a);
        inVar2.mo42314b(C4209b.m11491a(context).m11495a());
        inVar2.mo42321d(context.getPackageName());
        inVar2.mo42311a(C4531iy.m13590a(ioVar));
        inVar2.mo42307a(C4609ak.m13938a());
        C4204aw.m11444a(context).mo41402a(inVar2, EnumC4494ho.Notification, (C4508ib) null);
    }

    public static void removeDuplicateCache(Context context, MiPushMessage miPushMessage) {
        String str = miPushMessage.getExtra() != null ? miPushMessage.getExtra().get("jobkey") : null;
        if (TextUtils.isEmpty(str)) {
            str = miPushMessage.getMessageId();
        }
        C4201at.m11425a(context, str);
    }

    public static void reportMessageArrived(Context context, MiPushMessage miPushMessage, boolean z) {
        if (miPushMessage == null || miPushMessage.getExtra() == null) {
            AbstractC4163b.m11301a("do not ack message, message is null");
            return;
        }
        try {
            C4511ie ieVar = new C4511ie();
            ieVar.mo42167b(C4209b.m11491a(context).m11495a());
            ieVar.mo42163a(miPushMessage.getMessageId());
            ieVar.mo42162a(Long.valueOf(miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS)).longValue());
            ieVar.mo42164a(getDeviceStatus(miPushMessage, z));
            if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
                ieVar.mo42170c(miPushMessage.getTopic());
            }
            C4204aw.m11444a(context).mo41404a((AbstractC4532iz) ieVar, EnumC4494ho.AckMessage, false, PushMessageHelper.generateMessage(miPushMessage));
            AbstractC4163b.m11304b("MiPushClient4Hybrid ack mina message, messageId is " + miPushMessage.getMessageId());
        } catch (Throwable th) {
            miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS);
            miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
            throw th;
        }
        miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS);
        miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        MiPushClient.reportMessageClicked(context, miPushMessage);
    }

    public static void setCallback(MiPushCallback miPushCallback) {
        sCallback = miPushCallback;
    }

    public static boolean shouldPullNotification(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        StringBuilder sb = new StringBuilder();
        sb.append("last_pull_notification_");
        sb.append(str);
        return Math.abs(System.currentTimeMillis() - sharedPreferences.getLong(sb.toString(), -1)) > Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
    }

    public static void unregisterPush(Context context, String str) {
        sRegisterTimeMap.remove(str);
        C4209b.C4210a a = C4209b.m11491a(context).mo41422a(str);
        if (a != null) {
            C4527iu iuVar = new C4527iu();
            iuVar.mo42486a(C4609ak.m13938a());
            iuVar.mo42495d(str);
            iuVar.mo42489b(a.f11272a);
            iuVar.mo42492c(a.f11276c);
            iuVar.mo42497e(a.f11274b);
            C4520in inVar = new C4520in();
            inVar.mo42317c(EnumC4504hy.HybridUnregister.f12451a);
            inVar.mo42314b(C4209b.m11491a(context).m11495a());
            inVar.mo42321d(context.getPackageName());
            inVar.mo42311a(C4531iy.m13590a(iuVar));
            inVar.mo42307a(C4609ak.m13938a());
            C4204aw.m11444a(context).mo41402a(inVar, EnumC4494ho.Notification, (C4508ib) null);
            C4209b.m11491a(context).mo41429b(str);
        }
    }

    public static void uploadClearMessageData(Context context, LinkedList<? extends Object> linkedList) {
        C4592aa.m13883a(context, linkedList);
    }
}
