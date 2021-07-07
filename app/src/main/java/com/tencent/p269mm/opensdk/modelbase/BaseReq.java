package com.tencent.p269mm.opensdk.modelbase;

import android.os.Bundle;
import com.tencent.p269mm.opensdk.utils.C3387a;

/* renamed from: com.tencent.mm.opensdk.modelbase.BaseReq */
public abstract class BaseReq {
    public String openId;
    public String transaction;

    public abstract boolean checkArgs();

    public void fromBundle(Bundle bundle) {
        this.transaction = C3387a.m8656b(bundle, "_wxapi_basereq_transaction");
        this.openId = C3387a.m8656b(bundle, "_wxapi_basereq_openid");
    }

    public abstract int getType();

    public void toBundle(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", getType());
        bundle.putString("_wxapi_basereq_transaction", this.transaction);
        bundle.putString("_wxapi_basereq_openid", this.openId);
    }
}
