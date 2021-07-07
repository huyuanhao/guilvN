package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;

public abstract class AbstractResp implements IMessageEntity {
    @AbstractC1143a
    public String errorReason;
    @AbstractC1143a
    public int rtnCode = 0;

    public String getErrorReason() {
        return this.errorReason;
    }

    public int getRtnCode() {
        return this.rtnCode;
    }

    public void setErrorReason(String str) {
        this.errorReason = str;
    }

    public void setRtnCode(int i) {
        this.rtnCode = i;
    }
}
