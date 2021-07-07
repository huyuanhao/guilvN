package anet.channel.p008d;

import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;

/* renamed from: anet.channel.d.d */
public final class C0125d implements AppLifecycle.AppLifecycleListener {
    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void background() {
        ALog.m290i("awcn.NetworkDetector", "background", null, new Object[0]);
        C0122a.f131c.lock();
        try {
            C0122a.f132d.signal();
        } finally {
            C0122a.f131c.unlock();
        }
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void forground() {
    }
}
