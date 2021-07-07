package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;

/* renamed from: com.xiaomi.push.service.ba */
public class ServiceConnectionC4634ba implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C4631ay f13279a;

    public ServiceConnectionC4634ba(C4631ay ayVar) {
        this.f13279a = ayVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f13279a) {
            C4631ay.m14016a(this.f13279a, new Messenger(iBinder));
            C4631ay.m14021a(this.f13279a, false);
            for (Message message : C4631ay.m14018a(this.f13279a)) {
                try {
                    C4631ay.m14015a(this.f13279a).send(message);
                } catch (RemoteException e) {
                    AbstractC4163b.m11303a(e);
                }
            }
            C4631ay.m14018a(this.f13279a).clear();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C4631ay.m14016a(this.f13279a, (Messenger) null);
        C4631ay.m14021a(this.f13279a, false);
    }
}
