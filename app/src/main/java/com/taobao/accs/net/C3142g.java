package com.taobao.accs.net;

import anet.channel.entity.ConnType;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.taobao.accs.net.g */
public class C3142g {

    /* renamed from: a */
    public int f7038a = 0;

    /* renamed from: b */
    public List<IConnStrategy> f7039b = new ArrayList();

    public C3142g(String str) {
        HttpDispatcher.getInstance().addListener(new C3143h(this));
        mo37683a(str);
    }

    /* renamed from: a */
    public List<IConnStrategy> mo37683a(String str) {
        List<IConnStrategy> connStrategyListByHost;
        if ((this.f7038a == 0 || this.f7039b.isEmpty()) && (connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str)) != null && !connStrategyListByHost.isEmpty()) {
            this.f7039b.clear();
            for (IConnStrategy iConnStrategy : connStrategyListByHost) {
                ConnType valueOf = ConnType.valueOf(iConnStrategy.getProtocol());
                if (valueOf.getTypeLevel() == ConnType.TypeLevel.SPDY && valueOf.isSSL()) {
                    this.f7039b.add(iConnStrategy);
                }
            }
        }
        return this.f7039b;
    }

    /* renamed from: b */
    public void mo37684b() {
        this.f7038a++;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m7597d("HttpDnsProvider", "updateStrategyPos StrategyPos:" + this.f7038a, new Object[0]);
        }
    }

    /* renamed from: c */
    public int mo37686c() {
        return this.f7038a;
    }

    /* renamed from: b */
    public void mo37685b(String str) {
        StrategyCenter.getInstance().forceRefreshStrategy(str);
    }

    /* renamed from: a */
    public IConnStrategy mo37681a() {
        return mo37682a(this.f7039b);
    }

    /* renamed from: a */
    public IConnStrategy mo37682a(List<IConnStrategy> list) {
        if (list == null || list.isEmpty()) {
            ALog.m7597d("HttpDnsProvider", "strategys null or 0", new Object[0]);
            return null;
        }
        int i = this.f7038a;
        if (i < 0 || i >= list.size()) {
            this.f7038a = 0;
        }
        return list.get(this.f7038a);
    }
}
