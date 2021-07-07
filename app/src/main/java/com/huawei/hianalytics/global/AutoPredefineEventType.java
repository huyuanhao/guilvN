package com.huawei.hianalytics.global;

public enum AutoPredefineEventType {
    HA_APP_CLEAR_DATE("$HA_APP_CLEAR_DATE,"),
    HA_APP_EXCEPTION("$HA_APP_EXCEPTION,"),
    HA_APP_REMOVE("$HA_APP_REMOVE,"),
    HA_APP_UPDATE("$HA_APP_UPDATE,"),
    HA_FIRST_OPEN("$HA_FIRST_OPEN,"),
    HA_SCREEN_VIEW("$HA_SCREEN_VIEW,"),
    HA_SESSION_START("$HA_SESSION_START");
    
    public String eventName;

    /* access modifiers changed from: public */
    AutoPredefineEventType(String str) {
        this.eventName = str;
    }

    public String getEventName() {
        return this.eventName;
    }
}
