package com.alibaba.sdk.android.httpdns.probe;

public interface IPProbeService {

    /* renamed from: com.alibaba.sdk.android.httpdns.probe.IPProbeService$a */
    public enum EnumC0314a {
        NO_PROBING,
        PROBING
    }

    EnumC0314a getProbeStatus(String str);

    void launchIPProbeTask(String str, int i, String[] strArr);

    void setIPListUpdateCallback(AbstractC0316b bVar);

    boolean stopIPProbeTask(String str);
}
