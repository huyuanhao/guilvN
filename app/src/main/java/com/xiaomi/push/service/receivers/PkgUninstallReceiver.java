package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.AbstractC4627au;
import com.xiaomi.push.service.C4631ay;
import com.xiaomi.push.service.XMPushService;

public class PkgUninstallReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
            boolean z = intent.getExtras().getBoolean("android.intent.extra.REPLACING");
            Uri data = intent.getData();
            if (data != null && !z) {
                try {
                    Intent intent2 = new Intent(context, XMPushService.class);
                    intent2.setAction(AbstractC4627au.f13253a);
                    intent2.putExtra("uninstall_pkg_name", data.getEncodedSchemeSpecificPart());
                    C4631ay.m14017a(context).m14022a(intent2);
                } catch (Exception e) {
                    AbstractC4163b.m11303a(e);
                }
            }
        }
    }
}
