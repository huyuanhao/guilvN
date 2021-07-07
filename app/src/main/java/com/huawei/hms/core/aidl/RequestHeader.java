package com.huawei.hms.core.aidl;

import com.huawei.hms.core.aidl.p038a.AbstractC1143a;
import java.util.List;

public class RequestHeader implements IMessageEntity {
    @AbstractC1143a
    public List<String> apiNameList;
    @AbstractC1143a
    public String appId;
    @AbstractC1143a
    public String packageName;
    @AbstractC1143a
    public int sdkVersion;
    @AbstractC1143a
    public String sessionId;

    public RequestHeader() {
    }

    public List<String> getApiNameList() {
        return this.apiNameList;
    }

    public String getAppID() {
        return this.appId;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setApiNameList(List<String> list) {
        this.apiNameList = list;
    }

    public void setAppID(String str) {
        this.appId = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSdkVersion(int i) {
        this.sdkVersion = i;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public RequestHeader(String str, String str2, int i, String str3) {
        this.appId = str;
        this.packageName = str2;
        this.sdkVersion = i;
        this.sessionId = str3;
    }
}
