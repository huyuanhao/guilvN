package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;
import com.huawei.hms.support.api.push.HmsPushConst;
import com.huawei.hms.support.api.push.p046b.p049b.C1196c;
import com.p118pd.sdk.C7522o0Ooo0o;

public class AgreementReq implements IMessageEntity {
    @AbstractC1143a
    public boolean firstTime;
    @AbstractC1143a
    public String pkgName;
    @AbstractC1143a
    public String token = "";

    public String getPkgName() {
        return this.pkgName;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isFirstTime() {
        return this.firstTime;
    }

    public void setFirstTime(boolean z) {
        this.firstTime = z;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return AgreementReq.class.getName() + " {" + HmsPushConst.NEW_LINE + "isFirstTime: " + this.firstTime + HmsPushConst.NEW_LINE + "pkgName: " + this.pkgName + HmsPushConst.NEW_LINE + "token: " + C1196c.m1295a(this.token) + HmsPushConst.NEW_LINE + C7522o0Ooo0o.OooO0Oo;
    }
}
