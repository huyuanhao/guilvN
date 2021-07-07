package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netease.nis.captcha.Captcha;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.push.C4417fd;

public abstract class PushMessageReceiver extends BroadcastReceiver {
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
    }

    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
    }

    public final void onReceive(Context context, Intent intent) {
        C4417fd a;
        String packageName;
        int i;
        String str;
        MessageHandleService.addJob(context.getApplicationContext(), new MessageHandleService.C4177a(intent, this));
        try {
            int intExtra = intent.getIntExtra("eventMessageType", -1);
            if (intExtra == 2000) {
                a = C4417fd.m12519a(context.getApplicationContext());
                packageName = context.getPackageName();
                i = Captcha.WEB_VIEW_HTTP_ERROR;
                str = "receive passThough message broadcast";
            } else if (intExtra == 6000) {
                a = C4417fd.m12519a(context.getApplicationContext());
                packageName = context.getPackageName();
                i = 6005;
                str = "receive register push broadcast";
            } else {
                return;
            }
            a.mo41809a(packageName, intent, i, str);
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
    }

    @Deprecated
    public void onReceiveMessage(Context context, MiPushMessage miPushMessage) {
    }

    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
    }

    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public void onRequirePermissions(Context context, String[] strArr) {
    }
}
