package com.learnium.RNDeviceInfo;

public enum DeviceType {
    HANDSET("Handset"),
    TABLET("Tablet"),
    TV("Tv"),
    UNKNOWN("unknown");
    
    public final String value;

    /* access modifiers changed from: public */
    DeviceType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
