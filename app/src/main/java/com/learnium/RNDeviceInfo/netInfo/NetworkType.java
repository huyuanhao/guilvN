package com.learnium.RNDeviceInfo.netInfo;

public enum NetworkType {
    NETWORK_WIFI("WiFi"),
    NETWORK_5G("5G"),
    NETWORK_4G("4G"),
    NETWORK_2G("2G"),
    NETWORK_3G("3G"),
    NETWORK_UNKNOWN("unknown"),
    NETWORK_NO("none");
    
    public String desc;

    /* access modifiers changed from: public */
    NetworkType(String str) {
        this.desc = str;
    }

    public String toString() {
        return this.desc;
    }
}
