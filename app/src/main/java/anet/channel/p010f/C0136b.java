package anet.channel.p010f;

import anet.channel.entity.ConnType;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;

/* renamed from: anet.channel.f.b */
public final class C0136b implements IStrategyFilter {
    @Override // anet.channel.strategy.IStrategyFilter
    public boolean accept(IConnStrategy iConnStrategy) {
        String str = iConnStrategy.getProtocol().protocol;
        return ConnType.QUIC.equals(str) || ConnType.QUIC_PLAIN.equals(str);
    }
}
