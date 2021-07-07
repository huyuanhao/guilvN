package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4418fe;
import com.xiaomi.push.service.AbstractC4621aq;
import com.xiaomi.push.service.C4631ay;
import com.xiaomi.push.service.XMPushService;

public class PingReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        AbstractC4163b.m11305c(intent.getPackage() + " is the package name");
        if (!AbstractC4621aq.f13236o.equals(intent.getAction())) {
            AbstractC4163b.m11301a("cancel the old ping timer");
            C4418fe.m12531a();
        } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
            AbstractC4163b.m11305c("Ping XMChannelService on timer");
            try {
                Intent intent2 = new Intent(context, XMPushService.class);
                intent2.putExtra("time_stamp", System.currentTimeMillis());
                intent2.setAction("com.xiaomi.push.timer");
                C4631ay.m14017a(context).m14022a(intent2);
            } catch (Exception e) {
                AbstractC4163b.m11303a(e);
            }
        }
    }
}
