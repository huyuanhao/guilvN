package anet.channel.strategy;

import anet.channel.AwcnConfig;
import anet.channel.entity.ConnType;
import anet.channel.util.ALog;

/* renamed from: anet.channel.strategy.h */
public class C0194h implements IStrategyFilter {

    /* renamed from: a */
    public final /* synthetic */ C0193g f407a;

    public C0194h(C0193g gVar) {
        this.f407a = gVar;
    }

    @Override // anet.channel.strategy.IStrategyFilter
    public boolean accept(IConnStrategy iConnStrategy) {
        boolean isQuicEnable = AwcnConfig.isQuicEnable();
        boolean z = this.f407a.f403b.mo3681d().f358c;
        String str = iConnStrategy.getProtocol().protocol;
        if ((isQuicEnable && z) || (!ConnType.QUIC.equals(str) && !ConnType.QUIC_PLAIN.equals(str))) {
            return true;
        }
        ALog.m290i("awcn.StrategyCenter", "quic strategy disabled", null, "strategy", iConnStrategy);
        return false;
    }
}
