package anet.channel.strategy;

import java.util.Comparator;

/* renamed from: anet.channel.strategy.k */
public class C0197k implements Comparator<IPConnStrategy> {

    /* renamed from: a */
    public final /* synthetic */ StrategyList f413a;

    public C0197k(StrategyList strategyList) {
        this.f413a = strategyList;
    }

    /* renamed from: a */
    public int compare(IPConnStrategy iPConnStrategy, IPConnStrategy iPConnStrategy2) {
        int i;
        int i2;
        int a = ((ConnHistoryItem) this.f413a.f352b.get(Integer.valueOf(iPConnStrategy.getUniqueId()))).mo3635a();
        int a2 = ((ConnHistoryItem) this.f413a.f352b.get(Integer.valueOf(iPConnStrategy2.getUniqueId()))).mo3635a();
        if (a != a2) {
            return a - a2;
        }
        if (iPConnStrategy.f332a != iPConnStrategy2.f332a) {
            i = iPConnStrategy.f332a;
            i2 = iPConnStrategy2.f332a;
        } else {
            i = iPConnStrategy.protocol.isHttp;
            i2 = iPConnStrategy2.protocol.isHttp;
        }
        return i - i2;
    }
}
