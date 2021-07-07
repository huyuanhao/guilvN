package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;

public class AppInfo implements IMessageEntity {
    @AbstractC1143a
    public String appID;
    @AbstractC1143a
    public String packageName;

    public AppInfo() {
    }

    public String getAppID() {
        return this.appID;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public AppInfo(String str, String str2) {
        this.appID = str;
        this.packageName = str2;
    }
}
