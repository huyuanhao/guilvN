package com.alibaba.sdk.android.httpdns.net64;

public interface Net64Service {
    void enableIPv6(boolean z);

    String getIPv6ByHostAsync(String str);
}
