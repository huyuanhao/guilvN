package com.p118pd.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.NetworkResponse;
import anetwork.channel.aidl.ParcelableRequest;
import java.util.concurrent.Future;

/* renamed from: com.pd.sdk.o0O0oO0O  reason: case insensitive filesystem */
public class C7339o0O0oO0O implements AbstractC8649oo0OOoo {
    public static String OooO00o = "anet.NetworkProxy";
    public static final int OooO0O0 = 0;
    public static final int OooO0OO = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f20059OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f20060OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile AbstractC7334o0O0o0o0 f20061OooO00o = null;

    public C7339o0O0oO0O(Context context, int i) {
        this.f20060OooO00o = context;
        this.f20059OooO00o = i;
    }

    @Override // com.p118pd.sdk.AbstractC8649oo0OOoo, com.p118pd.sdk.AbstractC8649oo0OOoo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7326o0O0o00 m18853OooO00o(AbstractC7322o0O0OooO o0o0oooo, Object obj) {
        ALog.m290i(OooO00o, "networkProxy getConnection", o0o0oooo.OooO0Oo(), new Object[0]);
        OooO00o(true);
        ParcelableRequest parcelableRequest = new ParcelableRequest(o0o0oooo);
        if (parcelableRequest.f14723o0ooOOo == null) {
            return new BinderC7636o0oOo0O0(-102);
        }
        try {
            return this.f20061OooO00o.m18851OooO00o(parcelableRequest);
        } catch (Throwable th) {
            OooO00o(th, "[getConnection]call getConnection method failed.");
            return new BinderC7636o0oOo0O0(-103);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8649oo0OOoo, com.p118pd.sdk.AbstractC8649oo0OOoo
    public AbstractC7327o0O0o000 OooO00o(AbstractC7322o0O0OooO o0o0oooo, Object obj) {
        ALog.m290i(OooO00o, "networkProxy syncSend", o0o0oooo.OooO0Oo(), new Object[0]);
        OooO00o(true);
        ParcelableRequest parcelableRequest = new ParcelableRequest(o0o0oooo);
        if (parcelableRequest.f14723o0ooOOo == null) {
            return new NetworkResponse(-102);
        }
        try {
            return this.f20061OooO00o.OooO00o(parcelableRequest);
        } catch (Throwable th) {
            OooO00o(th, "[syncSend]call syncSend method failed.");
            return new NetworkResponse(-103);
        }
    }

    private void OooO00o(boolean z) {
        if (this.f20061OooO00o == null) {
            if (C7348o0O0oo.OooO0o()) {
                C7337o0O0oO.OooO00o(this.f20060OooO00o, z);
                OooO00o(this.f20059OooO00o);
                if (this.f20061OooO00o != null) {
                    return;
                }
            }
            synchronized (this) {
                if (this.f20061OooO00o == null) {
                    if (ALog.isPrintLog(2)) {
                        ALog.m290i(OooO00o, "[getLocalNetworkInstance]", null, new Object[0]);
                    }
                    this.f20061OooO00o = new BinderC7361o0OO0(this.f20060OooO00o);
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8649oo0OOoo
    public Future<AbstractC7327o0O0o000> OooO00o(AbstractC7322o0O0OooO o0o0oooo, Object obj, Handler handler, AbstractC7321o0O0Ooo0 o0o0ooo0) {
        boolean z = false;
        ALog.m290i(OooO00o, "networkProxy asyncSend", o0o0oooo.OooO0Oo(), new Object[0]);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        }
        OooO00o(z);
        ParcelableRequest parcelableRequest = new ParcelableRequest(o0o0oooo);
        BinderC9150oooOO0 ooooo0 = null;
        if (!(o0o0ooo0 == null && handler == null)) {
            ooooo0 = new BinderC9150oooOO0(o0o0ooo0, handler, obj);
        }
        if (parcelableRequest.f14723o0ooOOo == null) {
            if (ooooo0 != null) {
                try {
                    ooooo0.OooO00o(new DefaultFinishEvent(-102));
                } catch (RemoteException unused) {
                }
            }
            return new FutureC7338o0O0oO0(new NetworkResponse(-102));
        }
        try {
            return new FutureC7338o0O0oO0(this.f20061OooO00o.OooO00o(parcelableRequest, ooooo0));
        } catch (Throwable th) {
            if (ooooo0 != null) {
                try {
                    ooooo0.OooO00o(new DefaultFinishEvent(-102));
                } catch (RemoteException unused2) {
                }
            }
            OooO00o(th, "[asyncSend]call asyncSend exception");
            return new FutureC7338o0O0oO0(new NetworkResponse(-103));
        }
    }

    private synchronized void OooO00o(int i) {
        if (this.f20061OooO00o == null) {
            if (ALog.isPrintLog(2)) {
                String str = OooO00o;
                ALog.m290i(str, "[tryGetRemoteNetworkInstance] type=" + i, null, new Object[0]);
            }
            AbstractC7328o0O0o00O OooO00o2 = C7337o0O0oO.OooO00o();
            if (OooO00o2 != null) {
                try {
                    this.f20061OooO00o = OooO00o2.OooO00o(i);
                } catch (Throwable th) {
                    OooO00o(th, "[tryGetRemoteNetworkInstance]get RemoteNetwork Delegate failed.");
                }
            }
        }
    }

    private void OooO00o(Throwable th, String str) {
        ALog.m288e(OooO00o, null, str, th, new Object[0]);
        ExceptionStatistic exceptionStatistic = new ExceptionStatistic(-103, null, "rt");
        exceptionStatistic.exceptionStack = th.toString();
        AppMonitor.getInstance().commitStat(exceptionStatistic);
    }
}
