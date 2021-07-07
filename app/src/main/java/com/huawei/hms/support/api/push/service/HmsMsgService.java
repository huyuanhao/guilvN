package com.huawei.hms.support.api.push.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.p037c.AbstractC1139h;
import com.huawei.hms.p037c.C1137g;
import com.huawei.hms.support.api.push.p041a.C1172a;
import com.huawei.hms.support.api.push.p046b.p047a.C1188a;
import com.huawei.hms.support.log.C1202a;
import com.umeng.message.MsgConstant;

public class HmsMsgService extends Service {

    /* renamed from: com.huawei.hms.support.api.push.service.HmsMsgService$a */
    public static class HandlerC1199a extends Handler {

        /* renamed from: a */
        public Context f1302a;

        public HandlerC1199a(Context context) {
            this.f1302a = context;
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            if (this.f1302a.getApplicationContext().getPackageManager().getNameForUid(message.sendingUid).equals(HuaweiApiAvailability.SERVICES_PACKAGE) && data != null) {
                C1202a.m1318b("HmsMsgService", "get package signature");
                if (!HuaweiApiAvailability.SERVICES_SIGNATURE.equalsIgnoreCase(new C1137g(this.f1302a).mo15419c(HuaweiApiAvailability.SERVICES_PACKAGE))) {
                    C1202a.m1318b("HmsMsgService", "service not start by hms");
                } else {
                    C1202a.m1318b("HmsMsgService", "chose push type");
                    if (data.getString("push_action").equals("com.huawei.push.msg.NOTIFY_MSG")) {
                        if (AbstractC1139h.m1081a() == null) {
                            AbstractC1139h.m1083a(this.f1302a.getApplicationContext());
                        }
                        C1202a.m1318b("HmsMsgService", "invokeSelfShow");
                        HmsMsgService.m1305d(this.f1302a, data);
                    } else if (data.getString("push_action").equals("com.huawei.push.msg.PASSBY_MSG")) {
                        C1202a.m1318b("HmsMsgService", "sendBroadcastToHms");
                        HmsMsgService.m1304c(this.f1302a, data);
                    }
                }
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: c */
    public static void m1304c(Context context, Bundle bundle) {
        Intent intent = new Intent();
        intent.setAction("com.huawei.android.push.intent.RECEIVE");
        intent.putExtra("msg_data", bundle.getByteArray("msg_data"));
        intent.putExtra(MsgConstant.KEY_DEVICE_TOKEN, bundle.getByteArray(MsgConstant.KEY_DEVICE_TOKEN));
        intent.putExtra("msgIdStr", bundle.getString("msgIdStr"));
        intent.setFlags(32);
        intent.setPackage(bundle.getString("push_package"));
        context.sendBroadcast(intent, context.getPackageName() + ".permission.PROCESS_PUSH_MSG");
        C1202a.m1318b("HmsMsgService", "send broadcast passby done");
    }

    /* renamed from: d */
    public static void m1305d(Context context, Bundle bundle) {
        if (!C1188a.m1267a(context)) {
            C1202a.m1318b("HmsMsgService", context.getPackageName() + " disable display notification.");
        }
        Intent intent = new Intent();
        intent.setAction("com.huawei.push.msg.NOTIFY_MSG");
        intent.putExtra("selfshow_info", bundle.getByteArray("selfshow_info"));
        intent.putExtra("selfshow_token", bundle.getByteArray("selfshow_token"));
        intent.setPackage(bundle.getString("push_package"));
        new C1172a().mo15660a(context, intent);
        C1202a.m1318b("HmsMsgService", "invokeSelfShow done");
    }

    public IBinder onBind(Intent intent) {
        C1202a.m1318b("HmsMsgService", "onBind");
        Messenger messenger = new Messenger(new HandlerC1199a(this));
        stopService(intent);
        return messenger.getBinder();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C1202a.m1318b("HmsMsgService", "Enter onStartCommand.");
        return 2;
    }
}
