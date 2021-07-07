package anet.channel.strategy;

import anet.channel.strategy.C0198l;
import anet.channel.strategy.StrategyList;

/* renamed from: anet.channel.strategy.j */
public class C0196j implements StrategyList.Predicate<IPConnStrategy> {

    /* renamed from: a */
    public final /* synthetic */ C0198l.C0199a f409a;

    /* renamed from: b */
    public final /* synthetic */ String f410b;

    /* renamed from: c */
    public final /* synthetic */ ConnProtocol f411c;

    /* renamed from: d */
    public final /* synthetic */ StrategyList f412d;

    public C0196j(StrategyList strategyList, C0198l.C0199a aVar, String str, ConnProtocol connProtocol) {
        this.f412d = strategyList;
        this.f409a = aVar;
        this.f410b = str;
        this.f411c = connProtocol;
    }

    /* renamed from: a */
    public boolean apply(IPConnStrategy iPConnStrategy) {
        return iPConnStrategy.getPort() == this.f409a.f414a && iPConnStrategy.getIp().equals(this.f410b) && iPConnStrategy.protocol.equals(this.f411c);
    }
}
