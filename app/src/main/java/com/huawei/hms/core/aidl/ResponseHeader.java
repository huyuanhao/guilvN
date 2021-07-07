package com.huawei.hms.core.aidl;

import com.huawei.hms.core.aidl.p038a.AbstractC1143a;

public class ResponseHeader implements IMessageEntity {
    @AbstractC1143a
    public int statusCode;

    public ResponseHeader() {
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public ResponseHeader(int i) {
        this.statusCode = i;
    }
}
