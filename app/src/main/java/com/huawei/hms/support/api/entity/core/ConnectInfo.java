package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

public class ConnectInfo implements IMessageEntity {
    @AbstractC1143a
    public List<String> apiNameList;
    @AbstractC1143a
    public String fingerprint;
    @AbstractC1143a
    public List<Scope> scopeList;
    @AbstractC1143a
    public String subAppID;

    public ConnectInfo() {
    }

    public List<String> getApiNameList() {
        return this.apiNameList;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public List<Scope> getScopeList() {
        return this.scopeList;
    }

    public String getSubAppID() {
        return this.subAppID;
    }

    public void setApiNameList(List<String> list) {
        this.apiNameList = list;
    }

    public void setFingerprint(String str) {
        this.fingerprint = str;
    }

    public void setScopeList(List<Scope> list) {
        this.scopeList = list;
    }

    public void setSubAppID(String str) {
        this.subAppID = str;
    }

    public ConnectInfo(List<String> list, List<Scope> list2, String str, String str2) {
        this.apiNameList = list;
        this.scopeList = list2;
        this.fingerprint = str;
        this.subAppID = str2;
    }
}
