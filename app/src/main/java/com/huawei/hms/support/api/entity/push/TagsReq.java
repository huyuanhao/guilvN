package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;
import com.huawei.hms.support.api.push.HmsPushConst;
import com.huawei.hms.support.api.push.p046b.p049b.C1196c;
import com.p118pd.sdk.C7522o0Ooo0o;

public class TagsReq implements IMessageEntity {
    @AbstractC1143a
    public String apkVersion;
    @AbstractC1143a
    public String content = "";
    @AbstractC1143a
    public long cycle = 0;
    @AbstractC1143a
    public int operType;
    @AbstractC1143a
    public String pkgName;
    @AbstractC1143a
    public int plusType;
    @AbstractC1143a
    public String token;

    public String getApkVersion() {
        return this.apkVersion;
    }

    public String getContent() {
        return this.content;
    }

    public long getCycle() {
        return this.cycle;
    }

    public int getOperType() {
        return this.operType;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public int getPlusType() {
        return this.plusType;
    }

    public String getToken() {
        return this.token;
    }

    public void setApkVersion(String str) {
        this.apkVersion = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCycle(long j) {
        this.cycle = j;
    }

    public void setOperType(int i) {
        this.operType = i;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setPlusType(int i) {
        this.plusType = i;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return TagsReq.class.getName() + " {" + HmsPushConst.NEW_LINE + "cycle: " + this.cycle + HmsPushConst.NEW_LINE + "operType: " + this.operType + HmsPushConst.NEW_LINE + "plusType: " + this.plusType + HmsPushConst.NEW_LINE + "token: " + C1196c.m1295a(this.token) + HmsPushConst.NEW_LINE + "pkgName: " + this.pkgName + HmsPushConst.NEW_LINE + "apkVersion: " + this.apkVersion + HmsPushConst.NEW_LINE + "content: " + this.content + HmsPushConst.NEW_LINE + HmsPushConst.NEW_LINE + C7522o0Ooo0o.OooO0Oo;
    }
}
