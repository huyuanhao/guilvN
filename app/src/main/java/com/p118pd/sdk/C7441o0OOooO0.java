package com.p118pd.sdk;

import android.content.Context;
import anet.channel.monitor.C0146a;
import anet.channel.monitor.C0147b;
import anet.channel.monitor.C0152f;
import anet.channel.monitor.INetworkQualityChangeListener;
import anet.channel.util.ALog;
import anetwork.channel.monitor.speed.NetworkSpeed;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.pd.sdk.o0OOooO0  reason: case insensitive filesystem */
public class C7441o0OOooO0 {
    public static final String OooO00o = "anet.Monitor";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static AtomicBoolean f20269OooO00o = new AtomicBoolean(false);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static synchronized void m19062OooO00o() {
        synchronized (C7441o0OOooO0.class) {
            if (f20269OooO00o.compareAndSet(false, true)) {
                C0147b.m101a().mo3513d();
            }
        }
    }

    public static void OooO0O0() {
        try {
            C0147b.m101a().mo3513d();
        } catch (Throwable th) {
            ALog.m288e(OooO00o, "start failed", null, th, new Object[0]);
        }
    }

    public static void OooO0OO() {
        try {
            C0147b.m101a().mo3514e();
        } catch (Throwable th) {
            ALog.m288e(OooO00o, "stop failed", null, th, new Object[0]);
        }
    }

    public static void OooO0O0(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        C0146a.m96a().mo3508a(iNetworkQualityChangeListener);
    }

    @Deprecated
    public static synchronized void OooO00o(Context context) {
        synchronized (C7441o0OOooO0.class) {
            m19062OooO00o();
        }
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static NetworkSpeed m19061OooO00o() {
        return NetworkSpeed.valueOfCode(m19060OooO00o().getCode());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static anet.channel.monitor.NetworkSpeed m19060OooO00o() {
        anet.channel.monitor.NetworkSpeed networkSpeed = anet.channel.monitor.NetworkSpeed.Fast;
        try {
            return anet.channel.monitor.NetworkSpeed.valueOfCode(C0147b.m101a().mo3511b());
        } catch (Throwable th) {
            ALog.m288e(OooO00o, "getNetworkSpeed failed", null, th, new Object[0]);
            return networkSpeed;
        }
    }

    public static void OooO00o(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        OooO00o(iNetworkQualityChangeListener, null);
    }

    public static void OooO00o(INetworkQualityChangeListener iNetworkQualityChangeListener, C0152f fVar) {
        C0146a.m96a().mo3509a(iNetworkQualityChangeListener, fVar);
    }

    public static double OooO00o() {
        return C0147b.m101a().mo3512c();
    }
}
