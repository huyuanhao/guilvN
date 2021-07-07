package anet.channel.strategy;

import anet.channel.strategy.C0198l;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class StrategyCollection implements Serializable {

    /* renamed from: a */
    public String f336a;

    /* renamed from: b */
    public StrategyList f337b = null;

    /* renamed from: c */
    public volatile long f338c = 0;

    /* renamed from: d */
    public volatile String f339d = null;

    /* renamed from: e */
    public boolean f340e = false;

    /* renamed from: f */
    public transient long f341f = 0;

    public StrategyCollection() {
    }

    public void checkInit() {
        if (System.currentTimeMillis() - this.f338c > 172800000) {
            this.f337b = null;
            return;
        }
        StrategyList strategyList = this.f337b;
        if (strategyList != null) {
            strategyList.checkInit();
        }
    }

    public boolean isExpired() {
        return System.currentTimeMillis() > this.f338c;
    }

    public synchronized void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (this.f337b != null) {
            this.f337b.notifyConnEvent(iConnStrategy, connEvent);
            if (!connEvent.isSuccess && this.f337b.shouldRefresh()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f341f > 60000) {
                    StrategyCenter.getInstance().forceRefreshStrategy(this.f336a);
                    this.f341f = currentTimeMillis;
                }
            }
        }
    }

    public synchronized List<IConnStrategy> queryStrategyList() {
        if (this.f337b == null) {
            return Collections.EMPTY_LIST;
        }
        return this.f337b.getStrategyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("\nStrategyList = ");
        sb.append(this.f338c);
        StrategyList strategyList = this.f337b;
        if (strategyList != null) {
            sb.append(strategyList.toString());
        } else if (this.f339d != null) {
            sb.append('[');
            sb.append(this.f336a);
            sb.append("=>");
            sb.append(this.f339d);
            sb.append(']');
        } else {
            sb.append("[]");
        }
        return sb.toString();
    }

    public synchronized void update(C0198l.C0200b bVar) {
        this.f338c = System.currentTimeMillis() + (((long) bVar.f423b) * 1000);
        if (!bVar.f422a.equalsIgnoreCase(this.f336a)) {
            ALog.m289e("StrategyCollection", "update error!", null, "host", this.f336a, "dnsInfo.host", bVar.f422a);
            return;
        }
        this.f339d = bVar.f425d;
        if ((bVar.f427f == null || bVar.f427f.length == 0 || bVar.f429h == null || bVar.f429h.length == 0) && (bVar.f430i == null || bVar.f430i.length == 0)) {
            this.f337b = null;
            return;
        }
        if (this.f337b == null) {
            this.f337b = new StrategyList();
        }
        this.f337b.update(bVar);
    }

    public StrategyCollection(String str) {
        this.f336a = str;
        this.f340e = DispatchConstants.isAmdcServerDomain(str);
    }
}
