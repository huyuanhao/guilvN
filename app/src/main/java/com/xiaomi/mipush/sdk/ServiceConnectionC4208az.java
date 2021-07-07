package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;

/* renamed from: com.xiaomi.mipush.sdk.az */
public class ServiceConnectionC4208az implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C4204aw f11264a;

    public ServiceConnectionC4208az(C4204aw awVar) {
        this.f11264a = awVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f11264a) {
            this.f11264a.f11253a = new Messenger(iBinder);
            this.f11264a.f11258c = false;
            for (Message message : C4204aw.m11448a(this.f11264a)) {
                try {
                    C4204aw.m11442a(this.f11264a).send(message);
                } catch (RemoteException e) {
                    AbstractC4163b.m11303a(e);
                }
            }
            C4204aw.m11448a(this.f11264a).clear();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f11264a.f11253a = null;
        this.f11264a.f11258c = false;
    }
}
