package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.C4194am;
import com.xiaomi.mipush.sdk.C4204aw;
import com.xiaomi.mipush.sdk.C4209b;
import com.xiaomi.mipush.sdk.COSPushHelper;
import com.xiaomi.mipush.sdk.EnumC4212bb;
import com.xiaomi.mipush.sdk.FTOSPushHelper;
import com.xiaomi.mipush.sdk.HWPushHelper;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C4274az;
import com.xiaomi.push.C4473gz;
import com.xiaomi.push.service.C4631ay;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class NetworkStatusReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static int f13377a = 1;

    /* renamed from: a */
    public static BlockingQueue<Runnable> f13378a = new LinkedBlockingQueue();

    /* renamed from: a */
    public static ThreadPoolExecutor f13379a = new ThreadPoolExecutor(f13377a, f13381b, (long) f13382c, TimeUnit.SECONDS, f13378a);

    /* renamed from: a */
    public static boolean f13380a = false;

    /* renamed from: b */
    public static int f13381b = 1;

    /* renamed from: c */
    public static int f13382c = 2;

    /* renamed from: b */
    public boolean f13383b;

    public NetworkStatusReceiver() {
        this.f13383b = false;
        this.f13383b = true;
    }

    public NetworkStatusReceiver(Object obj) {
        this.f13383b = false;
        f13380a = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14192a(Context context) {
        if (!C4204aw.m11444a(context).m11482a() && C4209b.m11491a(context).m11511c() && !C4209b.m11491a(context).m11515e()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                C4631ay.m14017a(context).m14022a(intent);
            } catch (Exception e) {
                AbstractC4163b.m11303a(e);
            }
        }
        C4473gz.m12846a(context);
        if (C4274az.m11735b(context) && C4204aw.m11444a(context).m11486b()) {
            C4204aw.m11444a(context).m11487c();
        }
        if (C4274az.m11735b(context)) {
            if ("syncing".equals(C4194am.m11405a(context).mo41387a(EnumC4212bb.DISABLE_PUSH))) {
                MiPushClient.disablePush(context);
            }
            if ("syncing".equals(C4194am.m11405a(context).mo41387a(EnumC4212bb.ENABLE_PUSH))) {
                MiPushClient.enablePush(context);
            }
            if ("syncing".equals(C4194am.m11405a(context).mo41387a(EnumC4212bb.UPLOAD_HUAWEI_TOKEN))) {
                MiPushClient.syncAssemblePushToken(context);
            }
            if ("syncing".equals(C4194am.m11405a(context).mo41387a(EnumC4212bb.UPLOAD_FCM_TOKEN))) {
                MiPushClient.syncAssembleFCMPushToken(context);
            }
            if ("syncing".equals(C4194am.m11405a(context).mo41387a(EnumC4212bb.UPLOAD_COS_TOKEN))) {
                MiPushClient.syncAssembleCOSPushToken(context);
            }
            if ("syncing".equals(C4194am.m11405a(context).mo41387a(EnumC4212bb.UPLOAD_FTOS_TOKEN))) {
                MiPushClient.syncAssembleFTOSPushToken(context);
            }
            if (HWPushHelper.needConnect() && HWPushHelper.shouldTryConnect(context)) {
                HWPushHelper.setConnectTime(context);
                HWPushHelper.registerHuaWeiAssemblePush(context);
            }
            COSPushHelper.doInNetworkChange(context);
            FTOSPushHelper.doInNetworkChange(context);
        }
    }

    /* renamed from: a */
    public static boolean m14194a() {
        return f13380a;
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.f13383b) {
            f13379a.execute(new RunnableC4679a(this, context));
        }
    }
}
