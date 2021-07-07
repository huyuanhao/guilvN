package com.huawei.hms.core.aidl;

import com.huawei.hms.core.aidl.p038a.AbstractC1143a;
import com.huawei.hms.support.api.client.Status;

public class AbstractMessageEntity implements IMessageEntity {
    @AbstractC1143a
    public Status commonStatus;

    public Status getCommonStatus() {
        return this.commonStatus;
    }

    public void setCommonStatus(Status status) {
        this.commonStatus = status;
    }
}
