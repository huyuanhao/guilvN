package com.taobao.accs.data;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.taobao.accs.data.k */
public class ServiceConnectionC3120k implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ MsgDistributeService f6972a;

    public ServiceConnectionC3120k(MsgDistributeService msgDistributeService) {
        this.f6972a = msgDistributeService;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
