package com.rxhui.android_log_sdk;

import com.taobao.accs.AccsClientConfig;

public enum LogCategory {
    APPLICATION("application"),
    PAGE("page"),
    BUSINESS_COMPONENT("business_component"),
    COMPONENT("component"),
    API("api"),
    NETWORK("network"),
    DEFAULT(AccsClientConfig.DEFAULT_CONFIGTAG);
    
    public String value;

    /* access modifiers changed from: public */
    LogCategory(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
