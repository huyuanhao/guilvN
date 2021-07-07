package com.rxhui.android_log_sdk;

import com.taobao.accs.AccsClientConfig;

public enum DesensitizationType {
    STAR("star"),
    DEFAULT(AccsClientConfig.DEFAULT_CONFIGTAG);
    
    public String value;

    /* access modifiers changed from: public */
    DesensitizationType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
