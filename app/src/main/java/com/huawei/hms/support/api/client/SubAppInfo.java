package com.huawei.hms.support.api.client;

public class SubAppInfo {

    /* renamed from: a */
    public String f1201a;

    public SubAppInfo(SubAppInfo subAppInfo) {
        if (subAppInfo != null) {
            this.f1201a = subAppInfo.getSubAppID();
        }
    }

    public String getSubAppID() {
        return this.f1201a;
    }

    public void setSubAppID(String str) {
        this.f1201a = str;
    }

    public SubAppInfo(String str) {
        this.f1201a = str;
    }
}
