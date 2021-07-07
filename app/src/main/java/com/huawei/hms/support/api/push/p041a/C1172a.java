package com.huawei.hms.support.api.push.p041a;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.push.p041a.p042a.C1173a;
import com.huawei.hms.support.api.push.p041a.p043b.C1174a;
import com.huawei.hms.support.api.push.p041a.p044c.C1183h;
import com.huawei.hms.support.api.push.p041a.p045d.C1184a;
import com.huawei.hms.support.log.C1202a;
import org.json.JSONArray;

/* renamed from: com.huawei.hms.support.api.push.a.a */
public class C1172a {
    /* renamed from: a */
    public void mo15660a(Context context, Intent intent) {
        int i;
        if (context == null || intent == null) {
            C1202a.m1316a("PushSelfShowLog", "enter SelfShowReceiver receiver, context or intent is null");
            return;
        }
        try {
            String action = intent.getAction();
            if ("com.huawei.intent.action.PUSH".equals(action) || "com.huawei.push.msg.NOTIFY_MSG".equals(action) || "com.huawei.intent.action.PUSH_DELAY_NOTIFY".equals(action)) {
                String str = null;
                if (intent.hasExtra("selfshow_info")) {
                    if (intent.hasExtra("selfshow_token")) {
                        byte[] byteArrayExtra = intent.getByteArrayExtra("selfshow_info");
                        byte[] byteArrayExtra2 = intent.getByteArrayExtra("selfshow_token");
                        if (byteArrayExtra != null) {
                            if (byteArrayExtra2 != null) {
                                if (intent.hasExtra("selfshow_event_id")) {
                                    str = intent.getStringExtra("selfshow_event_id");
                                }
                                if (intent.hasExtra("selfshow_notify_id")) {
                                    int intExtra = intent.getIntExtra("selfshow_notify_id", 0);
                                    C1202a.m1318b("PushSelfShowLog", "get notifyId:" + intExtra);
                                    i = intExtra;
                                } else {
                                    i = 0;
                                }
                                m1165a(context, intent, byteArrayExtra, byteArrayExtra2, str, i);
                                return;
                            }
                        }
                        C1202a.m1318b("PushSelfShowLog", "self show info or token is null.");
                        return;
                    }
                }
                C1202a.m1318b("PushSelfShowLog", "not contain selfshow info or token, invalid message.");
            }
        } catch (RuntimeException unused) {
            C1202a.m1316a("PushSelfShowLog", "onReceive RuntimeException.");
        } catch (Exception unused2) {
            C1202a.m1316a("PushSelfShowLog", "onReceive Exception.");
        }
    }

    /* renamed from: a */
    private void m1165a(Context context, Intent intent, byte[] bArr, byte[] bArr2, String str, int i) {
        C1174a aVar = new C1174a(bArr, bArr2);
        if (!aVar.mo15663b()) {
            C1202a.m1316a("PushSelfShowLog", "parseMessage failed");
            return;
        }
        C1202a.m1318b("PushSelfShowLog", " onReceive the msg id = " + aVar.mo15662a() + ",and cmd is" + aVar.mo15672k() + ",and the eventId is " + str);
        if (str == null) {
            m1163a(context, intent, aVar);
        } else {
            m1164a(context, intent, str, aVar, i);
        }
    }

    /* renamed from: a */
    private void m1163a(Context context, Intent intent, C1174a aVar) {
        C1202a.m1318b("PushSelfShowLog", "receive a selfshow message ,the type is" + aVar.mo15672k());
        if (C1173a.m1167a(aVar.mo15672k())) {
            long a = C1184a.m1237a(aVar.mo15669h());
            if (a == 0) {
                new C1183h(context, aVar, intent.getStringExtra("extra_encrypt_data")).start();
                return;
            }
            C1202a.m1316a("PushSelfShowLog", "waiting ……");
            intent.setPackage(context.getPackageName());
            C1184a.m1241a(context, intent, a);
        }
    }

    /* renamed from: a */
    private void m1164a(Context context, Intent intent, String str, C1174a aVar, int i) {
        C1202a.m1316a("PushSelfShowLog", "receive a selfshow userhandle message");
        if (!"-1".equals(str)) {
            C1184a.m1246b(context, intent);
        } else {
            C1184a.m1240a(context, i);
        }
        if ("1".equals(str)) {
            new C1173a(context, aVar).mo15661a();
            if (aVar.mo15671j() != null) {
                try {
                    JSONArray jSONArray = new JSONArray(aVar.mo15671j());
                    Intent intent2 = new Intent("com.huawei.android.push.intent.CLICK");
                    intent2.putExtra("click", jSONArray.toString()).setPackage(aVar.mo15670i()).setFlags(32);
                    context.sendBroadcast(intent2);
                } catch (Exception e) {
                    C1202a.m1320d("PushSelfShowLog", "message.extras is not a json format,err info " + e.toString());
                }
            }
        }
    }
}
