package com.p118pd.sdk;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;

/* renamed from: com.pd.sdk.oOoo000o  reason: case insensitive filesystem */
public final class ServiceConnectionC8395oOoo000o implements ServiceConnection {
    public final /* synthetic */ Intent OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ C8379oOoOoOo f21503OooO00o;

    public ServiceConnectionC8395oOoo000o(C8379oOoOoOo ooooooo, Intent intent) {
        this.f21503OooO00o = ooooooo;
        this.OooO00o = intent;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Bundle bundle = new Bundle();
        bundle.putAll(this.OooO00o.getExtras());
        try {
            AbstractBinderC9198oooOooO.OooO00o(iBinder).OooO00o(bundle);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o("bindMcsService exception:" + e);
        }
        this.f21503OooO00o.f21495OooO00o.unbindService(this);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
