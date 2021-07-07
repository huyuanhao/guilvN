package com.qiyukf.nimlib.p180e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.qiyukf.basesdk.p119a.C1709a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.qiyukf.nimlib.e.c */
public class HandlerC2237c extends Handler implements ServiceConnection {

    /* renamed from: a */
    public final Context f4454a;

    /* renamed from: b */
    public final Intent f4455b;

    /* renamed from: c */
    public final AtomicBoolean f4456c = new AtomicBoolean();

    /* renamed from: d */
    public final String f4457d;

    public HandlerC2237c(Context context, Intent intent, String str) {
        super(context.getMainLooper());
        this.f4454a = context.getApplicationContext();
        this.f4455b = intent;
        this.f4457d = str;
    }

    /* renamed from: a */
    private void m4672a(int i) {
        try {
            String str = this.f4457d;
            C1709a.m3018d(str, "doConnect: tag#" + this.f4457d + " count#" + i);
            if (i > 0) {
                String str2 = this.f4457d;
                C1709a.m3020e(str2, "doConnect: unbind & stop service#" + this.f4455b);
                try {
                    this.f4454a.unbindService(this);
                    this.f4454a.stopService(this.f4455b);
                } catch (Throwable unused) {
                }
            }
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.arg1 = i;
            String str3 = this.f4457d;
            C1709a.m3011a(str3, "doConnect: start & bind service#" + this.f4455b);
            sendMessageDelayed(obtain, 15000);
            this.f4454a.startService(this.f4455b);
            if (!this.f4454a.bindService(this.f4455b, this, 1)) {
                String str4 = this.f4457d;
                C1709a.m3020e(str4, "doConnect: stop & bind service#" + this.f4455b);
                this.f4454a.stopService(this.f4455b);
                this.f4454a.bindService(this.f4455b, this, 1);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            String str5 = this.f4457d;
            C1709a.m3011a(str5, "connect core error: " + th);
        }
    }

    /* renamed from: a */
    public void mo34860a() {
    }

    /* renamed from: a */
    public void mo34859a(IBinder iBinder) {
    }

    /* renamed from: b */
    public final void mo34863b() {
        if (!this.f4456c.compareAndSet(false, true)) {
            C1709a.m3018d(this.f4457d, "connect: connecting...");
        } else {
            m4672a(0);
        }
    }

    /* renamed from: c */
    public final void mo34864c() {
        try {
            this.f4454a.unbindService(this);
        } catch (Exception e) {
            String str = this.f4457d;
            C1709a.m3016c(str, "unbind service error: " + e);
        }
    }

    /* renamed from: d */
    public final boolean mo34865d() {
        return this.f4456c.get();
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            int i = message.arg1;
            String str = this.f4457d;
            C1709a.m3018d(str, "doTimeout: count#" + i);
            if (i > 0) {
                this.f4456c.set(false);
            } else {
                m4672a(i + 1);
            }
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str = this.f4457d;
        C1709a.m3011a(str, "onServiceConnected: binder#" + iBinder);
        if (iBinder != null) {
            removeMessages(1);
            this.f4456c.set(false);
            mo34859a(iBinder);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        String str = this.f4457d;
        C1709a.m3011a(str, "onServiceDisconnected#" + componentName.getClassName());
        mo34860a();
    }
}
