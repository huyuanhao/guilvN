package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

public class DisconnectInfo implements IMessageEntity {
    @AbstractC1143a
    public List<String> apiNameList;
    @AbstractC1143a
    public List<Scope> scopeList;

    public DisconnectInfo() {
    }

    public List<String> getApiNameList() {
        return this.apiNameList;
    }

    public List<Scope> getScopeList() {
        return this.scopeList;
    }

    public DisconnectInfo(List<Scope> list, List<String> list2) {
        this.scopeList = list;
        this.apiNameList = list2;
    }
}
