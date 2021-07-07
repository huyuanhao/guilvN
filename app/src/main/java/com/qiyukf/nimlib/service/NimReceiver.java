package com.qiyukf.nimlib.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.unicorn.p228g.C2649a;
import com.umeng.socialize.net.dplus.CommonNetImpl;

public class NimReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static int m5139a(String str) {
        if ("com.qiyukf.nim.ACTION.ALARM.REPEATING".equals(str)) {
            return 2;
        }
        return "com.qiyukf.unicorn.ACTION.CHECK_MESSAGE".equals(str) ? 5 : 3;
    }

    /* renamed from: a */
    public static void m5140a(Context context) {
        PendingIntent broadcast;
        C1709a.m3018d("service", "start repeating alarm");
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent(applicationContext, NimReceiver.class);
        intent.setAction("com.qiyukf.nim.ACTION.ALARM.REPEATING");
        AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService("alarm");
        if (alarmManager != null && (broadcast = PendingIntent.getBroadcast(applicationContext, 0, intent, 134217728)) != null) {
            try {
                alarmManager.setRepeating(2, 600000 + SystemClock.elapsedRealtime(), 600000, broadcast);
            } catch (Exception unused) {
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        PendingIntent broadcast;
        try {
            if ("com.qiyukf.unicorn.ACTION.CHECK_MESSAGE".equals(intent.getAction())) {
                if (!C2205d.m4582e().logined()) {
                    if (!C2205d.m4574a()) {
                        NimService.m5142a(context, m5139a(intent.getAction()));
                    }
                    if (C2180b.m4471a() != null) {
                        C2649a.m6065a(context, true);
                    }
                }
            } else if (C2205d.m4574a()) {
            } else {
                if (!TextUtils.isEmpty(C2180b.m4477b())) {
                    NimService.m5142a(context, m5139a(intent.getAction()));
                    return;
                }
                C1709a.m3018d("service", "stop alarm");
                Context applicationContext = context.getApplicationContext();
                Intent intent2 = new Intent(applicationContext, NimReceiver.class);
                intent2.setAction("com.qiyukf.nim.ACTION.ALARM.REPEATING");
                AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService("alarm");
                if (alarmManager != null && (broadcast = PendingIntent.getBroadcast(applicationContext, 0, intent2, CommonNetImpl.FLAG_AUTH)) != null) {
                    alarmManager.cancel(broadcast);
                }
            }
        } catch (Throwable th) {
            C1709a.m3016c("NimReceiver", "NimReceiver on Receive exception, e=" + th.getMessage());
        }
    }
}
