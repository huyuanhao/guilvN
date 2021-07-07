package com.qiyukf.unicorn.p228g;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.p118pd.sdk.C8412oOoo0OoO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.service.NimReceiver;
import com.qiyukf.unicorn.api.SavePowerConfig;
import com.qiyukf.unicorn.p213f.C2634c;
import com.qiyukf.unicorn.p232k.AbstractC2694b;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.g.a */
public final class C2649a {
    /* renamed from: a */
    public static void m6064a(Context context) {
        PendingIntent broadcast;
        SavePowerConfig f = C2657d.m6078a().mo36306f();
        long j = f == null ? -1 : f.checkInterval * 1000;
        if (j >= 0) {
            long max = Math.max(j, 900L);
            Intent intent = new Intent(context, NimReceiver.class);
            intent.setAction("com.qiyukf.unicorn.ACTION.CHECK_MESSAGE");
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            if (alarmManager != null && (broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728)) != null) {
                alarmManager.setRepeating(2, SystemClock.elapsedRealtime() + Math.max(max - (System.currentTimeMillis() - C2657d.m6078a().mo36302d()), 0L), max, broadcast);
            }
        }
    }

    /* renamed from: a */
    public static void m6065a(final Context context, final boolean z) {
        new AbstractC2694b<Void, JSONObject>("Unicorn-HTTP") {
            /* class com.qiyukf.unicorn.p228g.C2649a.C26501 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.qiyukf.unicorn.p232k.AbstractC2694b
            /* renamed from: a */
            public final /* synthetic */ JSONObject mo34446a() {
                return C2634c.m6002a(C2180b.m4482g(), C2180b.m4477b(), C2657d.m6078a().mo36308h(), C2180b.m4481f(), C2657d.m6078a().mo36310j(), C2657d.m6078a().mo36311k());
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.qiyukf.unicorn.p232k.AbstractC2694b
            /* renamed from: a */
            public final /* synthetic */ void mo34447a(JSONObject jSONObject) {
                SavePowerConfig f;
                JSONObject jSONObject2 = jSONObject;
                C1709a.m3011a("PowerSaver", "query unread count: " + jSONObject2);
                if (jSONObject2 != null) {
                    int b = C1810b.m3427b(jSONObject2, C8412oOoo0OoO.OooO0O0);
                    int b2 = C1810b.m3427b(jSONObject2, "push");
                    long c = C1810b.m3430c(jSONObject2, "user");
                    long c2 = C1810b.m3430c(jSONObject2, "app");
                    C2657d.m6078a().mo36297a(b2 == 1);
                    if (z) {
                        if (b > 0) {
                            C2654c.m6072a(context).mo36290a(1);
                        }
                        if (b2 == 1 && (f = C2657d.m6078a().mo36306f()) != null && f.customPush) {
                            C2649a.m6066b(context);
                        }
                    } else {
                        C2654c.m6072a(context).mo36292b();
                    }
                    C2657d.m6078a().mo36303d(c);
                    C2657d.m6078a().mo36305e(c2);
                }
                C2657d.m6078a().mo36299b(System.currentTimeMillis());
            }
        }.mo36463a((Object[]) new Void[0]);
    }

    /* renamed from: b */
    public static void m6066b(Context context) {
        PendingIntent broadcast;
        Intent intent = new Intent(context, NimReceiver.class);
        intent.setAction("com.qiyukf.unicorn.ACTION.CHECK_MESSAGE");
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager != null && (broadcast = PendingIntent.getBroadcast(context, 0, intent, CommonNetImpl.FLAG_AUTH)) != null) {
            alarmManager.cancel(broadcast);
        }
    }
}
