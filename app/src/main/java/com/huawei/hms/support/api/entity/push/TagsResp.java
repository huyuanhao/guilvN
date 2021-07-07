package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;

public class TagsResp implements IMessageEntity {
    @AbstractC1143a
    public String content = "";
    @AbstractC1143a
    public int retCode = 0;

    public String getContent() {
        return this.content;
    }

    public int getRetCode() {
        return this.retCode;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setRetCode(int i) {
        this.retCode = i;
    }
}
