package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;

public class PermissionInfo implements IMessageEntity {
    @AbstractC1143a
    public String appID;
    @AbstractC1143a
    public String packageName;
    @AbstractC1143a
    public String permission;

    public PermissionInfo() {
    }

    public String getAppID() {
        return this.appID;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPermission() {
        return this.permission;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPermission(String str) {
        this.permission = str;
    }

    public PermissionInfo setPermissionUri(String str) {
        this.permission = str;
        return this;
    }

    public PermissionInfo(String str, String str2, String str3) {
        this.appID = str;
        this.packageName = str2;
        this.permission = str3;
    }
}
