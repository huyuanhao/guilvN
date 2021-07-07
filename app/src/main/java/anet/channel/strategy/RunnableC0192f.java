package anet.channel.strategy;

import anet.channel.statist.StrategyStatObject;
import anet.channel.strategy.StrategyInfoHolder;
import java.io.Serializable;
import java.util.Map;

/* renamed from: anet.channel.strategy.f */
public class RunnableC0192f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Map.Entry f400a;

    /* renamed from: b */
    public final /* synthetic */ StrategyInfoHolder.LruStrategyMap f401b;

    public RunnableC0192f(StrategyInfoHolder.LruStrategyMap lruStrategyMap, Map.Entry entry) {
        this.f401b = lruStrategyMap;
        this.f400a = entry;
    }

    public void run() {
        StrategyTable strategyTable = (StrategyTable) this.f400a.getValue();
        if (strategyTable.f360e) {
            StrategyStatObject strategyStatObject = new StrategyStatObject(1);
            strategyStatObject.writeStrategyFileId = strategyTable.f356a;
            C0204m.m269a((Serializable) this.f400a.getValue(), strategyTable.f356a, strategyStatObject);
            strategyTable.f360e = false;
        }
    }
}
