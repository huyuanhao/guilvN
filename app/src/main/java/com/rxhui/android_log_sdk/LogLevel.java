package com.rxhui.android_log_sdk;

public enum LogLevel {
    error("error", 3),
    warn("warn", 2),
    info("info", 1),
    debug("debug", 0);
    
    public int level;
    public String value;

    /* access modifiers changed from: public */
    LogLevel(String str, int i) {
        this.value = str;
        this.level = i;
    }

    public int getLevel() {
        return this.level;
    }

    public String getValue() {
        return this.value;
    }
}
