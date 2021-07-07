package com.p118pd.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import anet.channel.util.ALog;
import com.p118pd.sdk.AbstractC7328o0O0o00O;

/* renamed from: com.pd.sdk.o0O0oOO0  reason: case insensitive filesystem */
public final class ServiceConnectionC7342o0O0oOO0 implements ServiceConnection {
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (ALog.isPrintLog(2)) {
            ALog.m290i("anet.RemoteGetter", "[onServiceConnected]ANet_Service start success. ANet run with service mode", null, new Object[0]);
        }
        synchronized (C7337o0O0oO.class) {
            C7337o0O0oO.f20055OooO00o = AbstractC7328o0O0o00O.OooO00o.OooO00o(iBinder);
            if (C7337o0O0oO.f20056OooO00o != null) {
                C7337o0O0oO.f20056OooO00o.countDown();
            }
        }
        C7337o0O0oO.f20057OooO00o = false;
        C7337o0O0oO.OooO0O0 = false;
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (ALog.isPrintLog(2)) {
            ALog.m290i("anet.RemoteGetter", "ANet_Service Disconnected", null, new Object[0]);
        }
        C7337o0O0oO.f20055OooO00o = null;
        C7337o0O0oO.OooO0O0 = false;
        if (C7337o0O0oO.f20056OooO00o != null) {
            C7337o0O0oO.f20056OooO00o.countDown();
        }
    }
}
