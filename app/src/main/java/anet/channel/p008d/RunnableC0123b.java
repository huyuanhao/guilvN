package anet.channel.p008d;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.strategy.C0198l;
import anet.channel.util.ALog;
import java.util.Map;

/* renamed from: anet.channel.d.b */
public final class RunnableC0123b implements Runnable {
    public void run() {
        Map.Entry entry;
        ALog.m289e("awcn.NetworkDetector", "network detect thread start", null, new Object[0]);
        while (true) {
            try {
                C0122a.f131c.lock();
                if (!GlobalAppRuntimeInfo.isAppBackground()) {
                    C0122a.f132d.await();
                }
                if (C0122a.f129a.isEmpty()) {
                    C0122a.f133e.await();
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C0122a.f131c.unlock();
                throw th;
            }
            C0122a.f131c.unlock();
            while (GlobalAppRuntimeInfo.isAppBackground()) {
                synchronized (C0122a.f129a) {
                    if (!AwcnConfig.isHorseRaceEnable()) {
                        C0122a.f129a.clear();
                        entry = null;
                    } else {
                        entry = C0122a.f129a.pollFirstEntry();
                    }
                }
                if (entry == null) {
                    break;
                }
                try {
                    C0122a.m66b((C0198l.C0201c) entry.getValue());
                } catch (Exception e) {
                    ALog.m288e("awcn.NetworkDetector", "start hr task failed", null, e, new Object[0]);
                }
            }
        }
    }
}
