package com.rxhui.android_log_sdk;

import anet.channel.strategy.dispatch.DispatchConstants;

public enum LogNetworkType {
    BUSINESS_SUCCESS("business_success"),
    BUSINESS_FAIL("business_fail"),
    LOAD_FROM_CACHE_SUCCESS("load_from_cache_success"),
    LOAD_FROM_CACHE_FAIL("load_from_cache_fail"),
    OVERTIME("overtime"),
    NO_200("no_200"),
    NO_NETWORK("no_network"),
    OTHER(DispatchConstants.OTHER);
    
    public String value;

    /* access modifiers changed from: public */
    LogNetworkType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
