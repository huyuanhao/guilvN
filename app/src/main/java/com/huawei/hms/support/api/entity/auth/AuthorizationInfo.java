package com.huawei.hms.support.api.entity.auth;

import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;
import java.util.List;

public class AuthorizationInfo implements IMessageEntity {
    @AbstractC1143a
    public String accessToken;
    @AbstractC1143a
    public String appID;
    @AbstractC1143a
    public String clientID;
    @AbstractC1143a
    public String clientSecret;
    @AbstractC1143a
    public long expiredTime;
    @AbstractC1143a
    public String openID;
    @AbstractC1143a
    public String refreshToken;
    @AbstractC1143a
    public List<String> scopeList;

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAppID() {
        return this.appID;
    }

    public String getClientID() {
        return this.clientID;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public long getExpiredTime() {
        return this.expiredTime;
    }

    public String getOpenId() {
        return this.openID;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public List<String> getScopeList() {
        return this.scopeList;
    }

    public boolean isTokenExpire() {
        return System.currentTimeMillis() > this.expiredTime;
    }

    public boolean isValid() {
        return TextUtils.isEmpty(this.appID);
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setClientID(String str) {
        this.clientID = str;
    }

    public void setClientSecret(String str) {
        this.clientSecret = str;
    }

    public void setExpiredTime(long j) {
        this.expiredTime = j;
    }

    public void setOpenID(String str) {
        this.openID = str;
    }

    public void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public void setScopeList(List<String> list) {
        this.scopeList = list;
    }

    public String toString() {
        return "appID:" + this.appID + ", expiredTime:" + this.expiredTime;
    }
}
