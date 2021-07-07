package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import java.util.Arrays;
import java.util.List;

public class ConnectResp implements IMessageEntity {
    @AbstractC1143a
    public List<Integer> protocolVersion = Arrays.asList(1, 2);
    @AbstractC1143a
    public String sessionId;

    public String toString() {
        StringBuilder sb = new StringBuilder("protocol version:");
        for (Integer num : this.protocolVersion) {
            sb.append(num);
            sb.append(AbstractC1299b.COMMA);
        }
        return sb.toString();
    }
}
