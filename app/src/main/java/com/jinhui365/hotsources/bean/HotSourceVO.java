package com.jinhui365.hotsources.bean;

import java.io.Serializable;
import java.util.Map;

public class HotSourceVO implements Serializable {
    public String category;
    public String client;
    public String maxVersion;
    public String md5;
    public String miniVersion;
    public String targetVersion;
    public long timestamp;
    public String url;
    public Map<String, String> userInfo;

    public String getCategory() {
        return this.category;
    }

    public String getClient() {
        return this.client;
    }

    public String getMaxVersion() {
        return this.maxVersion;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMiniVersion() {
        return this.miniVersion;
    }

    public String getTargetVersion() {
        return this.targetVersion;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getUrl() {
        return this.url;
    }

    public Map<String, String> getUserInfo() {
        return this.userInfo;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setClient(String str) {
        this.client = str;
    }

    public void setMaxVersion(String str) {
        this.maxVersion = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMiniVersion(String str) {
        this.miniVersion = str;
    }

    public void setTargetVersion(String str) {
        this.targetVersion = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUserInfo(Map<String, String> map) {
        this.userInfo = map;
    }
}
