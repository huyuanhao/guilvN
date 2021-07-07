package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;

public class AgreementResp implements IMessageEntity {
    @AbstractC1143a
    public boolean bAgree = false;
    @AbstractC1143a
    public int retCode = 0;

    public int getRetCode() {
        return this.retCode;
    }

    public boolean isAgree() {
        return this.bAgree;
    }

    public void setAgree(boolean z) {
        this.bAgree = z;
    }

    public void setRetCode(int i) {
        this.retCode = i;
    }
}
