package com.rxhui.android_log_sdk;

import com.p118pd.sdk.C8653oo0Oo0;

public enum LogApplicationType {
    STARTUP(C8653oo0Oo0.OooO0Oo),
    STARTUP_STEP("startup_step"),
    STARTUP_RESULT("startup_result"),
    CLOSE("close"),
    SESSION_START("session_start"),
    SESSION_END("session_end"),
    BACKGROUND("background"),
    FOREGOUND("foreground"),
    NETWORK_CHANGE("network_change"),
    PHYSICAL_BACK("physical_back"),
    CRASH("crash"),
    EXCEPTION("exception");
    
    public String value;

    /* access modifiers changed from: public */
    LogApplicationType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
