package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;
import com.huawei.hms.support.api.push.HmsPushConst;
import com.p118pd.sdk.C7522o0Ooo0o;

public class EnableNotifyReq implements IMessageEntity {
    @AbstractC1143a
    public boolean enable;
    @AbstractC1143a
    public String packageName;

    public String getPackageName() {
        return this.packageName;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public String toString() {
        return EnableNotifyReq.class.getName() + " {" + HmsPushConst.NEW_LINE + "pkgName: " + this.packageName + HmsPushConst.NEW_LINE + "enable: " + this.enable + HmsPushConst.NEW_LINE + C7522o0Ooo0o.OooO0Oo;
    }
}
