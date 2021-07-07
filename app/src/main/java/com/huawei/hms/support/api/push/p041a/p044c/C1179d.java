package com.huawei.hms.support.api.push.p041a.p044c;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.p035a.C1107a;
import com.huawei.hms.p037c.AbstractC1139h;
import com.huawei.hms.support.api.push.p041a.p043b.C1174a;
import com.huawei.hms.support.api.push.p041a.p045d.C1184a;
import com.huawei.hms.support.log.C1202a;
import com.umeng.message.entity.UMessage;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Date;

/* renamed from: com.huawei.hms.support.api.push.a.c.d */
public class C1179d {

    /* renamed from: a */
    public static int f1290a;

    @TargetApi(26)
    /* renamed from: a */
    public static synchronized void m1226a(Context context, C1174a aVar, String str) {
        int hashCode;
        int i;
        int i2;
        int i3;
        synchronized (C1179d.class) {
            if (context != null && aVar != null) {
                C1202a.m1316a("PushSelfShowLog", " showNotification , the msg id = " + aVar.mo15662a());
                if (f1290a == 0) {
                    f1290a = (context.getPackageName() + new Date().toString()).hashCode();
                }
                if (TextUtils.isEmpty(aVar.mo15666e())) {
                    hashCode = f1290a + 1;
                    f1290a = hashCode;
                    i = hashCode + 1;
                    f1290a = i;
                    i2 = i + 1;
                    f1290a = i2;
                    i3 = i2 + 1;
                    f1290a = i3;
                } else {
                    hashCode = (aVar.mo15670i() + aVar.mo15666e()).hashCode();
                    i = f1290a + 1;
                    f1290a = i;
                    i2 = i + 1;
                    f1290a = i2;
                    i3 = i2 + 1;
                    f1290a = i3;
                }
                C1202a.m1316a("PushSelfShowLog", "notifyId:" + hashCode + ",openNotifyId:" + i + ",delNotifyId:" + i2 + ",alarmNotifyId:" + i3);
                Notification notification = null;
                if (C1184a.m1242a()) {
                    notification = m1222a(context, aVar, str, hashCode, i, i2);
                }
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
                if (!(notificationManager == null || notification == null)) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        notificationManager.createNotificationChannel(new NotificationChannel("HwPushChannelID", context.getString(AbstractC1139h.m1085c("hms_push_channel")), 3));
                    }
                    notificationManager.notify(hashCode, notification);
                    if (aVar.mo15667f() > 0) {
                        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
                        intent.putExtra("selfshow_info", aVar.mo15664c()).putExtra("selfshow_token", aVar.mo15665d()).putExtra("selfshow_event_id", "-1").putExtra("extra_encrypt_data", str).putExtra("selfshow_notify_id", hashCode).setPackage(context.getPackageName()).setFlags(32);
                        m1225a(context, intent, (long) aVar.mo15667f(), i3);
                        C1202a.m1316a("PushSelfShowLog", "setDelayAlarm alarmNotityId" + i3 + " and intent is " + intent.toURI());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static PendingIntent m1227b(Context context, C1174a aVar, String str, int i, int i2) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
        intent.putExtra("selfshow_info", aVar.mo15664c()).putExtra("selfshow_token", aVar.mo15665d()).putExtra("selfshow_event_id", "2").putExtra("selfshow_notify_id", i).setPackage(context.getPackageName()).putExtra("extra_encrypt_data", str).setFlags(CommonNetImpl.FLAG_AUTH);
        return PendingIntent.getBroadcast(context, i2, intent, 134217728);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m1228b(Context context, Notification.Builder builder, C1174a aVar) {
        if (C1107a.C1108a.f1094a >= 11 && C1184a.m1249c(context)) {
            Bundle bundle = new Bundle();
            String i = aVar.mo15670i();
            C1202a.m1318b("PushSelfShowLog", "the package name of notification is:" + i);
            if (!TextUtils.isEmpty(i)) {
                String a = C1184a.m1239a(context, i);
                C1202a.m1318b("PushSelfShowLog", "the app name is:" + a);
                if (a != null) {
                    bundle.putCharSequence("android.extraAppName", a);
                }
            }
            builder.setExtras(bundle);
        }
    }

    /* renamed from: a */
    public static PendingIntent m1223a(Context context, C1174a aVar, String str, int i, int i2) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
        intent.putExtra("selfshow_info", aVar.mo15664c()).putExtra("selfshow_token", aVar.mo15665d()).putExtra("selfshow_event_id", "1").putExtra("extra_encrypt_data", str).putExtra("selfshow_notify_id", i).setPackage(context.getPackageName()).setFlags(CommonNetImpl.FLAG_AUTH);
        return PendingIntent.getBroadcast(context, i2, intent, 134217728);
    }

    @TargetApi(26)
    /* renamed from: a */
    public static Notification m1222a(Context context, C1174a aVar, String str, int i, int i2, int i3) {
        Notification.Builder builder = new Notification.Builder(context);
        C1177b.m1214a(context, builder, aVar);
        int i4 = context.getApplicationInfo().labelRes;
        builder.setTicker(aVar.mo15673l());
        builder.setWhen(System.currentTimeMillis());
        builder.setAutoCancel(true);
        builder.setDefaults(1);
        if (aVar.mo15675n() == null || "".equals(aVar.mo15675n())) {
            builder.setContentTitle(context.getResources().getString(i4));
        } else {
            builder.setContentTitle(aVar.mo15675n());
        }
        builder.setContentText(aVar.mo15673l());
        builder.setContentIntent(m1223a(context, aVar, str, i, i2));
        builder.setDeleteIntent(m1227b(context, aVar, str, i, i3));
        Bitmap b = C1177b.m1215b(context, aVar);
        if (b != null) {
            builder.setLargeIcon(b);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId("HwPushChannelID");
        }
        m1224a(context, builder, aVar);
        m1228b(context, builder, aVar);
        if (C1181f.m1230a(context, builder, i, aVar, b) != null) {
            return builder.getNotification();
        }
        C1202a.m1319c("PushSelfShowLog", "builder is null after add style.");
        return null;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m1224a(Context context, Notification.Builder builder, C1174a aVar) {
        if ("com.huawei.android.pushagent".equals(context.getPackageName())) {
            Bundle bundle = new Bundle();
            String i = aVar.mo15670i();
            if (!TextUtils.isEmpty(i)) {
                bundle.putString("hw_origin_sender_package_name", i);
                builder.setExtras(bundle);
            }
        }
    }

    /* renamed from: a */
    public static void m1225a(Context context, Intent intent, long j, int i) {
        try {
            C1202a.m1316a("PushSelfShowLog", "enter setDelayAlarm(intent:" + intent.toURI() + " interval:" + j + "ms, context:" + context);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            if (alarmManager != null) {
                alarmManager.set(0, System.currentTimeMillis() + j, PendingIntent.getBroadcast(context, i, intent, 134217728));
            }
        } catch (RuntimeException unused) {
            C1202a.m1319c("PushSelfShowLog", "set DelayAlarm error");
        } catch (Exception unused2) {
            C1202a.m1319c("PushSelfShowLog", "set DelayAlarm error");
        }
    }
}
