package anet.channel.p008d;

import anet.channel.strategy.C0198l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;

/* renamed from: anet.channel.d.g */
public final class C0128g implements IConnStrategy {

    /* renamed from: a */
    public final /* synthetic */ C0198l.C0203e f142a;

    /* renamed from: b */
    public final /* synthetic */ ConnProtocol f143b;

    public C0128g(C0198l.C0203e eVar, ConnProtocol connProtocol) {
        this.f142a = eVar;
        this.f143b = connProtocol;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.f142a.f444b.f416c;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return 0;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.f142a.f443a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return 2;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return 1;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        return this.f142a.f444b.f414a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        return this.f143b;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.f142a.f444b.f417d;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return 0;
    }
}
