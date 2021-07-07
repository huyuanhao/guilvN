package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;

public class TokenResp implements IMessageEntity {
    @AbstractC1143a
    public int retCode = 0;
    @AbstractC1143a
    public String token = "";

    public int getRetCode() {
        return this.retCode;
    }

    public String getToken() {
        return this.token;
    }

    public void setRetCode(int i) {
        this.retCode = i;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
