package com.huawei.hms.api;

import java.util.List;

public class ProtocolNegotiate {

    /* renamed from: a */
    public static ProtocolNegotiate f1142a = new ProtocolNegotiate();

    /* renamed from: b */
    public int f1143b = 1;

    public static ProtocolNegotiate getInstance() {
        return f1142a;
    }

    public int getVersion() {
        return this.f1143b;
    }

    public int negotiate(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            this.f1143b = 1;
            return 1;
        }
        if (!list.contains(2)) {
            this.f1143b = list.get(list.size() - 1).intValue();
        } else {
            this.f1143b = 2;
        }
        return this.f1143b;
    }
}
