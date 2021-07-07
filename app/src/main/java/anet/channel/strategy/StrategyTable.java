package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0198l;
import anet.channel.strategy.dispatch.C0185a;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C0209c;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.HttpConstant;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class StrategyTable implements Serializable {

    /* renamed from: f */
    public static Comparator<StrategyCollection> f355f = new C0206o();

    /* renamed from: a */
    public String f356a;

    /* renamed from: b */
    public volatile String f357b;

    /* renamed from: c */
    public boolean f358c = false;

    /* renamed from: d */
    public Map<String, Long> f359d;

    /* renamed from: e */
    public transient boolean f360e = false;

    /* renamed from: g */
    public HostLruCache f361g;

    /* renamed from: h */
    public volatile transient int f362h;

    public static class HostLruCache extends SerialLruCache<String, StrategyCollection> {
        public HostLruCache(int i) {
            super(i);
        }

        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyCollection> entry) {
            if (!entry.getValue().f340e) {
                return true;
            }
            Iterator it = entrySet().iterator();
            while (it.hasNext()) {
                if (!((StrategyCollection) ((Map.Entry) it.next()).getValue()).f340e) {
                    it.remove();
                    return false;
                }
            }
            return false;
        }
    }

    public StrategyTable(String str) {
        this.f356a = str;
        mo3690a();
    }

    /* renamed from: b */
    private void m223b() {
        if (HttpDispatcher.getInstance().isInitHostsChanged(this.f356a)) {
            for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                this.f361g.put(str, new StrategyCollection(str));
            }
        }
    }

    /* renamed from: c */
    private void m225c() {
        try {
            if (HttpDispatcher.getInstance().isInitHostsChanged(this.f356a)) {
                TreeSet treeSet = null;
                synchronized (this.f361g) {
                    for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                        if (!this.f361g.containsKey(str)) {
                            this.f361g.put(str, new StrategyCollection(str));
                            if (treeSet == null) {
                                treeSet = new TreeSet();
                            }
                            treeSet.add(str);
                        }
                    }
                }
                if (treeSet != null) {
                    m222a(treeSet);
                }
            }
        } catch (Exception e) {
            ALog.m288e("awcn.StrategyTable", "checkInitHost failed", this.f356a, e, new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo3690a() {
        if (this.f361g == null) {
            this.f361g = new HostLruCache(256);
            m223b();
        }
        for (StrategyCollection strategyCollection : this.f361g.values()) {
            strategyCollection.checkInit();
        }
        int i = 0;
        ALog.m290i("awcn.StrategyTable", "strategy map", null, FileAttachment.KEY_SIZE, Integer.valueOf(this.f361g.size()));
        if (!GlobalAppRuntimeInfo.isTargetProcess()) {
            i = -1;
        }
        this.f362h = i;
        if (this.f359d == null) {
            this.f359d = new ConcurrentHashMap();
        }
    }

    public String getCnameByHost(String str) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f361g) {
            strategyCollection = (StrategyCollection) this.f361g.get(str);
        }
        if (strategyCollection != null && strategyCollection.isExpired() && C0185a.m239a() == 0) {
            m221a(str);
        }
        if (strategyCollection != null) {
            return strategyCollection.f339d;
        }
        return null;
    }

    public List<IConnStrategy> queryByHost(String str) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str) || !C0209c.m283c(str)) {
            return Collections.EMPTY_LIST;
        }
        m225c();
        synchronized (this.f361g) {
            strategyCollection = (StrategyCollection) this.f361g.get(str);
            if (strategyCollection == null) {
                strategyCollection = new StrategyCollection(str);
                this.f361g.put(str, strategyCollection);
            }
        }
        if (strategyCollection.f338c == 0 || (strategyCollection.isExpired() && C0185a.m239a() == 0)) {
            m221a(str);
        }
        return strategyCollection.queryStrategyList();
    }

    public void update(C0198l.C0202d dVar) {
        ALog.m290i("awcn.StrategyTable", "update strategyTable with httpDns response", this.f356a, new Object[0]);
        try {
            this.f357b = dVar.f435a;
            this.f362h = dVar.f440f;
            C0198l.C0200b[] bVarArr = dVar.f436b;
            if (bVarArr != null) {
                synchronized (this.f361g) {
                    for (C0198l.C0200b bVar : bVarArr) {
                        if (bVar != null) {
                            if (bVar.f422a != null) {
                                if (bVar.f431j) {
                                    this.f361g.remove(bVar.f422a);
                                } else {
                                    StrategyCollection strategyCollection = (StrategyCollection) this.f361g.get(bVar.f422a);
                                    if (strategyCollection == null) {
                                        strategyCollection = new StrategyCollection(bVar.f422a);
                                        this.f361g.put(bVar.f422a, strategyCollection);
                                    }
                                    strategyCollection.update(bVar);
                                }
                            }
                        }
                    }
                }
                this.f360e = true;
                if (ALog.isPrintLog(1)) {
                    StringBuilder sb = new StringBuilder("uniqueId : ");
                    sb.append(this.f356a);
                    sb.append("\n-------------------------domains:------------------------------------");
                    ALog.m287d("awcn.StrategyTable", sb.toString(), null, new Object[0]);
                    synchronized (this.f361g) {
                        for (Map.Entry entry : this.f361g.entrySet()) {
                            sb.setLength(0);
                            sb.append((String) entry.getKey());
                            sb.append(" = ");
                            sb.append(((StrategyCollection) entry.getValue()).toString());
                            ALog.m287d("awcn.StrategyTable", sb.toString(), null, new Object[0]);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            ALog.m288e("awcn.StrategyTable", "fail to update strategyTable", this.f356a, th, new Object[0]);
        }
    }

    /* renamed from: b */
    private void m224b(Set<String> set) {
        TreeSet treeSet = new TreeSet(f355f);
        synchronized (this.f361g) {
            treeSet.addAll(this.f361g.values());
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            StrategyCollection strategyCollection = (StrategyCollection) it.next();
            if (strategyCollection.isExpired() && set.size() < 40) {
                strategyCollection.f338c = 30000 + currentTimeMillis;
                set.add(strategyCollection.f336a);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m221a(String str) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(str);
        m222a(treeSet);
    }

    /* renamed from: a */
    public void mo3692a(String str, boolean z) {
        StrategyCollection strategyCollection;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f361g) {
                strategyCollection = (StrategyCollection) this.f361g.get(str);
                if (strategyCollection == null) {
                    strategyCollection = new StrategyCollection(str);
                    this.f361g.put(str, strategyCollection);
                }
            }
            if (z || strategyCollection.f338c == 0 || (strategyCollection.isExpired() && C0185a.m239a() == 0)) {
                m221a(str);
            }
        }
    }

    /* renamed from: a */
    private void m222a(Set<String> set) {
        if (!(set == null || set.isEmpty())) {
            if ((!GlobalAppRuntimeInfo.isAppBackground() || AppLifecycle.lastEnterBackgroundTime <= 0) && NetworkStatusHelper.isConnected()) {
                int a = C0185a.m239a();
                if (a != 3) {
                    long currentTimeMillis = System.currentTimeMillis();
                    synchronized (this.f361g) {
                        for (String str : set) {
                            StrategyCollection strategyCollection = (StrategyCollection) this.f361g.get(str);
                            if (strategyCollection != null) {
                                strategyCollection.f338c = 30000 + currentTimeMillis;
                            }
                        }
                    }
                    if (a == 0) {
                        m224b(set);
                    }
                    HttpDispatcher.getInstance().sendAmdcRequest(set, this.f362h);
                    return;
                }
                return;
            }
            ALog.m290i("awcn.StrategyTable", "app in background or no network", this.f356a, new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo3691a(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyCollection strategyCollection;
        if (ALog.isPrintLog(1)) {
            ALog.m287d("awcn.StrategyTable", "[notifyConnEvent]", null, HttpConstant.HOST, str, "IConnStrategy", iConnStrategy, "ConnEvent", connEvent);
        }
        String str2 = iConnStrategy.getProtocol().protocol;
        if (ConnType.QUIC.equals(str2) || ConnType.QUIC_PLAIN.equals(str2)) {
            boolean z = connEvent.isSuccess;
            this.f358c = z;
            ALog.m289e("awcn.StrategyTable", "enbale quic", null, "uniqueId", this.f356a, "enable", Boolean.valueOf(z));
        }
        if (!connEvent.isSuccess && C0209c.m282b(iConnStrategy.getIp())) {
            this.f359d.put(str, Long.valueOf(System.currentTimeMillis()));
            ALog.m289e("awcn.StrategyTable", "disable ipv6", null, "uniqueId", this.f356a, "host", str);
        }
        synchronized (this.f361g) {
            strategyCollection = (StrategyCollection) this.f361g.get(str);
        }
        if (strategyCollection != null) {
            strategyCollection.notifyConnEvent(iConnStrategy, connEvent);
        }
    }

    /* renamed from: a */
    public boolean mo3693a(String str, long j) {
        Long l = this.f359d.get(str);
        if (l == null) {
            return false;
        }
        if (l.longValue() + j >= System.currentTimeMillis()) {
            return true;
        }
        this.f359d.remove(str);
        return false;
    }
}
