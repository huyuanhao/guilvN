package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;

public class AuthClearInfo implements IMessageEntity {
    public static final int TYPE_CLEAR_ALL = 1;
    public static final int TYPE_CLEAR_APP = 0;
    @AbstractC1143a
    public String appID;
    @AbstractC1143a
    public int type = 0;

    public String getAppID() {
        return this.appID;
    }

    public int getType() {
        return this.type;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
