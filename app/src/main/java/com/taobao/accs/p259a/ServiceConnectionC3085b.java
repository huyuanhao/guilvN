package com.taobao.accs.p259a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.a.b */
public final class ServiceConnectionC3085b implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ Intent f6823a;

    /* renamed from: b */
    public final /* synthetic */ Context f6824b;

    public ServiceConnectionC3085b(Intent intent, Context context) {
        this.f6823a = intent;
        this.f6824b = context;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ALog.m7597d(C3084a.TAG, "bindService connected", "componentName", componentName.toString());
        Messenger messenger = new Messenger(iBinder);
        Message message = new Message();
        try {
            message.getData().putParcelable("intent", this.f6823a);
            messenger.send(message);
        } catch (Exception e) {
            ALog.m7599e(C3084a.TAG, "dispatch intent with exception", e.toString());
        } catch (Throwable th) {
            this.f6824b.unbindService(this);
            throw th;
        }
        this.f6824b.unbindService(this);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ALog.m7597d(C3084a.TAG, "bindService on disconnect", "componentName", componentName.toString());
        this.f6824b.unbindService(this);
    }
}
