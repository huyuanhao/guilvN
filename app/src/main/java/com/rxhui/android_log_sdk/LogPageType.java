package com.rxhui.android_log_sdk;

public enum LogPageType {
    PAGE_IN("page_in"),
    PAGE_OUT("page_out"),
    PAGE_SHOW("page_show"),
    PAGE_HIDE("page_hide"),
    INTERCEPT_START("intercept_start"),
    INTERCEPT_VERIFY_RESULT("intercept_verify_result"),
    INTERCEPT_FINISH("intercept_finish");
    
    public String value;

    /* access modifiers changed from: public */
    LogPageType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
