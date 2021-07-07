package com.p118pd.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.alipay.android.app.IAlixPay;

/* renamed from: com.pd.sdk.o0oOOO0o  reason: case insensitive filesystem */
public class ServiceConnectionC7619o0oOOO0o implements ServiceConnection {
    public final /* synthetic */ C7533o0OoooO0 OooO00o;

    public ServiceConnectionC7619o0oOOO0o(C7533o0OoooO0 o0ooooo0) {
        this.OooO00o = o0ooooo0;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (C7533o0OoooO0.OooO00o(this.OooO00o)) {
            this.OooO00o.f20394OooO00o = IAlixPay.Stub.asInterface(iBinder);
            C7533o0OoooO0.OooO00o(this.OooO00o).notify();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.OooO00o.f20394OooO00o = null;
    }
}
