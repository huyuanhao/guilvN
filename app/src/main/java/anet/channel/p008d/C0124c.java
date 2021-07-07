package anet.channel.p008d;

import anet.channel.AwcnConfig;
import anet.channel.strategy.C0198l;
import anet.channel.strategy.IStrategyListener;
import anet.channel.util.ALog;

/* renamed from: anet.channel.d.c */
public final class C0124c implements IStrategyListener {
    @Override // anet.channel.strategy.IStrategyListener
    public void onStrategyUpdated(C0198l.C0202d dVar) {
        C0198l.C0201c[] cVarArr;
        ALog.m290i("awcn.NetworkDetector", "onStrategyUpdated", null, new Object[0]);
        if (AwcnConfig.isHorseRaceEnable() && (cVarArr = dVar.f437c) != null && cVarArr.length != 0) {
            if (C0122a.f134f == null) {
                Thread unused = C0122a.f134f = new Thread(C0122a.f135g);
                C0122a.f134f.setName("AWCN HR");
                C0122a.f134f.start();
                ALog.m290i("awcn.NetworkDetector", "start horse race thread", null, new Object[0]);
            }
            synchronized (C0122a.f129a) {
                for (int i = 0; i < dVar.f437c.length; i++) {
                    C0198l.C0201c cVar = dVar.f437c[i];
                    C0122a.f129a.put(cVar.f433a, cVar);
                }
            }
            C0122a.f131c.lock();
            try {
                C0122a.f133e.signal();
            } finally {
                C0122a.f131c.unlock();
            }
        }
    }
}
