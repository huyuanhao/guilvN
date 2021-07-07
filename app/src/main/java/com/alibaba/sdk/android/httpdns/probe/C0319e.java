package com.alibaba.sdk.android.httpdns.probe;

import com.alibaba.sdk.android.httpdns.C0266c;
import com.alibaba.sdk.android.httpdns.C0299i;
import com.alibaba.sdk.android.httpdns.p013a.C0255a;
import com.alibaba.sdk.android.httpdns.p016d.C0276b;
import com.alibaba.sdk.android.httpdns.probe.IPProbeService;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.e */
public class C0319e implements IPProbeService {

    /* renamed from: a */
    public AbstractC0316b f702a = null;

    /* renamed from: a */
    public AtomicLong f703a = new AtomicLong(0);

    /* renamed from: b */
    public AbstractC0321f f704b = new AbstractC0321f() {
        /* class com.alibaba.sdk.android.httpdns.probe.C0319e.C03201 */

        @Override // com.alibaba.sdk.android.httpdns.probe.AbstractC0321f
        /* renamed from: a */
        public void mo4055a(long j, C0317c cVar) {
            if (cVar != null) {
                try {
                    if (C0319e.this.f705c.containsKey(cVar.getHostName())) {
                        if (((Long) C0319e.this.f705c.get(cVar.getHostName())).longValue() == j) {
                            if (cVar != null && cVar.mo4049a() != null && cVar.mo4053i() != null && cVar.mo4054j() != null && cVar.getHostName() != null) {
                                C0299i.m535e("defultId:" + cVar.mo4053i() + ", selectedIp:" + cVar.mo4054j() + ", promote:" + (cVar.mo4050c() - cVar.mo4051d()));
                                C0319e.this.m576a(cVar.getHostName(), cVar.mo4053i(), cVar.mo4054j(), cVar.mo4050c(), cVar.mo4051d(), cVar.mo4049a().length);
                                C0319e.this.f702a.mo3978a(cVar.getHostName(), cVar.mo4049a());
                                C0319e.this.f705c.remove(cVar.getHostName());
                                return;
                            }
                            return;
                        }
                    }
                    C0299i.m534d("corresponding tasknumber not exists, drop the result");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    };

    /* renamed from: c */
    public ConcurrentHashMap<String, Long> f705c = new ConcurrentHashMap<>();

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m576a(String str, String str2, String str3, long j, long j2, int i) {
        C0276b a = C0276b.m496a();
        if (a != null) {
            a.mo3987a(str, str2, str3, j, j2, i);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public IPProbeService.EnumC0314a getProbeStatus(String str) {
        return this.f705c.containsKey(str) ? IPProbeService.EnumC0314a.PROBING : IPProbeService.EnumC0314a.NO_PROBING;
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public void launchIPProbeTask(String str, int i, String[] strArr) {
        if (!C0255a.m419a().mo3956f()) {
            C0299i.m536f("ip probe is forbidden");
        } else if (getProbeStatus(str) == IPProbeService.EnumC0314a.NO_PROBING) {
            long addAndGet = this.f703a.addAndGet(1);
            this.f705c.put(str, Long.valueOf(addAndGet));
            C0266c.m467a().execute(new RunnableC0315a(addAndGet, str, strArr, i, this.f704b));
        } else {
            C0299i.m536f("already launch the same task, drop the task");
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public void setIPListUpdateCallback(AbstractC0316b bVar) {
        this.f702a = bVar;
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public boolean stopIPProbeTask(String str) {
        if (!this.f705c.containsKey(str)) {
            return false;
        }
        C0299i.m534d("stop ip probe task for host:" + str);
        this.f705c.remove(str);
        return true;
    }
}
