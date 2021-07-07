package com.alibaba.sdk.android.httpdns.probe;

public class IPProbeItem {
    public String hostName;
    public int port;

    public IPProbeItem(String str, int i) {
        this.hostName = str;
        this.port = i;
    }

    public String getHostName() {
        return this.hostName;
    }

    public int getPort() {
        return this.port;
    }
}
