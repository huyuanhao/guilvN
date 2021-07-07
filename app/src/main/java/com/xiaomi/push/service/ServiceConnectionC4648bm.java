package com.xiaomi.push.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;

/* renamed from: com.xiaomi.push.service.bm */
public class ServiceConnectionC4648bm implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13308a;

    public ServiceConnectionC4648bm(XMPushService xMPushService) {
        this.f13308a = xMPushService;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC4163b.m11304b("onServiceConnected " + iBinder);
        Service a = XMJobService.m13746a();
        if (a != null) {
            this.f13308a.startForeground(XMPushService.mo42620a(), XMPushService.m13748a((Context) this.f13308a));
            a.startForeground(XMPushService.mo42620a(), XMPushService.m13748a((Context) this.f13308a));
            a.stopForeground(true);
            this.f13308a.unbindService(this);
            return;
        }
        AbstractC4163b.m11301a("XMService connected but innerService is null " + iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
