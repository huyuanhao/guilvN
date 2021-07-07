package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.statist.StrategyStatObject;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0198l;
import anet.channel.strategy.dispatch.C0185a;
import anet.channel.strategy.utils.C0207a;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StrategyInfoHolder implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    public Map<String, StrategyTable> f345a = new LruStrategyMap();

    /* renamed from: b */
    public volatile StrategyConfig f346b = null;

    /* renamed from: c */
    public final C0178a f347c = new C0178a();

    /* renamed from: d */
    public final StrategyTable f348d = new StrategyTable("Unknown");

    /* renamed from: e */
    public final Set<String> f349e = new HashSet();

    /* renamed from: f */
    public volatile String f350f = "";

    public static class LruStrategyMap extends SerialLruCache<String, StrategyTable> {
        public LruStrategyMap() {
            super(3);
        }

        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyTable> entry) {
            C0207a.m276a(new RunnableC0192f(this, entry));
            return true;
        }
    }

    public StrategyInfoHolder() {
        try {
            m209e();
            m211g();
        } catch (Throwable unused) {
        }
        m210f();
    }

    /* renamed from: a */
    public static StrategyInfoHolder m207a() {
        return new StrategyInfoHolder();
    }

    /* renamed from: e */
    private void m209e() {
        NetworkStatusHelper.addStatusChangeListener(this);
        this.f350f = m208a(NetworkStatusHelper.getStatus());
    }

    /* renamed from: f */
    private void m210f() {
        for (Map.Entry<String, StrategyTable> entry : this.f345a.entrySet()) {
            entry.getValue().mo3690a();
        }
        synchronized (this) {
            if (this.f346b == null) {
                StrategyConfig strategyConfig = new StrategyConfig();
                strategyConfig.mo3673a();
                strategyConfig.mo3674a(this);
                this.f346b = strategyConfig;
            }
        }
    }

    /* renamed from: g */
    private void m211g() {
        ALog.m290i("awcn.StrategyInfoHolder", "restore", null, new Object[0]);
        String str = this.f350f;
        if (!AwcnConfig.isAsyncLoadStrategyEnable()) {
            if (!TextUtils.isEmpty(str)) {
                mo3678a(str, true);
            }
            this.f346b = (StrategyConfig) C0204m.m266a("StrategyConfig", null);
        }
        C0207a.m276a(new RunnableC0182d(this, str));
    }

    /* renamed from: b */
    public void mo3679b() {
        NetworkStatusHelper.removeStatusChangeListener(this);
    }

    /* renamed from: c */
    public void mo3680c() {
        synchronized (this) {
            for (StrategyTable strategyTable : this.f345a.values()) {
                if (strategyTable.f360e) {
                    StrategyStatObject strategyStatObject = new StrategyStatObject(1);
                    strategyStatObject.writeStrategyFileId = strategyTable.f356a;
                    C0204m.m269a(strategyTable, strategyTable.f356a, strategyStatObject);
                    strategyTable.f360e = false;
                }
            }
            C0204m.m269a(this.f346b, "StrategyConfig", null);
        }
    }

    /* renamed from: d */
    public StrategyTable mo3681d() {
        StrategyTable strategyTable = this.f348d;
        String str = this.f350f;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f345a) {
                strategyTable = this.f345a.get(str);
                if (strategyTable == null) {
                    strategyTable = new StrategyTable(str);
                    this.f345a.put(str, strategyTable);
                }
            }
        }
        return strategyTable;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f350f = m208a(networkStatus);
        String str = this.f350f;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f345a) {
                if (!this.f345a.containsKey(str)) {
                    C0207a.m276a(new RunnableC0191e(this, str));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r2 = (anet.channel.strategy.StrategyTable) anet.channel.strategy.C0204m.m266a(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r2 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r2.mo3690a();
        r3 = r6.f345a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.f345a.put(r2.f356a, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r3 = r6.f349e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r6.f349e.remove(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (r8 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        if (r2 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0044, code lost:
        r0.isSucceed = r1;
        anet.channel.appmonitor.AppMonitor.getInstance().commitStat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r0 = null;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r8 == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = new anet.channel.statist.StrategyStatObject(0);
        r0.readStrategyFileId = r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3678a(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            java.util.Set<java.lang.String> r0 = r6.f349e
            monitor-enter(r0)
            java.util.Set<java.lang.String> r1 = r6.f349e     // Catch:{ all -> 0x0053 }
            boolean r1 = r1.contains(r7)     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x0051
            java.util.Set<java.lang.String> r1 = r6.f349e     // Catch:{ all -> 0x0053 }
            r1.add(r7)     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L_0x001c
            anet.channel.statist.StrategyStatObject r0 = new anet.channel.statist.StrategyStatObject
            r0.<init>(r1)
            r0.readStrategyFileId = r7
        L_0x001c:
            java.lang.Object r2 = anet.channel.strategy.C0204m.m266a(r7, r0)
            anet.channel.strategy.StrategyTable r2 = (anet.channel.strategy.StrategyTable) r2
            if (r2 == 0) goto L_0x0036
            r2.mo3690a()
            java.util.Map<java.lang.String, anet.channel.strategy.StrategyTable> r3 = r6.f345a
            monitor-enter(r3)
            java.util.Map<java.lang.String, anet.channel.strategy.StrategyTable> r4 = r6.f345a     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r2.f356a     // Catch:{ all -> 0x0033 }
            r4.put(r5, r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x0036
        L_0x0033:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r7
        L_0x0036:
            java.util.Set<java.lang.String> r3 = r6.f349e
            monitor-enter(r3)
            java.util.Set<java.lang.String> r4 = r6.f349e     // Catch:{ all -> 0x004e }
            r4.remove(r7)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            if (r8 == 0) goto L_0x004d
            if (r2 == 0) goto L_0x0044
            r1 = 1
        L_0x0044:
            r0.isSucceed = r1
            anet.channel.appmonitor.IAppMonitor r7 = anet.channel.appmonitor.AppMonitor.getInstance()
            r7.commitStat(r0)
        L_0x004d:
            return
        L_0x004e:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L_0x0051:
            monitor-exit(r0)
            return
        L_0x0053:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyInfoHolder.mo3678a(java.lang.String, boolean):void");
    }

    /* renamed from: a */
    private String m208a(NetworkStatusHelper.NetworkStatus networkStatus) {
        String str = "";
        if (networkStatus.isWifi()) {
            String md5ToHex = StringUtils.md5ToHex(NetworkStatusHelper.getWifiBSSID());
            if (!TextUtils.isEmpty(md5ToHex)) {
                str = md5ToHex;
            }
            return "WIFI$" + str;
        } else if (!networkStatus.isMobile()) {
            return str;
        } else {
            return networkStatus.getType() + "$" + NetworkStatusHelper.getApn();
        }
    }

    /* renamed from: a */
    public void mo3677a(C0198l.C0202d dVar) {
        int i = dVar.f441g;
        if (i != 0) {
            C0185a.m240a(i, dVar.f442h);
        }
        mo3681d().update(dVar);
        this.f346b.mo3675a(dVar);
    }
}
