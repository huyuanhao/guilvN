package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.p038a.AbstractC1143a;

public class AuthInfoResp extends AbstractResp {
    @AbstractC1143a
    public AuthorizationInfo authInfo;

    public AuthorizationInfo getAuthInfo() {
        return this.authInfo;
    }

    @Override // com.huawei.hms.support.api.entity.auth.AbstractResp
    public int getRtnCode() {
        return super.getRtnCode();
    }

    public void setAuthInfo(AuthorizationInfo authorizationInfo) {
        this.authInfo = authorizationInfo;
    }
}
