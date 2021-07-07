package com.alibaba.sdk.android.httpdns.probe;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.d */
public final class C0318d {

    /* renamed from: a */
    public static IPProbeService f701a;

    /* renamed from: a */
    public static synchronized IPProbeService m572a(AbstractC0316b bVar) {
        IPProbeService iPProbeService;
        synchronized (C0318d.class) {
            if (f701a == null) {
                C0319e eVar = new C0319e();
                f701a = eVar;
                eVar.setIPListUpdateCallback(bVar);
            }
            iPProbeService = f701a;
        }
        return iPProbeService;
    }
}
